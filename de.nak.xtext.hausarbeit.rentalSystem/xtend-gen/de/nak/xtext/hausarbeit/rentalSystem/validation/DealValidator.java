/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.validation;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.validation.AbstractRentalSystemValidator;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DealValidator extends AbstractRentalSystemValidator {
  public final static String DEAL__UPPER_CASE_NAME = "de.nak.xtext.hausarbeit.rentalSystem.validation.dealUpperCaseName";
  
  @Check
  public void dealShallStartWithLowerCase(final Deal deal) {
    String _name = deal.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      String _name_1 = deal.getName();
      this.warning(
        "The deal should start with a lower case.", 
        RentalSystemPackage.Literals.DEAL__NAME, 
        DealValidator.DEAL__UPPER_CASE_NAME, _name_1);
    }
  }
}
