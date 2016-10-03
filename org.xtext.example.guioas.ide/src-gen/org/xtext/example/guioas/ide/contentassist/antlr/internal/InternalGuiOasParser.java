package org.xtext.example.guioas.ide.contentassist.antlr.internal;

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
import org.xtext.example.guioas.services.GuiOasGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiOasParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entidad'", "'campos'", "'{'", "'}'", "'entidades'", "'campo'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int RULE_URL=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalGuiOasParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuiOasParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuiOasParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGuiOas.g"; }


    	private GuiOasGrammarAccess grammarAccess;

    	public void setGrammarAccess(GuiOasGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEntidad"
    // InternalGuiOas.g:53:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalGuiOas.g:54:1: ( ruleEntidad EOF )
            // InternalGuiOas.g:55:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
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
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalGuiOas.g:62:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:66:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalGuiOas.g:67:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalGuiOas.g:67:2: ( ( rule__Entidad__Group__0 ) )
            // InternalGuiOas.g:68:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalGuiOas.g:69:3: ( rule__Entidad__Group__0 )
            // InternalGuiOas.g:69:4: rule__Entidad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getGroup()); 

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
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleCampo"
    // InternalGuiOas.g:78:1: entryRuleCampo : ruleCampo EOF ;
    public final void entryRuleCampo() throws RecognitionException {
        try {
            // InternalGuiOas.g:79:1: ( ruleCampo EOF )
            // InternalGuiOas.g:80:1: ruleCampo EOF
            {
             before(grammarAccess.getCampoRule()); 
            pushFollow(FOLLOW_1);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getCampoRule()); 
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
    // $ANTLR end "entryRuleCampo"


    // $ANTLR start "ruleCampo"
    // InternalGuiOas.g:87:1: ruleCampo : ( ( rule__Campo__Group__0 ) ) ;
    public final void ruleCampo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:91:2: ( ( ( rule__Campo__Group__0 ) ) )
            // InternalGuiOas.g:92:2: ( ( rule__Campo__Group__0 ) )
            {
            // InternalGuiOas.g:92:2: ( ( rule__Campo__Group__0 ) )
            // InternalGuiOas.g:93:3: ( rule__Campo__Group__0 )
            {
             before(grammarAccess.getCampoAccess().getGroup()); 
            // InternalGuiOas.g:94:3: ( rule__Campo__Group__0 )
            // InternalGuiOas.g:94:4: rule__Campo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getGroup()); 

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
    // $ANTLR end "ruleCampo"


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalGuiOas.g:102:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:106:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalGuiOas.g:107:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__1();

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
    // $ANTLR end "rule__Entidad__Group__0"


    // $ANTLR start "rule__Entidad__Group__0__Impl"
    // InternalGuiOas.g:114:1: rule__Entidad__Group__0__Impl : ( 'entidad' ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:118:1: ( ( 'entidad' ) )
            // InternalGuiOas.g:119:1: ( 'entidad' )
            {
            // InternalGuiOas.g:119:1: ( 'entidad' )
            // InternalGuiOas.g:120:2: 'entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); 

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
    // $ANTLR end "rule__Entidad__Group__0__Impl"


    // $ANTLR start "rule__Entidad__Group__1"
    // InternalGuiOas.g:129:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:133:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalGuiOas.g:134:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__2();

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
    // $ANTLR end "rule__Entidad__Group__1"


    // $ANTLR start "rule__Entidad__Group__1__Impl"
    // InternalGuiOas.g:141:1: rule__Entidad__Group__1__Impl : ( ( rule__Entidad__NombreAssignment_1 ) ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:145:1: ( ( ( rule__Entidad__NombreAssignment_1 ) ) )
            // InternalGuiOas.g:146:1: ( ( rule__Entidad__NombreAssignment_1 ) )
            {
            // InternalGuiOas.g:146:1: ( ( rule__Entidad__NombreAssignment_1 ) )
            // InternalGuiOas.g:147:2: ( rule__Entidad__NombreAssignment_1 )
            {
             before(grammarAccess.getEntidadAccess().getNombreAssignment_1()); 
            // InternalGuiOas.g:148:2: ( rule__Entidad__NombreAssignment_1 )
            // InternalGuiOas.g:148:3: rule__Entidad__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__Entidad__Group__1__Impl"


    // $ANTLR start "rule__Entidad__Group__2"
    // InternalGuiOas.g:156:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:160:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalGuiOas.g:161:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entidad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__3();

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
    // $ANTLR end "rule__Entidad__Group__2"


    // $ANTLR start "rule__Entidad__Group__2__Impl"
    // InternalGuiOas.g:168:1: rule__Entidad__Group__2__Impl : ( 'campos' ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:172:1: ( ( 'campos' ) )
            // InternalGuiOas.g:173:1: ( 'campos' )
            {
            // InternalGuiOas.g:173:1: ( 'campos' )
            // InternalGuiOas.g:174:2: 'campos'
            {
             before(grammarAccess.getEntidadAccess().getCamposKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getCamposKeyword_2()); 

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
    // $ANTLR end "rule__Entidad__Group__2__Impl"


    // $ANTLR start "rule__Entidad__Group__3"
    // InternalGuiOas.g:183:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:187:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalGuiOas.g:188:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entidad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__4();

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
    // $ANTLR end "rule__Entidad__Group__3"


    // $ANTLR start "rule__Entidad__Group__3__Impl"
    // InternalGuiOas.g:195:1: rule__Entidad__Group__3__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:199:1: ( ( '{' ) )
            // InternalGuiOas.g:200:1: ( '{' )
            {
            // InternalGuiOas.g:200:1: ( '{' )
            // InternalGuiOas.g:201:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entidad__Group__3__Impl"


    // $ANTLR start "rule__Entidad__Group__4"
    // InternalGuiOas.g:210:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:214:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalGuiOas.g:215:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entidad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5();

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
    // $ANTLR end "rule__Entidad__Group__4"


    // $ANTLR start "rule__Entidad__Group__4__Impl"
    // InternalGuiOas.g:222:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__CamposAssignment_4 )* ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:226:1: ( ( ( rule__Entidad__CamposAssignment_4 )* ) )
            // InternalGuiOas.g:227:1: ( ( rule__Entidad__CamposAssignment_4 )* )
            {
            // InternalGuiOas.g:227:1: ( ( rule__Entidad__CamposAssignment_4 )* )
            // InternalGuiOas.g:228:2: ( rule__Entidad__CamposAssignment_4 )*
            {
             before(grammarAccess.getEntidadAccess().getCamposAssignment_4()); 
            // InternalGuiOas.g:229:2: ( rule__Entidad__CamposAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGuiOas.g:229:3: rule__Entidad__CamposAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entidad__CamposAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getCamposAssignment_4()); 

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
    // $ANTLR end "rule__Entidad__Group__4__Impl"


    // $ANTLR start "rule__Entidad__Group__5"
    // InternalGuiOas.g:237:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl rule__Entidad__Group__6 ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:241:1: ( rule__Entidad__Group__5__Impl rule__Entidad__Group__6 )
            // InternalGuiOas.g:242:2: rule__Entidad__Group__5__Impl rule__Entidad__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Entidad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__6();

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
    // $ANTLR end "rule__Entidad__Group__5"


    // $ANTLR start "rule__Entidad__Group__5__Impl"
    // InternalGuiOas.g:249:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:253:1: ( ( '}' ) )
            // InternalGuiOas.g:254:1: ( '}' )
            {
            // InternalGuiOas.g:254:1: ( '}' )
            // InternalGuiOas.g:255:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entidad__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group__6"
    // InternalGuiOas.g:264:1: rule__Entidad__Group__6 : rule__Entidad__Group__6__Impl rule__Entidad__Group__7 ;
    public final void rule__Entidad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:268:1: ( rule__Entidad__Group__6__Impl rule__Entidad__Group__7 )
            // InternalGuiOas.g:269:2: rule__Entidad__Group__6__Impl rule__Entidad__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Entidad__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__7();

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
    // $ANTLR end "rule__Entidad__Group__6"


    // $ANTLR start "rule__Entidad__Group__6__Impl"
    // InternalGuiOas.g:276:1: rule__Entidad__Group__6__Impl : ( 'entidades' ) ;
    public final void rule__Entidad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:280:1: ( ( 'entidades' ) )
            // InternalGuiOas.g:281:1: ( 'entidades' )
            {
            // InternalGuiOas.g:281:1: ( 'entidades' )
            // InternalGuiOas.g:282:2: 'entidades'
            {
             before(grammarAccess.getEntidadAccess().getEntidadesKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntidadesKeyword_6()); 

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
    // $ANTLR end "rule__Entidad__Group__6__Impl"


    // $ANTLR start "rule__Entidad__Group__7"
    // InternalGuiOas.g:291:1: rule__Entidad__Group__7 : rule__Entidad__Group__7__Impl rule__Entidad__Group__8 ;
    public final void rule__Entidad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:295:1: ( rule__Entidad__Group__7__Impl rule__Entidad__Group__8 )
            // InternalGuiOas.g:296:2: rule__Entidad__Group__7__Impl rule__Entidad__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Entidad__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__8();

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
    // $ANTLR end "rule__Entidad__Group__7"


    // $ANTLR start "rule__Entidad__Group__7__Impl"
    // InternalGuiOas.g:303:1: rule__Entidad__Group__7__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:307:1: ( ( '{' ) )
            // InternalGuiOas.g:308:1: ( '{' )
            {
            // InternalGuiOas.g:308:1: ( '{' )
            // InternalGuiOas.g:309:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Entidad__Group__7__Impl"


    // $ANTLR start "rule__Entidad__Group__8"
    // InternalGuiOas.g:318:1: rule__Entidad__Group__8 : rule__Entidad__Group__8__Impl rule__Entidad__Group__9 ;
    public final void rule__Entidad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:322:1: ( rule__Entidad__Group__8__Impl rule__Entidad__Group__9 )
            // InternalGuiOas.g:323:2: rule__Entidad__Group__8__Impl rule__Entidad__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Entidad__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__9();

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
    // $ANTLR end "rule__Entidad__Group__8"


    // $ANTLR start "rule__Entidad__Group__8__Impl"
    // InternalGuiOas.g:330:1: rule__Entidad__Group__8__Impl : ( ( rule__Entidad__EntidadesAssignment_8 )* ) ;
    public final void rule__Entidad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:334:1: ( ( ( rule__Entidad__EntidadesAssignment_8 )* ) )
            // InternalGuiOas.g:335:1: ( ( rule__Entidad__EntidadesAssignment_8 )* )
            {
            // InternalGuiOas.g:335:1: ( ( rule__Entidad__EntidadesAssignment_8 )* )
            // InternalGuiOas.g:336:2: ( rule__Entidad__EntidadesAssignment_8 )*
            {
             before(grammarAccess.getEntidadAccess().getEntidadesAssignment_8()); 
            // InternalGuiOas.g:337:2: ( rule__Entidad__EntidadesAssignment_8 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGuiOas.g:337:3: rule__Entidad__EntidadesAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entidad__EntidadesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getEntidadesAssignment_8()); 

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
    // $ANTLR end "rule__Entidad__Group__8__Impl"


    // $ANTLR start "rule__Entidad__Group__9"
    // InternalGuiOas.g:345:1: rule__Entidad__Group__9 : rule__Entidad__Group__9__Impl ;
    public final void rule__Entidad__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:349:1: ( rule__Entidad__Group__9__Impl )
            // InternalGuiOas.g:350:2: rule__Entidad__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__9__Impl();

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
    // $ANTLR end "rule__Entidad__Group__9"


    // $ANTLR start "rule__Entidad__Group__9__Impl"
    // InternalGuiOas.g:356:1: rule__Entidad__Group__9__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:360:1: ( ( '}' ) )
            // InternalGuiOas.g:361:1: ( '}' )
            {
            // InternalGuiOas.g:361:1: ( '}' )
            // InternalGuiOas.g:362:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Entidad__Group__9__Impl"


    // $ANTLR start "rule__Campo__Group__0"
    // InternalGuiOas.g:372:1: rule__Campo__Group__0 : rule__Campo__Group__0__Impl rule__Campo__Group__1 ;
    public final void rule__Campo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:376:1: ( rule__Campo__Group__0__Impl rule__Campo__Group__1 )
            // InternalGuiOas.g:377:2: rule__Campo__Group__0__Impl rule__Campo__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Campo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__1();

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
    // $ANTLR end "rule__Campo__Group__0"


    // $ANTLR start "rule__Campo__Group__0__Impl"
    // InternalGuiOas.g:384:1: rule__Campo__Group__0__Impl : ( 'campo' ) ;
    public final void rule__Campo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:388:1: ( ( 'campo' ) )
            // InternalGuiOas.g:389:1: ( 'campo' )
            {
            // InternalGuiOas.g:389:1: ( 'campo' )
            // InternalGuiOas.g:390:2: 'campo'
            {
             before(grammarAccess.getCampoAccess().getCampoKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getCampoKeyword_0()); 

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
    // $ANTLR end "rule__Campo__Group__0__Impl"


    // $ANTLR start "rule__Campo__Group__1"
    // InternalGuiOas.g:399:1: rule__Campo__Group__1 : rule__Campo__Group__1__Impl rule__Campo__Group__2 ;
    public final void rule__Campo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:403:1: ( rule__Campo__Group__1__Impl rule__Campo__Group__2 )
            // InternalGuiOas.g:404:2: rule__Campo__Group__1__Impl rule__Campo__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Campo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__2();

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
    // $ANTLR end "rule__Campo__Group__1"


    // $ANTLR start "rule__Campo__Group__1__Impl"
    // InternalGuiOas.g:411:1: rule__Campo__Group__1__Impl : ( ( rule__Campo__NameAssignment_1 ) ) ;
    public final void rule__Campo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:415:1: ( ( ( rule__Campo__NameAssignment_1 ) ) )
            // InternalGuiOas.g:416:1: ( ( rule__Campo__NameAssignment_1 ) )
            {
            // InternalGuiOas.g:416:1: ( ( rule__Campo__NameAssignment_1 ) )
            // InternalGuiOas.g:417:2: ( rule__Campo__NameAssignment_1 )
            {
             before(grammarAccess.getCampoAccess().getNameAssignment_1()); 
            // InternalGuiOas.g:418:2: ( rule__Campo__NameAssignment_1 )
            // InternalGuiOas.g:418:3: rule__Campo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Campo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Campo__Group__1__Impl"


    // $ANTLR start "rule__Campo__Group__2"
    // InternalGuiOas.g:426:1: rule__Campo__Group__2 : rule__Campo__Group__2__Impl rule__Campo__Group__3 ;
    public final void rule__Campo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:430:1: ( rule__Campo__Group__2__Impl rule__Campo__Group__3 )
            // InternalGuiOas.g:431:2: rule__Campo__Group__2__Impl rule__Campo__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Campo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__3();

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
    // $ANTLR end "rule__Campo__Group__2"


    // $ANTLR start "rule__Campo__Group__2__Impl"
    // InternalGuiOas.g:438:1: rule__Campo__Group__2__Impl : ( ( rule__Campo__NombreAssignment_2 ) ) ;
    public final void rule__Campo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:442:1: ( ( ( rule__Campo__NombreAssignment_2 ) ) )
            // InternalGuiOas.g:443:1: ( ( rule__Campo__NombreAssignment_2 ) )
            {
            // InternalGuiOas.g:443:1: ( ( rule__Campo__NombreAssignment_2 ) )
            // InternalGuiOas.g:444:2: ( rule__Campo__NombreAssignment_2 )
            {
             before(grammarAccess.getCampoAccess().getNombreAssignment_2()); 
            // InternalGuiOas.g:445:2: ( rule__Campo__NombreAssignment_2 )
            // InternalGuiOas.g:445:3: rule__Campo__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Campo__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getNombreAssignment_2()); 

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
    // $ANTLR end "rule__Campo__Group__2__Impl"


    // $ANTLR start "rule__Campo__Group__3"
    // InternalGuiOas.g:453:1: rule__Campo__Group__3 : rule__Campo__Group__3__Impl rule__Campo__Group__4 ;
    public final void rule__Campo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:457:1: ( rule__Campo__Group__3__Impl rule__Campo__Group__4 )
            // InternalGuiOas.g:458:2: rule__Campo__Group__3__Impl rule__Campo__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Campo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__4();

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
    // $ANTLR end "rule__Campo__Group__3"


    // $ANTLR start "rule__Campo__Group__3__Impl"
    // InternalGuiOas.g:465:1: rule__Campo__Group__3__Impl : ( ( rule__Campo__TipoAssignment_3 ) ) ;
    public final void rule__Campo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:469:1: ( ( ( rule__Campo__TipoAssignment_3 ) ) )
            // InternalGuiOas.g:470:1: ( ( rule__Campo__TipoAssignment_3 ) )
            {
            // InternalGuiOas.g:470:1: ( ( rule__Campo__TipoAssignment_3 ) )
            // InternalGuiOas.g:471:2: ( rule__Campo__TipoAssignment_3 )
            {
             before(grammarAccess.getCampoAccess().getTipoAssignment_3()); 
            // InternalGuiOas.g:472:2: ( rule__Campo__TipoAssignment_3 )
            // InternalGuiOas.g:472:3: rule__Campo__TipoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Campo__TipoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getTipoAssignment_3()); 

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
    // $ANTLR end "rule__Campo__Group__3__Impl"


    // $ANTLR start "rule__Campo__Group__4"
    // InternalGuiOas.g:480:1: rule__Campo__Group__4 : rule__Campo__Group__4__Impl ;
    public final void rule__Campo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:484:1: ( rule__Campo__Group__4__Impl )
            // InternalGuiOas.g:485:2: rule__Campo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Group__4__Impl();

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
    // $ANTLR end "rule__Campo__Group__4"


    // $ANTLR start "rule__Campo__Group__4__Impl"
    // InternalGuiOas.g:491:1: rule__Campo__Group__4__Impl : ( ( rule__Campo__LongitudAssignment_4 ) ) ;
    public final void rule__Campo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:495:1: ( ( ( rule__Campo__LongitudAssignment_4 ) ) )
            // InternalGuiOas.g:496:1: ( ( rule__Campo__LongitudAssignment_4 ) )
            {
            // InternalGuiOas.g:496:1: ( ( rule__Campo__LongitudAssignment_4 ) )
            // InternalGuiOas.g:497:2: ( rule__Campo__LongitudAssignment_4 )
            {
             before(grammarAccess.getCampoAccess().getLongitudAssignment_4()); 
            // InternalGuiOas.g:498:2: ( rule__Campo__LongitudAssignment_4 )
            // InternalGuiOas.g:498:3: rule__Campo__LongitudAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Campo__LongitudAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getLongitudAssignment_4()); 

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
    // $ANTLR end "rule__Campo__Group__4__Impl"


    // $ANTLR start "rule__Entidad__NombreAssignment_1"
    // InternalGuiOas.g:507:1: rule__Entidad__NombreAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entidad__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:511:1: ( ( RULE_STRING ) )
            // InternalGuiOas.g:512:2: ( RULE_STRING )
            {
            // InternalGuiOas.g:512:2: ( RULE_STRING )
            // InternalGuiOas.g:513:3: RULE_STRING
            {
             before(grammarAccess.getEntidadAccess().getNombreSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getNombreSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entidad__NombreAssignment_1"


    // $ANTLR start "rule__Entidad__CamposAssignment_4"
    // InternalGuiOas.g:522:1: rule__Entidad__CamposAssignment_4 : ( ruleCampo ) ;
    public final void rule__Entidad__CamposAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:526:1: ( ( ruleCampo ) )
            // InternalGuiOas.g:527:2: ( ruleCampo )
            {
            // InternalGuiOas.g:527:2: ( ruleCampo )
            // InternalGuiOas.g:528:3: ruleCampo
            {
             before(grammarAccess.getEntidadAccess().getCamposCampoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getCamposCampoParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entidad__CamposAssignment_4"


    // $ANTLR start "rule__Entidad__EntidadesAssignment_8"
    // InternalGuiOas.g:537:1: rule__Entidad__EntidadesAssignment_8 : ( ruleEntidad ) ;
    public final void rule__Entidad__EntidadesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:541:1: ( ( ruleEntidad ) )
            // InternalGuiOas.g:542:2: ( ruleEntidad )
            {
            // InternalGuiOas.g:542:2: ( ruleEntidad )
            // InternalGuiOas.g:543:3: ruleEntidad
            {
             before(grammarAccess.getEntidadAccess().getEntidadesEntidadParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getEntidadesEntidadParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Entidad__EntidadesAssignment_8"


    // $ANTLR start "rule__Campo__NameAssignment_1"
    // InternalGuiOas.g:552:1: rule__Campo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Campo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:556:1: ( ( RULE_ID ) )
            // InternalGuiOas.g:557:2: ( RULE_ID )
            {
            // InternalGuiOas.g:557:2: ( RULE_ID )
            // InternalGuiOas.g:558:3: RULE_ID
            {
             before(grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Campo__NameAssignment_1"


    // $ANTLR start "rule__Campo__NombreAssignment_2"
    // InternalGuiOas.g:567:1: rule__Campo__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Campo__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:571:1: ( ( RULE_STRING ) )
            // InternalGuiOas.g:572:2: ( RULE_STRING )
            {
            // InternalGuiOas.g:572:2: ( RULE_STRING )
            // InternalGuiOas.g:573:3: RULE_STRING
            {
             before(grammarAccess.getCampoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Campo__NombreAssignment_2"


    // $ANTLR start "rule__Campo__TipoAssignment_3"
    // InternalGuiOas.g:582:1: rule__Campo__TipoAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Campo__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:586:1: ( ( RULE_STRING ) )
            // InternalGuiOas.g:587:2: ( RULE_STRING )
            {
            // InternalGuiOas.g:587:2: ( RULE_STRING )
            // InternalGuiOas.g:588:3: RULE_STRING
            {
             before(grammarAccess.getCampoAccess().getTipoSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getTipoSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Campo__TipoAssignment_3"


    // $ANTLR start "rule__Campo__LongitudAssignment_4"
    // InternalGuiOas.g:597:1: rule__Campo__LongitudAssignment_4 : ( RULE_INT ) ;
    public final void rule__Campo__LongitudAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiOas.g:601:1: ( ( RULE_INT ) )
            // InternalGuiOas.g:602:2: ( RULE_INT )
            {
            // InternalGuiOas.g:602:2: ( RULE_INT )
            // InternalGuiOas.g:603:3: RULE_INT
            {
             before(grammarAccess.getCampoAccess().getLongitudINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getLongitudINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Campo__LongitudAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});

}