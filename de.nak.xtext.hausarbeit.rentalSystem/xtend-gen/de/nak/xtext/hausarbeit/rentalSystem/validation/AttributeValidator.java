/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.validation;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.validation.AbstractRentalSystemValidator;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class AttributeValidator extends AbstractRentalSystemValidator {
  public final static String ATTRIBUTE__UPPER_CASE_NAME = "de.nak.xtext.hausarbeit.rentalSystem.validation.attributeUpperCaseName";
  
  @Check
  public void attributeShallStartWithLowerCase(final Attribute attribute) {
    String _name = attribute.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      String _name_1 = attribute.getName();
      this.warning(
        "The attribute should start with a lower case.", 
        RentalSystemPackage.Literals.ATTRIBUTE__NAME, 
        AttributeValidator.ATTRIBUTE__UPPER_CASE_NAME, _name_1);
    }
  }
}
