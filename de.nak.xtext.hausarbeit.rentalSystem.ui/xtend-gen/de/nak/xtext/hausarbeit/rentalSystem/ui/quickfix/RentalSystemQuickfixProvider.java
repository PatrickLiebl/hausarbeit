/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.ui.quickfix;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType;
import de.nak.xtext.hausarbeit.rentalSystem.validation.AttributeValidator;
import de.nak.xtext.hausarbeit.rentalSystem.validation.CustomerValidator;
import de.nak.xtext.hausarbeit.rentalSystem.validation.DealValidator;
import de.nak.xtext.hausarbeit.rentalSystem.validation.RentalSystemValidator;
import de.nak.xtext.hausarbeit.rentalSystem.validation.RentalTypeValidator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
@SuppressWarnings("all")
public class RentalSystemQuickfixProvider extends DefaultQuickfixProvider {
  private final String DEFAULT_NAME = "rentalSystem";
  
  @Fix(RentalSystemValidator.RENTAL_SYSTEM__EMPTY_TITLE)
  public void useDefaultTitle(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      xtextDocument.replace((_offset).intValue(), 1, ("\"" + this.DEFAULT_NAME));
    };
    acceptor.accept(issue, "Use the default name.", (("Use the default name \"" + this.DEFAULT_NAME) + "\" as the name."), "upcase.png", _function);
  }
  
  @Fix(RentalSystemValidator.RENTAL_SYSTEM__UPPER_CASE_TITLE)
  public void decapitalizeTitle(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      String[] _data = issue.getData();
      String _get = _data[0];
      String _firstLower = StringExtensions.toFirstLower(_get);
      ((RentalSystem) element).setTitle(_firstLower);
    };
    acceptor.accept(issue, "Decapitalize the title.", "Change the first character of the title to lower case.", "downcase.png", _function);
  }
  
  @Fix(RentalSystemValidator.RENTAL_SYSTEM__UPPER_CASE_NAME)
  public void decapitalizeRentalSystem(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      String[] _data = issue.getData();
      String _get = _data[0];
      String _firstLower = StringExtensions.toFirstLower(_get);
      ((RentalSystem) element).setName(_firstLower);
    };
    acceptor.accept(issue, "Decapitalize the name of the rentalSystem.", "Change the first character of the rentalSystem to lower case.", "downcase.png", _function);
  }
  
  @Fix(AttributeValidator.ATTRIBUTE__UPPER_CASE_NAME)
  public void decapitalizeAttribute(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      String[] _data = issue.getData();
      String _get = _data[0];
      String _firstLower = StringExtensions.toFirstLower(_get);
      ((Attribute) element).setName(_firstLower);
    };
    acceptor.accept(issue, "Decapitalize the name of the attribute.", "Change the first character of the attribute to lower case.", "downcase.png", _function);
  }
  
  @Fix(CustomerValidator.CUSTOMER__UPPER_CASE_NAME)
  public void decapitalizeCustomer(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      String[] _data = issue.getData();
      String _get = _data[0];
      String _firstLower = StringExtensions.toFirstLower(_get);
      ((Customer) element).setName(_firstLower);
    };
    acceptor.accept(issue, "Decapitalize the name of the customer.", "Change the first character of the customer to lower case.", "downcase.png", _function);
  }
  
  @Fix(DealValidator.DEAL__UPPER_CASE_NAME)
  public void decapitalizeDeal(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      String[] _data = issue.getData();
      String _get = _data[0];
      String _firstLower = StringExtensions.toFirstLower(_get);
      ((Deal) element).setName(_firstLower);
    };
    acceptor.accept(issue, "Decapitalize the name of the deal.", "Change the first character of the deal to lower case.", "downcase.png", _function);
  }
  
  @Fix(RentalTypeValidator.RENTAL_TYPE__UPPER_CASE_NAME)
  public void decapitalizeRentalType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      String[] _data = issue.getData();
      String _get = _data[0];
      String _firstLower = StringExtensions.toFirstLower(_get);
      ((RentalType) element).setName(_firstLower);
    };
    acceptor.accept(issue, "Decapitalize the name of the rentalType.", "Change the first character of the rentalType to lower case.", "downcase.png", _function);
  }
}
