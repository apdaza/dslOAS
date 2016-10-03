package org.xtext.example.guioas.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.guioas.services.GuiOasGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiOasParser extends AbstractInternalAntlrParser {
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

        public InternalGuiOasParser(TokenStream input, GuiOasGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Entidad";
       	}

       	@Override
       	protected GuiOasGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntidad"
    // InternalGuiOas.g:64:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalGuiOas.g:64:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalGuiOas.g:65:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
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
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalGuiOas.g:71:1: ruleEntidad returns [EObject current=null] : (otherlv_0= 'entidad' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'campos' otherlv_3= '{' ( (lv_campos_4_0= ruleCampo ) )* otherlv_5= '}' otherlv_6= 'entidades' otherlv_7= '{' ( (lv_entidades_8_0= ruleEntidad ) )* otherlv_9= '}' ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_campos_4_0 = null;

        EObject lv_entidades_8_0 = null;



        	enterRule();

        try {
            // InternalGuiOas.g:77:2: ( (otherlv_0= 'entidad' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'campos' otherlv_3= '{' ( (lv_campos_4_0= ruleCampo ) )* otherlv_5= '}' otherlv_6= 'entidades' otherlv_7= '{' ( (lv_entidades_8_0= ruleEntidad ) )* otherlv_9= '}' ) )
            // InternalGuiOas.g:78:2: (otherlv_0= 'entidad' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'campos' otherlv_3= '{' ( (lv_campos_4_0= ruleCampo ) )* otherlv_5= '}' otherlv_6= 'entidades' otherlv_7= '{' ( (lv_entidades_8_0= ruleEntidad ) )* otherlv_9= '}' )
            {
            // InternalGuiOas.g:78:2: (otherlv_0= 'entidad' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'campos' otherlv_3= '{' ( (lv_campos_4_0= ruleCampo ) )* otherlv_5= '}' otherlv_6= 'entidades' otherlv_7= '{' ( (lv_entidades_8_0= ruleEntidad ) )* otherlv_9= '}' )
            // InternalGuiOas.g:79:3: otherlv_0= 'entidad' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'campos' otherlv_3= '{' ( (lv_campos_4_0= ruleCampo ) )* otherlv_5= '}' otherlv_6= 'entidades' otherlv_7= '{' ( (lv_entidades_8_0= ruleEntidad ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadAccess().getEntidadKeyword_0());
            		
            // InternalGuiOas.g:83:3: ( (lv_nombre_1_0= RULE_STRING ) )
            // InternalGuiOas.g:84:4: (lv_nombre_1_0= RULE_STRING )
            {
            // InternalGuiOas.g:84:4: (lv_nombre_1_0= RULE_STRING )
            // InternalGuiOas.g:85:5: lv_nombre_1_0= RULE_STRING
            {
            lv_nombre_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_nombre_1_0, grammarAccess.getEntidadAccess().getNombreSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntidadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEntidadAccess().getCamposKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGuiOas.g:109:3: ( (lv_campos_4_0= ruleCampo ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGuiOas.g:110:4: (lv_campos_4_0= ruleCampo )
            	    {
            	    // InternalGuiOas.g:110:4: (lv_campos_4_0= ruleCampo )
            	    // InternalGuiOas.g:111:5: lv_campos_4_0= ruleCampo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadAccess().getCamposCampoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_campos_4_0=ruleCampo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"campos",
            	    						lv_campos_4_0,
            	    						"org.xtext.example.guioas.GuiOas.Campo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getEntidadAccess().getEntidadesKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalGuiOas.g:140:3: ( (lv_entidades_8_0= ruleEntidad ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGuiOas.g:141:4: (lv_entidades_8_0= ruleEntidad )
            	    {
            	    // InternalGuiOas.g:141:4: (lv_entidades_8_0= ruleEntidad )
            	    // InternalGuiOas.g:142:5: lv_entidades_8_0= ruleEntidad
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadAccess().getEntidadesEntidadParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_entidades_8_0=ruleEntidad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_8_0,
            	    						"org.xtext.example.guioas.GuiOas.Entidad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleCampo"
    // InternalGuiOas.g:167:1: entryRuleCampo returns [EObject current=null] : iv_ruleCampo= ruleCampo EOF ;
    public final EObject entryRuleCampo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampo = null;


        try {
            // InternalGuiOas.g:167:46: (iv_ruleCampo= ruleCampo EOF )
            // InternalGuiOas.g:168:2: iv_ruleCampo= ruleCampo EOF
            {
             newCompositeNode(grammarAccess.getCampoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCampo=ruleCampo();

            state._fsp--;

             current =iv_ruleCampo; 
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
    // $ANTLR end "entryRuleCampo"


    // $ANTLR start "ruleCampo"
    // InternalGuiOas.g:174:1: ruleCampo returns [EObject current=null] : (otherlv_0= 'campo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_tipo_3_0= RULE_STRING ) ) ( (lv_longitud_4_0= RULE_INT ) ) ) ;
    public final EObject ruleCampo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token lv_tipo_3_0=null;
        Token lv_longitud_4_0=null;


        	enterRule();

        try {
            // InternalGuiOas.g:180:2: ( (otherlv_0= 'campo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_tipo_3_0= RULE_STRING ) ) ( (lv_longitud_4_0= RULE_INT ) ) ) )
            // InternalGuiOas.g:181:2: (otherlv_0= 'campo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_tipo_3_0= RULE_STRING ) ) ( (lv_longitud_4_0= RULE_INT ) ) )
            {
            // InternalGuiOas.g:181:2: (otherlv_0= 'campo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_tipo_3_0= RULE_STRING ) ) ( (lv_longitud_4_0= RULE_INT ) ) )
            // InternalGuiOas.g:182:3: otherlv_0= 'campo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_tipo_3_0= RULE_STRING ) ) ( (lv_longitud_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCampoAccess().getCampoKeyword_0());
            		
            // InternalGuiOas.g:186:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGuiOas.g:187:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGuiOas.g:187:4: (lv_name_1_0= RULE_ID )
            // InternalGuiOas.g:188:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGuiOas.g:204:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalGuiOas.g:205:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalGuiOas.g:205:4: (lv_nombre_2_0= RULE_STRING )
            // InternalGuiOas.g:206:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getCampoAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGuiOas.g:222:3: ( (lv_tipo_3_0= RULE_STRING ) )
            // InternalGuiOas.g:223:4: (lv_tipo_3_0= RULE_STRING )
            {
            // InternalGuiOas.g:223:4: (lv_tipo_3_0= RULE_STRING )
            // InternalGuiOas.g:224:5: lv_tipo_3_0= RULE_STRING
            {
            lv_tipo_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_tipo_3_0, grammarAccess.getCampoAccess().getTipoSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tipo",
            						lv_tipo_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGuiOas.g:240:3: ( (lv_longitud_4_0= RULE_INT ) )
            // InternalGuiOas.g:241:4: (lv_longitud_4_0= RULE_INT )
            {
            // InternalGuiOas.g:241:4: (lv_longitud_4_0= RULE_INT )
            // InternalGuiOas.g:242:5: lv_longitud_4_0= RULE_INT
            {
            lv_longitud_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_longitud_4_0, grammarAccess.getCampoAccess().getLongitudINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"longitud",
            						lv_longitud_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleCampo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});

}