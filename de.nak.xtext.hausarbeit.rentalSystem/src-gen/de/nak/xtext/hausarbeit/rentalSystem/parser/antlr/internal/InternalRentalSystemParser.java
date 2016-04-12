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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rentalSystem'", "'movable'", "'digital'", "'fix'", "'type'", "'('", "')'", "'text'", "'='", "'customer'", "'int'", "'string'", "'date'", "'decimal'", "'double'", "'email'", "'mobile'", "'currency'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    // InternalRentalSystem.g:72:1: ruleRentalSystem returns [EObject current=null] : (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* ) ;
    public final EObject ruleRentalSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_types_3_0 = null;

        EObject lv_customers_4_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:78:2: ( (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* ) )
            // InternalRentalSystem.g:79:2: (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* )
            {
            // InternalRentalSystem.g:79:2: (otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )* )
            // InternalRentalSystem.g:80:3: otherlv_0= 'rentalSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_types_3_0= ruleType ) )* ( (lv_customers_4_0= ruleCustomer ) )*
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

                if ( (LA2_0==20) ) {
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
    // InternalRentalSystem.g:162:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRentalSystem.g:162:45: (iv_ruleType= ruleType EOF )
            // InternalRentalSystem.g:163:2: iv_ruleType= ruleType EOF
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
    // InternalRentalSystem.g:169:1: ruleType returns [EObject current=null] : ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( (lv_typeAttributes_7_0= ruleTypeAttribute ) )* otherlv_8= ')' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_movable_0_0=null;
        Token lv_digital_1_0=null;
        Token lv_fix_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_typeAttributes_7_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:175:2: ( ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( (lv_typeAttributes_7_0= ruleTypeAttribute ) )* otherlv_8= ')' ) )
            // InternalRentalSystem.g:176:2: ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( (lv_typeAttributes_7_0= ruleTypeAttribute ) )* otherlv_8= ')' )
            {
            // InternalRentalSystem.g:176:2: ( ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( (lv_typeAttributes_7_0= ruleTypeAttribute ) )* otherlv_8= ')' )
            // InternalRentalSystem.g:177:3: ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) ) otherlv_3= 'type' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( (lv_typeAttributes_7_0= ruleTypeAttribute ) )* otherlv_8= ')'
            {
            // InternalRentalSystem.g:177:3: ( ( (lv_movable_0_0= 'movable' ) ) | ( (lv_digital_1_0= 'digital' ) ) | ( (lv_fix_2_0= 'fix' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRentalSystem.g:178:4: ( (lv_movable_0_0= 'movable' ) )
                    {
                    // InternalRentalSystem.g:178:4: ( (lv_movable_0_0= 'movable' ) )
                    // InternalRentalSystem.g:179:5: (lv_movable_0_0= 'movable' )
                    {
                    // InternalRentalSystem.g:179:5: (lv_movable_0_0= 'movable' )
                    // InternalRentalSystem.g:180:6: lv_movable_0_0= 'movable'
                    {
                    lv_movable_0_0=(Token)match(input,12,FOLLOW_7); 

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
                    // InternalRentalSystem.g:193:4: ( (lv_digital_1_0= 'digital' ) )
                    {
                    // InternalRentalSystem.g:193:4: ( (lv_digital_1_0= 'digital' ) )
                    // InternalRentalSystem.g:194:5: (lv_digital_1_0= 'digital' )
                    {
                    // InternalRentalSystem.g:194:5: (lv_digital_1_0= 'digital' )
                    // InternalRentalSystem.g:195:6: lv_digital_1_0= 'digital'
                    {
                    lv_digital_1_0=(Token)match(input,13,FOLLOW_7); 

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
                    // InternalRentalSystem.g:208:4: ( (lv_fix_2_0= 'fix' ) )
                    {
                    // InternalRentalSystem.g:208:4: ( (lv_fix_2_0= 'fix' ) )
                    // InternalRentalSystem.g:209:5: (lv_fix_2_0= 'fix' )
                    {
                    // InternalRentalSystem.g:209:5: (lv_fix_2_0= 'fix' )
                    // InternalRentalSystem.g:210:6: lv_fix_2_0= 'fix'
                    {
                    lv_fix_2_0=(Token)match(input,14,FOLLOW_7); 

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
            		
            // InternalRentalSystem.g:227:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalRentalSystem.g:228:4: (lv_name_4_0= RULE_ID )
            {
            // InternalRentalSystem.g:228:4: (lv_name_4_0= RULE_ID )
            // InternalRentalSystem.g:229:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRentalSystem.g:249:3: ( (otherlv_6= RULE_ID ) )
            // InternalRentalSystem.g:250:4: (otherlv_6= RULE_ID )
            {
            // InternalRentalSystem.g:250:4: (otherlv_6= RULE_ID )
            // InternalRentalSystem.g:251:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getRentalWorkflowRentalWorkflowCrossReference_4_0());
            				

            }


            }

            // InternalRentalSystem.g:262:3: ( (lv_typeAttributes_7_0= ruleTypeAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRentalSystem.g:263:4: (lv_typeAttributes_7_0= ruleTypeAttribute )
            	    {
            	    // InternalRentalSystem.g:263:4: (lv_typeAttributes_7_0= ruleTypeAttribute )
            	    // InternalRentalSystem.g:264:5: lv_typeAttributes_7_0= ruleTypeAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTypeAccess().getTypeAttributesTypeAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_typeAttributes_7_0=ruleTypeAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeAttributes",
            	    						lv_typeAttributes_7_0,
            	    						"de.nak.xtext.hausarbeit.rentalSystem.RentalSystem.TypeAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalRentalSystem.g:289:1: entryRuleTypeAttribute returns [EObject current=null] : iv_ruleTypeAttribute= ruleTypeAttribute EOF ;
    public final EObject entryRuleTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAttribute = null;


        try {
            // InternalRentalSystem.g:289:54: (iv_ruleTypeAttribute= ruleTypeAttribute EOF )
            // InternalRentalSystem.g:290:2: iv_ruleTypeAttribute= ruleTypeAttribute EOF
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
    // InternalRentalSystem.g:296:1: ruleTypeAttribute returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ofType_3_0= ruleOfType ) ) ) ;
    public final EObject ruleTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_ofType_3_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:302:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ofType_3_0= ruleOfType ) ) ) )
            // InternalRentalSystem.g:303:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ofType_3_0= ruleOfType ) ) )
            {
            // InternalRentalSystem.g:303:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ofType_3_0= ruleOfType ) ) )
            // InternalRentalSystem.g:304:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ofType_3_0= ruleOfType ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAttributeAccess().getTextKeyword_0());
            		
            // InternalRentalSystem.g:308:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:309:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:309:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:310:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAttributeAccess().getEqualsSignKeyword_2());
            		
            // InternalRentalSystem.g:330:3: ( (lv_ofType_3_0= ruleOfType ) )
            // InternalRentalSystem.g:331:4: (lv_ofType_3_0= ruleOfType )
            {
            // InternalRentalSystem.g:331:4: (lv_ofType_3_0= ruleOfType )
            // InternalRentalSystem.g:332:5: lv_ofType_3_0= ruleOfType
            {

            					newCompositeNode(grammarAccess.getTypeAttributeAccess().getOfTypeOfTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_ofType_3_0=ruleOfType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeAttributeRule());
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
    // $ANTLR end "ruleTypeAttribute"


    // $ANTLR start "entryRuleCustomer"
    // InternalRentalSystem.g:353:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalRentalSystem.g:353:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalRentalSystem.g:354:2: iv_ruleCustomer= ruleCustomer EOF
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
    // InternalRentalSystem.g:360:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalRentalSystem.g:366:2: ( (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')' ) )
            // InternalRentalSystem.g:367:2: (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')' )
            {
            // InternalRentalSystem.g:367:2: (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')' )
            // InternalRentalSystem.g:368:3: otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalRentalSystem.g:372:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:373:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:373:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:374:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRentalSystem.g:394:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRentalSystem.g:395:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalRentalSystem.g:395:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalRentalSystem.g:396:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getCustomerAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRentalSystem.g:421:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRentalSystem.g:421:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRentalSystem.g:422:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRentalSystem.g:428:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalRentalSystem.g:434:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalRentalSystem.g:435:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalRentalSystem.g:435:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalRentalSystem.g:436:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTextKeyword_0());
            		
            // InternalRentalSystem.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRentalSystem.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRentalSystem.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalRentalSystem.g:442:5: lv_name_1_0= RULE_ID
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

            // InternalRentalSystem.g:458:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalRentalSystem.g:459:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalRentalSystem.g:459:4: (lv_value_2_0= RULE_STRING )
            // InternalRentalSystem.g:460:5: lv_value_2_0= RULE_STRING
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
    // InternalRentalSystem.g:480:1: ruleOfType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'email' ) | (enumLiteral_6= 'mobile' ) | (enumLiteral_7= 'currency' ) ) ;
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


        	enterRule();

        try {
            // InternalRentalSystem.g:486:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'email' ) | (enumLiteral_6= 'mobile' ) | (enumLiteral_7= 'currency' ) ) )
            // InternalRentalSystem.g:487:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'email' ) | (enumLiteral_6= 'mobile' ) | (enumLiteral_7= 'currency' ) )
            {
            // InternalRentalSystem.g:487:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'decimal' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'email' ) | (enumLiteral_6= 'mobile' ) | (enumLiteral_7= 'currency' ) )
            int alt6=8;
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
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            case 27:
                {
                alt6=7;
                }
                break;
            case 28:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRentalSystem.g:488:3: (enumLiteral_0= 'int' )
                    {
                    // InternalRentalSystem.g:488:3: (enumLiteral_0= 'int' )
                    // InternalRentalSystem.g:489:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalSystem.g:496:3: (enumLiteral_1= 'string' )
                    {
                    // InternalRentalSystem.g:496:3: (enumLiteral_1= 'string' )
                    // InternalRentalSystem.g:497:4: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalSystem.g:504:3: (enumLiteral_2= 'date' )
                    {
                    // InternalRentalSystem.g:504:3: (enumLiteral_2= 'date' )
                    // InternalRentalSystem.g:505:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRentalSystem.g:512:3: (enumLiteral_3= 'decimal' )
                    {
                    // InternalRentalSystem.g:512:3: (enumLiteral_3= 'decimal' )
                    // InternalRentalSystem.g:513:4: enumLiteral_3= 'decimal'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDecimalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOfTypeAccess().getDecimalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRentalSystem.g:520:3: (enumLiteral_4= 'double' )
                    {
                    // InternalRentalSystem.g:520:3: (enumLiteral_4= 'double' )
                    // InternalRentalSystem.g:521:4: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRentalSystem.g:528:3: (enumLiteral_5= 'email' )
                    {
                    // InternalRentalSystem.g:528:3: (enumLiteral_5= 'email' )
                    // InternalRentalSystem.g:529:4: enumLiteral_5= 'email'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getEMailEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOfTypeAccess().getEMailEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRentalSystem.g:536:3: (enumLiteral_6= 'mobile' )
                    {
                    // InternalRentalSystem.g:536:3: (enumLiteral_6= 'mobile' )
                    // InternalRentalSystem.g:537:4: enumLiteral_6= 'mobile'
                    {
                    enumLiteral_6=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getMobileEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOfTypeAccess().getMobileEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRentalSystem.g:544:3: (enumLiteral_7= 'currency' )
                    {
                    // InternalRentalSystem.g:544:3: (enumLiteral_7= 'currency' )
                    // InternalRentalSystem.g:545:4: enumLiteral_7= 'currency'
                    {
                    enumLiteral_7=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getOfTypeAccess().getCurrencyEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOfTypeAccess().getCurrencyEnumLiteralDeclaration_7());
                    			

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000107002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001FE00000L});

}