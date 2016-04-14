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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRentalSystemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'date'", "'decimal'", "'double'", "'day'", "'week'", "'month'", "'email'", "'mobile'", "'currency'", "'rentalSystem'", "'type'", "'('", "')'", "'text'", "'='", "'.'", "'Deal'", "'customer'", "'movable'", "'digital'", "'fix'"
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



    // $ANTLR start "entryRuleRentalSystem"
    // InternalRentalSystem.g:53:1: entryRuleRentalSystem : ruleRentalSystem EOF ;
    public final void entryRuleRentalSystem() throws RecognitionException {
        try {
            // InternalRentalSystem.g:54:1: ( ruleRentalSystem EOF )
            // InternalRentalSystem.g:55:1: ruleRentalSystem EOF
            {
             before(grammarAccess.getRentalSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleRentalSystem();

            state._fsp--;

             after(grammarAccess.getRentalSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRentalSystem"


    // $ANTLR start "ruleRentalSystem"
    // InternalRentalSystem.g:62:1: ruleRentalSystem : ( ( rule__RentalSystem__Group__0 ) ) ;
    public final void ruleRentalSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:66:2: ( ( ( rule__RentalSystem__Group__0 ) ) )
            // InternalRentalSystem.g:67:2: ( ( rule__RentalSystem__Group__0 ) )
            {
            // InternalRentalSystem.g:67:2: ( ( rule__RentalSystem__Group__0 ) )
            // InternalRentalSystem.g:68:3: ( rule__RentalSystem__Group__0 )
            {
             before(grammarAccess.getRentalSystemAccess().getGroup()); 
            // InternalRentalSystem.g:69:3: ( rule__RentalSystem__Group__0 )
            // InternalRentalSystem.g:69:4: rule__RentalSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RentalSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRentalSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRentalSystem"


    // $ANTLR start "entryRuleType"
    // InternalRentalSystem.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalRentalSystem.g:79:1: ( ruleType EOF )
            // InternalRentalSystem.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRentalSystem.g:87:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:91:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalRentalSystem.g:92:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalRentalSystem.g:92:2: ( ( rule__Type__Group__0 ) )
            // InternalRentalSystem.g:93:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalRentalSystem.g:94:3: ( rule__Type__Group__0 )
            // InternalRentalSystem.g:94:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeAttribute"
    // InternalRentalSystem.g:103:1: entryRuleTypeAttribute : ruleTypeAttribute EOF ;
    public final void entryRuleTypeAttribute() throws RecognitionException {
        try {
            // InternalRentalSystem.g:104:1: ( ruleTypeAttribute EOF )
            // InternalRentalSystem.g:105:1: ruleTypeAttribute EOF
            {
             before(grammarAccess.getTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeAttribute();

            state._fsp--;

             after(grammarAccess.getTypeAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeAttribute"


    // $ANTLR start "ruleTypeAttribute"
    // InternalRentalSystem.g:112:1: ruleTypeAttribute : ( ( rule__TypeAttribute__Group__0 ) ) ;
    public final void ruleTypeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:116:2: ( ( ( rule__TypeAttribute__Group__0 ) ) )
            // InternalRentalSystem.g:117:2: ( ( rule__TypeAttribute__Group__0 ) )
            {
            // InternalRentalSystem.g:117:2: ( ( rule__TypeAttribute__Group__0 ) )
            // InternalRentalSystem.g:118:3: ( rule__TypeAttribute__Group__0 )
            {
             before(grammarAccess.getTypeAttributeAccess().getGroup()); 
            // InternalRentalSystem.g:119:3: ( rule__TypeAttribute__Group__0 )
            // InternalRentalSystem.g:119:4: rule__TypeAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRentalSystem.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRentalSystem.g:129:1: ( ruleQualifiedName EOF )
            // InternalRentalSystem.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalRentalSystem.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRentalSystem.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRentalSystem.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRentalSystem.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRentalSystem.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalRentalSystem.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDeal"
    // InternalRentalSystem.g:153:1: entryRuleDeal : ruleDeal EOF ;
    public final void entryRuleDeal() throws RecognitionException {
        try {
            // InternalRentalSystem.g:154:1: ( ruleDeal EOF )
            // InternalRentalSystem.g:155:1: ruleDeal EOF
            {
             before(grammarAccess.getDealRule()); 
            pushFollow(FOLLOW_1);
            ruleDeal();

            state._fsp--;

             after(grammarAccess.getDealRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeal"


    // $ANTLR start "ruleDeal"
    // InternalRentalSystem.g:162:1: ruleDeal : ( ( rule__Deal__Group__0 ) ) ;
    public final void ruleDeal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:166:2: ( ( ( rule__Deal__Group__0 ) ) )
            // InternalRentalSystem.g:167:2: ( ( rule__Deal__Group__0 ) )
            {
            // InternalRentalSystem.g:167:2: ( ( rule__Deal__Group__0 ) )
            // InternalRentalSystem.g:168:3: ( rule__Deal__Group__0 )
            {
             before(grammarAccess.getDealAccess().getGroup()); 
            // InternalRentalSystem.g:169:3: ( rule__Deal__Group__0 )
            // InternalRentalSystem.g:169:4: rule__Deal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Deal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeal"


    // $ANTLR start "entryRuleCustomer"
    // InternalRentalSystem.g:178:1: entryRuleCustomer : ruleCustomer EOF ;
    public final void entryRuleCustomer() throws RecognitionException {
        try {
            // InternalRentalSystem.g:179:1: ( ruleCustomer EOF )
            // InternalRentalSystem.g:180:1: ruleCustomer EOF
            {
             before(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalRentalSystem.g:187:1: ruleCustomer : ( ( rule__Customer__Group__0 ) ) ;
    public final void ruleCustomer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:191:2: ( ( ( rule__Customer__Group__0 ) ) )
            // InternalRentalSystem.g:192:2: ( ( rule__Customer__Group__0 ) )
            {
            // InternalRentalSystem.g:192:2: ( ( rule__Customer__Group__0 ) )
            // InternalRentalSystem.g:193:3: ( rule__Customer__Group__0 )
            {
             before(grammarAccess.getCustomerAccess().getGroup()); 
            // InternalRentalSystem.g:194:3: ( rule__Customer__Group__0 )
            // InternalRentalSystem.g:194:4: rule__Customer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleAttribute"
    // InternalRentalSystem.g:203:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalRentalSystem.g:204:1: ( ruleAttribute EOF )
            // InternalRentalSystem.g:205:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRentalSystem.g:212:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:216:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalRentalSystem.g:217:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalRentalSystem.g:217:2: ( ( rule__Attribute__Group__0 ) )
            // InternalRentalSystem.g:218:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalRentalSystem.g:219:3: ( rule__Attribute__Group__0 )
            // InternalRentalSystem.g:219:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleOfType"
    // InternalRentalSystem.g:228:1: ruleOfType : ( ( rule__OfType__Alternatives ) ) ;
    public final void ruleOfType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:232:1: ( ( ( rule__OfType__Alternatives ) ) )
            // InternalRentalSystem.g:233:2: ( ( rule__OfType__Alternatives ) )
            {
            // InternalRentalSystem.g:233:2: ( ( rule__OfType__Alternatives ) )
            // InternalRentalSystem.g:234:3: ( rule__OfType__Alternatives )
            {
             before(grammarAccess.getOfTypeAccess().getAlternatives()); 
            // InternalRentalSystem.g:235:3: ( rule__OfType__Alternatives )
            // InternalRentalSystem.g:235:4: rule__OfType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OfType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOfTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOfType"


    // $ANTLR start "rule__Type__Alternatives_0"
    // InternalRentalSystem.g:243:1: rule__Type__Alternatives_0 : ( ( ( rule__Type__MovableAssignment_0_0 ) ) | ( ( rule__Type__DigitalAssignment_0_1 ) ) | ( ( rule__Type__FixAssignment_0_2 ) ) );
    public final void rule__Type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:247:1: ( ( ( rule__Type__MovableAssignment_0_0 ) ) | ( ( rule__Type__DigitalAssignment_0_1 ) ) | ( ( rule__Type__FixAssignment_0_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRentalSystem.g:248:2: ( ( rule__Type__MovableAssignment_0_0 ) )
                    {
                    // InternalRentalSystem.g:248:2: ( ( rule__Type__MovableAssignment_0_0 ) )
                    // InternalRentalSystem.g:249:3: ( rule__Type__MovableAssignment_0_0 )
                    {
                     before(grammarAccess.getTypeAccess().getMovableAssignment_0_0()); 
                    // InternalRentalSystem.g:250:3: ( rule__Type__MovableAssignment_0_0 )
                    // InternalRentalSystem.g:250:4: rule__Type__MovableAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__MovableAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getMovableAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalSystem.g:254:2: ( ( rule__Type__DigitalAssignment_0_1 ) )
                    {
                    // InternalRentalSystem.g:254:2: ( ( rule__Type__DigitalAssignment_0_1 ) )
                    // InternalRentalSystem.g:255:3: ( rule__Type__DigitalAssignment_0_1 )
                    {
                     before(grammarAccess.getTypeAccess().getDigitalAssignment_0_1()); 
                    // InternalRentalSystem.g:256:3: ( rule__Type__DigitalAssignment_0_1 )
                    // InternalRentalSystem.g:256:4: rule__Type__DigitalAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__DigitalAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getDigitalAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalSystem.g:260:2: ( ( rule__Type__FixAssignment_0_2 ) )
                    {
                    // InternalRentalSystem.g:260:2: ( ( rule__Type__FixAssignment_0_2 ) )
                    // InternalRentalSystem.g:261:3: ( rule__Type__FixAssignment_0_2 )
                    {
                     before(grammarAccess.getTypeAccess().getFixAssignment_0_2()); 
                    // InternalRentalSystem.g:262:3: ( rule__Type__FixAssignment_0_2 )
                    // InternalRentalSystem.g:262:4: rule__Type__FixAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__FixAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getFixAssignment_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives_0"


    // $ANTLR start "rule__OfType__Alternatives"
    // InternalRentalSystem.g:270:1: rule__OfType__Alternatives : ( ( ( 'int' ) ) | ( ( 'string' ) ) | ( ( 'date' ) ) | ( ( 'decimal' ) ) | ( ( 'double' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) | ( ( 'month' ) ) | ( ( 'email' ) ) | ( ( 'mobile' ) ) | ( ( 'currency' ) ) );
    public final void rule__OfType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:274:1: ( ( ( 'int' ) ) | ( ( 'string' ) ) | ( ( 'date' ) ) | ( ( 'decimal' ) ) | ( ( 'double' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) | ( ( 'month' ) ) | ( ( 'email' ) ) | ( ( 'mobile' ) ) | ( ( 'currency' ) ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRentalSystem.g:275:2: ( ( 'int' ) )
                    {
                    // InternalRentalSystem.g:275:2: ( ( 'int' ) )
                    // InternalRentalSystem.g:276:3: ( 'int' )
                    {
                     before(grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalRentalSystem.g:277:3: ( 'int' )
                    // InternalRentalSystem.g:277:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalSystem.g:281:2: ( ( 'string' ) )
                    {
                    // InternalRentalSystem.g:281:2: ( ( 'string' ) )
                    // InternalRentalSystem.g:282:3: ( 'string' )
                    {
                     before(grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // InternalRentalSystem.g:283:3: ( 'string' )
                    // InternalRentalSystem.g:283:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalSystem.g:287:2: ( ( 'date' ) )
                    {
                    // InternalRentalSystem.g:287:2: ( ( 'date' ) )
                    // InternalRentalSystem.g:288:3: ( 'date' )
                    {
                     before(grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2()); 
                    // InternalRentalSystem.g:289:3: ( 'date' )
                    // InternalRentalSystem.g:289:4: 'date'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getDateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRentalSystem.g:293:2: ( ( 'decimal' ) )
                    {
                    // InternalRentalSystem.g:293:2: ( ( 'decimal' ) )
                    // InternalRentalSystem.g:294:3: ( 'decimal' )
                    {
                     before(grammarAccess.getOfTypeAccess().getDecimalEnumLiteralDeclaration_3()); 
                    // InternalRentalSystem.g:295:3: ( 'decimal' )
                    // InternalRentalSystem.g:295:4: 'decimal'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getDecimalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRentalSystem.g:299:2: ( ( 'double' ) )
                    {
                    // InternalRentalSystem.g:299:2: ( ( 'double' ) )
                    // InternalRentalSystem.g:300:3: ( 'double' )
                    {
                     before(grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalRentalSystem.g:301:3: ( 'double' )
                    // InternalRentalSystem.g:301:4: 'double'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRentalSystem.g:305:2: ( ( 'day' ) )
                    {
                    // InternalRentalSystem.g:305:2: ( ( 'day' ) )
                    // InternalRentalSystem.g:306:3: ( 'day' )
                    {
                     before(grammarAccess.getOfTypeAccess().getDayEnumLiteralDeclaration_5()); 
                    // InternalRentalSystem.g:307:3: ( 'day' )
                    // InternalRentalSystem.g:307:4: 'day'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getDayEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRentalSystem.g:311:2: ( ( 'week' ) )
                    {
                    // InternalRentalSystem.g:311:2: ( ( 'week' ) )
                    // InternalRentalSystem.g:312:3: ( 'week' )
                    {
                     before(grammarAccess.getOfTypeAccess().getWeekEnumLiteralDeclaration_6()); 
                    // InternalRentalSystem.g:313:3: ( 'week' )
                    // InternalRentalSystem.g:313:4: 'week'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getWeekEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRentalSystem.g:317:2: ( ( 'month' ) )
                    {
                    // InternalRentalSystem.g:317:2: ( ( 'month' ) )
                    // InternalRentalSystem.g:318:3: ( 'month' )
                    {
                     before(grammarAccess.getOfTypeAccess().getMonthEnumLiteralDeclaration_7()); 
                    // InternalRentalSystem.g:319:3: ( 'month' )
                    // InternalRentalSystem.g:319:4: 'month'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getMonthEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRentalSystem.g:323:2: ( ( 'email' ) )
                    {
                    // InternalRentalSystem.g:323:2: ( ( 'email' ) )
                    // InternalRentalSystem.g:324:3: ( 'email' )
                    {
                     before(grammarAccess.getOfTypeAccess().getEMailEnumLiteralDeclaration_8()); 
                    // InternalRentalSystem.g:325:3: ( 'email' )
                    // InternalRentalSystem.g:325:4: 'email'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getEMailEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRentalSystem.g:329:2: ( ( 'mobile' ) )
                    {
                    // InternalRentalSystem.g:329:2: ( ( 'mobile' ) )
                    // InternalRentalSystem.g:330:3: ( 'mobile' )
                    {
                     before(grammarAccess.getOfTypeAccess().getMobileEnumLiteralDeclaration_9()); 
                    // InternalRentalSystem.g:331:3: ( 'mobile' )
                    // InternalRentalSystem.g:331:4: 'mobile'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getMobileEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRentalSystem.g:335:2: ( ( 'currency' ) )
                    {
                    // InternalRentalSystem.g:335:2: ( ( 'currency' ) )
                    // InternalRentalSystem.g:336:3: ( 'currency' )
                    {
                     before(grammarAccess.getOfTypeAccess().getCurrencyEnumLiteralDeclaration_10()); 
                    // InternalRentalSystem.g:337:3: ( 'currency' )
                    // InternalRentalSystem.g:337:4: 'currency'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfTypeAccess().getCurrencyEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OfType__Alternatives"


    // $ANTLR start "rule__RentalSystem__Group__0"
    // InternalRentalSystem.g:345:1: rule__RentalSystem__Group__0 : rule__RentalSystem__Group__0__Impl rule__RentalSystem__Group__1 ;
    public final void rule__RentalSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:349:1: ( rule__RentalSystem__Group__0__Impl rule__RentalSystem__Group__1 )
            // InternalRentalSystem.g:350:2: rule__RentalSystem__Group__0__Impl rule__RentalSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RentalSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__0"


    // $ANTLR start "rule__RentalSystem__Group__0__Impl"
    // InternalRentalSystem.g:357:1: rule__RentalSystem__Group__0__Impl : ( 'rentalSystem' ) ;
    public final void rule__RentalSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:361:1: ( ( 'rentalSystem' ) )
            // InternalRentalSystem.g:362:1: ( 'rentalSystem' )
            {
            // InternalRentalSystem.g:362:1: ( 'rentalSystem' )
            // InternalRentalSystem.g:363:2: 'rentalSystem'
            {
             before(grammarAccess.getRentalSystemAccess().getRentalSystemKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRentalSystemAccess().getRentalSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__0__Impl"


    // $ANTLR start "rule__RentalSystem__Group__1"
    // InternalRentalSystem.g:372:1: rule__RentalSystem__Group__1 : rule__RentalSystem__Group__1__Impl rule__RentalSystem__Group__2 ;
    public final void rule__RentalSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:376:1: ( rule__RentalSystem__Group__1__Impl rule__RentalSystem__Group__2 )
            // InternalRentalSystem.g:377:2: rule__RentalSystem__Group__1__Impl rule__RentalSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RentalSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__1"


    // $ANTLR start "rule__RentalSystem__Group__1__Impl"
    // InternalRentalSystem.g:384:1: rule__RentalSystem__Group__1__Impl : ( ( rule__RentalSystem__NameAssignment_1 ) ) ;
    public final void rule__RentalSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:388:1: ( ( ( rule__RentalSystem__NameAssignment_1 ) ) )
            // InternalRentalSystem.g:389:1: ( ( rule__RentalSystem__NameAssignment_1 ) )
            {
            // InternalRentalSystem.g:389:1: ( ( rule__RentalSystem__NameAssignment_1 ) )
            // InternalRentalSystem.g:390:2: ( rule__RentalSystem__NameAssignment_1 )
            {
             before(grammarAccess.getRentalSystemAccess().getNameAssignment_1()); 
            // InternalRentalSystem.g:391:2: ( rule__RentalSystem__NameAssignment_1 )
            // InternalRentalSystem.g:391:3: rule__RentalSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RentalSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRentalSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__1__Impl"


    // $ANTLR start "rule__RentalSystem__Group__2"
    // InternalRentalSystem.g:399:1: rule__RentalSystem__Group__2 : rule__RentalSystem__Group__2__Impl rule__RentalSystem__Group__3 ;
    public final void rule__RentalSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:403:1: ( rule__RentalSystem__Group__2__Impl rule__RentalSystem__Group__3 )
            // InternalRentalSystem.g:404:2: rule__RentalSystem__Group__2__Impl rule__RentalSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RentalSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__2"


    // $ANTLR start "rule__RentalSystem__Group__2__Impl"
    // InternalRentalSystem.g:411:1: rule__RentalSystem__Group__2__Impl : ( ( rule__RentalSystem__TitleAssignment_2 ) ) ;
    public final void rule__RentalSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:415:1: ( ( ( rule__RentalSystem__TitleAssignment_2 ) ) )
            // InternalRentalSystem.g:416:1: ( ( rule__RentalSystem__TitleAssignment_2 ) )
            {
            // InternalRentalSystem.g:416:1: ( ( rule__RentalSystem__TitleAssignment_2 ) )
            // InternalRentalSystem.g:417:2: ( rule__RentalSystem__TitleAssignment_2 )
            {
             before(grammarAccess.getRentalSystemAccess().getTitleAssignment_2()); 
            // InternalRentalSystem.g:418:2: ( rule__RentalSystem__TitleAssignment_2 )
            // InternalRentalSystem.g:418:3: rule__RentalSystem__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RentalSystem__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRentalSystemAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__2__Impl"


    // $ANTLR start "rule__RentalSystem__Group__3"
    // InternalRentalSystem.g:426:1: rule__RentalSystem__Group__3 : rule__RentalSystem__Group__3__Impl rule__RentalSystem__Group__4 ;
    public final void rule__RentalSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:430:1: ( rule__RentalSystem__Group__3__Impl rule__RentalSystem__Group__4 )
            // InternalRentalSystem.g:431:2: rule__RentalSystem__Group__3__Impl rule__RentalSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RentalSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__3"


    // $ANTLR start "rule__RentalSystem__Group__3__Impl"
    // InternalRentalSystem.g:438:1: rule__RentalSystem__Group__3__Impl : ( ( rule__RentalSystem__TypesAssignment_3 )* ) ;
    public final void rule__RentalSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:442:1: ( ( ( rule__RentalSystem__TypesAssignment_3 )* ) )
            // InternalRentalSystem.g:443:1: ( ( rule__RentalSystem__TypesAssignment_3 )* )
            {
            // InternalRentalSystem.g:443:1: ( ( rule__RentalSystem__TypesAssignment_3 )* )
            // InternalRentalSystem.g:444:2: ( rule__RentalSystem__TypesAssignment_3 )*
            {
             before(grammarAccess.getRentalSystemAccess().getTypesAssignment_3()); 
            // InternalRentalSystem.g:445:2: ( rule__RentalSystem__TypesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=31 && LA3_0<=33)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRentalSystem.g:445:3: rule__RentalSystem__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RentalSystem__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRentalSystemAccess().getTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__3__Impl"


    // $ANTLR start "rule__RentalSystem__Group__4"
    // InternalRentalSystem.g:453:1: rule__RentalSystem__Group__4 : rule__RentalSystem__Group__4__Impl rule__RentalSystem__Group__5 ;
    public final void rule__RentalSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:457:1: ( rule__RentalSystem__Group__4__Impl rule__RentalSystem__Group__5 )
            // InternalRentalSystem.g:458:2: rule__RentalSystem__Group__4__Impl rule__RentalSystem__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__RentalSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__4"


    // $ANTLR start "rule__RentalSystem__Group__4__Impl"
    // InternalRentalSystem.g:465:1: rule__RentalSystem__Group__4__Impl : ( ( rule__RentalSystem__CustomersAssignment_4 )* ) ;
    public final void rule__RentalSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:469:1: ( ( ( rule__RentalSystem__CustomersAssignment_4 )* ) )
            // InternalRentalSystem.g:470:1: ( ( rule__RentalSystem__CustomersAssignment_4 )* )
            {
            // InternalRentalSystem.g:470:1: ( ( rule__RentalSystem__CustomersAssignment_4 )* )
            // InternalRentalSystem.g:471:2: ( rule__RentalSystem__CustomersAssignment_4 )*
            {
             before(grammarAccess.getRentalSystemAccess().getCustomersAssignment_4()); 
            // InternalRentalSystem.g:472:2: ( rule__RentalSystem__CustomersAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRentalSystem.g:472:3: rule__RentalSystem__CustomersAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RentalSystem__CustomersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRentalSystemAccess().getCustomersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__4__Impl"


    // $ANTLR start "rule__RentalSystem__Group__5"
    // InternalRentalSystem.g:480:1: rule__RentalSystem__Group__5 : rule__RentalSystem__Group__5__Impl ;
    public final void rule__RentalSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:484:1: ( rule__RentalSystem__Group__5__Impl )
            // InternalRentalSystem.g:485:2: rule__RentalSystem__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RentalSystem__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__5"


    // $ANTLR start "rule__RentalSystem__Group__5__Impl"
    // InternalRentalSystem.g:491:1: rule__RentalSystem__Group__5__Impl : ( ( rule__RentalSystem__DealsAssignment_5 )* ) ;
    public final void rule__RentalSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:495:1: ( ( ( rule__RentalSystem__DealsAssignment_5 )* ) )
            // InternalRentalSystem.g:496:1: ( ( rule__RentalSystem__DealsAssignment_5 )* )
            {
            // InternalRentalSystem.g:496:1: ( ( rule__RentalSystem__DealsAssignment_5 )* )
            // InternalRentalSystem.g:497:2: ( rule__RentalSystem__DealsAssignment_5 )*
            {
             before(grammarAccess.getRentalSystemAccess().getDealsAssignment_5()); 
            // InternalRentalSystem.g:498:2: ( rule__RentalSystem__DealsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRentalSystem.g:498:3: rule__RentalSystem__DealsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RentalSystem__DealsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRentalSystemAccess().getDealsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__Group__5__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalRentalSystem.g:507:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:511:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalRentalSystem.g:512:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalRentalSystem.g:519:1: rule__Type__Group__0__Impl : ( ( rule__Type__Alternatives_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:523:1: ( ( ( rule__Type__Alternatives_0 ) ) )
            // InternalRentalSystem.g:524:1: ( ( rule__Type__Alternatives_0 ) )
            {
            // InternalRentalSystem.g:524:1: ( ( rule__Type__Alternatives_0 ) )
            // InternalRentalSystem.g:525:2: ( rule__Type__Alternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0()); 
            // InternalRentalSystem.g:526:2: ( rule__Type__Alternatives_0 )
            // InternalRentalSystem.g:526:3: rule__Type__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalRentalSystem.g:534:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:538:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalRentalSystem.g:539:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalRentalSystem.g:546:1: rule__Type__Group__1__Impl : ( 'type' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:550:1: ( ( 'type' ) )
            // InternalRentalSystem.g:551:1: ( 'type' )
            {
            // InternalRentalSystem.g:551:1: ( 'type' )
            // InternalRentalSystem.g:552:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalRentalSystem.g:561:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:565:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalRentalSystem.g:566:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalRentalSystem.g:573:1: rule__Type__Group__2__Impl : ( ( rule__Type__NameAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:577:1: ( ( ( rule__Type__NameAssignment_2 ) ) )
            // InternalRentalSystem.g:578:1: ( ( rule__Type__NameAssignment_2 ) )
            {
            // InternalRentalSystem.g:578:1: ( ( rule__Type__NameAssignment_2 ) )
            // InternalRentalSystem.g:579:2: ( rule__Type__NameAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_2()); 
            // InternalRentalSystem.g:580:2: ( rule__Type__NameAssignment_2 )
            // InternalRentalSystem.g:580:3: rule__Type__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalRentalSystem.g:588:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:592:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalRentalSystem.g:593:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalRentalSystem.g:600:1: rule__Type__Group__3__Impl : ( '(' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:604:1: ( ( '(' ) )
            // InternalRentalSystem.g:605:1: ( '(' )
            {
            // InternalRentalSystem.g:605:1: ( '(' )
            // InternalRentalSystem.g:606:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__4"
    // InternalRentalSystem.g:615:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:619:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalRentalSystem.g:620:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // InternalRentalSystem.g:627:1: rule__Type__Group__4__Impl : ( ( rule__Type__RentalWorkflowAssignment_4 ) ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:631:1: ( ( ( rule__Type__RentalWorkflowAssignment_4 ) ) )
            // InternalRentalSystem.g:632:1: ( ( rule__Type__RentalWorkflowAssignment_4 ) )
            {
            // InternalRentalSystem.g:632:1: ( ( rule__Type__RentalWorkflowAssignment_4 ) )
            // InternalRentalSystem.g:633:2: ( rule__Type__RentalWorkflowAssignment_4 )
            {
             before(grammarAccess.getTypeAccess().getRentalWorkflowAssignment_4()); 
            // InternalRentalSystem.g:634:2: ( rule__Type__RentalWorkflowAssignment_4 )
            // InternalRentalSystem.g:634:3: rule__Type__RentalWorkflowAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Type__RentalWorkflowAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getRentalWorkflowAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__5"
    // InternalRentalSystem.g:642:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:646:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // InternalRentalSystem.g:647:2: rule__Type__Group__5__Impl rule__Type__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5"


    // $ANTLR start "rule__Type__Group__5__Impl"
    // InternalRentalSystem.g:654:1: rule__Type__Group__5__Impl : ( ( rule__Type__TypeAttributesAssignment_5 )* ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:658:1: ( ( ( rule__Type__TypeAttributesAssignment_5 )* ) )
            // InternalRentalSystem.g:659:1: ( ( rule__Type__TypeAttributesAssignment_5 )* )
            {
            // InternalRentalSystem.g:659:1: ( ( rule__Type__TypeAttributesAssignment_5 )* )
            // InternalRentalSystem.g:660:2: ( rule__Type__TypeAttributesAssignment_5 )*
            {
             before(grammarAccess.getTypeAccess().getTypeAttributesAssignment_5()); 
            // InternalRentalSystem.g:661:2: ( rule__Type__TypeAttributesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRentalSystem.g:661:3: rule__Type__TypeAttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Type__TypeAttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getTypeAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5__Impl"


    // $ANTLR start "rule__Type__Group__6"
    // InternalRentalSystem.g:669:1: rule__Type__Group__6 : rule__Type__Group__6__Impl ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:673:1: ( rule__Type__Group__6__Impl )
            // InternalRentalSystem.g:674:2: rule__Type__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__6"


    // $ANTLR start "rule__Type__Group__6__Impl"
    // InternalRentalSystem.g:680:1: rule__Type__Group__6__Impl : ( ')' ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:684:1: ( ( ')' ) )
            // InternalRentalSystem.g:685:1: ( ')' )
            {
            // InternalRentalSystem.g:685:1: ( ')' )
            // InternalRentalSystem.g:686:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__6__Impl"


    // $ANTLR start "rule__TypeAttribute__Group__0"
    // InternalRentalSystem.g:696:1: rule__TypeAttribute__Group__0 : rule__TypeAttribute__Group__0__Impl rule__TypeAttribute__Group__1 ;
    public final void rule__TypeAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:700:1: ( rule__TypeAttribute__Group__0__Impl rule__TypeAttribute__Group__1 )
            // InternalRentalSystem.g:701:2: rule__TypeAttribute__Group__0__Impl rule__TypeAttribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__0"


    // $ANTLR start "rule__TypeAttribute__Group__0__Impl"
    // InternalRentalSystem.g:708:1: rule__TypeAttribute__Group__0__Impl : ( 'text' ) ;
    public final void rule__TypeAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:712:1: ( ( 'text' ) )
            // InternalRentalSystem.g:713:1: ( 'text' )
            {
            // InternalRentalSystem.g:713:1: ( 'text' )
            // InternalRentalSystem.g:714:2: 'text'
            {
             before(grammarAccess.getTypeAttributeAccess().getTextKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeAttributeAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__0__Impl"


    // $ANTLR start "rule__TypeAttribute__Group__1"
    // InternalRentalSystem.g:723:1: rule__TypeAttribute__Group__1 : rule__TypeAttribute__Group__1__Impl rule__TypeAttribute__Group__2 ;
    public final void rule__TypeAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:727:1: ( rule__TypeAttribute__Group__1__Impl rule__TypeAttribute__Group__2 )
            // InternalRentalSystem.g:728:2: rule__TypeAttribute__Group__1__Impl rule__TypeAttribute__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__TypeAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__1"


    // $ANTLR start "rule__TypeAttribute__Group__1__Impl"
    // InternalRentalSystem.g:735:1: rule__TypeAttribute__Group__1__Impl : ( ( rule__TypeAttribute__NameAssignment_1 ) ) ;
    public final void rule__TypeAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:739:1: ( ( ( rule__TypeAttribute__NameAssignment_1 ) ) )
            // InternalRentalSystem.g:740:1: ( ( rule__TypeAttribute__NameAssignment_1 ) )
            {
            // InternalRentalSystem.g:740:1: ( ( rule__TypeAttribute__NameAssignment_1 ) )
            // InternalRentalSystem.g:741:2: ( rule__TypeAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAttributeAccess().getNameAssignment_1()); 
            // InternalRentalSystem.g:742:2: ( rule__TypeAttribute__NameAssignment_1 )
            // InternalRentalSystem.g:742:3: rule__TypeAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__1__Impl"


    // $ANTLR start "rule__TypeAttribute__Group__2"
    // InternalRentalSystem.g:750:1: rule__TypeAttribute__Group__2 : rule__TypeAttribute__Group__2__Impl rule__TypeAttribute__Group__3 ;
    public final void rule__TypeAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:754:1: ( rule__TypeAttribute__Group__2__Impl rule__TypeAttribute__Group__3 )
            // InternalRentalSystem.g:755:2: rule__TypeAttribute__Group__2__Impl rule__TypeAttribute__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TypeAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__2"


    // $ANTLR start "rule__TypeAttribute__Group__2__Impl"
    // InternalRentalSystem.g:762:1: rule__TypeAttribute__Group__2__Impl : ( '=' ) ;
    public final void rule__TypeAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:766:1: ( ( '=' ) )
            // InternalRentalSystem.g:767:1: ( '=' )
            {
            // InternalRentalSystem.g:767:1: ( '=' )
            // InternalRentalSystem.g:768:2: '='
            {
             before(grammarAccess.getTypeAttributeAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeAttributeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__2__Impl"


    // $ANTLR start "rule__TypeAttribute__Group__3"
    // InternalRentalSystem.g:777:1: rule__TypeAttribute__Group__3 : rule__TypeAttribute__Group__3__Impl ;
    public final void rule__TypeAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:781:1: ( rule__TypeAttribute__Group__3__Impl )
            // InternalRentalSystem.g:782:2: rule__TypeAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__3"


    // $ANTLR start "rule__TypeAttribute__Group__3__Impl"
    // InternalRentalSystem.g:788:1: rule__TypeAttribute__Group__3__Impl : ( ( rule__TypeAttribute__OfTypeAssignment_3 ) ) ;
    public final void rule__TypeAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:792:1: ( ( ( rule__TypeAttribute__OfTypeAssignment_3 ) ) )
            // InternalRentalSystem.g:793:1: ( ( rule__TypeAttribute__OfTypeAssignment_3 ) )
            {
            // InternalRentalSystem.g:793:1: ( ( rule__TypeAttribute__OfTypeAssignment_3 ) )
            // InternalRentalSystem.g:794:2: ( rule__TypeAttribute__OfTypeAssignment_3 )
            {
             before(grammarAccess.getTypeAttributeAccess().getOfTypeAssignment_3()); 
            // InternalRentalSystem.g:795:2: ( rule__TypeAttribute__OfTypeAssignment_3 )
            // InternalRentalSystem.g:795:3: rule__TypeAttribute__OfTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TypeAttribute__OfTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAttributeAccess().getOfTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalRentalSystem.g:804:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:808:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRentalSystem.g:809:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalRentalSystem.g:816:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:820:1: ( ( RULE_ID ) )
            // InternalRentalSystem.g:821:1: ( RULE_ID )
            {
            // InternalRentalSystem.g:821:1: ( RULE_ID )
            // InternalRentalSystem.g:822:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalRentalSystem.g:831:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:835:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRentalSystem.g:836:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalRentalSystem.g:842:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:846:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRentalSystem.g:847:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRentalSystem.g:847:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRentalSystem.g:848:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRentalSystem.g:849:2: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRentalSystem.g:849:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalRentalSystem.g:858:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:862:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRentalSystem.g:863:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalRentalSystem.g:870:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:874:1: ( ( '.' ) )
            // InternalRentalSystem.g:875:1: ( '.' )
            {
            // InternalRentalSystem.g:875:1: ( '.' )
            // InternalRentalSystem.g:876:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalRentalSystem.g:885:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:889:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRentalSystem.g:890:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalRentalSystem.g:896:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:900:1: ( ( RULE_ID ) )
            // InternalRentalSystem.g:901:1: ( RULE_ID )
            {
            // InternalRentalSystem.g:901:1: ( RULE_ID )
            // InternalRentalSystem.g:902:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Deal__Group__0"
    // InternalRentalSystem.g:912:1: rule__Deal__Group__0 : rule__Deal__Group__0__Impl rule__Deal__Group__1 ;
    public final void rule__Deal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:916:1: ( rule__Deal__Group__0__Impl rule__Deal__Group__1 )
            // InternalRentalSystem.g:917:2: rule__Deal__Group__0__Impl rule__Deal__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Deal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__0"


    // $ANTLR start "rule__Deal__Group__0__Impl"
    // InternalRentalSystem.g:924:1: rule__Deal__Group__0__Impl : ( 'Deal' ) ;
    public final void rule__Deal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:928:1: ( ( 'Deal' ) )
            // InternalRentalSystem.g:929:1: ( 'Deal' )
            {
            // InternalRentalSystem.g:929:1: ( 'Deal' )
            // InternalRentalSystem.g:930:2: 'Deal'
            {
             before(grammarAccess.getDealAccess().getDealKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDealAccess().getDealKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__0__Impl"


    // $ANTLR start "rule__Deal__Group__1"
    // InternalRentalSystem.g:939:1: rule__Deal__Group__1 : rule__Deal__Group__1__Impl rule__Deal__Group__2 ;
    public final void rule__Deal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:943:1: ( rule__Deal__Group__1__Impl rule__Deal__Group__2 )
            // InternalRentalSystem.g:944:2: rule__Deal__Group__1__Impl rule__Deal__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Deal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__1"


    // $ANTLR start "rule__Deal__Group__1__Impl"
    // InternalRentalSystem.g:951:1: rule__Deal__Group__1__Impl : ( ( rule__Deal__NameAssignment_1 ) ) ;
    public final void rule__Deal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:955:1: ( ( ( rule__Deal__NameAssignment_1 ) ) )
            // InternalRentalSystem.g:956:1: ( ( rule__Deal__NameAssignment_1 ) )
            {
            // InternalRentalSystem.g:956:1: ( ( rule__Deal__NameAssignment_1 ) )
            // InternalRentalSystem.g:957:2: ( rule__Deal__NameAssignment_1 )
            {
             before(grammarAccess.getDealAccess().getNameAssignment_1()); 
            // InternalRentalSystem.g:958:2: ( rule__Deal__NameAssignment_1 )
            // InternalRentalSystem.g:958:3: rule__Deal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Deal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDealAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__1__Impl"


    // $ANTLR start "rule__Deal__Group__2"
    // InternalRentalSystem.g:966:1: rule__Deal__Group__2 : rule__Deal__Group__2__Impl rule__Deal__Group__3 ;
    public final void rule__Deal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:970:1: ( rule__Deal__Group__2__Impl rule__Deal__Group__3 )
            // InternalRentalSystem.g:971:2: rule__Deal__Group__2__Impl rule__Deal__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Deal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__2"


    // $ANTLR start "rule__Deal__Group__2__Impl"
    // InternalRentalSystem.g:978:1: rule__Deal__Group__2__Impl : ( '(' ) ;
    public final void rule__Deal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:982:1: ( ( '(' ) )
            // InternalRentalSystem.g:983:1: ( '(' )
            {
            // InternalRentalSystem.g:983:1: ( '(' )
            // InternalRentalSystem.g:984:2: '('
            {
             before(grammarAccess.getDealAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDealAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__2__Impl"


    // $ANTLR start "rule__Deal__Group__3"
    // InternalRentalSystem.g:993:1: rule__Deal__Group__3 : rule__Deal__Group__3__Impl rule__Deal__Group__4 ;
    public final void rule__Deal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:997:1: ( rule__Deal__Group__3__Impl rule__Deal__Group__4 )
            // InternalRentalSystem.g:998:2: rule__Deal__Group__3__Impl rule__Deal__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Deal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__3"


    // $ANTLR start "rule__Deal__Group__3__Impl"
    // InternalRentalSystem.g:1005:1: rule__Deal__Group__3__Impl : ( ( rule__Deal__CustomerAssignment_3 ) ) ;
    public final void rule__Deal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1009:1: ( ( ( rule__Deal__CustomerAssignment_3 ) ) )
            // InternalRentalSystem.g:1010:1: ( ( rule__Deal__CustomerAssignment_3 ) )
            {
            // InternalRentalSystem.g:1010:1: ( ( rule__Deal__CustomerAssignment_3 ) )
            // InternalRentalSystem.g:1011:2: ( rule__Deal__CustomerAssignment_3 )
            {
             before(grammarAccess.getDealAccess().getCustomerAssignment_3()); 
            // InternalRentalSystem.g:1012:2: ( rule__Deal__CustomerAssignment_3 )
            // InternalRentalSystem.g:1012:3: rule__Deal__CustomerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Deal__CustomerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDealAccess().getCustomerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__3__Impl"


    // $ANTLR start "rule__Deal__Group__4"
    // InternalRentalSystem.g:1020:1: rule__Deal__Group__4 : rule__Deal__Group__4__Impl rule__Deal__Group__5 ;
    public final void rule__Deal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1024:1: ( rule__Deal__Group__4__Impl rule__Deal__Group__5 )
            // InternalRentalSystem.g:1025:2: rule__Deal__Group__4__Impl rule__Deal__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Deal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__4"


    // $ANTLR start "rule__Deal__Group__4__Impl"
    // InternalRentalSystem.g:1032:1: rule__Deal__Group__4__Impl : ( ( rule__Deal__RentalTypeAssignment_4 ) ) ;
    public final void rule__Deal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1036:1: ( ( ( rule__Deal__RentalTypeAssignment_4 ) ) )
            // InternalRentalSystem.g:1037:1: ( ( rule__Deal__RentalTypeAssignment_4 ) )
            {
            // InternalRentalSystem.g:1037:1: ( ( rule__Deal__RentalTypeAssignment_4 ) )
            // InternalRentalSystem.g:1038:2: ( rule__Deal__RentalTypeAssignment_4 )
            {
             before(grammarAccess.getDealAccess().getRentalTypeAssignment_4()); 
            // InternalRentalSystem.g:1039:2: ( rule__Deal__RentalTypeAssignment_4 )
            // InternalRentalSystem.g:1039:3: rule__Deal__RentalTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Deal__RentalTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDealAccess().getRentalTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__4__Impl"


    // $ANTLR start "rule__Deal__Group__5"
    // InternalRentalSystem.g:1047:1: rule__Deal__Group__5 : rule__Deal__Group__5__Impl rule__Deal__Group__6 ;
    public final void rule__Deal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1051:1: ( rule__Deal__Group__5__Impl rule__Deal__Group__6 )
            // InternalRentalSystem.g:1052:2: rule__Deal__Group__5__Impl rule__Deal__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Deal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__5"


    // $ANTLR start "rule__Deal__Group__5__Impl"
    // InternalRentalSystem.g:1059:1: rule__Deal__Group__5__Impl : ( ( rule__Deal__AttributesAssignment_5 )* ) ;
    public final void rule__Deal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1063:1: ( ( ( rule__Deal__AttributesAssignment_5 )* ) )
            // InternalRentalSystem.g:1064:1: ( ( rule__Deal__AttributesAssignment_5 )* )
            {
            // InternalRentalSystem.g:1064:1: ( ( rule__Deal__AttributesAssignment_5 )* )
            // InternalRentalSystem.g:1065:2: ( rule__Deal__AttributesAssignment_5 )*
            {
             before(grammarAccess.getDealAccess().getAttributesAssignment_5()); 
            // InternalRentalSystem.g:1066:2: ( rule__Deal__AttributesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRentalSystem.g:1066:3: rule__Deal__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Deal__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDealAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__5__Impl"


    // $ANTLR start "rule__Deal__Group__6"
    // InternalRentalSystem.g:1074:1: rule__Deal__Group__6 : rule__Deal__Group__6__Impl ;
    public final void rule__Deal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1078:1: ( rule__Deal__Group__6__Impl )
            // InternalRentalSystem.g:1079:2: rule__Deal__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Deal__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__6"


    // $ANTLR start "rule__Deal__Group__6__Impl"
    // InternalRentalSystem.g:1085:1: rule__Deal__Group__6__Impl : ( ')' ) ;
    public final void rule__Deal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1089:1: ( ( ')' ) )
            // InternalRentalSystem.g:1090:1: ( ')' )
            {
            // InternalRentalSystem.g:1090:1: ( ')' )
            // InternalRentalSystem.g:1091:2: ')'
            {
             before(grammarAccess.getDealAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDealAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__Group__6__Impl"


    // $ANTLR start "rule__Customer__Group__0"
    // InternalRentalSystem.g:1101:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1105:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // InternalRentalSystem.g:1106:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0"


    // $ANTLR start "rule__Customer__Group__0__Impl"
    // InternalRentalSystem.g:1113:1: rule__Customer__Group__0__Impl : ( 'customer' ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1117:1: ( ( 'customer' ) )
            // InternalRentalSystem.g:1118:1: ( 'customer' )
            {
            // InternalRentalSystem.g:1118:1: ( 'customer' )
            // InternalRentalSystem.g:1119:2: 'customer'
            {
             before(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0__Impl"


    // $ANTLR start "rule__Customer__Group__1"
    // InternalRentalSystem.g:1128:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1132:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // InternalRentalSystem.g:1133:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Customer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1"


    // $ANTLR start "rule__Customer__Group__1__Impl"
    // InternalRentalSystem.g:1140:1: rule__Customer__Group__1__Impl : ( ( rule__Customer__NameAssignment_1 ) ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1144:1: ( ( ( rule__Customer__NameAssignment_1 ) ) )
            // InternalRentalSystem.g:1145:1: ( ( rule__Customer__NameAssignment_1 ) )
            {
            // InternalRentalSystem.g:1145:1: ( ( rule__Customer__NameAssignment_1 ) )
            // InternalRentalSystem.g:1146:2: ( rule__Customer__NameAssignment_1 )
            {
             before(grammarAccess.getCustomerAccess().getNameAssignment_1()); 
            // InternalRentalSystem.g:1147:2: ( rule__Customer__NameAssignment_1 )
            // InternalRentalSystem.g:1147:3: rule__Customer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1__Impl"


    // $ANTLR start "rule__Customer__Group__2"
    // InternalRentalSystem.g:1155:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl rule__Customer__Group__3 ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1159:1: ( rule__Customer__Group__2__Impl rule__Customer__Group__3 )
            // InternalRentalSystem.g:1160:2: rule__Customer__Group__2__Impl rule__Customer__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Customer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2"


    // $ANTLR start "rule__Customer__Group__2__Impl"
    // InternalRentalSystem.g:1167:1: rule__Customer__Group__2__Impl : ( '(' ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1171:1: ( ( '(' ) )
            // InternalRentalSystem.g:1172:1: ( '(' )
            {
            // InternalRentalSystem.g:1172:1: ( '(' )
            // InternalRentalSystem.g:1173:2: '('
            {
             before(grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2__Impl"


    // $ANTLR start "rule__Customer__Group__3"
    // InternalRentalSystem.g:1182:1: rule__Customer__Group__3 : rule__Customer__Group__3__Impl rule__Customer__Group__4 ;
    public final void rule__Customer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1186:1: ( rule__Customer__Group__3__Impl rule__Customer__Group__4 )
            // InternalRentalSystem.g:1187:2: rule__Customer__Group__3__Impl rule__Customer__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Customer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3"


    // $ANTLR start "rule__Customer__Group__3__Impl"
    // InternalRentalSystem.g:1194:1: rule__Customer__Group__3__Impl : ( ( rule__Customer__AttributesAssignment_3 )* ) ;
    public final void rule__Customer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1198:1: ( ( ( rule__Customer__AttributesAssignment_3 )* ) )
            // InternalRentalSystem.g:1199:1: ( ( rule__Customer__AttributesAssignment_3 )* )
            {
            // InternalRentalSystem.g:1199:1: ( ( rule__Customer__AttributesAssignment_3 )* )
            // InternalRentalSystem.g:1200:2: ( rule__Customer__AttributesAssignment_3 )*
            {
             before(grammarAccess.getCustomerAccess().getAttributesAssignment_3()); 
            // InternalRentalSystem.g:1201:2: ( rule__Customer__AttributesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRentalSystem.g:1201:3: rule__Customer__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Customer__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCustomerAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3__Impl"


    // $ANTLR start "rule__Customer__Group__4"
    // InternalRentalSystem.g:1209:1: rule__Customer__Group__4 : rule__Customer__Group__4__Impl ;
    public final void rule__Customer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1213:1: ( rule__Customer__Group__4__Impl )
            // InternalRentalSystem.g:1214:2: rule__Customer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4"


    // $ANTLR start "rule__Customer__Group__4__Impl"
    // InternalRentalSystem.g:1220:1: rule__Customer__Group__4__Impl : ( ')' ) ;
    public final void rule__Customer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1224:1: ( ( ')' ) )
            // InternalRentalSystem.g:1225:1: ( ')' )
            {
            // InternalRentalSystem.g:1225:1: ( ')' )
            // InternalRentalSystem.g:1226:2: ')'
            {
             before(grammarAccess.getCustomerAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalRentalSystem.g:1236:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1240:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalRentalSystem.g:1241:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalRentalSystem.g:1248:1: rule__Attribute__Group__0__Impl : ( 'text' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1252:1: ( ( 'text' ) )
            // InternalRentalSystem.g:1253:1: ( 'text' )
            {
            // InternalRentalSystem.g:1253:1: ( 'text' )
            // InternalRentalSystem.g:1254:2: 'text'
            {
             before(grammarAccess.getAttributeAccess().getTextKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalRentalSystem.g:1263:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1267:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalRentalSystem.g:1268:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalRentalSystem.g:1275:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1279:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalRentalSystem.g:1280:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalRentalSystem.g:1280:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalRentalSystem.g:1281:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalRentalSystem.g:1282:2: ( rule__Attribute__NameAssignment_1 )
            // InternalRentalSystem.g:1282:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalRentalSystem.g:1290:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1294:1: ( rule__Attribute__Group__2__Impl )
            // InternalRentalSystem.g:1295:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalRentalSystem.g:1301:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1305:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // InternalRentalSystem.g:1306:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // InternalRentalSystem.g:1306:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // InternalRentalSystem.g:1307:2: ( rule__Attribute__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            // InternalRentalSystem.g:1308:2: ( rule__Attribute__ValueAssignment_2 )
            // InternalRentalSystem.g:1308:3: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__RentalSystem__NameAssignment_1"
    // InternalRentalSystem.g:1317:1: rule__RentalSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RentalSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1321:1: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1322:2: ( RULE_ID )
            {
            // InternalRentalSystem.g:1322:2: ( RULE_ID )
            // InternalRentalSystem.g:1323:3: RULE_ID
            {
             before(grammarAccess.getRentalSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRentalSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__NameAssignment_1"


    // $ANTLR start "rule__RentalSystem__TitleAssignment_2"
    // InternalRentalSystem.g:1332:1: rule__RentalSystem__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RentalSystem__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1336:1: ( ( RULE_STRING ) )
            // InternalRentalSystem.g:1337:2: ( RULE_STRING )
            {
            // InternalRentalSystem.g:1337:2: ( RULE_STRING )
            // InternalRentalSystem.g:1338:3: RULE_STRING
            {
             before(grammarAccess.getRentalSystemAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRentalSystemAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__TitleAssignment_2"


    // $ANTLR start "rule__RentalSystem__TypesAssignment_3"
    // InternalRentalSystem.g:1347:1: rule__RentalSystem__TypesAssignment_3 : ( ruleType ) ;
    public final void rule__RentalSystem__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1351:1: ( ( ruleType ) )
            // InternalRentalSystem.g:1352:2: ( ruleType )
            {
            // InternalRentalSystem.g:1352:2: ( ruleType )
            // InternalRentalSystem.g:1353:3: ruleType
            {
             before(grammarAccess.getRentalSystemAccess().getTypesTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRentalSystemAccess().getTypesTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__TypesAssignment_3"


    // $ANTLR start "rule__RentalSystem__CustomersAssignment_4"
    // InternalRentalSystem.g:1362:1: rule__RentalSystem__CustomersAssignment_4 : ( ruleCustomer ) ;
    public final void rule__RentalSystem__CustomersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1366:1: ( ( ruleCustomer ) )
            // InternalRentalSystem.g:1367:2: ( ruleCustomer )
            {
            // InternalRentalSystem.g:1367:2: ( ruleCustomer )
            // InternalRentalSystem.g:1368:3: ruleCustomer
            {
             before(grammarAccess.getRentalSystemAccess().getCustomersCustomerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getRentalSystemAccess().getCustomersCustomerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__CustomersAssignment_4"


    // $ANTLR start "rule__RentalSystem__DealsAssignment_5"
    // InternalRentalSystem.g:1377:1: rule__RentalSystem__DealsAssignment_5 : ( ruleDeal ) ;
    public final void rule__RentalSystem__DealsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1381:1: ( ( ruleDeal ) )
            // InternalRentalSystem.g:1382:2: ( ruleDeal )
            {
            // InternalRentalSystem.g:1382:2: ( ruleDeal )
            // InternalRentalSystem.g:1383:3: ruleDeal
            {
             before(grammarAccess.getRentalSystemAccess().getDealsDealParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDeal();

            state._fsp--;

             after(grammarAccess.getRentalSystemAccess().getDealsDealParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalSystem__DealsAssignment_5"


    // $ANTLR start "rule__Type__MovableAssignment_0_0"
    // InternalRentalSystem.g:1392:1: rule__Type__MovableAssignment_0_0 : ( ( 'movable' ) ) ;
    public final void rule__Type__MovableAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1396:1: ( ( ( 'movable' ) ) )
            // InternalRentalSystem.g:1397:2: ( ( 'movable' ) )
            {
            // InternalRentalSystem.g:1397:2: ( ( 'movable' ) )
            // InternalRentalSystem.g:1398:3: ( 'movable' )
            {
             before(grammarAccess.getTypeAccess().getMovableMovableKeyword_0_0_0()); 
            // InternalRentalSystem.g:1399:3: ( 'movable' )
            // InternalRentalSystem.g:1400:4: 'movable'
            {
             before(grammarAccess.getTypeAccess().getMovableMovableKeyword_0_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getMovableMovableKeyword_0_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getMovableMovableKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__MovableAssignment_0_0"


    // $ANTLR start "rule__Type__DigitalAssignment_0_1"
    // InternalRentalSystem.g:1411:1: rule__Type__DigitalAssignment_0_1 : ( ( 'digital' ) ) ;
    public final void rule__Type__DigitalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1415:1: ( ( ( 'digital' ) ) )
            // InternalRentalSystem.g:1416:2: ( ( 'digital' ) )
            {
            // InternalRentalSystem.g:1416:2: ( ( 'digital' ) )
            // InternalRentalSystem.g:1417:3: ( 'digital' )
            {
             before(grammarAccess.getTypeAccess().getDigitalDigitalKeyword_0_1_0()); 
            // InternalRentalSystem.g:1418:3: ( 'digital' )
            // InternalRentalSystem.g:1419:4: 'digital'
            {
             before(grammarAccess.getTypeAccess().getDigitalDigitalKeyword_0_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDigitalDigitalKeyword_0_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getDigitalDigitalKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__DigitalAssignment_0_1"


    // $ANTLR start "rule__Type__FixAssignment_0_2"
    // InternalRentalSystem.g:1430:1: rule__Type__FixAssignment_0_2 : ( ( 'fix' ) ) ;
    public final void rule__Type__FixAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1434:1: ( ( ( 'fix' ) ) )
            // InternalRentalSystem.g:1435:2: ( ( 'fix' ) )
            {
            // InternalRentalSystem.g:1435:2: ( ( 'fix' ) )
            // InternalRentalSystem.g:1436:3: ( 'fix' )
            {
             before(grammarAccess.getTypeAccess().getFixFixKeyword_0_2_0()); 
            // InternalRentalSystem.g:1437:3: ( 'fix' )
            // InternalRentalSystem.g:1438:4: 'fix'
            {
             before(grammarAccess.getTypeAccess().getFixFixKeyword_0_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getFixFixKeyword_0_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getFixFixKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__FixAssignment_0_2"


    // $ANTLR start "rule__Type__NameAssignment_2"
    // InternalRentalSystem.g:1449:1: rule__Type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1453:1: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1454:2: ( RULE_ID )
            {
            // InternalRentalSystem.g:1454:2: ( RULE_ID )
            // InternalRentalSystem.g:1455:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_2"


    // $ANTLR start "rule__Type__RentalWorkflowAssignment_4"
    // InternalRentalSystem.g:1464:1: rule__Type__RentalWorkflowAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Type__RentalWorkflowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1468:1: ( ( ( RULE_ID ) ) )
            // InternalRentalSystem.g:1469:2: ( ( RULE_ID ) )
            {
            // InternalRentalSystem.g:1469:2: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1470:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getRentalWorkflowRentalWorkflowCrossReference_4_0()); 
            // InternalRentalSystem.g:1471:3: ( RULE_ID )
            // InternalRentalSystem.g:1472:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getRentalWorkflowRentalWorkflowIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRentalWorkflowRentalWorkflowIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getRentalWorkflowRentalWorkflowCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__RentalWorkflowAssignment_4"


    // $ANTLR start "rule__Type__TypeAttributesAssignment_5"
    // InternalRentalSystem.g:1483:1: rule__Type__TypeAttributesAssignment_5 : ( ruleTypeAttribute ) ;
    public final void rule__Type__TypeAttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1487:1: ( ( ruleTypeAttribute ) )
            // InternalRentalSystem.g:1488:2: ( ruleTypeAttribute )
            {
            // InternalRentalSystem.g:1488:2: ( ruleTypeAttribute )
            // InternalRentalSystem.g:1489:3: ruleTypeAttribute
            {
             before(grammarAccess.getTypeAccess().getTypeAttributesTypeAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAttribute();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeAttributesTypeAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAttributesAssignment_5"


    // $ANTLR start "rule__TypeAttribute__NameAssignment_1"
    // InternalRentalSystem.g:1498:1: rule__TypeAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1502:1: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1503:2: ( RULE_ID )
            {
            // InternalRentalSystem.g:1503:2: ( RULE_ID )
            // InternalRentalSystem.g:1504:3: RULE_ID
            {
             before(grammarAccess.getTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__NameAssignment_1"


    // $ANTLR start "rule__TypeAttribute__OfTypeAssignment_3"
    // InternalRentalSystem.g:1513:1: rule__TypeAttribute__OfTypeAssignment_3 : ( ruleOfType ) ;
    public final void rule__TypeAttribute__OfTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1517:1: ( ( ruleOfType ) )
            // InternalRentalSystem.g:1518:2: ( ruleOfType )
            {
            // InternalRentalSystem.g:1518:2: ( ruleOfType )
            // InternalRentalSystem.g:1519:3: ruleOfType
            {
             before(grammarAccess.getTypeAttributeAccess().getOfTypeOfTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOfType();

            state._fsp--;

             after(grammarAccess.getTypeAttributeAccess().getOfTypeOfTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__OfTypeAssignment_3"


    // $ANTLR start "rule__Deal__NameAssignment_1"
    // InternalRentalSystem.g:1528:1: rule__Deal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Deal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1532:1: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1533:2: ( RULE_ID )
            {
            // InternalRentalSystem.g:1533:2: ( RULE_ID )
            // InternalRentalSystem.g:1534:3: RULE_ID
            {
             before(grammarAccess.getDealAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDealAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__NameAssignment_1"


    // $ANTLR start "rule__Deal__CustomerAssignment_3"
    // InternalRentalSystem.g:1543:1: rule__Deal__CustomerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Deal__CustomerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1547:1: ( ( ( RULE_ID ) ) )
            // InternalRentalSystem.g:1548:2: ( ( RULE_ID ) )
            {
            // InternalRentalSystem.g:1548:2: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1549:3: ( RULE_ID )
            {
             before(grammarAccess.getDealAccess().getCustomerCustomerCrossReference_3_0()); 
            // InternalRentalSystem.g:1550:3: ( RULE_ID )
            // InternalRentalSystem.g:1551:4: RULE_ID
            {
             before(grammarAccess.getDealAccess().getCustomerCustomerIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDealAccess().getCustomerCustomerIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDealAccess().getCustomerCustomerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__CustomerAssignment_3"


    // $ANTLR start "rule__Deal__RentalTypeAssignment_4"
    // InternalRentalSystem.g:1562:1: rule__Deal__RentalTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Deal__RentalTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1566:1: ( ( ( RULE_ID ) ) )
            // InternalRentalSystem.g:1567:2: ( ( RULE_ID ) )
            {
            // InternalRentalSystem.g:1567:2: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1568:3: ( RULE_ID )
            {
             before(grammarAccess.getDealAccess().getRentalTypeTypeCrossReference_4_0()); 
            // InternalRentalSystem.g:1569:3: ( RULE_ID )
            // InternalRentalSystem.g:1570:4: RULE_ID
            {
             before(grammarAccess.getDealAccess().getRentalTypeTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDealAccess().getRentalTypeTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDealAccess().getRentalTypeTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__RentalTypeAssignment_4"


    // $ANTLR start "rule__Deal__AttributesAssignment_5"
    // InternalRentalSystem.g:1581:1: rule__Deal__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Deal__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1585:1: ( ( ruleAttribute ) )
            // InternalRentalSystem.g:1586:2: ( ruleAttribute )
            {
            // InternalRentalSystem.g:1586:2: ( ruleAttribute )
            // InternalRentalSystem.g:1587:3: ruleAttribute
            {
             before(grammarAccess.getDealAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDealAccess().getAttributesAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deal__AttributesAssignment_5"


    // $ANTLR start "rule__Customer__NameAssignment_1"
    // InternalRentalSystem.g:1596:1: rule__Customer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Customer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1600:1: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1601:2: ( RULE_ID )
            {
            // InternalRentalSystem.g:1601:2: ( RULE_ID )
            // InternalRentalSystem.g:1602:3: RULE_ID
            {
             before(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__NameAssignment_1"


    // $ANTLR start "rule__Customer__AttributesAssignment_3"
    // InternalRentalSystem.g:1611:1: rule__Customer__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Customer__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1615:1: ( ( ruleAttribute ) )
            // InternalRentalSystem.g:1616:2: ( ruleAttribute )
            {
            // InternalRentalSystem.g:1616:2: ( ruleAttribute )
            // InternalRentalSystem.g:1617:3: ruleAttribute
            {
             before(grammarAccess.getCustomerAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalRentalSystem.g:1626:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1630:1: ( ( RULE_ID ) )
            // InternalRentalSystem.g:1631:2: ( RULE_ID )
            {
            // InternalRentalSystem.g:1631:2: ( RULE_ID )
            // InternalRentalSystem.g:1632:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__ValueAssignment_2"
    // InternalRentalSystem.g:1641:1: rule__Attribute__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalSystem.g:1645:1: ( ( RULE_STRING ) )
            // InternalRentalSystem.g:1646:2: ( RULE_STRING )
            {
            // InternalRentalSystem.g:1646:2: ( RULE_STRING )
            // InternalRentalSystem.g:1647:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000003FF800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});

}