/*
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.validation

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AttributeValidator extends AbstractRentalSystemValidator {
	
	public static final String ATTRIBUTE__UPPER_CASE_NAME = "de.nak.xtext.hausarbeit.rentalSystem.validation.attributeUpperCaseName";
	
	@Check
	def attributeShallStartWithLowerCase(Attribute attribute) {
		if(Character.isUpperCase(attribute.name.charAt(0))) {
		    	warning(
		    		"The attribute should start with a lower case.", 
		    		RentalSystemPackage.Literals.ATTRIBUTE__NAME, 
		    		ATTRIBUTE__UPPER_CASE_NAME, 
		    		attribute.name
		    	) 
		  }
	}
}