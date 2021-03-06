/*
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.validation

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage
import org.eclipse.xtext.validation.Check


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CustomerValidator extends AbstractRentalSystemValidator {
	
	public static final String CUSTOMER__UPPER_CASE_NAME = "de.nak.xtext.hausarbeit.rentalSystem.validation.customerUpperCaseName";
	
	@Check
	def customerShallStartWithLowerCase(Customer customer) {
		if(Character.isUpperCase(customer.name.charAt(0))) {
		    	warning(
		    		"The customer should start with a lower case.", 
		    		RentalSystemPackage.Literals.CUSTOMER__NAME, 
		    		CUSTOMER__UPPER_CASE_NAME, 
		    		customer.name
		    	) 
		  }
	}
}