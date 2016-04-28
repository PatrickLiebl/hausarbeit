package de.nak.xtext.hausarbeit.rentalWorkflow.ide.contentassist.antlr.internal;

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
import de.nak.xtext.hausarbeit.rentalWorkflow.services.RentalWorkflowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRentalWorkflowParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nextClickable'", "'savable'", "'deletable'", "'defineWorkflow'", "'events'", "'end'", "'startState'", "'finishState'", "'state'", "'transition'", "'{'", "'}'", "'.'"
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

    	public void setGrammarAccess(RentalWorkflowGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRentalWorkflow"
    // InternalRentalWorkflow.g:53:1: entryRuleRentalWorkflow : ruleRentalWorkflow EOF ;
    public final void entryRuleRentalWorkflow() throws RecognitionException {
        try {
            // InternalRentalWorkflow.g:54:1: ( ruleRentalWorkflow EOF )
            // InternalRentalWorkflow.g:55:1: ruleRentalWorkflow EOF
            {
             before(grammarAccess.getRentalWorkflowRule()); 
            pushFollow(FOLLOW_1);
            ruleRentalWorkflow();

            state._fsp--;

             after(grammarAccess.getRentalWorkflowRule()); 
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
    // $ANTLR end "entryRuleRentalWorkflow"


    // $ANTLR start "ruleRentalWorkflow"
    // InternalRentalWorkflow.g:62:1: ruleRentalWorkflow : ( ( rule__RentalWorkflow__Group__0 ) ) ;
    public final void ruleRentalWorkflow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:66:2: ( ( ( rule__RentalWorkflow__Group__0 ) ) )
            // InternalRentalWorkflow.g:67:2: ( ( rule__RentalWorkflow__Group__0 ) )
            {
            // InternalRentalWorkflow.g:67:2: ( ( rule__RentalWorkflow__Group__0 ) )
            // InternalRentalWorkflow.g:68:3: ( rule__RentalWorkflow__Group__0 )
            {
             before(grammarAccess.getRentalWorkflowAccess().getGroup()); 
            // InternalRentalWorkflow.g:69:3: ( rule__RentalWorkflow__Group__0 )
            // InternalRentalWorkflow.g:69:4: rule__RentalWorkflow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRentalWorkflowAccess().getGroup()); 

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
    // $ANTLR end "ruleRentalWorkflow"


    // $ANTLR start "entryRuleEvent"
    // InternalRentalWorkflow.g:78:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalRentalWorkflow.g:79:1: ( ruleEvent EOF )
            // InternalRentalWorkflow.g:80:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalRentalWorkflow.g:87:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:91:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalRentalWorkflow.g:92:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalRentalWorkflow.g:92:2: ( ( rule__Event__Group__0 ) )
            // InternalRentalWorkflow.g:93:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalRentalWorkflow.g:94:3: ( rule__Event__Group__0 )
            // InternalRentalWorkflow.g:94:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // InternalRentalWorkflow.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalRentalWorkflow.g:104:1: ( ruleState EOF )
            // InternalRentalWorkflow.g:105:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalRentalWorkflow.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalRentalWorkflow.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalRentalWorkflow.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalRentalWorkflow.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalRentalWorkflow.g:119:3: ( rule__State__Group__0 )
            // InternalRentalWorkflow.g:119:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRentalWorkflow.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRentalWorkflow.g:129:1: ( ruleQualifiedName EOF )
            // InternalRentalWorkflow.g:130:1: ruleQualifiedName EOF
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
    // InternalRentalWorkflow.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRentalWorkflow.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRentalWorkflow.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRentalWorkflow.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRentalWorkflow.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalRentalWorkflow.g:144:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "ruleofEventType"
    // InternalRentalWorkflow.g:153:1: ruleofEventType : ( ( rule__OfEventType__Alternatives ) ) ;
    public final void ruleofEventType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:157:1: ( ( ( rule__OfEventType__Alternatives ) ) )
            // InternalRentalWorkflow.g:158:2: ( ( rule__OfEventType__Alternatives ) )
            {
            // InternalRentalWorkflow.g:158:2: ( ( rule__OfEventType__Alternatives ) )
            // InternalRentalWorkflow.g:159:3: ( rule__OfEventType__Alternatives )
            {
             before(grammarAccess.getOfEventTypeAccess().getAlternatives()); 
            // InternalRentalWorkflow.g:160:3: ( rule__OfEventType__Alternatives )
            // InternalRentalWorkflow.g:160:4: rule__OfEventType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OfEventType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOfEventTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleofEventType"


    // $ANTLR start "rule__OfEventType__Alternatives"
    // InternalRentalWorkflow.g:168:1: rule__OfEventType__Alternatives : ( ( ( 'nextClickable' ) ) | ( ( 'savable' ) ) | ( ( 'deletable' ) ) );
    public final void rule__OfEventType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:172:1: ( ( ( 'nextClickable' ) ) | ( ( 'savable' ) ) | ( ( 'deletable' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
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
                    // InternalRentalWorkflow.g:173:2: ( ( 'nextClickable' ) )
                    {
                    // InternalRentalWorkflow.g:173:2: ( ( 'nextClickable' ) )
                    // InternalRentalWorkflow.g:174:3: ( 'nextClickable' )
                    {
                     before(grammarAccess.getOfEventTypeAccess().getNextClickableEnumLiteralDeclaration_0()); 
                    // InternalRentalWorkflow.g:175:3: ( 'nextClickable' )
                    // InternalRentalWorkflow.g:175:4: 'nextClickable'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfEventTypeAccess().getNextClickableEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRentalWorkflow.g:179:2: ( ( 'savable' ) )
                    {
                    // InternalRentalWorkflow.g:179:2: ( ( 'savable' ) )
                    // InternalRentalWorkflow.g:180:3: ( 'savable' )
                    {
                     before(grammarAccess.getOfEventTypeAccess().getSavableEnumLiteralDeclaration_1()); 
                    // InternalRentalWorkflow.g:181:3: ( 'savable' )
                    // InternalRentalWorkflow.g:181:4: 'savable'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfEventTypeAccess().getSavableEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRentalWorkflow.g:185:2: ( ( 'deletable' ) )
                    {
                    // InternalRentalWorkflow.g:185:2: ( ( 'deletable' ) )
                    // InternalRentalWorkflow.g:186:3: ( 'deletable' )
                    {
                     before(grammarAccess.getOfEventTypeAccess().getDeleteableEnumLiteralDeclaration_2()); 
                    // InternalRentalWorkflow.g:187:3: ( 'deletable' )
                    // InternalRentalWorkflow.g:187:4: 'deletable'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOfEventTypeAccess().getDeleteableEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__OfEventType__Alternatives"


    // $ANTLR start "rule__RentalWorkflow__Group__0"
    // InternalRentalWorkflow.g:195:1: rule__RentalWorkflow__Group__0 : rule__RentalWorkflow__Group__0__Impl rule__RentalWorkflow__Group__1 ;
    public final void rule__RentalWorkflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:199:1: ( rule__RentalWorkflow__Group__0__Impl rule__RentalWorkflow__Group__1 )
            // InternalRentalWorkflow.g:200:2: rule__RentalWorkflow__Group__0__Impl rule__RentalWorkflow__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RentalWorkflow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__1();

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
    // $ANTLR end "rule__RentalWorkflow__Group__0"


    // $ANTLR start "rule__RentalWorkflow__Group__0__Impl"
    // InternalRentalWorkflow.g:207:1: rule__RentalWorkflow__Group__0__Impl : ( () ) ;
    public final void rule__RentalWorkflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:211:1: ( ( () ) )
            // InternalRentalWorkflow.g:212:1: ( () )
            {
            // InternalRentalWorkflow.g:212:1: ( () )
            // InternalRentalWorkflow.g:213:2: ()
            {
             before(grammarAccess.getRentalWorkflowAccess().getRentalWorkflowAction_0()); 
            // InternalRentalWorkflow.g:214:2: ()
            // InternalRentalWorkflow.g:214:3: 
            {
            }

             after(grammarAccess.getRentalWorkflowAccess().getRentalWorkflowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RentalWorkflow__Group__0__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__1"
    // InternalRentalWorkflow.g:222:1: rule__RentalWorkflow__Group__1 : rule__RentalWorkflow__Group__1__Impl rule__RentalWorkflow__Group__2 ;
    public final void rule__RentalWorkflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:226:1: ( rule__RentalWorkflow__Group__1__Impl rule__RentalWorkflow__Group__2 )
            // InternalRentalWorkflow.g:227:2: rule__RentalWorkflow__Group__1__Impl rule__RentalWorkflow__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RentalWorkflow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__2();

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
    // $ANTLR end "rule__RentalWorkflow__Group__1"


    // $ANTLR start "rule__RentalWorkflow__Group__1__Impl"
    // InternalRentalWorkflow.g:234:1: rule__RentalWorkflow__Group__1__Impl : ( 'defineWorkflow' ) ;
    public final void rule__RentalWorkflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:238:1: ( ( 'defineWorkflow' ) )
            // InternalRentalWorkflow.g:239:1: ( 'defineWorkflow' )
            {
            // InternalRentalWorkflow.g:239:1: ( 'defineWorkflow' )
            // InternalRentalWorkflow.g:240:2: 'defineWorkflow'
            {
             before(grammarAccess.getRentalWorkflowAccess().getDefineWorkflowKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRentalWorkflowAccess().getDefineWorkflowKeyword_1()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__1__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__2"
    // InternalRentalWorkflow.g:249:1: rule__RentalWorkflow__Group__2 : rule__RentalWorkflow__Group__2__Impl rule__RentalWorkflow__Group__3 ;
    public final void rule__RentalWorkflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:253:1: ( rule__RentalWorkflow__Group__2__Impl rule__RentalWorkflow__Group__3 )
            // InternalRentalWorkflow.g:254:2: rule__RentalWorkflow__Group__2__Impl rule__RentalWorkflow__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RentalWorkflow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__3();

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
    // $ANTLR end "rule__RentalWorkflow__Group__2"


    // $ANTLR start "rule__RentalWorkflow__Group__2__Impl"
    // InternalRentalWorkflow.g:261:1: rule__RentalWorkflow__Group__2__Impl : ( ( rule__RentalWorkflow__NameAssignment_2 ) ) ;
    public final void rule__RentalWorkflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:265:1: ( ( ( rule__RentalWorkflow__NameAssignment_2 ) ) )
            // InternalRentalWorkflow.g:266:1: ( ( rule__RentalWorkflow__NameAssignment_2 ) )
            {
            // InternalRentalWorkflow.g:266:1: ( ( rule__RentalWorkflow__NameAssignment_2 ) )
            // InternalRentalWorkflow.g:267:2: ( rule__RentalWorkflow__NameAssignment_2 )
            {
             before(grammarAccess.getRentalWorkflowAccess().getNameAssignment_2()); 
            // InternalRentalWorkflow.g:268:2: ( rule__RentalWorkflow__NameAssignment_2 )
            // InternalRentalWorkflow.g:268:3: rule__RentalWorkflow__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRentalWorkflowAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__2__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__3"
    // InternalRentalWorkflow.g:276:1: rule__RentalWorkflow__Group__3 : rule__RentalWorkflow__Group__3__Impl rule__RentalWorkflow__Group__4 ;
    public final void rule__RentalWorkflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:280:1: ( rule__RentalWorkflow__Group__3__Impl rule__RentalWorkflow__Group__4 )
            // InternalRentalWorkflow.g:281:2: rule__RentalWorkflow__Group__3__Impl rule__RentalWorkflow__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RentalWorkflow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__4();

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
    // $ANTLR end "rule__RentalWorkflow__Group__3"


    // $ANTLR start "rule__RentalWorkflow__Group__3__Impl"
    // InternalRentalWorkflow.g:288:1: rule__RentalWorkflow__Group__3__Impl : ( 'events' ) ;
    public final void rule__RentalWorkflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:292:1: ( ( 'events' ) )
            // InternalRentalWorkflow.g:293:1: ( 'events' )
            {
            // InternalRentalWorkflow.g:293:1: ( 'events' )
            // InternalRentalWorkflow.g:294:2: 'events'
            {
             before(grammarAccess.getRentalWorkflowAccess().getEventsKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRentalWorkflowAccess().getEventsKeyword_3()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__3__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__4"
    // InternalRentalWorkflow.g:303:1: rule__RentalWorkflow__Group__4 : rule__RentalWorkflow__Group__4__Impl rule__RentalWorkflow__Group__5 ;
    public final void rule__RentalWorkflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:307:1: ( rule__RentalWorkflow__Group__4__Impl rule__RentalWorkflow__Group__5 )
            // InternalRentalWorkflow.g:308:2: rule__RentalWorkflow__Group__4__Impl rule__RentalWorkflow__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__RentalWorkflow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__5();

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
    // $ANTLR end "rule__RentalWorkflow__Group__4"


    // $ANTLR start "rule__RentalWorkflow__Group__4__Impl"
    // InternalRentalWorkflow.g:315:1: rule__RentalWorkflow__Group__4__Impl : ( ( rule__RentalWorkflow__EventAssignment_4 )* ) ;
    public final void rule__RentalWorkflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:319:1: ( ( ( rule__RentalWorkflow__EventAssignment_4 )* ) )
            // InternalRentalWorkflow.g:320:1: ( ( rule__RentalWorkflow__EventAssignment_4 )* )
            {
            // InternalRentalWorkflow.g:320:1: ( ( rule__RentalWorkflow__EventAssignment_4 )* )
            // InternalRentalWorkflow.g:321:2: ( rule__RentalWorkflow__EventAssignment_4 )*
            {
             before(grammarAccess.getRentalWorkflowAccess().getEventAssignment_4()); 
            // InternalRentalWorkflow.g:322:2: ( rule__RentalWorkflow__EventAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRentalWorkflow.g:322:3: rule__RentalWorkflow__EventAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RentalWorkflow__EventAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRentalWorkflowAccess().getEventAssignment_4()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__4__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__5"
    // InternalRentalWorkflow.g:330:1: rule__RentalWorkflow__Group__5 : rule__RentalWorkflow__Group__5__Impl rule__RentalWorkflow__Group__6 ;
    public final void rule__RentalWorkflow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:334:1: ( rule__RentalWorkflow__Group__5__Impl rule__RentalWorkflow__Group__6 )
            // InternalRentalWorkflow.g:335:2: rule__RentalWorkflow__Group__5__Impl rule__RentalWorkflow__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__RentalWorkflow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__6();

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
    // $ANTLR end "rule__RentalWorkflow__Group__5"


    // $ANTLR start "rule__RentalWorkflow__Group__5__Impl"
    // InternalRentalWorkflow.g:342:1: rule__RentalWorkflow__Group__5__Impl : ( 'end' ) ;
    public final void rule__RentalWorkflow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:346:1: ( ( 'end' ) )
            // InternalRentalWorkflow.g:347:1: ( 'end' )
            {
            // InternalRentalWorkflow.g:347:1: ( 'end' )
            // InternalRentalWorkflow.g:348:2: 'end'
            {
             before(grammarAccess.getRentalWorkflowAccess().getEndKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRentalWorkflowAccess().getEndKeyword_5()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__5__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__6"
    // InternalRentalWorkflow.g:357:1: rule__RentalWorkflow__Group__6 : rule__RentalWorkflow__Group__6__Impl rule__RentalWorkflow__Group__7 ;
    public final void rule__RentalWorkflow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:361:1: ( rule__RentalWorkflow__Group__6__Impl rule__RentalWorkflow__Group__7 )
            // InternalRentalWorkflow.g:362:2: rule__RentalWorkflow__Group__6__Impl rule__RentalWorkflow__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__RentalWorkflow__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__7();

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
    // $ANTLR end "rule__RentalWorkflow__Group__6"


    // $ANTLR start "rule__RentalWorkflow__Group__6__Impl"
    // InternalRentalWorkflow.g:369:1: rule__RentalWorkflow__Group__6__Impl : ( ( rule__RentalWorkflow__StatesAssignment_6 )* ) ;
    public final void rule__RentalWorkflow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:373:1: ( ( ( rule__RentalWorkflow__StatesAssignment_6 )* ) )
            // InternalRentalWorkflow.g:374:1: ( ( rule__RentalWorkflow__StatesAssignment_6 )* )
            {
            // InternalRentalWorkflow.g:374:1: ( ( rule__RentalWorkflow__StatesAssignment_6 )* )
            // InternalRentalWorkflow.g:375:2: ( rule__RentalWorkflow__StatesAssignment_6 )*
            {
             before(grammarAccess.getRentalWorkflowAccess().getStatesAssignment_6()); 
            // InternalRentalWorkflow.g:376:2: ( rule__RentalWorkflow__StatesAssignment_6 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRentalWorkflow.g:376:3: rule__RentalWorkflow__StatesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RentalWorkflow__StatesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRentalWorkflowAccess().getStatesAssignment_6()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__6__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__7"
    // InternalRentalWorkflow.g:384:1: rule__RentalWorkflow__Group__7 : rule__RentalWorkflow__Group__7__Impl rule__RentalWorkflow__Group__8 ;
    public final void rule__RentalWorkflow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:388:1: ( rule__RentalWorkflow__Group__7__Impl rule__RentalWorkflow__Group__8 )
            // InternalRentalWorkflow.g:389:2: rule__RentalWorkflow__Group__7__Impl rule__RentalWorkflow__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__RentalWorkflow__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__8();

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
    // $ANTLR end "rule__RentalWorkflow__Group__7"


    // $ANTLR start "rule__RentalWorkflow__Group__7__Impl"
    // InternalRentalWorkflow.g:396:1: rule__RentalWorkflow__Group__7__Impl : ( 'startState' ) ;
    public final void rule__RentalWorkflow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:400:1: ( ( 'startState' ) )
            // InternalRentalWorkflow.g:401:1: ( 'startState' )
            {
            // InternalRentalWorkflow.g:401:1: ( 'startState' )
            // InternalRentalWorkflow.g:402:2: 'startState'
            {
             before(grammarAccess.getRentalWorkflowAccess().getStartStateKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRentalWorkflowAccess().getStartStateKeyword_7()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__7__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__8"
    // InternalRentalWorkflow.g:411:1: rule__RentalWorkflow__Group__8 : rule__RentalWorkflow__Group__8__Impl rule__RentalWorkflow__Group__9 ;
    public final void rule__RentalWorkflow__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:415:1: ( rule__RentalWorkflow__Group__8__Impl rule__RentalWorkflow__Group__9 )
            // InternalRentalWorkflow.g:416:2: rule__RentalWorkflow__Group__8__Impl rule__RentalWorkflow__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__RentalWorkflow__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__9();

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
    // $ANTLR end "rule__RentalWorkflow__Group__8"


    // $ANTLR start "rule__RentalWorkflow__Group__8__Impl"
    // InternalRentalWorkflow.g:423:1: rule__RentalWorkflow__Group__8__Impl : ( ( rule__RentalWorkflow__StartStateAssignment_8 ) ) ;
    public final void rule__RentalWorkflow__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:427:1: ( ( ( rule__RentalWorkflow__StartStateAssignment_8 ) ) )
            // InternalRentalWorkflow.g:428:1: ( ( rule__RentalWorkflow__StartStateAssignment_8 ) )
            {
            // InternalRentalWorkflow.g:428:1: ( ( rule__RentalWorkflow__StartStateAssignment_8 ) )
            // InternalRentalWorkflow.g:429:2: ( rule__RentalWorkflow__StartStateAssignment_8 )
            {
             before(grammarAccess.getRentalWorkflowAccess().getStartStateAssignment_8()); 
            // InternalRentalWorkflow.g:430:2: ( rule__RentalWorkflow__StartStateAssignment_8 )
            // InternalRentalWorkflow.g:430:3: rule__RentalWorkflow__StartStateAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__StartStateAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRentalWorkflowAccess().getStartStateAssignment_8()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__8__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__9"
    // InternalRentalWorkflow.g:438:1: rule__RentalWorkflow__Group__9 : rule__RentalWorkflow__Group__9__Impl rule__RentalWorkflow__Group__10 ;
    public final void rule__RentalWorkflow__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:442:1: ( rule__RentalWorkflow__Group__9__Impl rule__RentalWorkflow__Group__10 )
            // InternalRentalWorkflow.g:443:2: rule__RentalWorkflow__Group__9__Impl rule__RentalWorkflow__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__RentalWorkflow__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__10();

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
    // $ANTLR end "rule__RentalWorkflow__Group__9"


    // $ANTLR start "rule__RentalWorkflow__Group__9__Impl"
    // InternalRentalWorkflow.g:450:1: rule__RentalWorkflow__Group__9__Impl : ( 'end' ) ;
    public final void rule__RentalWorkflow__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:454:1: ( ( 'end' ) )
            // InternalRentalWorkflow.g:455:1: ( 'end' )
            {
            // InternalRentalWorkflow.g:455:1: ( 'end' )
            // InternalRentalWorkflow.g:456:2: 'end'
            {
             before(grammarAccess.getRentalWorkflowAccess().getEndKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRentalWorkflowAccess().getEndKeyword_9()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__9__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__10"
    // InternalRentalWorkflow.g:465:1: rule__RentalWorkflow__Group__10 : rule__RentalWorkflow__Group__10__Impl rule__RentalWorkflow__Group__11 ;
    public final void rule__RentalWorkflow__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:469:1: ( rule__RentalWorkflow__Group__10__Impl rule__RentalWorkflow__Group__11 )
            // InternalRentalWorkflow.g:470:2: rule__RentalWorkflow__Group__10__Impl rule__RentalWorkflow__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__RentalWorkflow__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__11();

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
    // $ANTLR end "rule__RentalWorkflow__Group__10"


    // $ANTLR start "rule__RentalWorkflow__Group__10__Impl"
    // InternalRentalWorkflow.g:477:1: rule__RentalWorkflow__Group__10__Impl : ( 'finishState' ) ;
    public final void rule__RentalWorkflow__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:481:1: ( ( 'finishState' ) )
            // InternalRentalWorkflow.g:482:1: ( 'finishState' )
            {
            // InternalRentalWorkflow.g:482:1: ( 'finishState' )
            // InternalRentalWorkflow.g:483:2: 'finishState'
            {
             before(grammarAccess.getRentalWorkflowAccess().getFinishStateKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRentalWorkflowAccess().getFinishStateKeyword_10()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__10__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__11"
    // InternalRentalWorkflow.g:492:1: rule__RentalWorkflow__Group__11 : rule__RentalWorkflow__Group__11__Impl rule__RentalWorkflow__Group__12 ;
    public final void rule__RentalWorkflow__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:496:1: ( rule__RentalWorkflow__Group__11__Impl rule__RentalWorkflow__Group__12 )
            // InternalRentalWorkflow.g:497:2: rule__RentalWorkflow__Group__11__Impl rule__RentalWorkflow__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__RentalWorkflow__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__12();

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
    // $ANTLR end "rule__RentalWorkflow__Group__11"


    // $ANTLR start "rule__RentalWorkflow__Group__11__Impl"
    // InternalRentalWorkflow.g:504:1: rule__RentalWorkflow__Group__11__Impl : ( ( rule__RentalWorkflow__FinishStateAssignment_11 ) ) ;
    public final void rule__RentalWorkflow__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:508:1: ( ( ( rule__RentalWorkflow__FinishStateAssignment_11 ) ) )
            // InternalRentalWorkflow.g:509:1: ( ( rule__RentalWorkflow__FinishStateAssignment_11 ) )
            {
            // InternalRentalWorkflow.g:509:1: ( ( rule__RentalWorkflow__FinishStateAssignment_11 ) )
            // InternalRentalWorkflow.g:510:2: ( rule__RentalWorkflow__FinishStateAssignment_11 )
            {
             before(grammarAccess.getRentalWorkflowAccess().getFinishStateAssignment_11()); 
            // InternalRentalWorkflow.g:511:2: ( rule__RentalWorkflow__FinishStateAssignment_11 )
            // InternalRentalWorkflow.g:511:3: rule__RentalWorkflow__FinishStateAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__FinishStateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRentalWorkflowAccess().getFinishStateAssignment_11()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__11__Impl"


    // $ANTLR start "rule__RentalWorkflow__Group__12"
    // InternalRentalWorkflow.g:519:1: rule__RentalWorkflow__Group__12 : rule__RentalWorkflow__Group__12__Impl ;
    public final void rule__RentalWorkflow__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:523:1: ( rule__RentalWorkflow__Group__12__Impl )
            // InternalRentalWorkflow.g:524:2: rule__RentalWorkflow__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RentalWorkflow__Group__12__Impl();

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
    // $ANTLR end "rule__RentalWorkflow__Group__12"


    // $ANTLR start "rule__RentalWorkflow__Group__12__Impl"
    // InternalRentalWorkflow.g:530:1: rule__RentalWorkflow__Group__12__Impl : ( 'end' ) ;
    public final void rule__RentalWorkflow__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:534:1: ( ( 'end' ) )
            // InternalRentalWorkflow.g:535:1: ( 'end' )
            {
            // InternalRentalWorkflow.g:535:1: ( 'end' )
            // InternalRentalWorkflow.g:536:2: 'end'
            {
             before(grammarAccess.getRentalWorkflowAccess().getEndKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRentalWorkflowAccess().getEndKeyword_12()); 

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
    // $ANTLR end "rule__RentalWorkflow__Group__12__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalRentalWorkflow.g:546:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:550:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalRentalWorkflow.g:551:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

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
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalRentalWorkflow.g:558:1: rule__Event__Group__0__Impl : ( ( rule__Event__NameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:562:1: ( ( ( rule__Event__NameAssignment_0 ) ) )
            // InternalRentalWorkflow.g:563:1: ( ( rule__Event__NameAssignment_0 ) )
            {
            // InternalRentalWorkflow.g:563:1: ( ( rule__Event__NameAssignment_0 ) )
            // InternalRentalWorkflow.g:564:2: ( rule__Event__NameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_0()); 
            // InternalRentalWorkflow.g:565:2: ( rule__Event__NameAssignment_0 )
            // InternalRentalWorkflow.g:565:3: rule__Event__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalRentalWorkflow.g:573:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:577:1: ( rule__Event__Group__1__Impl )
            // InternalRentalWorkflow.g:578:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__1__Impl();

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
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalRentalWorkflow.g:584:1: rule__Event__Group__1__Impl : ( ( rule__Event__OfTypeAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:588:1: ( ( ( rule__Event__OfTypeAssignment_1 ) ) )
            // InternalRentalWorkflow.g:589:1: ( ( rule__Event__OfTypeAssignment_1 ) )
            {
            // InternalRentalWorkflow.g:589:1: ( ( rule__Event__OfTypeAssignment_1 ) )
            // InternalRentalWorkflow.g:590:2: ( rule__Event__OfTypeAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getOfTypeAssignment_1()); 
            // InternalRentalWorkflow.g:591:2: ( rule__Event__OfTypeAssignment_1 )
            // InternalRentalWorkflow.g:591:3: rule__Event__OfTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__OfTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getOfTypeAssignment_1()); 

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
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalRentalWorkflow.g:600:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:604:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalRentalWorkflow.g:605:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalRentalWorkflow.g:612:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:616:1: ( ( 'state' ) )
            // InternalRentalWorkflow.g:617:1: ( 'state' )
            {
            // InternalRentalWorkflow.g:617:1: ( 'state' )
            // InternalRentalWorkflow.g:618:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

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
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalRentalWorkflow.g:627:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:631:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalRentalWorkflow.g:632:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalRentalWorkflow.g:639:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:643:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalRentalWorkflow.g:644:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalRentalWorkflow.g:644:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalRentalWorkflow.g:645:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalRentalWorkflow.g:646:2: ( rule__State__NameAssignment_1 )
            // InternalRentalWorkflow.g:646:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalRentalWorkflow.g:654:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:658:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalRentalWorkflow.g:659:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

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
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalRentalWorkflow.g:666:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:670:1: ( ( ( rule__State__Group_2__0 )? ) )
            // InternalRentalWorkflow.g:671:1: ( ( rule__State__Group_2__0 )? )
            {
            // InternalRentalWorkflow.g:671:1: ( ( rule__State__Group_2__0 )? )
            // InternalRentalWorkflow.g:672:2: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // InternalRentalWorkflow.g:673:2: ( rule__State__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRentalWorkflow.g:673:3: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalRentalWorkflow.g:681:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:685:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalRentalWorkflow.g:686:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

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
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalRentalWorkflow.g:693:1: rule__State__Group__3__Impl : ( 'transition' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:697:1: ( ( 'transition' ) )
            // InternalRentalWorkflow.g:698:1: ( 'transition' )
            {
            // InternalRentalWorkflow.g:698:1: ( 'transition' )
            // InternalRentalWorkflow.g:699:2: 'transition'
            {
             before(grammarAccess.getStateAccess().getTransitionKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getTransitionKeyword_3()); 

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
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalRentalWorkflow.g:708:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:712:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalRentalWorkflow.g:713:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

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
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalRentalWorkflow.g:720:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:724:1: ( ( ( rule__State__TransitionAssignment_4 ) ) )
            // InternalRentalWorkflow.g:725:1: ( ( rule__State__TransitionAssignment_4 ) )
            {
            // InternalRentalWorkflow.g:725:1: ( ( rule__State__TransitionAssignment_4 ) )
            // InternalRentalWorkflow.g:726:2: ( rule__State__TransitionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionAssignment_4()); 
            // InternalRentalWorkflow.g:727:2: ( rule__State__TransitionAssignment_4 )
            // InternalRentalWorkflow.g:727:3: rule__State__TransitionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__State__TransitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionAssignment_4()); 

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
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalRentalWorkflow.g:735:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:739:1: ( rule__State__Group__5__Impl )
            // InternalRentalWorkflow.g:740:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

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
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalRentalWorkflow.g:746:1: rule__State__Group__5__Impl : ( 'end' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:750:1: ( ( 'end' ) )
            // InternalRentalWorkflow.g:751:1: ( 'end' )
            {
            // InternalRentalWorkflow.g:751:1: ( 'end' )
            // InternalRentalWorkflow.g:752:2: 'end'
            {
             before(grammarAccess.getStateAccess().getEndKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getEndKeyword_5()); 

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
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group_2__0"
    // InternalRentalWorkflow.g:762:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:766:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // InternalRentalWorkflow.g:767:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__State__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__1();

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
    // $ANTLR end "rule__State__Group_2__0"


    // $ANTLR start "rule__State__Group_2__0__Impl"
    // InternalRentalWorkflow.g:774:1: rule__State__Group_2__0__Impl : ( 'events' ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:778:1: ( ( 'events' ) )
            // InternalRentalWorkflow.g:779:1: ( 'events' )
            {
            // InternalRentalWorkflow.g:779:1: ( 'events' )
            // InternalRentalWorkflow.g:780:2: 'events'
            {
             before(grammarAccess.getStateAccess().getEventsKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getEventsKeyword_2_0()); 

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
    // $ANTLR end "rule__State__Group_2__0__Impl"


    // $ANTLR start "rule__State__Group_2__1"
    // InternalRentalWorkflow.g:789:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl rule__State__Group_2__2 ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:793:1: ( rule__State__Group_2__1__Impl rule__State__Group_2__2 )
            // InternalRentalWorkflow.g:794:2: rule__State__Group_2__1__Impl rule__State__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__State__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__2();

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
    // $ANTLR end "rule__State__Group_2__1"


    // $ANTLR start "rule__State__Group_2__1__Impl"
    // InternalRentalWorkflow.g:801:1: rule__State__Group_2__1__Impl : ( '{' ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:805:1: ( ( '{' ) )
            // InternalRentalWorkflow.g:806:1: ( '{' )
            {
            // InternalRentalWorkflow.g:806:1: ( '{' )
            // InternalRentalWorkflow.g:807:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__State__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group_2__2"
    // InternalRentalWorkflow.g:816:1: rule__State__Group_2__2 : rule__State__Group_2__2__Impl rule__State__Group_2__3 ;
    public final void rule__State__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:820:1: ( rule__State__Group_2__2__Impl rule__State__Group_2__3 )
            // InternalRentalWorkflow.g:821:2: rule__State__Group_2__2__Impl rule__State__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__State__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__3();

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
    // $ANTLR end "rule__State__Group_2__2"


    // $ANTLR start "rule__State__Group_2__2__Impl"
    // InternalRentalWorkflow.g:828:1: rule__State__Group_2__2__Impl : ( ( ( rule__State__EventsAssignment_2_2 ) ) ( ( rule__State__EventsAssignment_2_2 )* ) ) ;
    public final void rule__State__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:832:1: ( ( ( ( rule__State__EventsAssignment_2_2 ) ) ( ( rule__State__EventsAssignment_2_2 )* ) ) )
            // InternalRentalWorkflow.g:833:1: ( ( ( rule__State__EventsAssignment_2_2 ) ) ( ( rule__State__EventsAssignment_2_2 )* ) )
            {
            // InternalRentalWorkflow.g:833:1: ( ( ( rule__State__EventsAssignment_2_2 ) ) ( ( rule__State__EventsAssignment_2_2 )* ) )
            // InternalRentalWorkflow.g:834:2: ( ( rule__State__EventsAssignment_2_2 ) ) ( ( rule__State__EventsAssignment_2_2 )* )
            {
            // InternalRentalWorkflow.g:834:2: ( ( rule__State__EventsAssignment_2_2 ) )
            // InternalRentalWorkflow.g:835:3: ( rule__State__EventsAssignment_2_2 )
            {
             before(grammarAccess.getStateAccess().getEventsAssignment_2_2()); 
            // InternalRentalWorkflow.g:836:3: ( rule__State__EventsAssignment_2_2 )
            // InternalRentalWorkflow.g:836:4: rule__State__EventsAssignment_2_2
            {
            pushFollow(FOLLOW_7);
            rule__State__EventsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getEventsAssignment_2_2()); 

            }

            // InternalRentalWorkflow.g:839:2: ( ( rule__State__EventsAssignment_2_2 )* )
            // InternalRentalWorkflow.g:840:3: ( rule__State__EventsAssignment_2_2 )*
            {
             before(grammarAccess.getStateAccess().getEventsAssignment_2_2()); 
            // InternalRentalWorkflow.g:841:3: ( rule__State__EventsAssignment_2_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRentalWorkflow.g:841:4: rule__State__EventsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__State__EventsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getEventsAssignment_2_2()); 

            }


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
    // $ANTLR end "rule__State__Group_2__2__Impl"


    // $ANTLR start "rule__State__Group_2__3"
    // InternalRentalWorkflow.g:850:1: rule__State__Group_2__3 : rule__State__Group_2__3__Impl ;
    public final void rule__State__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:854:1: ( rule__State__Group_2__3__Impl )
            // InternalRentalWorkflow.g:855:2: rule__State__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_2__3__Impl();

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
    // $ANTLR end "rule__State__Group_2__3"


    // $ANTLR start "rule__State__Group_2__3__Impl"
    // InternalRentalWorkflow.g:861:1: rule__State__Group_2__3__Impl : ( '}' ) ;
    public final void rule__State__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:865:1: ( ( '}' ) )
            // InternalRentalWorkflow.g:866:1: ( '}' )
            {
            // InternalRentalWorkflow.g:866:1: ( '}' )
            // InternalRentalWorkflow.g:867:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__State__Group_2__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalRentalWorkflow.g:877:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:881:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRentalWorkflow.g:882:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRentalWorkflow.g:889:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:893:1: ( ( RULE_ID ) )
            // InternalRentalWorkflow.g:894:1: ( RULE_ID )
            {
            // InternalRentalWorkflow.g:894:1: ( RULE_ID )
            // InternalRentalWorkflow.g:895:2: RULE_ID
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
    // InternalRentalWorkflow.g:904:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:908:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRentalWorkflow.g:909:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRentalWorkflow.g:915:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:919:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRentalWorkflow.g:920:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRentalWorkflow.g:920:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRentalWorkflow.g:921:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRentalWorkflow.g:922:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRentalWorkflow.g:922:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRentalWorkflow.g:931:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:935:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRentalWorkflow.g:936:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRentalWorkflow.g:943:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:947:1: ( ( '.' ) )
            // InternalRentalWorkflow.g:948:1: ( '.' )
            {
            // InternalRentalWorkflow.g:948:1: ( '.' )
            // InternalRentalWorkflow.g:949:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRentalWorkflow.g:958:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:962:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRentalWorkflow.g:963:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRentalWorkflow.g:969:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:973:1: ( ( RULE_ID ) )
            // InternalRentalWorkflow.g:974:1: ( RULE_ID )
            {
            // InternalRentalWorkflow.g:974:1: ( RULE_ID )
            // InternalRentalWorkflow.g:975:2: RULE_ID
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


    // $ANTLR start "rule__RentalWorkflow__NameAssignment_2"
    // InternalRentalWorkflow.g:985:1: rule__RentalWorkflow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RentalWorkflow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:989:1: ( ( RULE_ID ) )
            // InternalRentalWorkflow.g:990:2: ( RULE_ID )
            {
            // InternalRentalWorkflow.g:990:2: ( RULE_ID )
            // InternalRentalWorkflow.g:991:3: RULE_ID
            {
             before(grammarAccess.getRentalWorkflowAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRentalWorkflowAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RentalWorkflow__NameAssignment_2"


    // $ANTLR start "rule__RentalWorkflow__EventAssignment_4"
    // InternalRentalWorkflow.g:1000:1: rule__RentalWorkflow__EventAssignment_4 : ( ruleEvent ) ;
    public final void rule__RentalWorkflow__EventAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1004:1: ( ( ruleEvent ) )
            // InternalRentalWorkflow.g:1005:2: ( ruleEvent )
            {
            // InternalRentalWorkflow.g:1005:2: ( ruleEvent )
            // InternalRentalWorkflow.g:1006:3: ruleEvent
            {
             before(grammarAccess.getRentalWorkflowAccess().getEventEventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getRentalWorkflowAccess().getEventEventParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RentalWorkflow__EventAssignment_4"


    // $ANTLR start "rule__RentalWorkflow__StatesAssignment_6"
    // InternalRentalWorkflow.g:1015:1: rule__RentalWorkflow__StatesAssignment_6 : ( ruleState ) ;
    public final void rule__RentalWorkflow__StatesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1019:1: ( ( ruleState ) )
            // InternalRentalWorkflow.g:1020:2: ( ruleState )
            {
            // InternalRentalWorkflow.g:1020:2: ( ruleState )
            // InternalRentalWorkflow.g:1021:3: ruleState
            {
             before(grammarAccess.getRentalWorkflowAccess().getStatesStateParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRentalWorkflowAccess().getStatesStateParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RentalWorkflow__StatesAssignment_6"


    // $ANTLR start "rule__RentalWorkflow__StartStateAssignment_8"
    // InternalRentalWorkflow.g:1030:1: rule__RentalWorkflow__StartStateAssignment_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RentalWorkflow__StartStateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1034:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRentalWorkflow.g:1035:2: ( ( ruleQualifiedName ) )
            {
            // InternalRentalWorkflow.g:1035:2: ( ( ruleQualifiedName ) )
            // InternalRentalWorkflow.g:1036:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRentalWorkflowAccess().getStartStateStateCrossReference_8_0()); 
            // InternalRentalWorkflow.g:1037:3: ( ruleQualifiedName )
            // InternalRentalWorkflow.g:1038:4: ruleQualifiedName
            {
             before(grammarAccess.getRentalWorkflowAccess().getStartStateStateQualifiedNameParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRentalWorkflowAccess().getStartStateStateQualifiedNameParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRentalWorkflowAccess().getStartStateStateCrossReference_8_0()); 

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
    // $ANTLR end "rule__RentalWorkflow__StartStateAssignment_8"


    // $ANTLR start "rule__RentalWorkflow__FinishStateAssignment_11"
    // InternalRentalWorkflow.g:1049:1: rule__RentalWorkflow__FinishStateAssignment_11 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RentalWorkflow__FinishStateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1053:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRentalWorkflow.g:1054:2: ( ( ruleQualifiedName ) )
            {
            // InternalRentalWorkflow.g:1054:2: ( ( ruleQualifiedName ) )
            // InternalRentalWorkflow.g:1055:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRentalWorkflowAccess().getFinishStateStateCrossReference_11_0()); 
            // InternalRentalWorkflow.g:1056:3: ( ruleQualifiedName )
            // InternalRentalWorkflow.g:1057:4: ruleQualifiedName
            {
             before(grammarAccess.getRentalWorkflowAccess().getFinishStateStateQualifiedNameParserRuleCall_11_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRentalWorkflowAccess().getFinishStateStateQualifiedNameParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getRentalWorkflowAccess().getFinishStateStateCrossReference_11_0()); 

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
    // $ANTLR end "rule__RentalWorkflow__FinishStateAssignment_11"


    // $ANTLR start "rule__Event__NameAssignment_0"
    // InternalRentalWorkflow.g:1068:1: rule__Event__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1072:1: ( ( RULE_ID ) )
            // InternalRentalWorkflow.g:1073:2: ( RULE_ID )
            {
            // InternalRentalWorkflow.g:1073:2: ( RULE_ID )
            // InternalRentalWorkflow.g:1074:3: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Event__NameAssignment_0"


    // $ANTLR start "rule__Event__OfTypeAssignment_1"
    // InternalRentalWorkflow.g:1083:1: rule__Event__OfTypeAssignment_1 : ( ruleofEventType ) ;
    public final void rule__Event__OfTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1087:1: ( ( ruleofEventType ) )
            // InternalRentalWorkflow.g:1088:2: ( ruleofEventType )
            {
            // InternalRentalWorkflow.g:1088:2: ( ruleofEventType )
            // InternalRentalWorkflow.g:1089:3: ruleofEventType
            {
             before(grammarAccess.getEventAccess().getOfTypeOfEventTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleofEventType();

            state._fsp--;

             after(grammarAccess.getEventAccess().getOfTypeOfEventTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Event__OfTypeAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalRentalWorkflow.g:1098:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1102:1: ( ( RULE_ID ) )
            // InternalRentalWorkflow.g:1103:2: ( RULE_ID )
            {
            // InternalRentalWorkflow.g:1103:2: ( RULE_ID )
            // InternalRentalWorkflow.g:1104:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__EventsAssignment_2_2"
    // InternalRentalWorkflow.g:1113:1: rule__State__EventsAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__State__EventsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1117:1: ( ( ( RULE_ID ) ) )
            // InternalRentalWorkflow.g:1118:2: ( ( RULE_ID ) )
            {
            // InternalRentalWorkflow.g:1118:2: ( ( RULE_ID ) )
            // InternalRentalWorkflow.g:1119:3: ( RULE_ID )
            {
             before(grammarAccess.getStateAccess().getEventsEventCrossReference_2_2_0()); 
            // InternalRentalWorkflow.g:1120:3: ( RULE_ID )
            // InternalRentalWorkflow.g:1121:4: RULE_ID
            {
             before(grammarAccess.getStateAccess().getEventsEventIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getEventsEventIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getStateAccess().getEventsEventCrossReference_2_2_0()); 

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
    // $ANTLR end "rule__State__EventsAssignment_2_2"


    // $ANTLR start "rule__State__TransitionAssignment_4"
    // InternalRentalWorkflow.g:1132:1: rule__State__TransitionAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__State__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRentalWorkflow.g:1136:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRentalWorkflow.g:1137:2: ( ( ruleQualifiedName ) )
            {
            // InternalRentalWorkflow.g:1137:2: ( ( ruleQualifiedName ) )
            // InternalRentalWorkflow.g:1138:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getStateAccess().getTransitionStateCrossReference_4_0()); 
            // InternalRentalWorkflow.g:1139:3: ( ruleQualifiedName )
            // InternalRentalWorkflow.g:1140:4: ruleQualifiedName
            {
             before(grammarAccess.getStateAccess().getTransitionStateQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionStateQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getStateAccess().getTransitionStateCrossReference_4_0()); 

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
    // $ANTLR end "rule__State__TransitionAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});

}