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
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRentalTypesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRentalTypesRentalTypeParserRuleCall_4_0 = (RuleCall)cRentalTypesAssignment_4.eContents().get(0);
		private final Assignment cCustomersAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCustomersCustomerParserRuleCall_5_0 = (RuleCall)cCustomersAssignment_5.eContents().get(0);
		private final Assignment cDealsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDealsDealParserRuleCall_6_0 = (RuleCall)cDealsAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//RentalSystem:
		//	'rentalSystem' name=ID title=STRING '('
		//	rentalTypes+=RentalType*
		//	customers+=Customer*
		//	deals+=Deal* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'rentalSystem' name=ID title=STRING '(' rentalTypes+=RentalType* customers+=Customer* deals+=Deal* ')'
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
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//rentalTypes+=RentalType*
		public Assignment getRentalTypesAssignment_4() { return cRentalTypesAssignment_4; }
		
		//RentalType
		public RuleCall getRentalTypesRentalTypeParserRuleCall_4_0() { return cRentalTypesRentalTypeParserRuleCall_4_0; }
		
		//customers+=Customer*
		public Assignment getCustomersAssignment_5() { return cCustomersAssignment_5; }
		
		//Customer
		public RuleCall getCustomersCustomerParserRuleCall_5_0() { return cCustomersCustomerParserRuleCall_5_0; }
		
		//deals+=Deal*
		public Assignment getDealsAssignment_6() { return cDealsAssignment_6; }
		
		//Deal
		public RuleCall getDealsDealParserRuleCall_6_0() { return cDealsDealParserRuleCall_6_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class RentalTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.RentalType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cMovableAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final Keyword cMovableMovableKeyword_0_0_0 = (Keyword)cMovableAssignment_0_0.eContents().get(0);
		private final Assignment cDigitalAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final Keyword cDigitalDigitalKeyword_0_1_0 = (Keyword)cDigitalAssignment_0_1.eContents().get(0);
		private final Assignment cFixAssignment_0_2 = (Assignment)cAlternatives_0.eContents().get(2);
		private final Keyword cFixFixKeyword_0_2_0 = (Keyword)cFixAssignment_0_2.eContents().get(0);
		private final Keyword cTypeMoldKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeAttributesAttributeParserRuleCall_4_0 = (RuleCall)cTypeAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//RentalType:
		//	(movable?='movable' | digital?='digital' | fix?='fix') 'typeMold' name=ID '('
		//	typeAttributes+=Attribute*
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//(movable?='movable' | digital?='digital' | fix?='fix') 'typeMold' name=ID '(' typeAttributes+=Attribute* ')'
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
		
		//'typeMold'
		public Keyword getTypeMoldKeyword_1() { return cTypeMoldKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//typeAttributes+=Attribute*
		public Assignment getTypeAttributesAssignment_4() { return cTypeAttributesAssignment_4; }
		
		//Attribute
		public RuleCall getTypeAttributesAttributeParserRuleCall_4_0() { return cTypeAttributesAttributeParserRuleCall_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class CustomerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Customer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCustomerMoldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCustomerAttributeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCustomerAttributeAttributeParserRuleCall_3_0 = (RuleCall)cCustomerAttributeAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Customer:
		//	'customerMold' name=ID '('
		//	customerAttribute+=Attribute*
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'customerMold' name=ID '(' customerAttribute+=Attribute* ')'
		public Group getGroup() { return cGroup; }
		
		//'customerMold'
		public Keyword getCustomerMoldKeyword_0() { return cCustomerMoldKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//customerAttribute+=Attribute*
		public Assignment getCustomerAttributeAssignment_3() { return cCustomerAttributeAssignment_3; }
		
		//Attribute
		public RuleCall getCustomerAttributeAttributeParserRuleCall_3_0() { return cCustomerAttributeAttributeParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
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
		private final CrossReference cRentalTypeRentalTypeCrossReference_6_0 = (CrossReference)cRentalTypeAssignment_6.eContents().get(0);
		private final RuleCall cRentalTypeRentalTypeIDTerminalRuleCall_6_0_1 = (RuleCall)cRentalTypeRentalTypeCrossReference_6_0.eContents().get(1);
		private final Keyword cDealAttributeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDealAttributesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDealAttributesAttributeParserRuleCall_8_0 = (RuleCall)cDealAttributesAssignment_8.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Deal:
		//	'deal' name=ID '('
		//	'customer' customer=[Customer]
		//	'rentalType' rentalType=[RentalType]
		//	'dealAttribute' dealAttributes+=Attribute*
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'deal' name=ID '(' 'customer' customer=[Customer] 'rentalType' rentalType=[RentalType] 'dealAttribute'
		//dealAttributes+=Attribute* ')'
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
		
		//rentalType=[RentalType]
		public Assignment getRentalTypeAssignment_6() { return cRentalTypeAssignment_6; }
		
		//[RentalType]
		public CrossReference getRentalTypeRentalTypeCrossReference_6_0() { return cRentalTypeRentalTypeCrossReference_6_0; }
		
		//ID
		public RuleCall getRentalTypeRentalTypeIDTerminalRuleCall_6_0_1() { return cRentalTypeRentalTypeIDTerminalRuleCall_6_0_1; }
		
		//'dealAttribute'
		public Keyword getDealAttributeKeyword_7() { return cDealAttributeKeyword_7; }
		
		//dealAttributes+=Attribute*
		public Assignment getDealAttributesAssignment_8() { return cDealAttributesAssignment_8; }
		
		//Attribute
		public RuleCall getDealAttributesAttributeParserRuleCall_8_0() { return cDealAttributesAttributeParserRuleCall_8_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
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
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDoubleDoubleKeyword_3_0 = (Keyword)cDoubleEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cBooleanBooleanKeyword_4_0 = (Keyword)cBooleanEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum OfType:
		//	int | string='String'
		//	| date='Date'
		//	| double='Double'
		//	| boolean;
		public EnumRule getRule() { return rule; }
		
		//int | string='String' | date='Date' | double='Double' | boolean
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//int
		public EnumLiteralDeclaration getIntEnumLiteralDeclaration_0() { return cIntEnumLiteralDeclaration_0; }
		
		//'int'
		public Keyword getIntIntKeyword_0_0() { return cIntIntKeyword_0_0; }
		
		//string='String'
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_1() { return cStringEnumLiteralDeclaration_1; }
		
		//'String'
		public Keyword getStringStringKeyword_1_0() { return cStringStringKeyword_1_0; }
		
		//date='Date'
		public EnumLiteralDeclaration getDateEnumLiteralDeclaration_2() { return cDateEnumLiteralDeclaration_2; }
		
		//'Date'
		public Keyword getDateDateKeyword_2_0() { return cDateDateKeyword_2_0; }
		
		//double='Double'
		public EnumLiteralDeclaration getDoubleEnumLiteralDeclaration_3() { return cDoubleEnumLiteralDeclaration_3; }
		
		//'Double'
		public Keyword getDoubleDoubleKeyword_3_0() { return cDoubleDoubleKeyword_3_0; }
		
		//boolean
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_4() { return cBooleanEnumLiteralDeclaration_4; }
		
		//'boolean'
		public Keyword getBooleanBooleanKeyword_4_0() { return cBooleanBooleanKeyword_4_0; }
	}
	
	private final RentalSystemElements pRentalSystem;
	private final RentalTypeElements pRentalType;
	private final CustomerElements pCustomer;
	private final QualifiedNameElements pQualifiedName;
	private final DealElements pDeal;
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
		this.pRentalType = new RentalTypeElements();
		this.pCustomer = new CustomerElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pDeal = new DealElements();
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
	//	'rentalSystem' name=ID title=STRING '('
	//	rentalTypes+=RentalType*
	//	customers+=Customer*
	//	deals+=Deal* ')';
	public RentalSystemElements getRentalSystemAccess() {
		return pRentalSystem;
	}
	
	public ParserRule getRentalSystemRule() {
		return getRentalSystemAccess().getRule();
	}
	
	//RentalType:
	//	(movable?='movable' | digital?='digital' | fix?='fix') 'typeMold' name=ID '('
	//	typeAttributes+=Attribute*
	//	')';
	public RentalTypeElements getRentalTypeAccess() {
		return pRentalType;
	}
	
	public ParserRule getRentalTypeRule() {
		return getRentalTypeAccess().getRule();
	}
	
	//Customer:
	//	'customerMold' name=ID '('
	//	customerAttribute+=Attribute*
	//	')';
	public CustomerElements getCustomerAccess() {
		return pCustomer;
	}
	
	public ParserRule getCustomerRule() {
		return getCustomerAccess().getRule();
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
	//	'rentalType' rentalType=[RentalType]
	//	'dealAttribute' dealAttributes+=Attribute*
	//	')';
	public DealElements getDealAccess() {
		return pDeal;
	}
	
	public ParserRule getDealRule() {
		return getDealAccess().getRule();
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
	//	int | string='String'
	//	| date='Date'
	//	| double='Double'
	//	| boolean;
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
