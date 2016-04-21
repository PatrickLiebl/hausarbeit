package de.nak.xtext.hausarbeit.rentalWorkflow.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.nak.xtext.hausarbeit.rentalWorkflow.services.RentalWorkflowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRentalWorkflowParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'defineWorkflow'", "'events'", "'end'", "'commands'", "'resetEvents'", "'state'", "'actions'", "'{'", "'}'", "'=>'", "'initializing'", "'creating'", "'running'", "'canceling'", "'finishing'", "'nextClicked'", "'backClicked'", "'cancelClicked'", "'doSave'", "'doAbort'", "'doDelete'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRentalWorkflowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRentalWorkflowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRentalWorkflowParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRentalWorkflow.g"; }



     	private RentalWorkflowGrammarAccess grammarAccess;

        public InternalRentalWorkflowParser(TokenStream input, RentalWorkflowGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RentalWorkflow";
       	}

       	@Override
       	protected RentalWorkflowGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRentalWorkflow"
    // InternalRentalWorkflow.g:65:1: entryRuleRentalWorkflow returns [EObject current=null] : iv_ruleRentalWorkflow= ruleRentalWorkflow EOF ;
    public final EObject entryRuleRentalWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRentalWorkflow = null;


        try {
            // InternalRentalWorkflow.g:65:55: (iv_ruleRentalWorkflow= ruleRentalWorkflow EOF )
            // InternalRentalWorkflow.g:66:2: iv_ruleRentalWorkflow= ruleRentalWorkflow EOF
            {
             newCompositeNode(grammarAccess.getRentalWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRentalWorkflow=ruleRentalWorkflow();

            state._fsp--;

             current =iv_ruleRentalWorkflow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRentalWorkflow"


    // $ANTLR start "ruleRentalWorkflow"
    // InternalRentalWorkflow.g:72:1: ruleRentalWorkflow returns [EObject current=null] : ( () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' otherlv_6= 'commands' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= 'end' otherlv_9= 'resetEvents' ( (otherlv_10= RULE_ID ) )* otherlv_11= 'end' ( (lv_states_12_0= ruleState ) )* ) ;
    public final EObject ruleRentalWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_event_4_0 = null;

        EObject lv_commands_7_0 = null;

        EObject lv_states_12_0 = null;



        	enterRule();

        try {
            // InternalRentalWorkflow.g:78:2: ( ( () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' otherlv_6= 'commands' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= 'end' otherlv_9= 'resetEvents' ( (otherlv_10= RULE_ID ) )* otherlv_11= 'end' ( (lv_states_12_0= ruleState ) )* ) )
            // InternalRentalWorkflow.g:79:2: ( () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' otherlv_6= 'commands' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= 'end' otherlv_9= 'resetEvents' ( (otherlv_10= RULE_ID ) )* otherlv_11= 'end' ( (lv_states_12_0= ruleState ) )* )
            {
            // InternalRentalWorkflow.g:79:2: ( () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' otherlv_6= 'commands' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= 'end' otherlv_9= 'resetEvents' ( (otherlv_10= RULE_ID ) )* otherlv_11= 'end' ( (lv_states_12_0= ruleState ) )* )
            // InternalRentalWorkflow.g:80:3: () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' otherlv_6= 'commands' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= 'end' otherlv_9= 'resetEvents' ( (otherlv_10= RULE_ID ) )* otherlv_11= 'end' ( (lv_states_12_0= ruleState ) )*
            {
            // InternalRentalWorkflow.g:80:3: ()
            // InternalRentalWorkflow.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRentalWorkflowAccess().getRentalWorkflowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRentalWorkflowAccess().getDefineWorkflowKeyword_1());
            		
            // InternalRentalWorkflow.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRentalWorkflow.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRentalWorkflow.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalRentalWorkflow.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRentalWorkflowAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRentalWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRentalWorkflowAccess().getEventsKeyword_3());
            		
            // InternalRentalWorkflow.g:113:3: ( (lv_event_4_0= ruleEvent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRentalWorkflow.g:114:4: (lv_event_4_0= ruleEvent )
            	    {
            	    // InternalRentalWorkflow.g:114:4: (lv_event_4_0= ruleEvent )
            	    // InternalRentalWorkflow.g:115:5: lv_event_4_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getRentalWorkflowAccess().getEventEventParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_event_4_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"event",
            	    						lv_event_4_0,
            	    						"de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRentalWorkflowAccess().getEndKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRentalWorkflowAccess().getCommandsKeyword_6());
            		
            // InternalRentalWorkflow.g:140:3: ( (lv_commands_7_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRentalWorkflow.g:141:4: (lv_commands_7_0= ruleCommand )
            	    {
            	    // InternalRentalWorkflow.g:141:4: (lv_commands_7_0= ruleCommand )
            	    // InternalRentalWorkflow.g:142:5: lv_commands_7_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getRentalWorkflowAccess().getCommandsCommandParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_commands_7_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_7_0,
            	    						"de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getRentalWorkflowAccess().getEndKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getRentalWorkflowAccess().getResetEventsKeyword_9());
            		
            // InternalRentalWorkflow.g:167:3: ( (otherlv_10= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRentalWorkflow.g:168:4: (otherlv_10= RULE_ID )
            	    {
            	    // InternalRentalWorkflow.g:168:4: (otherlv_10= RULE_ID )
            	    // InternalRentalWorkflow.g:169:5: otherlv_10= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRentalWorkflowRule());
            	    					}
            	    				
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    					newLeafNode(otherlv_10, grammarAccess.getRentalWorkflowAccess().getResetEventsEventCrossReference_10_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getRentalWorkflowAccess().getEndKeyword_11());
            		
            // InternalRentalWorkflow.g:184:3: ( (lv_states_12_0= ruleState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRentalWorkflow.g:185:4: (lv_states_12_0= ruleState )
            	    {
            	    // InternalRentalWorkflow.g:185:4: (lv_states_12_0= ruleState )
            	    // InternalRentalWorkflow.g:186:5: lv_states_12_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getRentalWorkflowAccess().getStatesStateParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_states_12_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_12_0,
            	    						"de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRentalWorkflow"


    // $ANTLR start "entryRuleEvent"
    // InternalRentalWorkflow.g:207:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalRentalWorkflow.g:207:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalRentalWorkflow.g:208:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalRentalWorkflow.g:214:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofEventType ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_ofType_1_0 = null;



        	enterRule();

        try {
            // InternalRentalWorkflow.g:220:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofEventType ) ) ) )
            // InternalRentalWorkflow.g:221:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofEventType ) ) )
            {
            // InternalRentalWorkflow.g:221:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofEventType ) ) )
            // InternalRentalWorkflow.g:222:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofEventType ) )
            {
            // InternalRentalWorkflow.g:222:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRentalWorkflow.g:223:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRentalWorkflow.g:223:4: (lv_name_0_0= RULE_ID )
            // InternalRentalWorkflow.g:224:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRentalWorkflow.g:240:3: ( (lv_ofType_1_0= ruleofEventType ) )
            // InternalRentalWorkflow.g:241:4: (lv_ofType_1_0= ruleofEventType )
            {
            // InternalRentalWorkflow.g:241:4: (lv_ofType_1_0= ruleofEventType )
            // InternalRentalWorkflow.g:242:5: lv_ofType_1_0= ruleofEventType
            {

            					newCompositeNode(grammarAccess.getEventAccess().getOfTypeOfEventTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ofType_1_0=ruleofEventType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"ofType",
            						lv_ofType_1_0,
            						"de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.ofEventType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // InternalRentalWorkflow.g:263:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalRentalWorkflow.g:263:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalRentalWorkflow.g:264:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalRentalWorkflow.g:270:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofCommandType ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_ofType_1_0 = null;



        	enterRule();

        try {
            // InternalRentalWorkflow.g:276:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofCommandType ) ) ) )
            // InternalRentalWorkflow.g:277:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofCommandType ) ) )
            {
            // InternalRentalWorkflow.g:277:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofCommandType ) ) )
            // InternalRentalWorkflow.g:278:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_ofType_1_0= ruleofCommandType ) )
            {
            // InternalRentalWorkflow.g:278:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRentalWorkflow.g:279:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRentalWorkflow.g:279:4: (lv_name_0_0= RULE_ID )
            // InternalRentalWorkflow.g:280:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRentalWorkflow.g:296:3: ( (lv_ofType_1_0= ruleofCommandType ) )
            // InternalRentalWorkflow.g:297:4: (lv_ofType_1_0= ruleofCommandType )
            {
            // InternalRentalWorkflow.g:297:4: (lv_ofType_1_0= ruleofCommandType )
            // InternalRentalWorkflow.g:298:5: lv_ofType_1_0= ruleofCommandType
            {

            					newCompositeNode(grammarAccess.getCommandAccess().getOfTypeOfCommandTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ofType_1_0=ruleofCommandType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandRule());
            					}
            					set(
            						current,
            						"ofType",
            						lv_ofType_1_0,
            						"de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.ofCommandType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleState"
    // InternalRentalWorkflow.g:319:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalRentalWorkflow.g:319:46: (iv_ruleState= ruleState EOF )
            // InternalRentalWorkflow.g:320:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalRentalWorkflow.g:326:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ofType_2_0= ruleOfType ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_ofType_2_0 = null;

        EObject lv_transitions_7_0 = null;



        	enterRule();

        try {
            // InternalRentalWorkflow.g:332:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ofType_2_0= ruleOfType ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end' ) )
            // InternalRentalWorkflow.g:333:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ofType_2_0= ruleOfType ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end' )
            {
            // InternalRentalWorkflow.g:333:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ofType_2_0= ruleOfType ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end' )
            // InternalRentalWorkflow.g:334:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ofType_2_0= ruleOfType ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalRentalWorkflow.g:338:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalWorkflow.g:339:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalWorkflow.g:339:4: (lv_name_1_0= RULE_ID )
            // InternalRentalWorkflow.g:340:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRentalWorkflow.g:356:3: ( (lv_ofType_2_0= ruleOfType ) )
            // InternalRentalWorkflow.g:357:4: (lv_ofType_2_0= ruleOfType )
            {
            // InternalRentalWorkflow.g:357:4: (lv_ofType_2_0= ruleOfType )
            // InternalRentalWorkflow.g:358:5: lv_ofType_2_0= ruleOfType
            {

            					newCompositeNode(grammarAccess.getStateAccess().getOfTypeOfTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_ofType_2_0=ruleOfType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"ofType",
            						lv_ofType_2_0,
            						"de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.OfType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRentalWorkflow.g:375:3: (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRentalWorkflow.g:376:4: otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRentalWorkflow.g:384:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRentalWorkflow.g:385:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalRentalWorkflow.g:385:5: (otherlv_5= RULE_ID )
                    	    // InternalRentalWorkflow.g:386:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getStateAccess().getActionsCommandCrossReference_3_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_6=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalRentalWorkflow.g:402:3: ( (lv_transitions_7_0= ruleTransition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRentalWorkflow.g:403:4: (lv_transitions_7_0= ruleTransition )
            	    {
            	    // InternalRentalWorkflow.g:403:4: (lv_transitions_7_0= ruleTransition )
            	    // InternalRentalWorkflow.g:404:5: lv_transitions_7_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_transitions_7_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_7_0,
            	    						"de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalRentalWorkflow.g:429:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalRentalWorkflow.g:429:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalRentalWorkflow.g:430:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalRentalWorkflow.g:436:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRentalWorkflow.g:442:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRentalWorkflow.g:443:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRentalWorkflow.g:443:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalRentalWorkflow.g:444:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalRentalWorkflow.g:444:3: ( (otherlv_0= RULE_ID ) )
            // InternalRentalWorkflow.g:445:4: (otherlv_0= RULE_ID )
            {
            // InternalRentalWorkflow.g:445:4: (otherlv_0= RULE_ID )
            // InternalRentalWorkflow.g:446:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalRentalWorkflow.g:461:3: ( (otherlv_2= RULE_ID ) )
            // InternalRentalWorkflow.g:462:4: (otherlv_2= RULE_ID )
            {
            // InternalRentalWorkflow.g:462:4: (otherlv_2= RULE_ID )
            // InternalRentalWorkflow.g:463:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleOfType"
    // InternalRentalWorkflow.g:478:1: ruleOfType returns [Enumerator current=null] : ( (enumLiteral_0= 'initializing' ) | (enumLiteral_1= 'creating' ) | (enumLiteral_2= 'running' ) | (enumLiteral_3= 'canceling' ) | (enumLiteral_4= 'finishing' ) ) ;
    public final Enumerator ruleOfType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRentalWorkflow.g:484:2: ( ( (enumLiteral_0= 'initializing' ) | (enumLiteral_1= 'creating' ) | (enumLiteral_2= 'running' ) | (enumLiteral_3= 'canceling' ) | (enumLiteral_4= 'finishing' ) ) )
            // InternalRentalWorkflow.g:485:2: ( (enumLiteral_0= 'initializing' ) | (enumLiteral_1= 'creating' ) | (enumLiteral_2= 'running' ) | (enumLiteral_3= 'canceling' ) | (enumLiteral_4= 'finishing' ) )
            {
            // InternalRentalWorkflow.g:485:2: ( (enumLiteral_0= 'initializing' ) | (enumLiteral_1= 'creating' ) | (enumLiteral_2= 'running' ) | (enumLiteral_3= 'canceling' ) | (enumLiteral_4= 'finishing' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRentalWorkflow.g:486:3: (enumLiteral_0= 'initializing' )
                    {
                    // InternalRentalWorkflow.g:486:3: (enumLiteral_0= 'initializing' )
                    // InternalRentalWorkflow.g:487:4: enumLiteral_0= 'initializing'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getInitializingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOfTypeAccess().getInitializingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalWorkflow.g:494:3: (enumLiteral_1= 'creating' )
                    {
                    // InternalRentalWorkflow.g:494:3: (enumLiteral_1= 'creating' )
                    // InternalRentalWorkflow.g:495:4: enumLiteral_1= 'creating'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getCreatingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOfTypeAccess().getCreatingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalWorkflow.g:502:3: (enumLiteral_2= 'running' )
                    {
                    // InternalRentalWorkflow.g:502:3: (enumLiteral_2= 'running' )
                    // InternalRentalWorkflow.g:503:4: enumLiteral_2= 'running'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getRunningEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOfTypeAccess().getRunningEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRentalWorkflow.g:510:3: (enumLiteral_3= 'canceling' )
                    {
                    // InternalRentalWorkflow.g:510:3: (enumLiteral_3= 'canceling' )
                    // InternalRentalWorkflow.g:511:4: enumLiteral_3= 'canceling'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getCancelingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOfTypeAccess().getCancelingEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRentalWorkflow.g:518:3: (enumLiteral_4= 'finishing' )
                    {
                    // InternalRentalWorkflow.g:518:3: (enumLiteral_4= 'finishing' )
                    // InternalRentalWorkflow.g:519:4: enumLiteral_4= 'finishing'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getFinishingEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOfTypeAccess().getFinishingEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOfType"


    // $ANTLR start "ruleofEventType"
    // InternalRentalWorkflow.g:529:1: ruleofEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'nextClicked' ) | (enumLiteral_1= 'backClicked' ) | (enumLiteral_2= 'cancelClicked' ) ) ;
    public final Enumerator ruleofEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRentalWorkflow.g:535:2: ( ( (enumLiteral_0= 'nextClicked' ) | (enumLiteral_1= 'backClicked' ) | (enumLiteral_2= 'cancelClicked' ) ) )
            // InternalRentalWorkflow.g:536:2: ( (enumLiteral_0= 'nextClicked' ) | (enumLiteral_1= 'backClicked' ) | (enumLiteral_2= 'cancelClicked' ) )
            {
            // InternalRentalWorkflow.g:536:2: ( (enumLiteral_0= 'nextClicked' ) | (enumLiteral_1= 'backClicked' ) | (enumLiteral_2= 'cancelClicked' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRentalWorkflow.g:537:3: (enumLiteral_0= 'nextClicked' )
                    {
                    // InternalRentalWorkflow.g:537:3: (enumLiteral_0= 'nextClicked' )
                    // InternalRentalWorkflow.g:538:4: enumLiteral_0= 'nextClicked'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOfEventTypeAccess().getNextClickedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOfEventTypeAccess().getNextClickedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalWorkflow.g:545:3: (enumLiteral_1= 'backClicked' )
                    {
                    // InternalRentalWorkflow.g:545:3: (enumLiteral_1= 'backClicked' )
                    // InternalRentalWorkflow.g:546:4: enumLiteral_1= 'backClicked'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getOfEventTypeAccess().getBackClickedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOfEventTypeAccess().getBackClickedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalWorkflow.g:553:3: (enumLiteral_2= 'cancelClicked' )
                    {
                    // InternalRentalWorkflow.g:553:3: (enumLiteral_2= 'cancelClicked' )
                    // InternalRentalWorkflow.g:554:4: enumLiteral_2= 'cancelClicked'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getOfEventTypeAccess().getCancelClickedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOfEventTypeAccess().getCancelClickedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleofEventType"


    // $ANTLR start "ruleofCommandType"
    // InternalRentalWorkflow.g:564:1: ruleofCommandType returns [Enumerator current=null] : ( (enumLiteral_0= 'doSave' ) | (enumLiteral_1= 'doAbort' ) | (enumLiteral_2= 'doDelete' ) ) ;
    public final Enumerator ruleofCommandType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRentalWorkflow.g:570:2: ( ( (enumLiteral_0= 'doSave' ) | (enumLiteral_1= 'doAbort' ) | (enumLiteral_2= 'doDelete' ) ) )
            // InternalRentalWorkflow.g:571:2: ( (enumLiteral_0= 'doSave' ) | (enumLiteral_1= 'doAbort' ) | (enumLiteral_2= 'doDelete' ) )
            {
            // InternalRentalWorkflow.g:571:2: ( (enumLiteral_0= 'doSave' ) | (enumLiteral_1= 'doAbort' ) | (enumLiteral_2= 'doDelete' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRentalWorkflow.g:572:3: (enumLiteral_0= 'doSave' )
                    {
                    // InternalRentalWorkflow.g:572:3: (enumLiteral_0= 'doSave' )
                    // InternalRentalWorkflow.g:573:4: enumLiteral_0= 'doSave'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getOfCommandTypeAccess().getDoSaveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOfCommandTypeAccess().getDoSaveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalWorkflow.g:580:3: (enumLiteral_1= 'doAbort' )
                    {
                    // InternalRentalWorkflow.g:580:3: (enumLiteral_1= 'doAbort' )
                    // InternalRentalWorkflow.g:581:4: enumLiteral_1= 'doAbort'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOfCommandTypeAccess().getDoAbordEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOfCommandTypeAccess().getDoAbordEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalWorkflow.g:588:3: (enumLiteral_2= 'doDelete' )
                    {
                    // InternalRentalWorkflow.g:588:3: (enumLiteral_2= 'doDelete' )
                    // InternalRentalWorkflow.g:589:4: enumLiteral_2= 'doDelete'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOfCommandTypeAccess().getDoDeleteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOfCommandTypeAccess().getDoDeleteEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleofCommandType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000022010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});

}