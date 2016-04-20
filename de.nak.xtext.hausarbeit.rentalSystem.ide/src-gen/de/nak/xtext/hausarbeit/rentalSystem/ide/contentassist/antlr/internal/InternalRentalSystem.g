/*
 * generated by Xtext 2.9.2
 */
grammar InternalRentalSystem;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.nak.xtext.hausarbeit.rentalSystem.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.nak.xtext.hausarbeit.rentalSystem.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.nak.xtext.hausarbeit.rentalSystem.services.RentalSystemGrammarAccess;

}
@parser::members {
	private RentalSystemGrammarAccess grammarAccess;

	public void setGrammarAccess(RentalSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRentalSystem
entryRuleRentalSystem
:
{ before(grammarAccess.getRentalSystemRule()); }
	 ruleRentalSystem
{ after(grammarAccess.getRentalSystemRule()); } 
	 EOF 
;

// Rule RentalSystem
ruleRentalSystem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRentalSystemAccess().getGroup()); }
		(rule__RentalSystem__Group__0)
		{ after(grammarAccess.getRentalSystemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRentalType
entryRuleRentalType
:
{ before(grammarAccess.getRentalTypeRule()); }
	 ruleRentalType
{ after(grammarAccess.getRentalTypeRule()); } 
	 EOF 
;

// Rule RentalType
ruleRentalType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRentalTypeAccess().getGroup()); }
		(rule__RentalType__Group__0)
		{ after(grammarAccess.getRentalTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCustomer
entryRuleCustomer
:
{ before(grammarAccess.getCustomerRule()); }
	 ruleCustomer
{ after(grammarAccess.getCustomerRule()); } 
	 EOF 
;

// Rule Customer
ruleCustomer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCustomerAccess().getGroup()); }
		(rule__Customer__Group__0)
		{ after(grammarAccess.getCustomerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeal
entryRuleDeal
:
{ before(grammarAccess.getDealRule()); }
	 ruleDeal
{ after(grammarAccess.getDealRule()); } 
	 EOF 
;

// Rule Deal
ruleDeal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDealAccess().getGroup()); }
		(rule__Deal__Group__0)
		{ after(grammarAccess.getDealAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule OfType
ruleOfType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOfTypeAccess().getAlternatives()); }
		(rule__OfType__Alternatives)
		{ after(grammarAccess.getOfTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalTypeAccess().getMovableAssignment_0_0()); }
		(rule__RentalType__MovableAssignment_0_0)
		{ after(grammarAccess.getRentalTypeAccess().getMovableAssignment_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getRentalTypeAccess().getDigitalAssignment_0_1()); }
		(rule__RentalType__DigitalAssignment_0_1)
		{ after(grammarAccess.getRentalTypeAccess().getDigitalAssignment_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getRentalTypeAccess().getFixAssignment_0_2()); }
		(rule__RentalType__FixAssignment_0_2)
		{ after(grammarAccess.getRentalTypeAccess().getFixAssignment_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OfType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0()); }
		('int')
		{ after(grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1()); }
		('String')
		{ after(grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2()); }
		('Date')
		{ after(grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_3()); }
		('Double')
		{ after(grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getOfTypeAccess().getBooleanEnumLiteralDeclaration_4()); }
		('boolean')
		{ after(grammarAccess.getOfTypeAccess().getBooleanEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalSystem__Group__0__Impl
	rule__RentalSystem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalSystemAccess().getRentalSystemKeyword_0()); }
	'rentalSystem'
	{ after(grammarAccess.getRentalSystemAccess().getRentalSystemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalSystem__Group__1__Impl
	rule__RentalSystem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalSystemAccess().getNameAssignment_1()); }
	(rule__RentalSystem__NameAssignment_1)
	{ after(grammarAccess.getRentalSystemAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalSystem__Group__2__Impl
	rule__RentalSystem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalSystemAccess().getTitleAssignment_2()); }
	(rule__RentalSystem__TitleAssignment_2)
	{ after(grammarAccess.getRentalSystemAccess().getTitleAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalSystem__Group__3__Impl
	rule__RentalSystem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalSystemAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getRentalSystemAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalSystem__Group__4__Impl
	rule__RentalSystem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalSystemAccess().getRentalTypesAssignment_4()); }
	(rule__RentalSystem__RentalTypesAssignment_4)*
	{ after(grammarAccess.getRentalSystemAccess().getRentalTypesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalSystem__Group__5__Impl
	rule__RentalSystem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalSystemAccess().getCustomersAssignment_5()); }
	(rule__RentalSystem__CustomersAssignment_5)*
	{ after(grammarAccess.getRentalSystemAccess().getCustomersAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalSystem__Group__6__Impl
	rule__RentalSystem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalSystemAccess().getDealsAssignment_6()); }
	(rule__RentalSystem__DealsAssignment_6)*
	{ after(grammarAccess.getRentalSystemAccess().getDealsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalSystem__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalSystemAccess().getRightParenthesisKeyword_7()); }
	')'
	{ after(grammarAccess.getRentalSystemAccess().getRightParenthesisKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RentalType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalType__Group__0__Impl
	rule__RentalType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalTypeAccess().getAlternatives_0()); }
	(rule__RentalType__Alternatives_0)
	{ after(grammarAccess.getRentalTypeAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalType__Group__1__Impl
	rule__RentalType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalTypeAccess().getTypeMoldKeyword_1()); }
	'typeMold'
	{ after(grammarAccess.getRentalTypeAccess().getTypeMoldKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalType__Group__2__Impl
	rule__RentalType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalTypeAccess().getNameAssignment_2()); }
	(rule__RentalType__NameAssignment_2)
	{ after(grammarAccess.getRentalTypeAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalType__Group__3__Impl
	rule__RentalType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalTypeAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getRentalTypeAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalType__Group__4__Impl
	rule__RentalType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalTypeAccess().getTypeAttributesAssignment_4()); }
	(rule__RentalType__TypeAttributesAssignment_4)*
	{ after(grammarAccess.getRentalTypeAccess().getTypeAttributesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RentalType__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRentalTypeAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getRentalTypeAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Customer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Customer__Group__0__Impl
	rule__Customer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomerAccess().getCustomerMoldKeyword_0()); }
	'customerMold'
	{ after(grammarAccess.getCustomerAccess().getCustomerMoldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Customer__Group__1__Impl
	rule__Customer__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomerAccess().getNameAssignment_1()); }
	(rule__Customer__NameAssignment_1)
	{ after(grammarAccess.getCustomerAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Customer__Group__2__Impl
	rule__Customer__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Customer__Group__3__Impl
	rule__Customer__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomerAccess().getCustomerAttributeAssignment_3()); }
	(rule__Customer__CustomerAttributeAssignment_3)*
	{ after(grammarAccess.getCustomerAccess().getCustomerAttributeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Customer__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomerAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getCustomerAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Deal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__0__Impl
	rule__Deal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getDealKeyword_0()); }
	'deal'
	{ after(grammarAccess.getDealAccess().getDealKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__1__Impl
	rule__Deal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getNameAssignment_1()); }
	(rule__Deal__NameAssignment_1)
	{ after(grammarAccess.getDealAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__2__Impl
	rule__Deal__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getDealAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__3__Impl
	rule__Deal__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getCustomerKeyword_3()); }
	'customer'
	{ after(grammarAccess.getDealAccess().getCustomerKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__4__Impl
	rule__Deal__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getCustomerAssignment_4()); }
	(rule__Deal__CustomerAssignment_4)
	{ after(grammarAccess.getDealAccess().getCustomerAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__5__Impl
	rule__Deal__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getRentalTypeKeyword_5()); }
	'rentalType'
	{ after(grammarAccess.getDealAccess().getRentalTypeKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__6__Impl
	rule__Deal__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getRentalTypeAssignment_6()); }
	(rule__Deal__RentalTypeAssignment_6)
	{ after(grammarAccess.getDealAccess().getRentalTypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__7__Impl
	rule__Deal__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getDealAttributeKeyword_7()); }
	'dealAttribute'
	{ after(grammarAccess.getDealAccess().getDealAttributeKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__8__Impl
	rule__Deal__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getDealAttributesAssignment_8()); }
	(rule__Deal__DealAttributesAssignment_8)*
	{ after(grammarAccess.getDealAccess().getDealAttributesAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deal__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDealAccess().getRightParenthesisKeyword_9()); }
	')'
	{ after(grammarAccess.getDealAccess().getRightParenthesisKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); }
	'attribute'
	{ after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
	(rule__Attribute__NameAssignment_1)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getValueAssignment_2()); }
	(rule__Attribute__ValueAssignment_2)
	{ after(grammarAccess.getAttributeAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getOfTypeAssignment_3()); }
	(rule__Attribute__OfTypeAssignment_3)
	{ after(grammarAccess.getAttributeAccess().getOfTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RentalSystem__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalSystemAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRentalSystemAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__TitleAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalSystemAccess().getTitleSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getRentalSystemAccess().getTitleSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__RentalTypesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalSystemAccess().getRentalTypesRentalTypeParserRuleCall_4_0()); }
		ruleRentalType
		{ after(grammarAccess.getRentalSystemAccess().getRentalTypesRentalTypeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__CustomersAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalSystemAccess().getCustomersCustomerParserRuleCall_5_0()); }
		ruleCustomer
		{ after(grammarAccess.getRentalSystemAccess().getCustomersCustomerParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalSystem__DealsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalSystemAccess().getDealsDealParserRuleCall_6_0()); }
		ruleDeal
		{ after(grammarAccess.getRentalSystemAccess().getDealsDealParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__MovableAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalTypeAccess().getMovableMovableKeyword_0_0_0()); }
		(
			{ before(grammarAccess.getRentalTypeAccess().getMovableMovableKeyword_0_0_0()); }
			'movable'
			{ after(grammarAccess.getRentalTypeAccess().getMovableMovableKeyword_0_0_0()); }
		)
		{ after(grammarAccess.getRentalTypeAccess().getMovableMovableKeyword_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__DigitalAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalTypeAccess().getDigitalDigitalKeyword_0_1_0()); }
		(
			{ before(grammarAccess.getRentalTypeAccess().getDigitalDigitalKeyword_0_1_0()); }
			'digital'
			{ after(grammarAccess.getRentalTypeAccess().getDigitalDigitalKeyword_0_1_0()); }
		)
		{ after(grammarAccess.getRentalTypeAccess().getDigitalDigitalKeyword_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__FixAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalTypeAccess().getFixFixKeyword_0_2_0()); }
		(
			{ before(grammarAccess.getRentalTypeAccess().getFixFixKeyword_0_2_0()); }
			'fix'
			{ after(grammarAccess.getRentalTypeAccess().getFixFixKeyword_0_2_0()); }
		)
		{ after(grammarAccess.getRentalTypeAccess().getFixFixKeyword_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalTypeAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getRentalTypeAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RentalType__TypeAttributesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRentalTypeAccess().getTypeAttributesAttributeParserRuleCall_4_0()); }
		ruleAttribute
		{ after(grammarAccess.getRentalTypeAccess().getTypeAttributesAttributeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Customer__CustomerAttributeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCustomerAccess().getCustomerAttributeAttributeParserRuleCall_3_0()); }
		ruleAttribute
		{ after(grammarAccess.getCustomerAccess().getCustomerAttributeAttributeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDealAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDealAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__CustomerAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDealAccess().getCustomerCustomerCrossReference_4_0()); }
		(
			{ before(grammarAccess.getDealAccess().getCustomerCustomerIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDealAccess().getCustomerCustomerIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getDealAccess().getCustomerCustomerCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__RentalTypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDealAccess().getRentalTypeRentalTypeCrossReference_6_0()); }
		(
			{ before(grammarAccess.getDealAccess().getRentalTypeRentalTypeIDTerminalRuleCall_6_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDealAccess().getRentalTypeRentalTypeIDTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getDealAccess().getRentalTypeRentalTypeCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deal__DealAttributesAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDealAccess().getDealAttributesAttributeParserRuleCall_8_0()); }
		ruleAttribute
		{ after(grammarAccess.getDealAccess().getDealAttributesAttributeParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__OfTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getOfTypeOfTypeEnumRuleCall_3_0()); }
		ruleOfType
		{ after(grammarAccess.getAttributeAccess().getOfTypeOfTypeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
