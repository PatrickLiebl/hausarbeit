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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'defineWorkflow'", "'events'", "'end'", "'startState'", "'finishState'", "'state'", "'{'", "'}'", "'transition'", "'.'", "'nextClickable'", "'savable'", "'deletable'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
    // InternalRentalWorkflow.g:72:1: ruleRentalWorkflow returns [EObject current=null] : ( () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' ( (lv_states_6_0= ruleState ) )* otherlv_7= 'startState' ( ( ruleQualifiedName ) ) otherlv_9= 'end' otherlv_10= 'finishState' ( ( ruleQualifiedName ) ) otherlv_12= 'end' ) ;
    public final EObject ruleRentalWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_event_4_0 = null;

        EObject lv_states_6_0 = null;



        	enterRule();

        try {
            // InternalRentalWorkflow.g:78:2: ( ( () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' ( (lv_states_6_0= ruleState ) )* otherlv_7= 'startState' ( ( ruleQualifiedName ) ) otherlv_9= 'end' otherlv_10= 'finishState' ( ( ruleQualifiedName ) ) otherlv_12= 'end' ) )
            // InternalRentalWorkflow.g:79:2: ( () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' ( (lv_states_6_0= ruleState ) )* otherlv_7= 'startState' ( ( ruleQualifiedName ) ) otherlv_9= 'end' otherlv_10= 'finishState' ( ( ruleQualifiedName ) ) otherlv_12= 'end' )
            {
            // InternalRentalWorkflow.g:79:2: ( () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' ( (lv_states_6_0= ruleState ) )* otherlv_7= 'startState' ( ( ruleQualifiedName ) ) otherlv_9= 'end' otherlv_10= 'finishState' ( ( ruleQualifiedName ) ) otherlv_12= 'end' )
            // InternalRentalWorkflow.g:80:3: () otherlv_1= 'defineWorkflow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'events' ( (lv_event_4_0= ruleEvent ) )* otherlv_5= 'end' ( (lv_states_6_0= ruleState ) )* otherlv_7= 'startState' ( ( ruleQualifiedName ) ) otherlv_9= 'end' otherlv_10= 'finishState' ( ( ruleQualifiedName ) ) otherlv_12= 'end'
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
            		
            // InternalRentalWorkflow.g:136:3: ( (lv_states_6_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRentalWorkflow.g:137:4: (lv_states_6_0= ruleState )
            	    {
            	    // InternalRentalWorkflow.g:137:4: (lv_states_6_0= ruleState )
            	    // InternalRentalWorkflow.g:138:5: lv_states_6_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getRentalWorkflowAccess().getStatesStateParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_states_6_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_6_0,
            	    						"de.nak.xtext.hausarbeit.rentalWorkflow.RentalWorkflow.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRentalWorkflowAccess().getStartStateKeyword_7());
            		
            // InternalRentalWorkflow.g:159:3: ( ( ruleQualifiedName ) )
            // InternalRentalWorkflow.g:160:4: ( ruleQualifiedName )
            {
            // InternalRentalWorkflow.g:160:4: ( ruleQualifiedName )
            // InternalRentalWorkflow.g:161:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRentalWorkflowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRentalWorkflowAccess().getStartStateStateCrossReference_8_0());
            				
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getRentalWorkflowAccess().getEndKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getRentalWorkflowAccess().getFinishStateKeyword_10());
            		
            // InternalRentalWorkflow.g:183:3: ( ( ruleQualifiedName ) )
            // InternalRentalWorkflow.g:184:4: ( ruleQualifiedName )
            {
            // InternalRentalWorkflow.g:184:4: ( ruleQualifiedName )
            // InternalRentalWorkflow.g:185:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRentalWorkflowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRentalWorkflowAccess().getFinishStateStateCrossReference_11_0());
            				
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRentalWorkflowAccess().getEndKeyword_12());
            		

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


    // $ANTLR start "entryRuleState"
    // InternalRentalWorkflow.g:263:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalRentalWorkflow.g:263:46: (iv_ruleState= ruleState EOF )
            // InternalRentalWorkflow.g:264:2: iv_ruleState= ruleState EOF
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
    // InternalRentalWorkflow.g:270:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'events' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? otherlv_6= 'transition' ( ( ruleQualifiedName ) ) otherlv_8= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRentalWorkflow.g:276:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'events' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? otherlv_6= 'transition' ( ( ruleQualifiedName ) ) otherlv_8= 'end' ) )
            // InternalRentalWorkflow.g:277:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'events' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? otherlv_6= 'transition' ( ( ruleQualifiedName ) ) otherlv_8= 'end' )
            {
            // InternalRentalWorkflow.g:277:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'events' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? otherlv_6= 'transition' ( ( ruleQualifiedName ) ) otherlv_8= 'end' )
            // InternalRentalWorkflow.g:278:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'events' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? otherlv_6= 'transition' ( ( ruleQualifiedName ) ) otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalRentalWorkflow.g:282:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalWorkflow.g:283:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalWorkflow.g:283:4: (lv_name_1_0= RULE_ID )
            // InternalRentalWorkflow.g:284:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalRentalWorkflow.g:300:3: (otherlv_2= 'events' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRentalWorkflow.g:301:4: otherlv_2= 'events' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getEventsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalRentalWorkflow.g:309:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRentalWorkflow.g:310:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalRentalWorkflow.g:310:5: (otherlv_4= RULE_ID )
                    	    // InternalRentalWorkflow.g:311:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEventsEventCrossReference_2_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getStateAccess().getTransitionKeyword_3());
            		
            // InternalRentalWorkflow.g:331:3: ( ( ruleQualifiedName ) )
            // InternalRentalWorkflow.g:332:4: ( ruleQualifiedName )
            {
            // InternalRentalWorkflow.g:332:4: ( ruleQualifiedName )
            // InternalRentalWorkflow.g:333:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRentalWorkflow.g:355:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRentalWorkflow.g:355:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRentalWorkflow.g:356:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalRentalWorkflow.g:362:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRentalWorkflow.g:368:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRentalWorkflow.g:369:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRentalWorkflow.g:369:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRentalWorkflow.g:370:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRentalWorkflow.g:377:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRentalWorkflow.g:378:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleofEventType"
    // InternalRentalWorkflow.g:395:1: ruleofEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'nextClickable' ) | (enumLiteral_1= 'savable' ) | (enumLiteral_2= 'deletable' ) ) ;
    public final Enumerator ruleofEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRentalWorkflow.g:401:2: ( ( (enumLiteral_0= 'nextClickable' ) | (enumLiteral_1= 'savable' ) | (enumLiteral_2= 'deletable' ) ) )
            // InternalRentalWorkflow.g:402:2: ( (enumLiteral_0= 'nextClickable' ) | (enumLiteral_1= 'savable' ) | (enumLiteral_2= 'deletable' ) )
            {
            // InternalRentalWorkflow.g:402:2: ( (enumLiteral_0= 'nextClickable' ) | (enumLiteral_1= 'savable' ) | (enumLiteral_2= 'deletable' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRentalWorkflow.g:403:3: (enumLiteral_0= 'nextClickable' )
                    {
                    // InternalRentalWorkflow.g:403:3: (enumLiteral_0= 'nextClickable' )
                    // InternalRentalWorkflow.g:404:4: enumLiteral_0= 'nextClickable'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getOfEventTypeAccess().getNextClickableEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOfEventTypeAccess().getNextClickableEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalWorkflow.g:411:3: (enumLiteral_1= 'savable' )
                    {
                    // InternalRentalWorkflow.g:411:3: (enumLiteral_1= 'savable' )
                    // InternalRentalWorkflow.g:412:4: enumLiteral_1= 'savable'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getOfEventTypeAccess().getSavableEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOfEventTypeAccess().getSavableEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalWorkflow.g:419:3: (enumLiteral_2= 'deletable' )
                    {
                    // InternalRentalWorkflow.g:419:3: (enumLiteral_2= 'deletable' )
                    // InternalRentalWorkflow.g:420:4: enumLiteral_2= 'deletable'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getOfEventTypeAccess().getDeleteableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOfEventTypeAccess().getDeleteableEnumLiteralDeclaration_2());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});

}