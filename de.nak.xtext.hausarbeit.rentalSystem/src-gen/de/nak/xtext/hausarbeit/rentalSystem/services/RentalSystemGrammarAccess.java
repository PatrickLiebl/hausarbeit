/*
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RentalSystemGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RentalSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.RentalSystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRentalSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTitleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_0 = (RuleCall)cTitleAssignment_2.eContents().get(0);
		private final Assignment cTypesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypesTypeParserRuleCall_3_0 = (RuleCall)cTypesAssignment_3.eContents().get(0);
		private final Assignment cCustomersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCustomersCustomerParserRuleCall_4_0 = (RuleCall)cCustomersAssignment_4.eContents().get(0);
		private final Assignment cDealsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDealsDealParserRuleCall_5_0 = (RuleCall)cDealsAssignment_5.eContents().get(0);
		
		//RentalSystem:
		//	'rentalSystem' name=ID title=STRING
		//	types+=Type*
		//	customers+=Customer*
		//	deals+=Deal*;
		@Override public ParserRule getRule() { return rule; }
		
		//'rentalSystem' name=ID title=STRING types+=Type* customers+=Customer* deals+=Deal*
		public Group getGroup() { return cGroup; }
		
		//'rentalSystem'
		public Keyword getRentalSystemKeyword_0() { return cRentalSystemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//title=STRING
		public Assignment getTitleAssignment_2() { return cTitleAssignment_2; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_0() { return cTitleSTRINGTerminalRuleCall_2_0; }
		
		//types+=Type*
		public Assignment getTypesAssignment_3() { return cTypesAssignment_3; }
		
		//Type
		public RuleCall getTypesTypeParserRuleCall_3_0() { return cTypesTypeParserRuleCall_3_0; }
		
		//customers+=Customer*
		public Assignment getCustomersAssignment_4() { return cCustomersAssignment_4; }
		
		//Customer
		public RuleCall getCustomersCustomerParserRuleCall_4_0() { return cCustomersCustomerParserRuleCall_4_0; }
		
		//deals+=Deal*
		public Assignment getDealsAssignment_5() { return cDealsAssignment_5; }
		
		//Deal
		public RuleCall getDealsDealParserRuleCall_5_0() { return cDealsDealParserRuleCall_5_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cMovableAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final Keyword cMovableMovableKeyword_0_0_0 = (Keyword)cMovableAssignment_0_0.eContents().get(0);
		private final Assignment cDigitalAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final Keyword cDigitalDigitalKeyword_0_1_0 = (Keyword)cDigitalAssignment_0_1.eContents().get(0);
		private final Assignment cFixAssignment_0_2 = (Assignment)cAlternatives_0.eContents().get(2);
		private final Keyword cFixFixKeyword_0_2_0 = (Keyword)cFixAssignment_0_2.eContents().get(0);
		private final Keyword cTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cTypeWorkFlowKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cWfAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cWfRentalWorkflowCrossReference_5_0 = (CrossReference)cWfAssignment_5.eContents().get(0);
		private final RuleCall cWfRentalWorkflowIDTerminalRuleCall_5_0_1 = (RuleCall)cWfRentalWorkflowCrossReference_5_0.eContents().get(1);
		private final Assignment cTypeAttributesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTypeAttributesAttributeParserRuleCall_6_0 = (RuleCall)cTypeAttributesAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Type:
		//	(movable?='movable' | digital?='digital' | fix?='fix') 'type' name=ID '('
		//	'typeWorkFlow' wf=[rentalWorkflow::RentalWorkflow] typeAttributes+=Attribute*
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//(movable?='movable' | digital?='digital' | fix?='fix') 'type' name=ID '(' 'typeWorkFlow'
		//wf=[rentalWorkflow::RentalWorkflow] typeAttributes+=Attribute* ')'
		public Group getGroup() { return cGroup; }
		
		//(movable?='movable' | digital?='digital' | fix?='fix')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//movable?='movable'
		public Assignment getMovableAssignment_0_0() { return cMovableAssignment_0_0; }
		
		//'movable'
		public Keyword getMovableMovableKeyword_0_0_0() { return cMovableMovableKeyword_0_0_0; }
		
		//digital?='digital'
		public Assignment getDigitalAssignment_0_1() { return cDigitalAssignment_0_1; }
		
		//'digital'
		public Keyword getDigitalDigitalKeyword_0_1_0() { return cDigitalDigitalKeyword_0_1_0; }
		
		//fix?='fix'
		public Assignment getFixAssignment_0_2() { return cFixAssignment_0_2; }
		
		//'fix'
		public Keyword getFixFixKeyword_0_2_0() { return cFixFixKeyword_0_2_0; }
		
		//'type'
		public Keyword getTypeKeyword_1() { return cTypeKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//'typeWorkFlow'
		public Keyword getTypeWorkFlowKeyword_4() { return cTypeWorkFlowKeyword_4; }
		
		//wf=[rentalWorkflow::RentalWorkflow]
		public Assignment getWfAssignment_5() { return cWfAssignment_5; }
		
		//[rentalWorkflow::RentalWorkflow]
		public CrossReference getWfRentalWorkflowCrossReference_5_0() { return cWfRentalWorkflowCrossReference_5_0; }
		
		//ID
		public RuleCall getWfRentalWorkflowIDTerminalRuleCall_5_0_1() { return cWfRentalWorkflowIDTerminalRuleCall_5_0_1; }
		
		//typeAttributes+=Attribute*
		public Assignment getTypeAttributesAssignment_6() { return cTypeAttributesAssignment_6; }
		
		//Attribute
		public RuleCall getTypeAttributesAttributeParserRuleCall_6_0() { return cTypeAttributesAttributeParserRuleCall_6_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class DealElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Deal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDealKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cCustomerKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCustomerAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cCustomerCustomerCrossReference_4_0 = (CrossReference)cCustomerAssignment_4.eContents().get(0);
		private final RuleCall cCustomerCustomerIDTerminalRuleCall_4_0_1 = (RuleCall)cCustomerCustomerCrossReference_4_0.eContents().get(1);
		private final Keyword cRentalTypeKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cRentalTypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cRentalTypeTypeCrossReference_6_0 = (CrossReference)cRentalTypeAssignment_6.eContents().get(0);
		private final RuleCall cRentalTypeTypeIDTerminalRuleCall_6_0_1 = (RuleCall)cRentalTypeTypeCrossReference_6_0.eContents().get(1);
		private final Assignment cAttributesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAttributesAttributeParserRuleCall_7_0 = (RuleCall)cAttributesAssignment_7.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Deal:
		//	'deal' name=ID '('
		//	'customer' customer=[Customer]
		//	'rentalType' rentalType=[Type] attributes+=Attribute*
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'deal' name=ID '(' 'customer' customer=[Customer] 'rentalType' rentalType=[Type] attributes+=Attribute* ')'
		public Group getGroup() { return cGroup; }
		
		//'deal'
		public Keyword getDealKeyword_0() { return cDealKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//'customer'
		public Keyword getCustomerKeyword_3() { return cCustomerKeyword_3; }
		
		//customer=[Customer]
		public Assignment getCustomerAssignment_4() { return cCustomerAssignment_4; }
		
		//[Customer]
		public CrossReference getCustomerCustomerCrossReference_4_0() { return cCustomerCustomerCrossReference_4_0; }
		
		//ID
		public RuleCall getCustomerCustomerIDTerminalRuleCall_4_0_1() { return cCustomerCustomerIDTerminalRuleCall_4_0_1; }
		
		//'rentalType'
		public Keyword getRentalTypeKeyword_5() { return cRentalTypeKeyword_5; }
		
		//rentalType=[Type]
		public Assignment getRentalTypeAssignment_6() { return cRentalTypeAssignment_6; }
		
		//[Type]
		public CrossReference getRentalTypeTypeCrossReference_6_0() { return cRentalTypeTypeCrossReference_6_0; }
		
		//ID
		public RuleCall getRentalTypeTypeIDTerminalRuleCall_6_0_1() { return cRentalTypeTypeIDTerminalRuleCall_6_0_1; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_7() { return cAttributesAssignment_7; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_7_0() { return cAttributesAttributeParserRuleCall_7_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }
	}
	public class CustomerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Customer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCustomerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Customer:
		//	'customer' name=ID '('
		//	attributes+=Attribute*
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'customer' name=ID '(' attributes+=Attribute* ')'
		public Group getGroup() { return cGroup; }
		
		//'customer'
		public Keyword getCustomerKeyword_0() { return cCustomerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_3_0() { return cAttributesAttributeParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Assignment cOfTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOfTypeOfTypeEnumRuleCall_3_0 = (RuleCall)cOfTypeAssignment_3.eContents().get(0);
		
		//Attribute:
		//	'attribute' name=ID value=STRING ofType=OfType;
		@Override public ParserRule getRule() { return rule; }
		
		//'attribute' name=ID value=STRING ofType=OfType
		public Group getGroup() { return cGroup; }
		
		//'attribute'
		public Keyword getAttributeKeyword_0() { return cAttributeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
		
		//ofType=OfType
		public Assignment getOfTypeAssignment_3() { return cOfTypeAssignment_3; }
		
		//OfType
		public RuleCall getOfTypeOfTypeEnumRuleCall_3_0() { return cOfTypeOfTypeEnumRuleCall_3_0; }
	}
	
	public class OfTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.OfType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIntEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIntIntKeyword_0_0 = (Keyword)cIntEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cStringStringKeyword_1_0 = (Keyword)cStringEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cDateEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cDateDateKeyword_2_0 = (Keyword)cDateEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDecimalEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDecimalDecimalKeyword_3_0 = (Keyword)cDecimalEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cDoubleDoubleKeyword_4_0 = (Keyword)cDoubleEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cDayEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cDayDayKeyword_5_0 = (Keyword)cDayEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cWeekEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cWeekWeekKeyword_6_0 = (Keyword)cWeekEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cMonthEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cMonthMonthKeyword_7_0 = (Keyword)cMonthEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cEMailEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cEMailEmailKeyword_8_0 = (Keyword)cEMailEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cMobileEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cMobileMobileKeyword_9_0 = (Keyword)cMobileEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cCurrencyEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cCurrencyCurrencyKeyword_10_0 = (Keyword)cCurrencyEnumLiteralDeclaration_10.eContents().get(0);
		
		//enum OfType:
		//	int | string | date | decimal | double | day | week | month | EMail='email'
		//	| Mobile='mobile'
		//	| currency;
		public EnumRule getRule() { return rule; }
		
		//int | string | date | decimal | double | day | week | month | EMail='email' | Mobile='mobile' | currency
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//int
		public EnumLiteralDeclaration getIntEnumLiteralDeclaration_0() { return cIntEnumLiteralDeclaration_0; }
		
		//'int'
		public Keyword getIntIntKeyword_0_0() { return cIntIntKeyword_0_0; }
		
		//string
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_1() { return cStringEnumLiteralDeclaration_1; }
		
		//'string'
		public Keyword getStringStringKeyword_1_0() { return cStringStringKeyword_1_0; }
		
		//date
		public EnumLiteralDeclaration getDateEnumLiteralDeclaration_2() { return cDateEnumLiteralDeclaration_2; }
		
		//'date'
		public Keyword getDateDateKeyword_2_0() { return cDateDateKeyword_2_0; }
		
		//decimal
		public EnumLiteralDeclaration getDecimalEnumLiteralDeclaration_3() { return cDecimalEnumLiteralDeclaration_3; }
		
		//'decimal'
		public Keyword getDecimalDecimalKeyword_3_0() { return cDecimalDecimalKeyword_3_0; }
		
		//double
		public EnumLiteralDeclaration getDoubleEnumLiteralDeclaration_4() { return cDoubleEnumLiteralDeclaration_4; }
		
		//'double'
		public Keyword getDoubleDoubleKeyword_4_0() { return cDoubleDoubleKeyword_4_0; }
		
		//day
		public EnumLiteralDeclaration getDayEnumLiteralDeclaration_5() { return cDayEnumLiteralDeclaration_5; }
		
		//'day'
		public Keyword getDayDayKeyword_5_0() { return cDayDayKeyword_5_0; }
		
		//week
		public EnumLiteralDeclaration getWeekEnumLiteralDeclaration_6() { return cWeekEnumLiteralDeclaration_6; }
		
		//'week'
		public Keyword getWeekWeekKeyword_6_0() { return cWeekWeekKeyword_6_0; }
		
		//month
		public EnumLiteralDeclaration getMonthEnumLiteralDeclaration_7() { return cMonthEnumLiteralDeclaration_7; }
		
		//'month'
		public Keyword getMonthMonthKeyword_7_0() { return cMonthMonthKeyword_7_0; }
		
		//EMail='email'
		public EnumLiteralDeclaration getEMailEnumLiteralDeclaration_8() { return cEMailEnumLiteralDeclaration_8; }
		
		//'email'
		public Keyword getEMailEmailKeyword_8_0() { return cEMailEmailKeyword_8_0; }
		
		//Mobile='mobile'
		public EnumLiteralDeclaration getMobileEnumLiteralDeclaration_9() { return cMobileEnumLiteralDeclaration_9; }
		
		//'mobile'
		public Keyword getMobileMobileKeyword_9_0() { return cMobileMobileKeyword_9_0; }
		
		//currency
		public EnumLiteralDeclaration getCurrencyEnumLiteralDeclaration_10() { return cCurrencyEnumLiteralDeclaration_10; }
		
		//'currency'
		public Keyword getCurrencyCurrencyKeyword_10_0() { return cCurrencyCurrencyKeyword_10_0; }
	}
	
	private final RentalSystemElements pRentalSystem;
	private final TypeElements pType;
	private final QualifiedNameElements pQualifiedName;
	private final DealElements pDeal;
	private final CustomerElements pCustomer;
	private final AttributeElements pAttribute;
	private final OfTypeElements eOfType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RentalSystemGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRentalSystem = new RentalSystemElements();
		this.pType = new TypeElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pDeal = new DealElements();
		this.pCustomer = new CustomerElements();
		this.pAttribute = new AttributeElements();
		this.eOfType = new OfTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.nak.xtext.hausarbeit.rentalSystem.RentalSystem".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RentalSystem:
	//	'rentalSystem' name=ID title=STRING
	//	types+=Type*
	//	customers+=Customer*
	//	deals+=Deal*;
	public RentalSystemElements getRentalSystemAccess() {
		return pRentalSystem;
	}
	
	public ParserRule getRentalSystemRule() {
		return getRentalSystemAccess().getRule();
	}
	
	//Type:
	//	(movable?='movable' | digital?='digital' | fix?='fix') 'type' name=ID '('
	//	'typeWorkFlow' wf=[rentalWorkflow::RentalWorkflow] typeAttributes+=Attribute*
	//	')';
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Deal:
	//	'deal' name=ID '('
	//	'customer' customer=[Customer]
	//	'rentalType' rentalType=[Type] attributes+=Attribute*
	//	')';
	public DealElements getDealAccess() {
		return pDeal;
	}
	
	public ParserRule getDealRule() {
		return getDealAccess().getRule();
	}
	
	//Customer:
	//	'customer' name=ID '('
	//	attributes+=Attribute*
	//	')';
	public CustomerElements getCustomerAccess() {
		return pCustomer;
	}
	
	public ParserRule getCustomerRule() {
		return getCustomerAccess().getRule();
	}
	
	//Attribute:
	//	'attribute' name=ID value=STRING ofType=OfType;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//enum OfType:
	//	int | string | date | decimal | double | day | week | month | EMail='email'
	//	| Mobile='mobile'
	//	| currency;
	public OfTypeElements getOfTypeAccess() {
		return eOfType;
	}
	
	public EnumRule getOfTypeRule() {
		return getOfTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
