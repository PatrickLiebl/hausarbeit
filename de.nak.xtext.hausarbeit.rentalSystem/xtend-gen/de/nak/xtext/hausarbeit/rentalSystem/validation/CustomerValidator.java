/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.validation;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.validation.AbstractRentalSystemValidator;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class CustomerValidator extends AbstractRentalSystemValidator {
  public final static String CUSTOMER__UPPER_CASE_NAME = "de.nak.xtext.hausarbeit.rentalSystem.validation.customerUpperCaseName";
  
  @Check
  public void customerShallStartWithLowerCase(final Customer customer) {
    String _name = customer.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      String _name_1 = customer.getName();
      this.warning(
        "The attribute should start with a lower case.", 
        RentalSystemPackage.Literals.CUSTOMER__NAME, 
        CustomerValidator.CUSTOMER__UPPER_CASE_NAME, _name_1);
    }
  }
}
