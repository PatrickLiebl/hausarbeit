/*
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalWorkflow.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
public class RentalWorkflowGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RentalWorkflowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.RentalWorkflow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRentalWorkflowAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDefineWfKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cEventsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEventAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEventEventParserRuleCall_4_0 = (RuleCall)cEventAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cResetEventsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cResetEventsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cResetEventsEventCrossReference_7_0 = (CrossReference)cResetEventsAssignment_7.eContents().get(0);
		private final RuleCall cResetEventsEventIDTerminalRuleCall_7_0_1 = (RuleCall)cResetEventsEventCrossReference_7_0.eContents().get(1);
		private final Keyword cEndKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cCommandsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cCommandsAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cCommandsCommandParserRuleCall_10_0 = (RuleCall)cCommandsAssignment_10.eContents().get(0);
		private final Keyword cEndKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cStatesAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cStatesStateParserRuleCall_12_0 = (RuleCall)cStatesAssignment_12.eContents().get(0);
		
		//RentalWorkflow:
		//	{RentalWorkflow} 'defineWf' name=ID 'events' event+=Event* 'end' 'resetEvents' resetEvents+=[Event]* 'end' 'commands'
		//	commands+=Command* 'end' states+=State*;
		@Override public ParserRule getRule() { return rule; }
		
		//{RentalWorkflow} 'defineWf' name=ID 'events' event+=Event* 'end' 'resetEvents' resetEvents+=[Event]* 'end' 'commands'
		//commands+=Command* 'end' states+=State*
		public Group getGroup() { return cGroup; }
		
		//{RentalWorkflow}
		public Action getRentalWorkflowAction_0() { return cRentalWorkflowAction_0; }
		
		//'defineWf'
		public Keyword getDefineWfKeyword_1() { return cDefineWfKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'events'
		public Keyword getEventsKeyword_3() { return cEventsKeyword_3; }
		
		//event+=Event*
		public Assignment getEventAssignment_4() { return cEventAssignment_4; }
		
		//Event
		public RuleCall getEventEventParserRuleCall_4_0() { return cEventEventParserRuleCall_4_0; }
		
		//'end'
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
		
		//'resetEvents'
		public Keyword getResetEventsKeyword_6() { return cResetEventsKeyword_6; }
		
		//resetEvents+=[Event]*
		public Assignment getResetEventsAssignment_7() { return cResetEventsAssignment_7; }
		
		//[Event]
		public CrossReference getResetEventsEventCrossReference_7_0() { return cResetEventsEventCrossReference_7_0; }
		
		//ID
		public RuleCall getResetEventsEventIDTerminalRuleCall_7_0_1() { return cResetEventsEventIDTerminalRuleCall_7_0_1; }
		
		//'end'
		public Keyword getEndKeyword_8() { return cEndKeyword_8; }
		
		//'commands'
		public Keyword getCommandsKeyword_9() { return cCommandsKeyword_9; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment_10() { return cCommandsAssignment_10; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_10_0() { return cCommandsCommandParserRuleCall_10_0; }
		
		//'end'
		public Keyword getEndKeyword_11() { return cEndKeyword_11; }
		
		//states+=State*
		public Assignment getStatesAssignment_12() { return cStatesAssignment_12; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_12_0() { return cStatesStateParserRuleCall_12_0; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cCodeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCodeIDTerminalRuleCall_1_0 = (RuleCall)cCodeAssignment_1.eContents().get(0);
		
		//Event:
		//	name=ID code=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID code=ID
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//code=ID
		public Assignment getCodeAssignment_1() { return cCodeAssignment_1; }
		
		//ID
		public RuleCall getCodeIDTerminalRuleCall_1_0() { return cCodeIDTerminalRuleCall_1_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.Command");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cCodeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCodeIDTerminalRuleCall_1_0 = (RuleCall)cCodeAssignment_1.eContents().get(0);
		
		//Command:
		//	name=ID code=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID code=ID
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//code=ID
		public Assignment getCodeAssignment_1() { return cCodeAssignment_1; }
		
		//ID
		public RuleCall getCodeIDTerminalRuleCall_1_0() { return cCodeIDTerminalRuleCall_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cOfTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOfTypeOfTypeEnumRuleCall_2_0 = (RuleCall)cOfTypeAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cActionsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cActionsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cActionsCommandCrossReference_3_2_0 = (CrossReference)cActionsAssignment_3_2.eContents().get(0);
		private final RuleCall cActionsCommandIDTerminalRuleCall_3_2_0_1 = (RuleCall)cActionsCommandCrossReference_3_2_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsTransitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//State:
		//	'state' name=ID ofType=OfType ('actions' '{' actions+=[Command]+ '}')? transitions+=Transition* 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'state' name=ID ofType=OfType ('actions' '{' actions+=[Command]+ '}')? transitions+=Transition* 'end'
		public Group getGroup() { return cGroup; }
		
		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//ofType=OfType
		public Assignment getOfTypeAssignment_2() { return cOfTypeAssignment_2; }
		
		//OfType
		public RuleCall getOfTypeOfTypeEnumRuleCall_2_0() { return cOfTypeOfTypeEnumRuleCall_2_0; }
		
		//('actions' '{' actions+=[Command]+ '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'actions'
		public Keyword getActionsKeyword_3_0() { return cActionsKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//actions+=[Command]+
		public Assignment getActionsAssignment_3_2() { return cActionsAssignment_3_2; }
		
		//[Command]
		public CrossReference getActionsCommandCrossReference_3_2_0() { return cActionsCommandCrossReference_3_2_0; }
		
		//ID
		public RuleCall getActionsCommandIDTerminalRuleCall_3_2_0_1() { return cActionsCommandIDTerminalRuleCall_3_2_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }
		
		//transitions+=Transition*
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_4_0() { return cTransitionsTransitionParserRuleCall_4_0; }
		
		//'end'
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEventAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEventEventCrossReference_0_0 = (CrossReference)cEventAssignment_0.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_0_0_1 = (RuleCall)cEventEventCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cStateStateCrossReference_2_0 = (CrossReference)cStateAssignment_2.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_2_0_1 = (RuleCall)cStateStateCrossReference_2_0.eContents().get(1);
		
		//Transition:
		//	event=[Event] '=>' state=[State];
		@Override public ParserRule getRule() { return rule; }
		
		//event=[Event] '=>' state=[State]
		public Group getGroup() { return cGroup; }
		
		//event=[Event]
		public Assignment getEventAssignment_0() { return cEventAssignment_0; }
		
		//[Event]
		public CrossReference getEventEventCrossReference_0_0() { return cEventEventCrossReference_0_0; }
		
		//ID
		public RuleCall getEventEventIDTerminalRuleCall_0_0_1() { return cEventEventIDTerminalRuleCall_0_0_1; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//state=[State]
		public Assignment getStateAssignment_2() { return cStateAssignment_2; }
		
		//[State]
		public CrossReference getStateStateCrossReference_2_0() { return cStateStateCrossReference_2_0; }
		
		//ID
		public RuleCall getStateStateIDTerminalRuleCall_2_0_1() { return cStateStateIDTerminalRuleCall_2_0_1; }
	}
	
	public class OfTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.OfType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cInitializingEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cInitializingInitializingKeyword_0_0 = (Keyword)cInitializingEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cCreatingEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cCreatingCreatingKeyword_1_0 = (Keyword)cCreatingEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBeginningEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBeginningBeginningKeyword_2_0 = (Keyword)cBeginningEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cRunningEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cRunningRunningKeyword_3_0 = (Keyword)cRunningEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cCancellingEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cCancellingCancellingKeyword_4_0 = (Keyword)cCancellingEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cReplacingEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cReplacingReplacingKeyword_5_0 = (Keyword)cReplacingEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cEnstoringEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cEnstoringEnstoringKeyword_6_0 = (Keyword)cEnstoringEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cFinishingEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cFinishingFinishingKeyword_7_0 = (Keyword)cFinishingEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum OfType:
		//	initializing | creating | beginning | running | cancelling | replacing | enstoring | finishing;
		public EnumRule getRule() { return rule; }
		
		//initializing | creating | beginning | running | cancelling | replacing | enstoring | finishing
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//initializing
		public EnumLiteralDeclaration getInitializingEnumLiteralDeclaration_0() { return cInitializingEnumLiteralDeclaration_0; }
		
		//'initializing'
		public Keyword getInitializingInitializingKeyword_0_0() { return cInitializingInitializingKeyword_0_0; }
		
		//creating
		public EnumLiteralDeclaration getCreatingEnumLiteralDeclaration_1() { return cCreatingEnumLiteralDeclaration_1; }
		
		//'creating'
		public Keyword getCreatingCreatingKeyword_1_0() { return cCreatingCreatingKeyword_1_0; }
		
		//beginning
		public EnumLiteralDeclaration getBeginningEnumLiteralDeclaration_2() { return cBeginningEnumLiteralDeclaration_2; }
		
		//'beginning'
		public Keyword getBeginningBeginningKeyword_2_0() { return cBeginningBeginningKeyword_2_0; }
		
		//running
		public EnumLiteralDeclaration getRunningEnumLiteralDeclaration_3() { return cRunningEnumLiteralDeclaration_3; }
		
		//'running'
		public Keyword getRunningRunningKeyword_3_0() { return cRunningRunningKeyword_3_0; }
		
		//cancelling
		public EnumLiteralDeclaration getCancellingEnumLiteralDeclaration_4() { return cCancellingEnumLiteralDeclaration_4; }
		
		//'cancelling'
		public Keyword getCancellingCancellingKeyword_4_0() { return cCancellingCancellingKeyword_4_0; }
		
		//replacing
		public EnumLiteralDeclaration getReplacingEnumLiteralDeclaration_5() { return cReplacingEnumLiteralDeclaration_5; }
		
		//'replacing'
		public Keyword getReplacingReplacingKeyword_5_0() { return cReplacingReplacingKeyword_5_0; }
		
		//enstoring
		public EnumLiteralDeclaration getEnstoringEnumLiteralDeclaration_6() { return cEnstoringEnumLiteralDeclaration_6; }
		
		//'enstoring'
		public Keyword getEnstoringEnstoringKeyword_6_0() { return cEnstoringEnstoringKeyword_6_0; }
		
		//finishing
		public EnumLiteralDeclaration getFinishingEnumLiteralDeclaration_7() { return cFinishingEnumLiteralDeclaration_7; }
		
		//'finishing'
		public Keyword getFinishingFinishingKeyword_7_0() { return cFinishingFinishingKeyword_7_0; }
	}
	
	private final RentalWorkflowElements pRentalWorkflow;
	private final EventElements pEvent;
	private final CommandElements pCommand;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final OfTypeElements eOfType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RentalWorkflowGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRentalWorkflow = new RentalWorkflowElements();
		this.pEvent = new EventElements();
		this.pCommand = new CommandElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.eOfType = new OfTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow".equals(grammar.getName())) {
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

	
	//RentalWorkflow:
	//	{RentalWorkflow} 'defineWf' name=ID 'events' event+=Event* 'end' 'resetEvents' resetEvents+=[Event]* 'end' 'commands'
	//	commands+=Command* 'end' states+=State*;
	public RentalWorkflowElements getRentalWorkflowAccess() {
		return pRentalWorkflow;
	}
	
	public ParserRule getRentalWorkflowRule() {
		return getRentalWorkflowAccess().getRule();
	}
	
	//Event:
	//	name=ID code=ID;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//Command:
	//	name=ID code=ID;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//State:
	//	'state' name=ID ofType=OfType ('actions' '{' actions+=[Command]+ '}')? transitions+=Transition* 'end';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	event=[Event] '=>' state=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//enum OfType:
	//	initializing | creating | beginning | running | cancelling | replacing | enstoring | finishing;
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
