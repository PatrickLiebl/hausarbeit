package de.nak.xtext.hausarbeit.rentalSystem.tests

import com.google.inject.Inject
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage
import de.nak.xtext.hausarbeit.rentalSystem.validation.RentalSystemValidator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(BothLanguagesInjectorProvider)

class RentalSystemValidationTest {
	
	@Inject
	extension ParseHelper<RentalSystem> parseHelper;
	
	@Inject
	extension ValidationTestHelper validationTestHelper;
	
	//AttributeValidator
	
	//CustomerValidator
	
	//DealValidator
	
	//RentalSystemValidator
	@Test 
	def void titleMustNotBeEmpty() {
		val result = parseHelper.parse('''
		rentalSystem SampleSystem ""
		(
				
		)
		''')
		
		result.assertError(RentalSystemPackage::eINSTANCE.rentalSystem, RentalSystemValidator::RENTAL_SYSTEM__EMPTY_TITLE,"The title must not be empty.") 
	}
	
	@Test 
	def void nameMustBeSet() {
		val result = parseHelper.parse('''
		rentalSystem "Titel"
		(
				
		)
		''')
		
		result.assertError(RentalSystemPackage::eINSTANCE.rentalSystem, RentalSystemValidator::RENTAL_SYSTEM__EMPTY_TITLE,"The title must not be empty.") 
	}
	
	
	//RentalTypeValidator
	
	
}