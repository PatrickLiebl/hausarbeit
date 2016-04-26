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
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/newCustomerCreated.jsp",
					generateCustomerCreatedJsp(customer, rentalSystem))
			}

			// Pro Type ein eigenes Repository, eine JSP, ein Controller und eine Bean
			for (RentalType rentalType : rentalSystem.rentalTypes) {
				fsa.generateFile("src/main/java/" + rentalType.name.toFirstUpper + '.java',
					generateRentalTypeBeans(rentalType, rentalSystem))

				fsa.generateFile("src/main/java/I" + rentalType.name.toFirstUpper + 'Repository.java',
					generateRentalTypeRepos(rentalType, rentalSystem))
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + rentalType.name.toFirstLower + '.jsp',
					generateRentalTypeJsp(rentalType, rentalSystem))
			}

			// Pro Deal ein eigenes Repository, eine JSP, ein Controller und eine Bean
			for (Deal deal : rentalSystem.deals) {
				fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + '.java',
					generateDealBeans(deal, rentalSystem))

				fsa.generateFile("src/main/java/I" + deal.name.toFirstUpper + 'Repository.java',
					generateDealRepos(deal, rentalSystem))
					
				fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/" + deal.name.toFirstLower + '.jsp',
					generateDealJsp(deal, rentalSystem))
				
				// Besonderheit StateMachine: Pro State ein Controller, eine JSP, eine Bean und ein Repository
				for(State state : deal.rentalWorkflow.states){
					fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + state.name.toFirstUpper + '.java',
						generateDealStateBeans(deal, state))
	
					fsa.generateFile("src/main/java/I" + deal.name.toFirstUpper + state.name.toFirstUpper + 'Repository.java',
						generateDealStateRepos(deal, state))
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
						
						@RequestMapping(value="/«customer.name.toFirstLower»/new/{id}")
						public String createNew«customer.name.toFirstUpper»(@PathVariable("id") Long id){
							System.out.println("«customer.name.toFirstUpper»Creator!");
							«customer.name.toFirstUpper» «customer.name.toFirstLower» = new «customer.name.toFirstUpper»();
							«customer.name.toFirstLower».setId(id);
							customerRepository.save(«customer.name.toFirstLower»);
							return "newCustomerCreated";
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
		«FOR Customer customer : rentalSystem.customers»
			<a href="«customer.name»">«customer.name»</a></br>
		«ENDFOR»
		<a href="/" class="btn btn-primary">Index</a>
		«generateJspFooter(rentalSystem)»
		
	'''
			def CharSequence generateRentalTypesIndexJsp(RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>RentalTypes</h1>
		<a href="/" class="btn btn-primary">Index</a>
		«generateJspFooter(rentalSystem)»
		
	'''
	
			def CharSequence generateDealsIndexJsp(RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>Deals</h1>
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
		<p>Customers: ${customers.size()}</p>
		<ul>
			<c:forEach var="i" items="${customers}">
				<li>Customer ${i.id}</li>
			</c:forEach>
		</ul>
		<a href="«customer.name.toFirstLower»Form" class="btn btn-primary">New «customer.name.toFirstUpper»</a>
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
			<td>«buildInput(attribute, customer)» id="«attribute.name.toFirstLower»" name="«attribute.name.toFirstLower»" th:field="${«customer.name.toFirstLower».«attribute.name.toFirstLower»}" /></td>
			</tr>
		«ENDFOR»
		</table>
		<button type="submit">Save</button>
		</form>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence buildInput(Attribute attribute, Customer customer){
		switch attribute{
			case attribute.ofType.equals("String") : '''<input type="text"'''
			case attribute.ofType.equals("int") : '''<input type="number"'''
			case attribute.ofType.equals("boolean") : '''<input type="checkbox"'''
			case attribute.ofType.equals("Date") : '''<input type="date"'''
			default : '''<input type="text"'''
		}
	}
	
		def CharSequence generateCustomerCreatedJsp(Customer customer, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>«customer.name.toFirstUpper»-Instance-Creator</h1>
		<p>created!</p>
		<a href="/«customer.name.toFirstLower»" class="btn btn-primary">Back</a>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence generateRentalTypeJsp(RentalType rentalType, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>RentalTypes</h1>
		«generateJspFooter(rentalSystem)»
	'''
	
	def CharSequence generateDealJsp(Deal deal, RentalSystem rentalSystem) '''
		«generateJspHeader(rentalSystem)»
		<h1>Deals</h1>
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
		
				@Entity
				public class «deal.name.toFirstUpper» {
		
				@Id
				@GeneratedValue
				private Long id;
			
				«FOR attribute : deal.dealAttributes»
					private «attribute.ofType» «attribute.name.toFirstLower»;
				«ENDFOR»
				
				public Long getId() {
					return id;
				}
		
				«FOR attribute : deal.dealAttributes»
				public «attribute.ofType» get«attribute.name.toFirstUpper»(){
					return «attribute.name.toFirstLower»;
				}
				«ENDFOR»
				
				public void setId(Long id) {
					this.id = id;
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
