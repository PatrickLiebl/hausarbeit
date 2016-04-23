/*
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.ui.quickfix

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType
import de.nak.xtext.hausarbeit.rentalSystem.validation.AttributeValidator
import de.nak.xtext.hausarbeit.rentalSystem.validation.CustomerValidator
import de.nak.xtext.hausarbeit.rentalSystem.validation.DealValidator
import de.nak.xtext.hausarbeit.rentalSystem.validation.RentalSystemValidator
import de.nak.xtext.hausarbeit.rentalSystem.validation.RentalTypeValidator
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue


/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
class RentalSystemQuickfixProvider extends DefaultQuickfixProvider {

	private final String DEFAULT_NAME = 'rentalSystem'
	
	@Fix(RentalSystemValidator.RENTAL_SYSTEM__EMPTY_TITLE)
	def useDefaultTitle(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Use the default name.', 'Use the default name "' + DEFAULT_NAME + '" as the name.', 'upcase.png') [
			context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, 1, '"' + DEFAULT_NAME)
		]
	}
	
	@Fix(RentalSystemValidator.RENTAL_SYSTEM__UPPER_CASE_TITLE)
	def decapitalizeTitle(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Decapitalize the title.', 'Change the first character of the title to lower case.', 'downcase.png') [
			element, context |
			(element as RentalSystem).title = issue.data.get(0).toFirstLower
		]
	}
	
	@Fix(RentalSystemValidator.RENTAL_SYSTEM__UPPER_CASE_NAME)
	def decapitalizeRentalSystem(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Decapitalize the name of the rentalSystem.', 'Change the first character of the rentalSystem to lower case.', 'downcase.png') [
			element, context |
			(element as RentalSystem).name = issue.data.get(0).toFirstLower
		]
	}
	
	@Fix(AttributeValidator.ATTRIBUTE__UPPER_CASE_NAME)
	def decapitalizeAttribute(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Decapitalize the name of the attribute.', 'Change the first character of the attribute to lower case.', 'downcase.png') [
			element, context |
			(element as Attribute).name = issue.data.get(0).toFirstLower
		]
	}
	
	@Fix(CustomerValidator.CUSTOMER__UPPER_CASE_NAME)
	def decapitalizeCustomer(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Decapitalize the name of the customer.', 'Change the first character of the customer to lower case.', 'downcase.png') [
			element, context |
			(element as Customer).name = issue.data.get(0).toFirstLower
		]
	}
	
	@Fix(DealValidator.DEAL__UPPER_CASE_NAME)
	def decapitalizeDeal(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Decapitalize the name of the deal.', 'Change the first character of the deal to lower case.', 'downcase.png') [
			element, context |
			(element as Deal).name = issue.data.get(0).toFirstLower
		]
	}
	
	@Fix(RentalTypeValidator.RENTAL_TYPE__UPPER_CASE_NAME)
	def decapitalizeRentalType(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Decapitalize the name of the rentalType.', 'Change the first character of the rentalType to lower case.', 'downcase.png') [
			element, context |
			(element as RentalType).name = issue.data.get(0).toFirstLower
		]
	}
}
