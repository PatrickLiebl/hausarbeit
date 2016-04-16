package de.nak.xtext.hausarbeit.rentalSystem.parser.antlr.internal;

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
import de.nak.xtext.hausarbeit.rentalSystem.services.RentalSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRentalSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rentalSystem'", "'movable'", "'digital'", "'fix'", "'type'", "'('", "'typeWorkFlow'", "')'", "'text'", "'='", "'Deal'", "'customer'", "'rentalType'", "'int'", "'string'", "'date'", "'decimal'", "'double'", "'day'", "'week'", "'month'", "'email'", "'mobile'", "'currency'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


        public InternalRentalSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRentalSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRentalSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRentalSystem.g"; }



     	private RentalSystemGrammarAccess grammarAccess;

        public InternalRentalSystemParser(TokenStream input, RentalSystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RentalSystem";
       	}

       	@Override
       	protected RentalSystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRentalSystem"
    // InternalRentalSystem.g:65:1: entryRuleRentalSystem returns [EObject current=null] : iv_ruleRentalSystem= ruleRentalSystem EOF ;
    public final EObject entryRuleRentalSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRentalSystem = null;


        try {
            // InternalRentalSystem.g:65:53: (iv_ruleRentalSystem= ruleRentalSystem EOF )
            // InternalRentalSystem.g:66:2: iv_ruleRentalSystem= ruleRentalSystem EOF
            {
             newCompositeNode(grammarAccess.getRentalSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRentalSystem=ruleRentalSystem();

            state._fsp--;

             current =iv_ruleRentalSystem; 
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
    // $ANTLR end "entryRuleRentalSystem"


    // $ANTLR start "ruleRentalSystem"
    // InternalRentalSystem.g:72:1: ruleRentalSystem returns [EObject current=null] : (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* ( (lv_deals_5_0= ruleDeal ) )* ) ;
    public final EObject ruleRentalSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_types_3_0 = null;

        EObject lv_customers_4_0 = null;

        EObject lv_deals_5_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:78:2: ( (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* ( (lv_deals_5_0= ruleDeal ) )* ) )
            // InternalRentalSystem.g:79:2: (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* ( (lv_deals_5_0= ruleDeal ) )* )
            {
            // InternalRentalSystem.g:79:2: (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* ( (lv_deals_5_0= ruleDeal ) )* )
            // InternalRentalSystem.g:80:3: otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* ( (lv_deals_5_0= ruleDeal ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRentalSystemAccess().getRentalSystemKeyword_0());
            		
            // InternalRentalSystem.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRentalSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRentalSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRentalSystem.g:102:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalRentalSystem.g:103:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalRentalSystem.g:103:4: (lv_title_2_0= RULE_STRING )
            // InternalRentalSystem.g:104:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_title_2_0, grammarAccess.getRentalSystemAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRentalSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRentalSystem.g:120:3: ( (lv_types_3_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRentalSystem.g:121:4: (lv_types_3_0= ruleType )
            	    {
            	    // InternalRentalSystem.g:121:4: (lv_types_3_0= ruleType )
            	    // InternalRentalSystem.g:122:5: lv_types_3_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getRentalSystemAccess().getTypesTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_3_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRentalSystem.g:139:3: ( (lv_customers_4_0= ruleCustomer ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRentalSystem.g:140:4: (lv_customers_4_0= ruleCustomer )
            	    {
            	    // InternalRentalSystem.g:140:4: (lv_customers_4_0= ruleCustomer )
            	    // InternalRentalSystem.g:141:5: lv_customers_4_0= ruleCustomer
            	    {

            	    					newCompositeNode(grammarAccess.getRentalSystemAccess().getCustomersCustomerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_customers_4_0=ruleCustomer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customers",
            	    						lv_customers_4_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Customer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalRentalSystem.g:158:3: ( (lv_deals_5_0= ruleDeal ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRentalSystem.g:159:4: (lv_deals_5_0= ruleDeal )
            	    {
            	    // InternalRentalSystem.g:159:4: (lv_deals_5_0= ruleDeal )
            	    // InternalRentalSystem.g:160:5: lv_deals_5_0= ruleDeal
            	    {

            	    					newCompositeNode(grammarAccess.getRentalSystemAccess().getDealsDealParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_deals_5_0=ruleDeal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deals",
            	    						lv_deals_5_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Deal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleRentalSystem"


    // $ANTLR start "entryRuleType"
    // InternalRentalSystem.g:181:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRentalSystem.g:181:45: (iv_ruleType= ruleType EOF )
            // InternalRentalSystem.g:182:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRentalSystem.g:188:1: ruleType returns [EObject current=null] : ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' otherlv_6= 'typeWorkFlow' ( (otherlv_7= RULE_ID ) ) ( (lv_typeAttributes_8_0= ruleTypeAttribute ) )* otherlv_9= ')' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_movable_0_0=null;
        Token lv_digital_1_0=null;
        Token lv_fix_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_typeAttributes_8_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:194:2: ( ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' otherlv_6= 'typeWorkFlow' ( (otherlv_7= RULE_ID ) ) ( (lv_typeAttributes_8_0= ruleTypeAttribute ) )* otherlv_9= ')' ) )
            // InternalRentalSystem.g:195:2: ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' otherlv_6= 'typeWorkFlow' ( (otherlv_7= RULE_ID ) ) ( (lv_typeAttributes_8_0= ruleTypeAttribute ) )* otherlv_9= ')' )
            {
            // InternalRentalSystem.g:195:2: ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' otherlv_6= 'typeWorkFlow' ( (otherlv_7= RULE_ID ) ) ( (lv_typeAttributes_8_0= ruleTypeAttribute ) )* otherlv_9= ')' )
            // InternalRentalSystem.g:196:3: ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' otherlv_6= 'typeWorkFlow' ( (otherlv_7= RULE_ID ) ) ( (lv_typeAttributes_8_0= ruleTypeAttribute ) )* otherlv_9= ')'
            {
            // InternalRentalSystem.g:196:3: ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRentalSystem.g:197:4: ( (lv_movable_0_0= 'movable' ) )
                    {
                    // InternalRentalSystem.g:197:4: ( (lv_movable_0_0= 'movable' ) )
                    // InternalRentalSystem.g:198:5: (lv_movable_0_0= 'movable' )
                    {
                    // InternalRentalSystem.g:198:5: (lv_movable_0_0= 'movable' )
                    // InternalRentalSystem.g:199:6: lv_movable_0_0= 'movable'
                    {
                    lv_movable_0_0=(Token)match(input,12,FOLLOW_8); 

                    						newLeafNode(lv_movable_0_0, grammarAccess.getTypeAccess().getMovableMovableKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "movable", true, "movable");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRentalSystem.g:212:4: ( (lv_digital_1_0= 'digital' ) )
                    {
                    // InternalRentalSystem.g:212:4: ( (lv_digital_1_0= 'digital' ) )
                    // InternalRentalSystem.g:213:5: (lv_digital_1_0= 'digital' )
                    {
                    // InternalRentalSystem.g:213:5: (lv_digital_1_0= 'digital' )
                    // InternalRentalSystem.g:214:6: lv_digital_1_0= 'digital'
                    {
                    lv_digital_1_0=(Token)match(input,13,FOLLOW_8); 

                    						newLeafNode(lv_digital_1_0, grammarAccess.getTypeAccess().getDigitalDigitalKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "digital", true, "digital");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRentalSystem.g:227:4: ( (lv_fix_2_0= 'fix' ) )
                    {
                    // InternalRentalSystem.g:227:4: ( (lv_fix_2_0= 'fix' ) )
                    // InternalRentalSystem.g:228:5: (lv_fix_2_0= 'fix' )
                    {
                    // InternalRentalSystem.g:228:5: (lv_fix_2_0= 'fix' )
                    // InternalRentalSystem.g:229:6: lv_fix_2_0= 'fix'
                    {
                    lv_fix_2_0=(Token)match(input,14,FOLLOW_8); 

                    						newLeafNode(lv_fix_2_0, grammarAccess.getTypeAccess().getFixFixKeyword_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "fix", true, "fix");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getTypeKeyword_1());
            		
            // InternalRentalSystem.g:246:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalRentalSystem.g:247:4: (lv_name_4_0= RULE_ID )
            {
            // InternalRentalSystem.g:247:4: (lv_name_4_0= RULE_ID )
            // InternalRentalSystem.g:248:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_4_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getTypeWorkFlowKeyword_4());
            		
            // InternalRentalSystem.g:272:3: ( (otherlv_7= RULE_ID ) )
            // InternalRentalSystem.g:273:4: (otherlv_7= RULE_ID )
            {
            // InternalRentalSystem.g:273:4: (otherlv_7= RULE_ID )
            // InternalRentalSystem.g:274:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getWfRentalWorkflowCrossReference_5_0());
            				

            }


            }

            // InternalRentalSystem.g:285:3: ( (lv_typeAttributes_8_0= ruleTypeAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRentalSystem.g:286:4: (lv_typeAttributes_8_0= ruleTypeAttribute )
            	    {
            	    // InternalRentalSystem.g:286:4: (lv_typeAttributes_8_0= ruleTypeAttribute )
            	    // InternalRentalSystem.g:287:5: lv_typeAttributes_8_0= ruleTypeAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTypeAccess().getTypeAttributesTypeAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_typeAttributes_8_0=ruleTypeAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeAttributes",
            	    						lv_typeAttributes_8_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.TypeAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeAttribute"
    // InternalRentalSystem.g:312:1: entryRuleTypeAttribute returns [EObject current=null] : iv_ruleTypeAttribute= ruleTypeAttribute EOF ;
    public final EObject entryRuleTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAttribute = null;


        try {
            // InternalRentalSystem.g:312:54: (iv_ruleTypeAttribute= ruleTypeAttribute EOF )
            // InternalRentalSystem.g:313:2: iv_ruleTypeAttribute= ruleTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeAttribute=ruleTypeAttribute();

            state._fsp--;

             current =iv_ruleTypeAttribute; 
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
    // $ANTLR end "entryRuleTypeAttribute"


    // $ANTLR start "ruleTypeAttribute"
    // InternalRentalSystem.g:319:1: ruleTypeAttribute returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ( (lv_ofType_4_0= ruleOfType ) ) ) ;
    public final EObject ruleTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Enumerator lv_ofType_4_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:325:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ( (lv_ofType_4_0= ruleOfType ) ) ) )
            // InternalRentalSystem.g:326:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ( (lv_ofType_4_0= ruleOfType ) ) )
            {
            // InternalRentalSystem.g:326:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ( (lv_ofType_4_0= ruleOfType ) ) )
            // InternalRentalSystem.g:327:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ( (lv_ofType_4_0= ruleOfType ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAttributeAccess().getTextKeyword_0());
            		
            // InternalRentalSystem.g:331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:332:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:333:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAttributeAccess().getEqualsSignKeyword_2());
            		
            // InternalRentalSystem.g:353:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalRentalSystem.g:354:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalRentalSystem.g:354:4: (lv_value_3_0= RULE_STRING )
            // InternalRentalSystem.g:355:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_value_3_0, grammarAccess.getTypeAttributeAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRentalSystem.g:371:3: ( (lv_ofType_4_0= ruleOfType ) )
            // InternalRentalSystem.g:372:4: (lv_ofType_4_0= ruleOfType )
            {
            // InternalRentalSystem.g:372:4: (lv_ofType_4_0= ruleOfType )
            // InternalRentalSystem.g:373:5: lv_ofType_4_0= ruleOfType
            {

            					newCompositeNode(grammarAccess.getTypeAttributeAccess().getOfTypeOfTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_ofType_4_0=ruleOfType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeAttributeRule());
            					}
            					set(
            						current,
            						"ofType",
            						lv_ofType_4_0,
            						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.OfType");
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
    // $ANTLR end "ruleTypeAttribute"


    // $ANTLR start "entryRuleDeal"
    // InternalRentalSystem.g:394:1: entryRuleDeal returns [EObject current=null] : iv_ruleDeal= ruleDeal EOF ;
    public final EObject entryRuleDeal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeal = null;


        try {
            // InternalRentalSystem.g:394:45: (iv_ruleDeal= ruleDeal EOF )
            // InternalRentalSystem.g:395:2: iv_ruleDeal= ruleDeal EOF
            {
             newCompositeNode(grammarAccess.getDealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeal=ruleDeal();

            state._fsp--;

             current =iv_ruleDeal; 
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
    // $ANTLR end "entryRuleDeal"


    // $ANTLR start "ruleDeal"
    // InternalRentalSystem.g:401:1: ruleDeal returns [EObject current=null] : (otherlv_0= 'Deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ')' ) ;
    public final EObject ruleDeal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:407:2: ( (otherlv_0= 'Deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ')' ) )
            // InternalRentalSystem.g:408:2: (otherlv_0= 'Deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ')' )
            {
            // InternalRentalSystem.g:408:2: (otherlv_0= 'Deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ')' )
            // InternalRentalSystem.g:409:3: otherlv_0= 'Deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDealAccess().getDealKeyword_0());
            		
            // InternalRentalSystem.g:413:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:414:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:414:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:415:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDealAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDealRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDealAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDealAccess().getCustomerKeyword_3());
            		
            // InternalRentalSystem.g:439:3: ( (otherlv_4= RULE_ID ) )
            // InternalRentalSystem.g:440:4: (otherlv_4= RULE_ID )
            {
            // InternalRentalSystem.g:440:4: (otherlv_4= RULE_ID )
            // InternalRentalSystem.g:441:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDealRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_4, grammarAccess.getDealAccess().getCustomerCustomerCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDealAccess().getRentalTypeKeyword_5());
            		
            // InternalRentalSystem.g:456:3: ( (otherlv_6= RULE_ID ) )
            // InternalRentalSystem.g:457:4: (otherlv_6= RULE_ID )
            {
            // InternalRentalSystem.g:457:4: (otherlv_6= RULE_ID )
            // InternalRentalSystem.g:458:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDealRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_6, grammarAccess.getDealAccess().getRentalTypeTypeCrossReference_6_0());
            				

            }


            }

            // InternalRentalSystem.g:469:3: ( (lv_attributes_7_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRentalSystem.g:470:4: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalRentalSystem.g:470:4: (lv_attributes_7_0= ruleAttribute )
            	    // InternalRentalSystem.g:471:5: lv_attributes_7_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getDealAccess().getAttributesAttributeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_attributes_7_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDealRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_7_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDealAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleDeal"


    // $ANTLR start "entryRuleCustomer"
    // InternalRentalSystem.g:496:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalRentalSystem.g:496:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalRentalSystem.g:497:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
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
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalRentalSystem.g:503:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:509:2: ( (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')' ) )
            // InternalRentalSystem.g:510:2: (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')' )
            {
            // InternalRentalSystem.g:510:2: (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')' )
            // InternalRentalSystem.g:511:3: otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalRentalSystem.g:515:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:516:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:516:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:517:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRentalSystem.g:537:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRentalSystem.g:538:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalRentalSystem.g:538:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalRentalSystem.g:539:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getCustomerAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomerAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleAttribute"
    // InternalRentalSystem.g:564:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRentalSystem.g:564:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRentalSystem.g:565:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRentalSystem.g:571:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalRentalSystem.g:577:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalRentalSystem.g:578:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalRentalSystem.g:578:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalRentalSystem.g:579:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTextKeyword_0());
            		
            // InternalRentalSystem.g:583:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:584:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:584:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:585:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRentalSystem.g:601:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalRentalSystem.g:602:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalRentalSystem.g:602:4: (lv_value_2_0= RULE_STRING )
            // InternalRentalSystem.g:603:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleOfType"
    // InternalRentalSystem.g:623:1: ruleOfType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'day' ) | (enumLiteral_6= 'week' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'email' ) | (enumLiteral_9= 'mobile' ) | (enumLiteral_10= 'currency' ) ) ;
    public final Enumerator ruleOfType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalRentalSystem.g:629:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'day' ) | (enumLiteral_6= 'week' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'email' ) | (enumLiteral_9= 'mobile' ) | (enumLiteral_10= 'currency' ) ) )
            // InternalRentalSystem.g:630:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'day' ) | (enumLiteral_6= 'week' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'email' ) | (enumLiteral_9= 'mobile' ) | (enumLiteral_10= 'currency' ) )
            {
            // InternalRentalSystem.g:630:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'day' ) | (enumLiteral_6= 'week' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'email' ) | (enumLiteral_9= 'mobile' ) | (enumLiteral_10= 'currency' ) )
            int alt8=11;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 29:
                {
                alt8=6;
                }
                break;
            case 30:
                {
                alt8=7;
                }
                break;
            case 31:
                {
                alt8=8;
                }
                break;
            case 32:
                {
                alt8=9;
                }
                break;
            case 33:
                {
                alt8=10;
                }
                break;
            case 34:
                {
                alt8=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRentalSystem.g:631:3: (enumLiteral_0= 'int' )
                    {
                    // InternalRentalSystem.g:631:3: (enumLiteral_0= 'int' )
                    // InternalRentalSystem.g:632:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalSystem.g:639:3: (enumLiteral_1= 'string' )
                    {
                    // InternalRentalSystem.g:639:3: (enumLiteral_1= 'string' )
                    // InternalRentalSystem.g:640:4: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalSystem.g:647:3: (enumLiteral_2= 'date' )
                    {
                    // InternalRentalSystem.g:647:3: (enumLiteral_2= 'date' )
                    // InternalRentalSystem.g:648:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRentalSystem.g:655:3: (enumLiteral_3= 'decimal' )
                    {
                    // InternalRentalSystem.g:655:3: (enumLiteral_3= 'decimal' )
                    // InternalRentalSystem.g:656:4: enumLiteral_3= 'decimal'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDecimalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOfTypeAccess().getDecimalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRentalSystem.g:663:3: (enumLiteral_4= 'double' )
                    {
                    // InternalRentalSystem.g:663:3: (enumLiteral_4= 'double' )
                    // InternalRentalSystem.g:664:4: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRentalSystem.g:671:3: (enumLiteral_5= 'day' )
                    {
                    // InternalRentalSystem.g:671:3: (enumLiteral_5= 'day' )
                    // InternalRentalSystem.g:672:4: enumLiteral_5= 'day'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOfTypeAccess().getDayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRentalSystem.g:679:3: (enumLiteral_6= 'week' )
                    {
                    // InternalRentalSystem.g:679:3: (enumLiteral_6= 'week' )
                    // InternalRentalSystem.g:680:4: enumLiteral_6= 'week'
                    {
                    enumLiteral_6=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getWeekEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOfTypeAccess().getWeekEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRentalSystem.g:687:3: (enumLiteral_7= 'month' )
                    {
                    // InternalRentalSystem.g:687:3: (enumLiteral_7= 'month' )
                    // InternalRentalSystem.g:688:4: enumLiteral_7= 'month'
                    {
                    enumLiteral_7=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getMonthEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOfTypeAccess().getMonthEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRentalSystem.g:695:3: (enumLiteral_8= 'email' )
                    {
                    // InternalRentalSystem.g:695:3: (enumLiteral_8= 'email' )
                    // InternalRentalSystem.g:696:4: enumLiteral_8= 'email'
                    {
                    enumLiteral_8=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getEMailEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getOfTypeAccess().getEMailEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRentalSystem.g:703:3: (enumLiteral_9= 'mobile' )
                    {
                    // InternalRentalSystem.g:703:3: (enumLiteral_9= 'mobile' )
                    // InternalRentalSystem.g:704:4: enumLiteral_9= 'mobile'
                    {
                    enumLiteral_9=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getMobileEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getOfTypeAccess().getMobileEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRentalSystem.g:711:3: (enumLiteral_10= 'currency' )
                    {
                    // InternalRentalSystem.g:711:3: (enumLiteral_10= 'currency' )
                    // InternalRentalSystem.g:712:4: enumLiteral_10= 'currency'
                    {
                    enumLiteral_10=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getCurrencyEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getOfTypeAccess().getCurrencyEnumLiteralDeclaration_10());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000607002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000007FF000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});

}