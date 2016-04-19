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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rentalSystem'", "'('", "')'", "'movable'", "'digital'", "'fix'", "'typeMold'", "'.'", "'deal'", "'customer'", "'rentalType'", "'dealWorkFlow'", "'dealAttribute'", "'customerMold'", "'attribute'", "'int'", "'String'", "'Date'", "'decimal'", "'Double'", "'day'", "'week'", "'month'", "'email'", "'mobile'", "'currency'"
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
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    // InternalRentalSystem.g:72:1: ruleRentalSystem returns [EObject current=null] : (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_rentalTypes_4_0= ruleRentalType ) )* ( (lv_customers_5_0= ruleCustomer ) )* ( (lv_deals_6_0= ruleDeal ) )* otherlv_7= ')' ) ;
    public final EObject ruleRentalSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_rentalTypes_4_0 = null;

        EObject lv_customers_5_0 = null;

        EObject lv_deals_6_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:78:2: ( (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_rentalTypes_4_0= ruleRentalType ) )* ( (lv_customers_5_0= ruleCustomer ) )* ( (lv_deals_6_0= ruleDeal ) )* otherlv_7= ')' ) )
            // InternalRentalSystem.g:79:2: (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_rentalTypes_4_0= ruleRentalType ) )* ( (lv_customers_5_0= ruleCustomer ) )* ( (lv_deals_6_0= ruleDeal ) )* otherlv_7= ')' )
            {
            // InternalRentalSystem.g:79:2: (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_rentalTypes_4_0= ruleRentalType ) )* ( (lv_customers_5_0= ruleCustomer ) )* ( (lv_deals_6_0= ruleDeal ) )* otherlv_7= ')' )
            // InternalRentalSystem.g:80:3: otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_rentalTypes_4_0= ruleRentalType ) )* ( (lv_customers_5_0= ruleCustomer ) )* ( (lv_deals_6_0= ruleDeal ) )* otherlv_7= ')'
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

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRentalSystemAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRentalSystem.g:124:3: ( (lv_rentalTypes_4_0= ruleRentalType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRentalSystem.g:125:4: (lv_rentalTypes_4_0= ruleRentalType )
            	    {
            	    // InternalRentalSystem.g:125:4: (lv_rentalTypes_4_0= ruleRentalType )
            	    // InternalRentalSystem.g:126:5: lv_rentalTypes_4_0= ruleRentalType
            	    {

            	    					newCompositeNode(grammarAccess.getRentalSystemAccess().getRentalTypesRentalTypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_rentalTypes_4_0=ruleRentalType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rentalTypes",
            	    						lv_rentalTypes_4_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.RentalType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRentalSystem.g:143:3: ( (lv_customers_5_0= ruleCustomer ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRentalSystem.g:144:4: (lv_customers_5_0= ruleCustomer )
            	    {
            	    // InternalRentalSystem.g:144:4: (lv_customers_5_0= ruleCustomer )
            	    // InternalRentalSystem.g:145:5: lv_customers_5_0= ruleCustomer
            	    {

            	    					newCompositeNode(grammarAccess.getRentalSystemAccess().getCustomersCustomerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_customers_5_0=ruleCustomer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customers",
            	    						lv_customers_5_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Customer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalRentalSystem.g:162:3: ( (lv_deals_6_0= ruleDeal ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRentalSystem.g:163:4: (lv_deals_6_0= ruleDeal )
            	    {
            	    // InternalRentalSystem.g:163:4: (lv_deals_6_0= ruleDeal )
            	    // InternalRentalSystem.g:164:5: lv_deals_6_0= ruleDeal
            	    {

            	    					newCompositeNode(grammarAccess.getRentalSystemAccess().getDealsDealParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_deals_6_0=ruleDeal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deals",
            	    						lv_deals_6_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Deal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRentalSystemAccess().getRightParenthesisKeyword_7());
            		

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


    // $ANTLR start "entryRuleRentalType"
    // InternalRentalSystem.g:189:1: entryRuleRentalType returns [EObject current=null] : iv_ruleRentalType= ruleRentalType EOF ;
    public final EObject entryRuleRentalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRentalType = null;


        try {
            // InternalRentalSystem.g:189:51: (iv_ruleRentalType= ruleRentalType EOF )
            // InternalRentalSystem.g:190:2: iv_ruleRentalType= ruleRentalType EOF
            {
             newCompositeNode(grammarAccess.getRentalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRentalType=ruleRentalType();

            state._fsp--;

             current =iv_ruleRentalType; 
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
    // $ANTLR end "entryRuleRentalType"


    // $ANTLR start "ruleRentalType"
    // InternalRentalSystem.g:196:1: ruleRentalType returns [EObject current=null] : ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'typeMold' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_typeAttributes_6_0= ruleAttribute ) )* otherlv_7= ')' ) ;
    public final EObject ruleRentalType() throws RecognitionException {
        EObject current = null;

        Token lv_movable_0_0=null;
        Token lv_digital_1_0=null;
        Token lv_fix_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_typeAttributes_6_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:202:2: ( ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'typeMold' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_typeAttributes_6_0= ruleAttribute ) )* otherlv_7= ')' ) )
            // InternalRentalSystem.g:203:2: ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'typeMold' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_typeAttributes_6_0= ruleAttribute ) )* otherlv_7= ')' )
            {
            // InternalRentalSystem.g:203:2: ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'typeMold' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_typeAttributes_6_0= ruleAttribute ) )* otherlv_7= ')' )
            // InternalRentalSystem.g:204:3: ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'typeMold' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_typeAttributes_6_0= ruleAttribute ) )* otherlv_7= ')'
            {
            // InternalRentalSystem.g:204:3: ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
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
                    // InternalRentalSystem.g:205:4: ( (lv_movable_0_0= 'movable' ) )
                    {
                    // InternalRentalSystem.g:205:4: ( (lv_movable_0_0= 'movable' ) )
                    // InternalRentalSystem.g:206:5: (lv_movable_0_0= 'movable' )
                    {
                    // InternalRentalSystem.g:206:5: (lv_movable_0_0= 'movable' )
                    // InternalRentalSystem.g:207:6: lv_movable_0_0= 'movable'
                    {
                    lv_movable_0_0=(Token)match(input,14,FOLLOW_9); 

                    						newLeafNode(lv_movable_0_0, grammarAccess.getRentalTypeAccess().getMovableMovableKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRentalTypeRule());
                    						}
                    						setWithLastConsumed(current, "movable", true, "movable");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRentalSystem.g:220:4: ( (lv_digital_1_0= 'digital' ) )
                    {
                    // InternalRentalSystem.g:220:4: ( (lv_digital_1_0= 'digital' ) )
                    // InternalRentalSystem.g:221:5: (lv_digital_1_0= 'digital' )
                    {
                    // InternalRentalSystem.g:221:5: (lv_digital_1_0= 'digital' )
                    // InternalRentalSystem.g:222:6: lv_digital_1_0= 'digital'
                    {
                    lv_digital_1_0=(Token)match(input,15,FOLLOW_9); 

                    						newLeafNode(lv_digital_1_0, grammarAccess.getRentalTypeAccess().getDigitalDigitalKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRentalTypeRule());
                    						}
                    						setWithLastConsumed(current, "digital", true, "digital");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRentalSystem.g:235:4: ( (lv_fix_2_0= 'fix' ) )
                    {
                    // InternalRentalSystem.g:235:4: ( (lv_fix_2_0= 'fix' ) )
                    // InternalRentalSystem.g:236:5: (lv_fix_2_0= 'fix' )
                    {
                    // InternalRentalSystem.g:236:5: (lv_fix_2_0= 'fix' )
                    // InternalRentalSystem.g:237:6: lv_fix_2_0= 'fix'
                    {
                    lv_fix_2_0=(Token)match(input,16,FOLLOW_9); 

                    						newLeafNode(lv_fix_2_0, grammarAccess.getRentalTypeAccess().getFixFixKeyword_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRentalTypeRule());
                    						}
                    						setWithLastConsumed(current, "fix", true, "fix");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRentalTypeAccess().getTypeMoldKeyword_1());
            		
            // InternalRentalSystem.g:254:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalRentalSystem.g:255:4: (lv_name_4_0= RULE_ID )
            {
            // InternalRentalSystem.g:255:4: (lv_name_4_0= RULE_ID )
            // InternalRentalSystem.g:256:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_4_0, grammarAccess.getRentalTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRentalTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getRentalTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRentalSystem.g:276:3: ( (lv_typeAttributes_6_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRentalSystem.g:277:4: (lv_typeAttributes_6_0= ruleAttribute )
            	    {
            	    // InternalRentalSystem.g:277:4: (lv_typeAttributes_6_0= ruleAttribute )
            	    // InternalRentalSystem.g:278:5: lv_typeAttributes_6_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getRentalTypeAccess().getTypeAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_typeAttributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRentalTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeAttributes",
            	    						lv_typeAttributes_6_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRentalTypeAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleRentalType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRentalSystem.g:303:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRentalSystem.g:303:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRentalSystem.g:304:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRentalSystem.g:310:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRentalSystem.g:316:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRentalSystem.g:317:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRentalSystem.g:317:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRentalSystem.g:318:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRentalSystem.g:325:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRentalSystem.g:326:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "entryRuleDeal"
    // InternalRentalSystem.g:343:1: entryRuleDeal returns [EObject current=null] : iv_ruleDeal= ruleDeal EOF ;
    public final EObject entryRuleDeal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeal = null;


        try {
            // InternalRentalSystem.g:343:45: (iv_ruleDeal= ruleDeal EOF )
            // InternalRentalSystem.g:344:2: iv_ruleDeal= ruleDeal EOF
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
    // InternalRentalSystem.g:350:1: ruleDeal returns [EObject current=null] : (otherlv_0= 'deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'dealWorkFlow' ( ( ruleQualifiedName ) ) otherlv_9= 'dealAttribute' ( (lv_dealAttribute_10_0= ruleAttribute ) )* otherlv_11= ')' ) ;
    public final EObject ruleDeal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_dealAttribute_10_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:356:2: ( (otherlv_0= 'deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'dealWorkFlow' ( ( ruleQualifiedName ) ) otherlv_9= 'dealAttribute' ( (lv_dealAttribute_10_0= ruleAttribute ) )* otherlv_11= ')' ) )
            // InternalRentalSystem.g:357:2: (otherlv_0= 'deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'dealWorkFlow' ( ( ruleQualifiedName ) ) otherlv_9= 'dealAttribute' ( (lv_dealAttribute_10_0= ruleAttribute ) )* otherlv_11= ')' )
            {
            // InternalRentalSystem.g:357:2: (otherlv_0= 'deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'dealWorkFlow' ( ( ruleQualifiedName ) ) otherlv_9= 'dealAttribute' ( (lv_dealAttribute_10_0= ruleAttribute ) )* otherlv_11= ')' )
            // InternalRentalSystem.g:358:3: otherlv_0= 'deal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'customer' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'rentalType' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'dealWorkFlow' ( ( ruleQualifiedName ) ) otherlv_9= 'dealAttribute' ( (lv_dealAttribute_10_0= ruleAttribute ) )* otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDealAccess().getDealKeyword_0());
            		
            // InternalRentalSystem.g:362:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:363:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:363:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:364:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDealAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDealAccess().getCustomerKeyword_3());
            		
            // InternalRentalSystem.g:388:3: ( (otherlv_4= RULE_ID ) )
            // InternalRentalSystem.g:389:4: (otherlv_4= RULE_ID )
            {
            // InternalRentalSystem.g:389:4: (otherlv_4= RULE_ID )
            // InternalRentalSystem.g:390:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDealRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_4, grammarAccess.getDealAccess().getCustomerCustomerCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDealAccess().getRentalTypeKeyword_5());
            		
            // InternalRentalSystem.g:405:3: ( (otherlv_6= RULE_ID ) )
            // InternalRentalSystem.g:406:4: (otherlv_6= RULE_ID )
            {
            // InternalRentalSystem.g:406:4: (otherlv_6= RULE_ID )
            // InternalRentalSystem.g:407:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDealRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_6, grammarAccess.getDealAccess().getRentalTypeRentalTypeCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getDealAccess().getDealWorkFlowKeyword_7());
            		
            // InternalRentalSystem.g:422:3: ( ( ruleQualifiedName ) )
            // InternalRentalSystem.g:423:4: ( ruleQualifiedName )
            {
            // InternalRentalSystem.g:423:4: ( ruleQualifiedName )
            // InternalRentalSystem.g:424:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDealRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDealAccess().getWfRentalWorkflowCrossReference_8_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getDealAccess().getDealAttributeKeyword_9());
            		
            // InternalRentalSystem.g:442:3: ( (lv_dealAttribute_10_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRentalSystem.g:443:4: (lv_dealAttribute_10_0= ruleAttribute )
            	    {
            	    // InternalRentalSystem.g:443:4: (lv_dealAttribute_10_0= ruleAttribute )
            	    // InternalRentalSystem.g:444:5: lv_dealAttribute_10_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getDealAccess().getDealAttributeAttributeParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_dealAttribute_10_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDealRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dealAttribute",
            	    						lv_dealAttribute_10_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDealAccess().getRightParenthesisKeyword_11());
            		

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
    // InternalRentalSystem.g:469:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalRentalSystem.g:469:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalRentalSystem.g:470:2: iv_ruleCustomer= ruleCustomer EOF
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
    // InternalRentalSystem.g:476:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'customerMold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_customerAttribute_3_0= ruleAttribute ) )* otherlv_4= ')' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_customerAttribute_3_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:482:2: ( (otherlv_0= 'customerMold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_customerAttribute_3_0= ruleAttribute ) )* otherlv_4= ')' ) )
            // InternalRentalSystem.g:483:2: (otherlv_0= 'customerMold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_customerAttribute_3_0= ruleAttribute ) )* otherlv_4= ')' )
            {
            // InternalRentalSystem.g:483:2: (otherlv_0= 'customerMold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_customerAttribute_3_0= ruleAttribute ) )* otherlv_4= ')' )
            // InternalRentalSystem.g:484:3: otherlv_0= 'customerMold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_customerAttribute_3_0= ruleAttribute ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerMoldKeyword_0());
            		
            // InternalRentalSystem.g:488:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:489:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:489:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:490:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRentalSystem.g:510:3: ( (lv_customerAttribute_3_0= ruleAttribute ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRentalSystem.g:511:4: (lv_customerAttribute_3_0= ruleAttribute )
            	    {
            	    // InternalRentalSystem.g:511:4: (lv_customerAttribute_3_0= ruleAttribute )
            	    // InternalRentalSystem.g:512:5: lv_customerAttribute_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getCustomerAccess().getCustomerAttributeAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_customerAttribute_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customerAttribute",
            	    						lv_customerAttribute_3_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalRentalSystem.g:537:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRentalSystem.g:537:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRentalSystem.g:538:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRentalSystem.g:544:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_ofType_3_0= ruleOfType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Enumerator lv_ofType_3_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:550:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_ofType_3_0= ruleOfType ) ) ) )
            // InternalRentalSystem.g:551:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_ofType_3_0= ruleOfType ) ) )
            {
            // InternalRentalSystem.g:551:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_ofType_3_0= ruleOfType ) ) )
            // InternalRentalSystem.g:552:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_ofType_3_0= ruleOfType ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRentalSystem.g:556:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:557:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:557:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:558:5: lv_name_1_0= RULE_ID
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

            // InternalRentalSystem.g:574:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalRentalSystem.g:575:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalRentalSystem.g:575:4: (lv_value_2_0= RULE_STRING )
            // InternalRentalSystem.g:576:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            // InternalRentalSystem.g:592:3: ( (lv_ofType_3_0= ruleOfType ) )
            // InternalRentalSystem.g:593:4: (lv_ofType_3_0= ruleOfType )
            {
            // InternalRentalSystem.g:593:4: (lv_ofType_3_0= ruleOfType )
            // InternalRentalSystem.g:594:5: lv_ofType_3_0= ruleOfType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getOfTypeOfTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_ofType_3_0=ruleOfType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"ofType",
            						lv_ofType_3_0,
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleOfType"
    // InternalRentalSystem.g:615:1: ruleOfType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'day' ) | (enumLiteral_6= 'week' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'email' ) | (enumLiteral_9= 'mobile' ) | (enumLiteral_10= 'currency' ) ) ;
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
            // InternalRentalSystem.g:621:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'day' ) | (enumLiteral_6= 'week' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'email' ) | (enumLiteral_9= 'mobile' ) | (enumLiteral_10= 'currency' ) ) )
            // InternalRentalSystem.g:622:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'day' ) | (enumLiteral_6= 'week' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'email' ) | (enumLiteral_9= 'mobile' ) | (enumLiteral_10= 'currency' ) )
            {
            // InternalRentalSystem.g:622:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'day' ) | (enumLiteral_6= 'week' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'email' ) | (enumLiteral_9= 'mobile' ) | (enumLiteral_10= 'currency' ) )
            int alt9=11;
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
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            case 31:
                {
                alt9=6;
                }
                break;
            case 32:
                {
                alt9=7;
                }
                break;
            case 33:
                {
                alt9=8;
                }
                break;
            case 34:
                {
                alt9=9;
                }
                break;
            case 35:
                {
                alt9=10;
                }
                break;
            case 36:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRentalSystem.g:623:3: (enumLiteral_0= 'int' )
                    {
                    // InternalRentalSystem.g:623:3: (enumLiteral_0= 'int' )
                    // InternalRentalSystem.g:624:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalSystem.g:631:3: (enumLiteral_1= 'String' )
                    {
                    // InternalRentalSystem.g:631:3: (enumLiteral_1= 'String' )
                    // InternalRentalSystem.g:632:4: enumLiteral_1= 'String'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalSystem.g:639:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalRentalSystem.g:639:3: (enumLiteral_2= 'Date' )
                    // InternalRentalSystem.g:640:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRentalSystem.g:647:3: (enumLiteral_3= 'decimal' )
                    {
                    // InternalRentalSystem.g:647:3: (enumLiteral_3= 'decimal' )
                    // InternalRentalSystem.g:648:4: enumLiteral_3= 'decimal'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDecimalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOfTypeAccess().getDecimalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRentalSystem.g:655:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalRentalSystem.g:655:3: (enumLiteral_4= 'Double' )
                    // InternalRentalSystem.g:656:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRentalSystem.g:663:3: (enumLiteral_5= 'day' )
                    {
                    // InternalRentalSystem.g:663:3: (enumLiteral_5= 'day' )
                    // InternalRentalSystem.g:664:4: enumLiteral_5= 'day'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOfTypeAccess().getDayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRentalSystem.g:671:3: (enumLiteral_6= 'week' )
                    {
                    // InternalRentalSystem.g:671:3: (enumLiteral_6= 'week' )
                    // InternalRentalSystem.g:672:4: enumLiteral_6= 'week'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getWeekEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOfTypeAccess().getWeekEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRentalSystem.g:679:3: (enumLiteral_7= 'month' )
                    {
                    // InternalRentalSystem.g:679:3: (enumLiteral_7= 'month' )
                    // InternalRentalSystem.g:680:4: enumLiteral_7= 'month'
                    {
                    enumLiteral_7=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getMonthEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOfTypeAccess().getMonthEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRentalSystem.g:687:3: (enumLiteral_8= 'email' )
                    {
                    // InternalRentalSystem.g:687:3: (enumLiteral_8= 'email' )
                    // InternalRentalSystem.g:688:4: enumLiteral_8= 'email'
                    {
                    enumLiteral_8=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getEMailEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getOfTypeAccess().getEMailEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRentalSystem.g:695:3: (enumLiteral_9= 'mobile' )
                    {
                    // InternalRentalSystem.g:695:3: (enumLiteral_9= 'mobile' )
                    // InternalRentalSystem.g:696:4: enumLiteral_9= 'mobile'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getMobileEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getOfTypeAccess().getMobileEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRentalSystem.g:703:3: (enumLiteral_10= 'currency' )
                    {
                    // InternalRentalSystem.g:703:3: (enumLiteral_10= 'currency' )
                    // InternalRentalSystem.g:704:4: enumLiteral_10= 'currency'
                    {
                    enumLiteral_10=(Token)match(input,36,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000109E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001082000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001FFC000000L});

}