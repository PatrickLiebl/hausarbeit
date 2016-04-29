package de.nak.xtext.hausarbeit.rentalSystem.generator

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RentalSystemGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val rentalSystem = resource.getContents().head()

		if (rentalSystem instanceof RentalSystem) {
			
			// Einstiegspunkt der App
			fsa.generateFile("src/main/java/" + rentalSystem.name.toFirstUpper + '.java',
				generateRentalSystemMain(rentalSystem))
				
			// Web-Config generieren
			fsa.generateFile("src/main/java/WebConfiguration.java",
				generateWebConfig())

			// Erst die immer vorhandenen Index-JSPs erzeugen: Index, Customers, Types & Deals.
			fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + rentalSystem.name.toFirstLower + '.jsp',
					generateIndexJsp(rentalSystem))
					
			fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/customersIndex.jsp",
				generateCustomersIndexJsp(rentalSystem))
		
			fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/rentalTypesIndex.jsp",
				generateRentalTypesIndexJsp(rentalSystem))
	
			fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/dealsIndex.jsp",
				generateDealsIndexJsp(rentalSystem))
				
			//Für die Index-JSPs Controller definieren.
			fsa.generateFile("src/main/java/" + rentalSystem.name.toFirstUpper + 'Controller.java',
				generateIndexController(rentalSystem))
				
			fsa.generateFile("src/main/java/CustomersIndexController.java",
				generateCustomerIndexController())
				
			fsa.generateFile("src/main/java/RentalTypesIndexController.java",
				generateRentalTypesIndexController())
				
			fsa.generateFile("src/main/java/DealsIndexController.java",
				generateDealsIndexController())

			// Pro Customer ein eigenes Repository, eine JSP, ein Controller und eine Bean
			for (Customer customer : rentalSystem.customers) {
				fsa.generateFile("src/main/java/" + customer.name.toFirstUpper + '.java',
					generateCustomerBeans(customer, rentalSystem))

				fsa.generateFile("src/main/java/I" + customer.name.toFirstUpper + 'Repository.java',
					generateCustomerRepos(customer, rentalSystem))
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + customer.name.toFirstLower + '.jsp',
					generateCustomerJsp(customer, rentalSystem))
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + customer.name.toFirstLower + 'Form.jsp',
					generateCustomerFormJsp(customer, rentalSystem))
					
				fsa.generateFile("src/main/java/" + customer.name.toFirstUpper + 'Controller.java',
					generateCustomerController(customer, rentalSystem))
			}

			// Pro Type ein eigenes Repository, eine JSP, ein Controller und eine Bean
			for (RentalType rentalType : rentalSystem.rentalTypes) {
				fsa.generateFile("src/main/java/" + rentalType.name.toFirstUpper + '.java',
					generateRentalTypeBeans(rentalType, rentalSystem))

				fsa.generateFile("src/main/java/I" + rentalType.name.toFirstUpper + 'Repository.java',
					generateRentalTypeRepos(rentalType, rentalSystem))
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + rentalType.name.toFirstLower + '.jsp',
					generateRentalTypeJsp(rentalType, rentalSystem))
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + rentalType.name.toFirstLower + 'Form.jsp',
					generateRentalTypeFormJsp(rentalType, rentalSystem))
				
				fsa.generateFile("src/main/java/" + rentalType.name.toFirstUpper + 'Controller.java',
					generateRentalTypeController(rentalType, rentalSystem))
			}

			// Pro Deal ein eigenes Repository, eine JSP, ein Controller und eine Bean
			for (Deal deal : rentalSystem.deals) {
				fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + '.java',
					generateDealBeans(deal, rentalSystem))

				fsa.generateFile("src/main/java/I" + deal.name.toFirstUpper + 'Repository.java',
					generateDealRepos(deal, rentalSystem))
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + deal.name.toFirstLower + '.jsp',
					generateDealJsp(deal, rentalSystem))
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + deal.name.toFirstLower + 'Form.jsp',
					generateDealFormJsp(deal, rentalSystem))
					
				fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + 'Controller.java',
					generateDealController(deal, rentalSystem))
					
				// Index für alle Workflows zu diesem Deal
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + deal.name.toFirstLower + 'StatesIndex.jsp',
					generateWorkflowsIndexJsp(rentalSystem, deal))
				
				// Besonderheit StateMachine: Pro Deal ein State Index (s.o.), pro State eine Bean, JSP, JSP-Form, Controller, ein Repo.
				for(State state : deal.rentalWorkflow.states){
					
					fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + deal.name.toFirstLower + state.name.toFirstUpper + '.jsp',
						generateDealStateJsp(deal, rentalSystem, state))
					
					fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + state.name.toFirstUpper +  'Controller.java',
						generateDealStateController(deal, rentalSystem, state))
						
					fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + deal.name.toFirstLower + state.name.toFirstUpper + 'Form.jsp',
						generateDealStateFormJsp(deal, rentalSystem))
						
					fsa.generateFile("src/main/java/I" + deal.name.toFirstUpper + state.name.toFirstUpper +  'Repository.java',
						generateDealStateRepos(deal, rentalSystem, state))
						
					fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + state.name.toFirstUpper +  '.java',
						generateDealStateBeans(deal, rentalSystem, state))
				}
			}
		}
	}
	
	
		def CharSequence generateRentalSystemMain(RentalSystem rentalSystem) '''
			package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
			
				import org.springframework.boot.SpringApplication;
				import org.springframework.boot.autoconfigure.SpringBootApplication;
				
				@SpringBootApplication
				public class «rentalSystem.name.toFirstUpper» {
				
					public static void main(String[] args) {
						SpringApplication.run(«rentalSystem.name.toFirstUpper».class, args);
					}
				}
	'''
	
		def CharSequence generateIndexController(RentalSystem rentalSystem) '''
			package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
			
				import org.springframework.stereotype.Controller;
				import org.springframework.web.bind.annotation.RequestMapping;
				import org.springframework.web.servlet.ModelAndView;
				
				@Controller
				public class «rentalSystem.name.toFirstUpper»Controller {
				
					@RequestMapping(value = "/")
					public ModelAndView index() {
						System.out.println("INDEX");
						ModelAndView mav = new ModelAndView("«rentalSystem.name.toFirstLower»");
						return mav;
					}
				}
	'''
	
	def CharSequence generateCustomerIndexController() '''
				package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
				
				import org.springframework.stereotype.Controller;
				import org.springframework.ui.Model;
				import org.springframework.web.bind.annotation.RequestMapping;
				import org.springframework.web.bind.annotation.RequestMethod;
				import org.springframework.web.servlet.ModelAndView;
					
					@Controller
					public class CustomersIndexController {
						
						@RequestMapping(value="/customersIndex")
						public ModelAndView customersIndex(){
							System.out.println("CUSTOMERSINDEX!");
							ModelAndView mav = new ModelAndView("customersIndex");
							return mav;
						}
					
					}
		'''
		
		def CharSequence generateRentalTypesIndexController() '''
				package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
				
					import org.springframework.stereotype.Controller;
					import org.springframework.web.bind.annotation.RequestMapping;
					import org.springframework.web.servlet.ModelAndView;
					
					@Controller
					public class RentalTypesIndexController {
						
						@RequestMapping(value="/rentalTypesIndex")
						public ModelAndView rentalTypesIndex(){
							System.out.println("RENTALTYPESINDEX");
							ModelAndView mav = new ModelAndView("rentalTypesIndex");
							return mav;
						}
					}
		'''
		
	def CharSequence generateDealsIndexController() '''
				package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
				
					import org.springframework.stereotype.Controller;
					import org.springframework.web.bind.annotation.RequestMapping;
					import org.springframework.web.servlet.ModelAndView;
					
					@Controller
					public class DealsIndexController {
						
						@RequestMapping(value="/dealsIndex")
						public ModelAndView dealsIndex(){
							System.out.println("DEALSINDEX");
							ModelAndView mav = new ModelAndView("dealsIndex");
							return mav;
						}
					}
		'''
		
	def CharSequence generateCustomerController(Customer customer, RentalSystem rentalSystem) '''
				package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
				
				import org.springframework.beans.factory.annotation.Autowired;
				import org.springframework.stereotype.Controller;
				import org.springframework.web.bind.annotation.RequestMapping;
				import org.springframework.web.servlet.ModelAndView;
				import org.springframework.web.bind.annotation.PathVariable;
				import org.springframework.web.bind.annotation.RequestMethod;
					
					@Controller
					public class «customer.name.toFirstUpper»Controller {
						
						@Autowired
						private I«customer.name.toFirstUpper»Repository customerRepository;
						
						@RequestMapping(value="/«customer.name.toFirstLower»")
						public ModelAndView «customer.name.toFirstLower»Show(){
							System.out.println("«customer.name.toFirstUpper»Controller!");
							ModelAndView mav = new ModelAndView("«customer.name.toFirstLower»");
							mav.addObject("customers", customerRepository.findAll());
							return mav;
						}
						
						@RequestMapping(value="/«customer.name.toFirstLower»Form", method=RequestMethod.GET)
						public ModelAndView «customer.name.toFirstLower»ShowForm(){
							ModelAndView mav = new ModelAndView("«customer.name.toFirstLower»Form");
							return mav;
						}
						
						@RequestMapping(value="/«customer.name.toFirstLower»Form", method=RequestMethod.POST)
						public ModelAndView «customer.name.toFirstLower»SaveForm(«customer.name.toFirstUpper» «customer.name.toFirstLower»){
							customerRepository.save(«customer.name.toFirstLower»);
							ModelAndView mav = new ModelAndView("«customer.name.toFirstLower»");
							mav.addObject("customers", customerRepository.findAll());
							return mav;
						}
					}
		'''
		
			def CharSequence generateRentalTypeController(RentalType rentalType, RentalSystem rentalSystem) '''
				package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
				
				import org.springframework.beans.factory.annotation.Autowired;
				import org.springframework.stereotype.Controller;
				import org.springframework.web.bind.annotation.RequestMapping;
				import org.springframework.web.servlet.ModelAndView;
				import org.springframework.web.bind.annotation.PathVariable;
				import org.springframework.web.bind.annotation.RequestMethod;
					
					@Controller
					public class «rentalType.name.toFirstUpper»Controller {
						
						@Autowired
						private I«rentalType.name.toFirstUpper»Repository rentalTypeRepository;
						
						@RequestMapping(value="/«rentalType.name.toFirstLower»")
						public ModelAndView «rentalType.name.toFirstLower»Show(){
							System.out.println("«rentalType.name.toFirstUpper»Controller!");
							ModelAndView mav = new ModelAndView("«rentalType.name.toFirstLower»");
							mav.addObject("rentalTypes", rentalTypeRepository.findAll());
							return mav;
						}
						
						@RequestMapping(value="/«rentalType.name.toFirstLower»Form", method=RequestMethod.GET)
						public ModelAndView «rentalType.name.toFirstLower»ShowForm(){
							ModelAndView mav = new ModelAndView("«rentalType.name.toFirstLower»Form");
							return mav;
						}
						
						@RequestMapping(value="/«rentalType.name.toFirstLower»Form", method=RequestMethod.POST)
						public ModelAndView «rentalType.name.toFirstLower»SaveForm(«rentalType.name.toFirstUpper» «rentalType.name.toFirstLower»){
							rentalTypeRepository.save(«rentalType.name.toFirstLower»);
							ModelAndView mav = new ModelAndView("«rentalType.name.toFirstLower»");
							mav.addObject("rentalTypes", rentalTypeRepository.findAll());
							return mav;
						}
					}
		'''
		
		def CharSequence generateDealController(Deal deal, RentalSystem rentalSystem) '''
				package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
				
				import org.springframework.beans.factory.annotation.Autowired;
				import org.springframework.stereotype.Controller;
				import org.springframework.web.bind.annotation.RequestMapping;
				import org.springframework.web.servlet.ModelAndView;
				import org.springframework.web.bind.annotation.RequestMethod;
				import org.springframework.web.bind.annotation.RequestParam;
					
					@Controller
					public class «deal.name.toFirstUpper»Controller {
						
						@Autowired
						private I«deal.name.toFirstUpper»Repository dealRepository;
						
						@Autowired
						private I«deal.customer.name.toFirstUpper»Repository customerRepository;
						
						@Autowired
						private I«deal.rentalType.name.toFirstUpper»Repository rentalTypeRepository;
						
						@RequestMapping(value="/«deal.name.toFirstLower»")
						public ModelAndView «deal.name.toFirstLower»Show(){
							ModelAndView mav = new ModelAndView("«deal.name.toFirstLower»");
							mav.addObject("deals", dealRepository.findAll());
							return mav;
						}
						
						@RequestMapping(value="/«deal.name.toFirstLower»", method=RequestMethod.POST)
							public ModelAndView «deal.name.toFirstLower»«deal.rentalWorkflow.startState.head.name.toFirstUpper»Show(
							@RequestParam("selectedDealId") String selectedDealId){
								ModelAndView mav = new ModelAndView("«deal.name.toFirstLower»«deal.rentalWorkflow.startState.head.transition.head.name.toFirstUpper»");
								mav.addObject("selectedDeal", dealRepository.findOne(Long.parseLong(selectedDealId)));
								return  mav;
							}
							
						@RequestMapping(value="/«deal.name.toFirstLower»Form", method=RequestMethod.POST)
							public ModelAndView «deal.name.toFirstLower»SaveForm(«deal.name.toFirstUpper» «deal.name.toFirstLower»,
							@RequestParam("selectionCustomerId") String customerId, @RequestParam("selectionTypeId") String typeId){
								«deal.customer.name.toFirstUpper» «deal.customer.name.toFirstLower» = customerRepository.findOne(Long.parseLong(customerId));
								«deal.rentalType.name.toFirstUpper» «deal.rentalType.name.toFirstLower» = rentalTypeRepository.findOne(Long.parseLong(typeId));
								«deal.name.toFirstLower».set«deal.customer.name.toFirstUpper»(«deal.customer.name.toFirstLower»);
								«deal.name.toFirstLower».set«deal.rentalType.name.toFirstUpper»(«deal.rentalType.name.toFirstLower»);
								dealRepository.save(«deal.name.toFirstLower»);
								ModelAndView mav = new ModelAndView("«deal.name.toFirstLower»");
								mav.addObject("deals", dealRepository.findAll());
								return mav;
							}
						
						@RequestMapping(value="/«deal.name.toFirstLower»Form", method=RequestMethod.GET)
						public ModelAndView «deal.name.toFirstLower»ShowForm(){
							ModelAndView mav = new ModelAndView("«deal.name.toFirstLower»Form");
							mav.addObject("customers", customerRepository.findAll());
							mav.addObject("rentalTypes", rentalTypeRepository.findAll());
							return mav;
						}
						
						@RequestMapping(value="/«deal.name.toFirstLower»StatesIndex")
							public ModelAndView «deal.name.toFirstLower»ShowStateIndex(){
								ModelAndView mav = new ModelAndView("«deal.name.toFirstLower»StatesIndex");
								return mav;
							}
					}
		'''
		
				def CharSequence generateDealStateController(Deal deal, RentalSystem rentalSystem, State state) '''
				package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
				
				import org.springframework.beans.factory.annotation.Autowired;
				import org.springframework.stereotype.Controller;
				import org.springframework.web.bind.annotation.RequestMapping;
				import org.springframework.web.servlet.ModelAndView;
				import org.springframework.web.bind.annotation.RequestMethod;
				import org.springframework.web.bind.annotation.RequestParam;
					
					@Controller
					public class «deal.name.toFirstUpper»«state.name.toFirstUpper»Controller {
						
						@RequestMapping(value="/«deal.name.toFirstLower»«state.name.toFirstUpper»")
						public ModelAndView «deal.name.toFirstLower»«state.name.toFirstUpper»Transition(){
							ModelAndView mav = new ModelAndView("«deal.name.toFirstLower»«state.name.toFirstUpper»");
							return mav;
						}
					}
		'''
	
		def CharSequence generateWebConfig() '''
			package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
			
				import org.springframework.context.annotation.Bean;
				import org.springframework.context.annotation.Configuration;
				import org.springframework.web.servlet.ViewResolver;
				import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
				import org.springframework.web.servlet.view.InternalResourceViewResolver;
				import org.springframework.web.servlet.view.JstlView;
				
				@Configuration
				public class WebConfiguration extends WebMvcConfigurerAdapter {
				
					@Bean
					public ViewResolver viewResolver() {
						final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
						viewResolver.setViewClass(JstlView.class);
						viewResolver.setPrefix("/WEB-INF/views/jsp/");
						viewResolver.setSuffix(".jsp");
						return viewResolver;
					}
				}
	'''
	
	
		def CharSequence generateIndexJsp(RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
					<a href="customersIndex" class="btn btn-primary">Customers</a>
					<a href="rentalTypesIndex" class="btn btn-primary">RentalTypes</a>
					<a href="dealsIndex" class="btn btn-primary">Deals</a>
		«generateJspFooter(rentalSystem)»
		
	'''
	
	def CharSequence generateJspHeader(RentalSystem rentalSystem) '''
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<!DOCTYPE html>
		<html lang="de" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
			<head>
				<meta charset="utf-8">
				<title>«rentalSystem.title»</title>
				<meta name="viewport" content="width=device-width, initial-scale=1">	
				<link href="${pageContext.request.contextPath}/css/simple-sidebar.css" rel="stylesheet" type="text/css">
				<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css" />
		  		<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js" ></script>
		  		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" ></script>
		  		<style type="text/css">
		  			body {
		  				background-color:white; 
		  				color:black;
		  			}
		  		</style>
		  	</head>
		  	<body>
		  	<div class="col-sm-12" style="background-color:white;">
		  		<!-- Header -->
		      	<h1>«rentalSystem.name»</h1>
			</div>
			<div class="col-sm-12" style="background-color:white;">
				<!--  Header Menu -->
				<nav class="navbar navbar-inverse">
				  <div class="container-fluid">
				    <div class="navbar-header">
				      <a class="navbar-brand" href="#">«rentalSystem.title»</a>
				    </div>
				    <ul class="nav navbar-nav">
				      <li class="active"><a href="/">Home</a></li>
				      <li><a href="customersIndex">Customers</a></li>
				      <li><a href="rentalTypesIndex" >RentalTypes</a></li>
				      <li><a href="dealsIndex">Deals</a></li>
				    </ul>
				  </div>
				</nav>
			</div>
			
			<!--  side-menu -->
			<div class="col-sm-2" style="background-color:white;">
				<div id="wrapper">
				        <div id="sidebar-wrapper">
				            <ul class="sidebar-nav">
				                <li class="sidebar-brand"><a href="#"> Start Bootstrap</a></li>
				                <li><a href="#">Dashboard</a></li>
				                <li><a href="#">Shortcuts</a></li>
				                <li><a href="#">Overview</a></li>
				                <li><a href="#">Events</a></li>
				                <li><a href="#">About</a></li>
				                <li><a href="#">Services</a></li>
				                <li><a href="#">Contact</a></li>
				            </ul>
				        </div>
				</div>
			</div>
			<div class="col-sm-10" style="background-color:white;">
		
	'''
	
			def CharSequence generateJspFooter(RentalSystem rentalSystem) '''
			</div>
		  	</body>
		</html>
		
	'''
	
	
	
		def CharSequence generateCustomersIndexJsp(RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>Customers</h1>
		<table class="table table-striped">
		«var int i = 0»
		<thead>
			<tr>
				<td>No.</td>
				<td>Name</td>
			</tr>
		</thead>
		<tbody>
		«FOR Customer customer : rentalSystem.customers»
			<tr>
				<td>«i»</td>
				<td><a href="«customer.name»">«customer.name»</a></td>
			</tr>
			«i++»
		«ENDFOR»
		</tbody>
		</table>
		<a href="/" class="btn btn-primary">Index</a>
		«generateJspFooter(rentalSystem)»
		
	'''
	def CharSequence generateRentalTypesIndexJsp(RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
			<h1>Rental-Types</h1>
				<table class="table table-striped">
				«var int i = 0»
				<thead>
					<tr>
						<td>No.</td>
						<td>Name</td>
					</tr>
				</thead>
				<tbody>
				«FOR RentalType rentalType : rentalSystem.rentalTypes»
					<tr>
						<td>«i»</td>
						<td><a href="«rentalType.name»">«rentalType.name»</a></td>
					</tr>
					«i++»
				«ENDFOR»
				</tbody>
				</table>
				<a href="/" class="btn btn-primary">Index</a>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence generateWorkflowsIndexJsp(RentalSystem rentalSystem, Deal deal) '''
		«generateJspHeader(rentalSystem)»
		<h1>«deal.name.toFirstUpper» States</h1>
		<table class="table table-striped">
				«var int i = 0»
				<thead>
					<tr>
						<td>No.</td>
						<td>Name</td>
					</tr>
				</thead>
				<tbody>
				«FOR State state : deal.rentalWorkflow.states»
					<tr>
						<td>«i»</td>
						<td><a href="«deal.name.toFirstLower»«state.name.toFirstUpper»">«deal.name.toFirstLower»«state.name.toFirstUpper»</a></td>
					</tr>
					«i++»
				«ENDFOR»
				</tbody>
				</table>
				<a href="/" class="btn btn-primary">Index</a>
		«generateJspFooter(rentalSystem)»
		
	'''
	
		def CharSequence generateDealsIndexJsp(RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>Deals</h1>
		<table class="table table-striped">
				«var int i = 0»
				<thead>
					<tr>
						<td>No.</td>
						<td>Name</td>
					</tr>
				</thead>
				<tbody>
				«FOR Deal deal : rentalSystem.deals»
					<tr>
						<td>«i»</td>
						<td><a href="«deal.name»">«deal.name»</a></td>
					</tr>
					«i++»
				«ENDFOR»
				</tbody>
				</table>
				<a href="/" class="btn btn-primary">Index</a>
		«generateJspFooter(rentalSystem)»
		
	'''
	

	def CharSequence generateCustomerBeans(Customer customer, RentalSystem rentalSystem) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import javax.persistence.Entity;
		import javax.persistence.GeneratedValue;
		import javax.persistence.Id;
		
		
				@Entity
				public class «customer.name.toFirstUpper» {
					
				@Id
				@GeneratedValue
				private Long id;
					
				«FOR attribute : customer.customerAttribute»
					private «attribute.ofType» «attribute.name.toFirstLower»;
				«ENDFOR»
				
				public Long getId() {
					return id;
				}
				
				«FOR attribute : customer.customerAttribute»
					public «attribute.ofType» get«attribute.name.toFirstUpper»(){
						return «attribute.name.toFirstLower»;
					}
				«ENDFOR»
				
				public void setId(Long id) {
					this.id = id;
				}
				
				«FOR attribute : customer.customerAttribute»
					public  void set«attribute.name.toFirstUpper»(«attribute.ofType» «attribute.name.toFirstLower»){
						this.«attribute.name.toFirstLower» = «attribute.name.toFirstLower»;
					}
				«ENDFOR»
			}
	'''

	def CharSequence generateCustomerRepos(Customer customer, RentalSystem rentalSystem) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import org.springframework.data.repository.CrudRepository;
		import org.springframework.stereotype.Repository;
		
			@Repository
			public interface I«customer.name.toFirstUpper»Repository extends CrudRepository<«customer.name.toFirstUpper», Long> {
			
			}
	'''
	
	def CharSequence generateCustomerJsp(Customer customer, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>«customer.name.toFirstUpper»</h1>
		<p>Number of customers: ${customers.size()}</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<td>No.</td>
					<td>ID</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="i" items="${customers}">
					<tr>
						<td></td>
						<td>${i.id}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="«customer.name.toFirstLower»Form" class="btn btn-primary">New «customer.name.toFirstUpper»</a>
		<a href="customersIndex" class="btn btn-primary">Customers</a>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence generateCustomerFormJsp(Customer customer, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>«customer.name.toFirstUpper»Form</h1>
		<form id="customer-form" role="form" th:action="@{/«customer.name.toFirstLower»Form}" method="post" th:object="${«customer.name.toFirstLower»}">
		<table>
		«FOR Attribute attribute : customer.customerAttribute»
			<tr>
			<td><label for="«attribute.name.toFirstLower»">«attribute.name.toFirstUpper»</label></td>
			<td>«buildInput(attribute)» id="«attribute.name.toFirstLower»" name="«attribute.name.toFirstLower»" th:field="${«customer.name.toFirstLower».«attribute.name.toFirstLower»}" /></td>
			</tr>
		«ENDFOR»
		</table>
		<button type="submit">Save</button>
		</form>
		«generateJspFooter(rentalSystem)»
	'''
	
	
	def CharSequence generateRentalTypeFormJsp(RentalType rentalType, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>«rentalType.name.toFirstUpper»Form</h1>
		<form id="rentalType-form" role="form" th:action="@{/«rentalType.name.toFirstLower»Form}" method="post" th:object="${«rentalType.name.toFirstLower»}">
		<table>
		«FOR Attribute attribute : rentalType.typeAttributes»
			<tr>
			<td><label for="«attribute.name.toFirstLower»">«attribute.name.toFirstUpper»</label></td>
			<td>«buildInput(attribute)» id="«attribute.name.toFirstLower»" name="«attribute.name.toFirstLower»" th:field="${«rentalType.name.toFirstLower».«attribute.name.toFirstLower»}" /></td>
			</tr>
		«ENDFOR»
		</table>
		<button type="submit">Save</button>
		</form>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence buildInput(Attribute attribute){
		switch attribute{
			case attribute.ofType.equals(OfType.STRING) : '''<input type="text" value="example text"'''
			case attribute.ofType.equals(OfType.INT) : '''<input type="number" step="1" value="1"'''
			case attribute.ofType.equals(OfType.BOOLEAN) : '''<input type="checkbox"'''
			case attribute.ofType.equals(OfType.DOUBLE) : '''<input type="number" step="0.01" value="0.01"''' 
			default : '''<input type="text"'''
		}
	}
	
	def CharSequence generateRentalTypeJsp(RentalType rentalType, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
				<h1>«rentalType.name.toFirstUpper»</h1>
				<p>Number of rental types: ${rentalTypes.size()}</p>
				<table class="table table-striped">
					<thead>
						<tr>
							<td>No.</td>
							<td>ID</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="i" items="${rentalTypes}">
							<tr>
								<td></td>
								<td>${i.id}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<a href="«rentalType.name.toFirstLower»Form" class="btn btn-primary">New «rentalType.name.toFirstUpper»</a>
				<a href="rentalTypesIndex" class="btn btn-primary">Rental-Types</a>
		«generateJspFooter(rentalSystem)»
	'''
	
	
		def CharSequence generateDealJsp(Deal deal, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		
				<h1>«deal.name.toFirstUpper»</h1>
				<p>Number of deals types: ${deals.size()}</p>

				<table class="table table-striped">
					<thead>
						<tr>
							<td>No.</td>
							<td>ID</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="i" items="${deals}">
							<tr>
								<td></td>
								<td>${i.id}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<a href="«deal.name.toFirstLower»Form" class="btn btn-primary">New «deal.name.toFirstUpper»</a><br />
				<a href="dealsIndex" class="btn btn-primary">Deals Index</a><br />
				<a href="«deal.name.toFirstLower»StatesIndex" class="btn btn-primary">«deal.name.toFirstUpper» States Index</a><br />
				<a href="«deal.name.toFirstLower»«deal.rentalWorkflow.startState.head.name.toFirstUpper»" class="btn btn-primary">Begin Workflow</a>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence generateDealStateJsp(Deal deal, RentalSystem rentalSystem, State state) '''
		«generateJspHeader(rentalSystem)»
				<h1>«deal.name.toFirstUpper»«state.name.toFirstUpper»</h1>
				«buildButtonFlowSwitch(state, deal)»
				<a href="dealsIndex" class="btn btn-primary">Deals</a>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence buildButtonFlowSwitch(State state, Deal deal){
		switch deal{
			case deal.rentalWorkflow.finishState.head.name.equals(state.transition.head.name) : '''<a href="«deal.name.toFirstLower»«state.transition.head.name.toFirstUpper»" class="btn btn-primary">Last State</a>'''
			case deal.rentalWorkflow.finishState.head.name.equals(state.name) : '''<a href="«deal.name.toFirstLower»" class="btn btn-primary">Finish!</a>'''
			default : '''<a href="«deal.name.toFirstLower»«state.transition.head.name.toFirstUpper»" class="btn btn-primary">Next State</a>'''
		}
	}
	
	def CharSequence generateDealFormJsp(Deal deal, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>Deals</h1>
		<form id="customer-form" role="form" th:action="@{/«deal.name.toFirstLower»Form}" method="post" th:object="${«deal.name.toFirstLower»}">
				<table>
				«FOR Attribute attribute : deal.dealAttributes»
					<tr>
					<td><label for="«attribute.name.toFirstLower»">«attribute.name.toFirstUpper»</label></td>
					<td>«buildInput(attribute)» id="«attribute.name.toFirstLower»" name="«attribute.name.toFirstLower»" th:field="${«deal.name.toFirstLower».«attribute.name.toFirstLower»}" /></td>
					</tr>
				«ENDFOR»
				</table>
				<p>Please select the id of one of the following customers:</p><br />
					<select name="selectionCustomerId">
						<c:forEach var="i" items="${customers}">
							<option value="${i.id}">${i.id}</option>
						</c:forEach>
					</select>
				<p>Please select the id of one of the following rentalTypes:</p><br />
					<select name="selectionTypeId">
						<c:forEach var="j" items="${customers}">
							<option value="${j.id}">${j.id}</option>
						</c:forEach>
					</select>
				<button type="submit">Save</button>
				</form>
				<a href="«deal.name.toFirstLower»" class="btn btn-primary">Back</a>
		«generateJspFooter(rentalSystem)»
	'''
	
		def CharSequence generateDealStateFormJsp(Deal deal, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>Deals</h1>
		<form id="customer-form" role="form" th:action="@{/«deal.name.toFirstLower»Form}" method="post" th:object="${«deal.name.toFirstLower»}">
				<table>
				«FOR Attribute attribute : deal.dealAttributes»
					<tr>
					<td><label for="«attribute.name.toFirstLower»">«attribute.name.toFirstUpper»</label></td>
					<td>«buildInput(attribute)» id="«attribute.name.toFirstLower»" name="«attribute.name.toFirstLower»" th:field="${«deal.name.toFirstLower».«attribute.name.toFirstLower»}" /></td>
					</tr>
				«ENDFOR»
				</table>
				<p>Please select the id of one of the following customers:</p><br />
					<select name="selectionCustomerId">
						<c:forEach var="i" items="${customers}">
							<option value="${i.id}">${i.id}</option>
						</c:forEach>
					</select>
				<p>Please select the id of one of the following rentalTypes:</p><br />
					<select name="selectionTypeId">
						<c:forEach var="j" items="${customers}">
							<option value="${j.id}">${j.id}</option>
						</c:forEach>
					</select>
				<button type="submit">Save</button>
				</form>
				<a href="«deal.name.toFirstLower»" class="btn btn-primary">Back</a>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence generateRentalTypeBeans(RentalType rentalType, RentalSystem rentalSystem) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import javax.persistence.Entity;
		import javax.persistence.GeneratedValue;
		import javax.persistence.Id;
				
				@Entity
				public class «rentalType.name.toFirstUpper» {
		
				@Id
				@GeneratedValue
				private Long id;
			
				«FOR attribute : rentalType.typeAttributes»
					private «attribute.ofType» «attribute.name.toFirstLower»;
				«ENDFOR»
				
				public Long getId() {
					return id;
				}
		
				«FOR attribute : rentalType.typeAttributes»
				public «attribute.ofType» get«attribute.name.toFirstUpper»(){
					return «attribute.name.toFirstLower»;
				}
				«ENDFOR»
				
				public void setId(Long id) {
					this.id = id;
				}
				
				«FOR attribute : rentalType.typeAttributes»
					public  void set«attribute.name.toFirstUpper»(«attribute.ofType» «attribute.name.toFirstLower»){
						this.«attribute.name.toFirstLower» = «attribute.name.toFirstLower»;
					}
				«ENDFOR»
			}
	'''

	def CharSequence generateRentalTypeRepos(RentalType rentalType,
		RentalSystem rentalSystem) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import org.springframework.data.repository.CrudRepository;
		import org.springframework.stereotype.Repository;
				
				@Repository
				public interface I«rentalType.name.toFirstUpper»Repository extends CrudRepository<«rentalType.name.toFirstUpper», Long> {
				
				}
	'''

	def CharSequence generateDealBeans(Deal deal, RentalSystem rentalSystem) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import javax.persistence.Entity;
		import javax.persistence.GeneratedValue;
		import javax.persistence.Id;
		import javax.persistence.OneToOne;
		
				@Entity
				public class «deal.name.toFirstUpper» {
		
				@Id
				@GeneratedValue
				private Long id;
				
				@OneToOne
				private «deal.customer.name.toFirstUpper» «deal.customer.name.toFirstLower»;
				
				@OneToOne
				private «deal.rentalType.name.toFirstUpper» «deal.rentalType.name.toFirstLower»;
			
				«FOR attribute : deal.dealAttributes»
					private «attribute.ofType» «attribute.name.toFirstLower»;
				«ENDFOR»
				
				public Long getId() {
					return id;
				}
				
				public «deal.customer.name.toFirstUpper» get«deal.customer.name.toFirstUpper»(){
						return «deal.customer.name.toFirstLower»;
					}
					
				public «deal.rentalType.name.toFirstUpper» get«deal.rentalType.name.toFirstUpper»(){
						return «deal.rentalType.name.toFirstLower»;
					}
		
				«FOR attribute : deal.dealAttributes»
				public «attribute.ofType» get«attribute.name.toFirstUpper»(){
					return «attribute.name.toFirstLower»;
				}
				«ENDFOR»
				
				public void setId(Long id) {
					this.id = id;
				}
				
				public void set«deal.customer.name.toFirstUpper»(«deal.customer.name.toFirstUpper» «deal.customer.name.toFirstLower»){
						this.«deal.customer.name.toFirstLower» = «deal.customer.name.toFirstLower»;
					}
					
				public void set«deal.rentalType.name.toFirstUpper»(«deal.rentalType.name.toFirstUpper» «deal.rentalType.name.toFirstLower»){
						this.«deal.rentalType.name.toFirstLower» = «deal.rentalType.name.toFirstLower»;
					}
				
				«FOR attribute : deal.dealAttributes»
					public  void set«attribute.name.toFirstUpper»(«attribute.ofType» «attribute.name.toFirstLower»){
						this.«attribute.name.toFirstLower» = «attribute.name.toFirstLower»;
					}
				«ENDFOR»
			}
	'''
	
		def CharSequence generateDealStateBeans(Deal deal, RentalSystem rentalSystem, State state) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import javax.persistence.Entity;
		import javax.persistence.GeneratedValue;
		import javax.persistence.Id;
		import javax.persistence.OneToOne;
		
				@Entity
				public class «deal.name.toFirstUpper»«state.name.toFirstUpper» {
		
				@Id
				@GeneratedValue
				private Long id;
				
				@OneToOne
				private «deal.customer.name.toFirstUpper» «deal.customer.name.toFirstLower»;
				
				@OneToOne
				private «deal.rentalType.name.toFirstUpper» «deal.rentalType.name.toFirstLower»;
			
				«FOR attribute : deal.dealAttributes»
					private «attribute.ofType» «attribute.name.toFirstLower»;
				«ENDFOR»
				
				public Long getId() {
					return id;
				}
				
				public «deal.customer.name.toFirstUpper» get«deal.customer.name.toFirstUpper»(){
						return «deal.customer.name.toFirstLower»;
					}
					
				public «deal.rentalType.name.toFirstUpper» get«deal.rentalType.name.toFirstUpper»(){
						return «deal.rentalType.name.toFirstLower»;
					}
		
				«FOR attribute : deal.dealAttributes»
				public «attribute.ofType» get«attribute.name.toFirstUpper»(){
					return «attribute.name.toFirstLower»;
				}
				«ENDFOR»
				
				public void setId(Long id) {
					this.id = id;
				}
				
				public void set«deal.customer.name.toFirstUpper»(«deal.customer.name.toFirstUpper» «deal.customer.name.toFirstLower»){
						this.«deal.customer.name.toFirstLower» = «deal.customer.name.toFirstLower»;
					}
					
				public void set«deal.rentalType.name.toFirstUpper»(«deal.rentalType.name.toFirstUpper» «deal.rentalType.name.toFirstLower»){
						this.«deal.rentalType.name.toFirstLower» = «deal.rentalType.name.toFirstLower»;
					}
				
				«FOR attribute : deal.dealAttributes»
					public  void set«attribute.name.toFirstUpper»(«attribute.ofType» «attribute.name.toFirstLower»){
						this.«attribute.name.toFirstLower» = «attribute.name.toFirstLower»;
					}
				«ENDFOR»
			}
	'''

	def CharSequence generateDealRepos(Deal deal, RentalSystem rentalSystem) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import org.springframework.data.repository.CrudRepository;
		import org.springframework.stereotype.Repository;
				
				@Repository
				public interface I«deal.name.toFirstUpper»Repository extends CrudRepository<«deal.name.toFirstUpper», Long> {
				
				}
	'''
	
		def CharSequence generateDealStateRepos(Deal deal, RentalSystem rentalSystem, State state) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import org.springframework.data.repository.CrudRepository;
		import org.springframework.stereotype.Repository;
				
				@Repository
				public interface I«deal.name.toFirstUpper»«state.name.toFirstUpper»Repository extends CrudRepository<«deal.name.toFirstUpper»«state.name.toFirstUpper», Long> {
				
				}
	'''
	
	def CharSequence generateDealStateBeans(Deal deal, State state) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import javax.persistence.Entity;
		import javax.persistence.GeneratedValue;
		import javax.persistence.Id;
		import javax.persistence.ManyToOne;
		
				@Entity
				public class «deal.name.toFirstUpper + state.name.toFirstUpper» {
		
				@Id
				@GeneratedValue
				private Long id;
				
				@ManyToOne
				private «deal.name.toFirstUpper» «deal.name.toFirstLower»;
				
				public Long getId() {
					return id;
				}
				
				public «deal.name.toFirstUpper» get«deal.name.toFirstUpper»(){
					return «deal.name.toFirstLower»;
				}
				
				public void setId(Long id) {
					this.id = id;
				}
				
				public void set«deal.name.toFirstUpper»(«deal.name.toFirstUpper» «deal.name.toFirstLower»){
					this.«deal.name.toFirstLower» = «deal.name.toFirstLower»;
				}
			}
	'''

	def CharSequence generateDealStateRepos(Deal deal, State state) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import org.springframework.data.repository.CrudRepository;
		import org.springframework.stereotype.Repository;
				
				@Repository
				public interface I«deal.name.toFirstUpper + state.name.toFirstUpper»Repository extends CrudRepository<«deal.name.toFirstUpper + state.name.toFirstUpper», Long> {
				
				}
	'''

}
