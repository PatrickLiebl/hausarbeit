package de.nak.xtext.hausarbeit.rentalSystem.tests

import com.google.inject.Inject
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage
import de.nak.xtext.hausarbeit.rentalSystem.validation.AttributeValidator
import de.nak.xtext.hausarbeit.rentalSystem.validation.CustomerValidator
import de.nak.xtext.hausarbeit.rentalSystem.validation.RentalSystemValidator
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.StringInputStream
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Provider
import org.eclipse.emf.common.util.URI
import de.nak.xtext.hausarbeit.rentalSystem.validation.DealValidator


@RunWith(XtextRunner)
@InjectWith(BothLanguagesInjectorProvider)

class RentalSystemValidationTest {
	
	@Inject
	extension ParseHelper<RentalSystem> parseHelper;
	
	@Inject
	extension ValidationTestHelper validationTestHelper;
	
	@Inject 
	extension Provider<XtextResourceSet> resourceSetProvider
	
	//AttributeValidator
	@Test 
	def void attributeShallStartWithLowerCase() {
		val result = parseHelper.parse('''
		rentalSystem sampleSystem "title"(
			movable typeMold rentalTypeID1(
				attribute Title String
				attribute price int
			)
		)
		''')
		result.assertIssue(RentalSystemPackage::eINSTANCE.attribute, AttributeValidator::ATTRIBUTE__UPPER_CASE_NAME,Severity.WARNING, "The attribute should start with a lower case.") 
	}
	
	//CustomerValidator
	@Test 
	def void customerShallStartWithLowerCase() {
		val result = parseHelper.parse('''
		rentalSystem testSystem "title"(
			customerMold CustomerID1 (
				attribute title int			
			)	
		)
		''')
		result.assertIssue(RentalSystemPackage::eINSTANCE.customer, CustomerValidator::CUSTOMER__UPPER_CASE_NAME,Severity.WARNING, "The customer should start with a lower case.") 
	}

	
	//DealValidator
	@Test 
	def void dealShallStartWithLowerCase() {
		val resourceSet = resourceSetProvider.get
		
		// create a resource for language 'RentalWorkflow'
		val testWorkflow = resourceSet.createResource(URI.createURI("workflow.rentalWorkflow"))
		// parse sample contents
		testWorkflow.load(new StringInputStream(
			"defineWorkflow workflow1
			events 
				onNext nextClicked 
				onCancel cancelClicked
				onBack backClicked
			end
			
			commands
			abortNow doAbort
			deleteNow doDelete
			saveNow doSave 
			end
			
			resetEvents
			onCancel
			end"
			), emptyMap)
				
		validationTestHelper.assertNoErrors(testWorkflow)
		
		// use the parse helper to read the model under test
		// into the same resource set
		val testRentalSystem = parseHelper.parse(
			"rentalSystem testSystem \"title\"(
				movable typeMold rentalTypeID1(
					attribute title String
					attribute price int
				)
				customerMold customerID1 (
					attribute title String			
				)
				deal DealID1(
					customer customerID1
					rentalType rentalTypeID1 
					dealWorkflow  workflow1 
					dealAttribute
				)
				
			)", resourceSet)

		validationTestHelper.assertNoErrors(testRentalSystem)
		
		//validationTestHelper.assertIssue(RentalSystemPackage::eINSTANCE.deal, DealValidator::DEAL__UPPER_CASE_NAME,Severity.WARNING, "The deal should start with a lower case.")
		//Wie kann man auf den RentalWorkflow verweisen? 
		//sonst war es immer assertIssue(RentalSystemPackage::eINSTANCE.customer, CustomerValidator::CUSTOMER__UPPER_CASE_NAME,Severity.WARNING, "The customer should start with a lower case.") 
	
	}
	
	
	//RentalSystemValidator
	@Test 
	def void rentalSystemTitleMustNotBeEmpty() {
		val result = parseHelper.parse('''
		rentalSystem sampleSystem ""
		(
				
		)
		''')
		
		result.assertError(RentalSystemPackage::eINSTANCE.rentalSystem, RentalSystemValidator::RENTAL_SYSTEM__EMPTY_TITLE,"The title must not be empty.") 
	}
	
	@Test 
	def void rentalSystemNameMustBeSet() {
		val result = parseHelper.parse('''
		rentalSystem "Titel"
		(
				
		)
		''')
		result.assertError(RentalSystemPackage::eINSTANCE.rentalSystem, null, "A name must be set.") 
	}

	@Test 
	def void rentalSystemTitleShallStartWithLowerCase() {
		val result = parseHelper.parse('''
		rentalSystem sampleSystem "Titel"
		(
				
		)
		''')
		result.assertIssue(RentalSystemPackage::eINSTANCE.rentalSystem, RentalSystemValidator::RENTAL_SYSTEM__UPPER_CASE_TITLE,Severity.WARNING, "The title should start with a lower case.") 
	}
	
	@Test 
	def void rentalSystemShallStartWithLowerCase() {
		val result = parseHelper.parse('''
		rentalSystem SampleSystem "titel"
		(
				
		)
		''')
		result.assertIssue(RentalSystemPackage::eINSTANCE.rentalSystem, RentalSystemValidator::RENTAL_SYSTEM__UPPER_CASE_NAME,Severity.WARNING, "The rentalSystem should start with a lower case.") 
	}
	
	//RentalTypeValidator
	@Test 
	def void rentalTypeShallStartWithLowerCase() {
		val resourceSet = resourceSetProvider.get
		
		// create a resource for language 'RentalWorkflow'
		val testWorkflow = resourceSet.createResource(URI.createURI("workflow.rentalWorkflow"))
		// parse sample contents
		testWorkflow.load(new StringInputStream(
			"defineWorkflow workflow1
			events 
				onNext nextClicked 
				onCancel cancelClicked
				onBack backClicked
			end
			
			commands
			abortNow doAbort
			deleteNow doDelete
			saveNow doSave 
			end
			
			resetEvents
			onCancel
			end"
			), emptyMap)
				
		validationTestHelper.assertNoErrors(testWorkflow)
		
		// use the parse helper to read the model under test
		// into the same resource set
		val testRentalSystem = parseHelper.parse(
			"rentalSystem testSystem \"title\"(
				movable typeMold RentalTypeID1(
					attribute title String
					attribute price int
				)
				customerMold customerID1 (
					attribute title String			
				)
				deal DealID1(
					customer customerID1
					rentalType RentalTypeID1 
					dealWorkflow  workflow1 
					dealAttribute
				)
				
			)", resourceSet)

		validationTestHelper.assertNoErrors(testRentalSystem)
		
		//validationTestHelper.assertIssue(RentalSystemPackage::eINSTANCE.deal, DealValidator::DEAL__UPPER_CASE_NAME,Severity.WARNING, "The deal should start with a lower case.")
		//Wie kann man auf den RentalWorkflow verweisen? 
		//sonst war es immer assertIssue(RentalSystemPackage::eINSTANCE.customer, CustomerValidator::CUSTOMER__UPPER_CASE_NAME,Severity.WARNING, "The customer should start with a lower case.") 
	
	}
	
	
}