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
			}

			// Pro Type ein eigenes Repository, eine JSP, ein Controller und eine Bean
			for (RentalType rentalType : rentalSystem.rentalTypes) {
				fsa.generateFile("src/main/java/" + rentalType.name.toFirstUpper + '.java',
					generateTypeBeans(rentalType, rentalSystem))

				fsa.generateFile("src/main/java/I" + rentalType.name.toFirstUpper + 'Repository.java',
					generateTypeRepos(rentalType, rentalSystem))
			}

			// Pro Deal ein eigenes Repository, eine JSP, ein Controller und eine Bean
			for (Deal deal : rentalSystem.deals) {
				fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + '.java',
					generateDealBeans(deal, rentalSystem))

				fsa.generateFile("src/main/java/I" + deal.name.toFirstUpper + 'Repository.java',
					generateDealRepos(deal, rentalSystem))
				
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
					import org.springframework.web.bind.annotation.RequestMapping;
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
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<a href="customersIndex" >Customers</a>
		<a href="rentalTypesIndex">RentalTypes</a>
		<a href="dealsIndex">Deals</a>
		
	'''
	
			def CharSequence generateCustomersIndexJsp(RentalSystem rentalSystem) '''
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<h1>Customers</h1>
		<a href="/">Index</a>
		
	'''
			def CharSequence generateRentalTypesIndexJsp(RentalSystem rentalSystem) '''
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<h1>RentalTypes</h1>
		<a href="/">Index</a>
		
	'''
	
			def CharSequence generateDealsIndexJsp(RentalSystem rentalSystem) '''
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<h1>Deals</h1>
		<a href="/">Index</a>
		
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
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<h1>Customers</h1>
	'''

	def CharSequence generateTypeBeans(RentalType rentalType, RentalSystem rentalSystem) '''
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

	def CharSequence generateTypeRepos(RentalType rentalType,
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
