/*
 * generated by Xtext 2.10.0
 */
grammar InternalGuiOas;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.guioas.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEntidad
entryRuleEntidad returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntidadRule()); }
	iv_ruleEntidad=ruleEntidad
	{ $current=$iv_ruleEntidad.current; }
	EOF;

// Rule Entidad
ruleEntidad returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entidad'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntidadAccess().getEntidadKeyword_0());
		}
		(
			(
				lv_nombre_1_0=RULE_STRING
				{
					newLeafNode(lv_nombre_1_0, grammarAccess.getEntidadAccess().getNombreSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntidadRule());
					}
					setWithLastConsumed(
						$current,
						"nombre",
						lv_nombre_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='campos'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntidadAccess().getCamposKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntidadAccess().getCamposCampoParserRuleCall_4_0());
				}
				lv_campos_4_0=ruleCampo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadRule());
					}
					add(
						$current,
						"campos",
						lv_campos_4_0,
						"org.xtext.example.guioas.GuiOas.Campo");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_6='entidades'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntidadAccess().getEntidadesKeyword_6());
		}
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntidadAccess().getEntidadesEntidadParserRuleCall_8_0());
				}
				lv_entidades_8_0=ruleEntidad
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadRule());
					}
					add(
						$current,
						"entidades",
						lv_entidades_8_0,
						"org.xtext.example.guioas.GuiOas.Entidad");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleCampo
entryRuleCampo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCampoRule()); }
	iv_ruleCampo=ruleCampo
	{ $current=$iv_ruleCampo.current; }
	EOF;

// Rule Campo
ruleCampo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='campo'
		{
			newLeafNode(otherlv_0, grammarAccess.getCampoAccess().getCampoKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCampoRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_nombre_2_0=RULE_STRING
				{
					newLeafNode(lv_nombre_2_0, grammarAccess.getCampoAccess().getNombreSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCampoRule());
					}
					setWithLastConsumed(
						$current,
						"nombre",
						lv_nombre_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_tipo_3_0=RULE_STRING
				{
					newLeafNode(lv_tipo_3_0, grammarAccess.getCampoAccess().getTipoSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCampoRule());
					}
					setWithLastConsumed(
						$current,
						"tipo",
						lv_tipo_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_longitud_4_0=RULE_INT
				{
					newLeafNode(lv_longitud_4_0, grammarAccess.getCampoAccess().getLongitudINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCampoRule());
					}
					setWithLastConsumed(
						$current,
						"longitud",
						lv_longitud_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_URL : ('http'|'https') '://' ('a'..'z'|'A'..'Z'|'_'|'-'|'('|')'|'\\'|'/'|'.'|'0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
