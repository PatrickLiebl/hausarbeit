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

			for (Customer customer : rentalSystem.customers) {
				fsa.generateFile("src/main/java/" + customer.name.toFirstUpper + '.java',
					generateCustomerBeans(customer, rentalSystem))

				fsa.generateFile("src/main/java/I" + customer.name.toFirstUpper + 'Repository.java',
					generateCustomerRepos(customer, rentalSystem))
			}

			for (RentalType rentalType : rentalSystem.rentalTypes) {
				fsa.generateFile("src/main/java/" + rentalType.name.toFirstUpper + '.java',
					generateTypeBeans(rentalType, rentalSystem))

				fsa.generateFile("src/main/java/I" + rentalType.name.toFirstUpper + 'Repository.java',
					generateTypeRepos(rentalType, rentalSystem))
			}

			for (Deal deal : rentalSystem.deals) {
				fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + '.java',
					generateDealBeans(deal, rentalSystem))

				fsa.generateFile("src/main/java/I" + deal.name.toFirstUpper + 'Repository.java',
					generateDealRepos(deal, rentalSystem))
					
				for(State state : deal.rentalWorkflow.states){
					fsa.generateFile("src/main/java/" + deal.name.toFirstUpper + state.name.toFirstUpper + '.java',
						generateDealStateBeans(deal, state))
	
					fsa.generateFile("src/main/java/I" + deal.name.toFirstUpper + state.name.toFirstUpper + 'Repository.java',
						generateDealStateRepos(deal, state))
				}
			}
		}
	}

	def CharSequence generateCustomerBeans(Customer customer, RentalSystem rentalSystem) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
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

	def CharSequence generateTypeBeans(RentalType rentalType, RentalSystem rentalSystem) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
				public class «rentalType.name.toFirstUpper» {
		
				@Id
				@GeneratedValue
				private Long id;
			
				«FOR attribute : rentalType.typeAttributes»
					public «attribute.ofType» «attribute.name.toFirstLower»;
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
		
				public class «deal.name.toFirstUpper» {
		
				@Id
				@GeneratedValue
				private Long id;
			
				«FOR attribute : deal.dealAttributes»
					public «attribute.ofType» «attribute.name.toFirstLower»;
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
		
				public class «deal.name.toFirstUpper»«deal.name.toFirstUpper» {
		
				@Id
				@GeneratedValue
				private Long id;
				
				public «state.name.toFirstUpper» «state.name.toFirstLower»;
				
				public «deal.name.toFirstUpper» «deal.name.toFirstLower»;
				
				public «deal.name.toFirstUpper»«state.name.toFirstUpper»(«state.name.toFirstUpper» «state.name.toFirstLower», «deal.name.toFirstUpper» «deal.name.toFirstLower»){
					this.«state.name.toFirstUpper» = «state.name.toFirstLower»;
					this.«deal.name.toFirstUpper» = «deal.name.toFirstUpper»
				}
				
				public Long getId() {
					return id;
				}
				
				public «deal.name.toFirstUpper» get«deal.name.toFirstUpper»(){
					return «deal.name.toFirstLower»;
				}
				
				public «state.name.toFirstUpper» get«state.name.toFirstUpper»(){
					return «state.name.toFirstLower»;
				}
				
				public void setId(Long id) {
					this.id = id;
				}
				
				public void set«deal.name.toFirstUpper»(«deal.name.toFirstUpper» «deal.name.toFirstLower»){
					this.«deal.name.toFirstLower» = «deal.name.toFirstLower»;
				}
				
				public void set«state.name.toFirstUpper»(«state.name.toFirstUpper» «state.name.toFirstLower»){
					this.«state.name.toFirstLower» = «state.name.toFirstLower»;
				}
			}
	'''

	def CharSequence generateDealStateRepos(Deal deal, State state) '''
		package de.nordakademie.xtext.hausarbeit.rentalSystem.web;
		
		import org.springframework.data.repository.CrudRepository;
		import org.springframework.stereotype.Repository;
				
				@Repository
				public interface I«deal.name.toFirstUpper»«state.name.toFirstUpper»Repository extends CrudRepository<«deal.name.toFirstUpper»«state.name.toFirstUpper», Long> {
				
				}
	'''

}
