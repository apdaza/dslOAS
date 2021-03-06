/*
 * generated by Xtext 2.10.0
 */
grammar InternalGuiOas;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.guioas.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleEntidad
entryRuleEntidad
:
{ before(grammarAccess.getEntidadRule()); }
	 ruleEntidad
{ after(grammarAccess.getEntidadRule()); } 
	 EOF 
;

// Rule Entidad
ruleEntidad 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntidadAccess().getGroup()); }
		(rule__Entidad__Group__0)
		{ after(grammarAccess.getEntidadAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCampo
entryRuleCampo
:
{ before(grammarAccess.getCampoRule()); }
	 ruleCampo
{ after(grammarAccess.getCampoRule()); } 
	 EOF 
;

// Rule Campo
ruleCampo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCampoAccess().getGroup()); }
		(rule__Campo__Group__0)
		{ after(grammarAccess.getCampoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__0__Impl
	rule__Entidad__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); }
	'entidad'
	{ after(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__1__Impl
	rule__Entidad__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getNombreAssignment_1()); }
	(rule__Entidad__NombreAssignment_1)
	{ after(grammarAccess.getEntidadAccess().getNombreAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__2__Impl
	rule__Entidad__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getCamposKeyword_2()); }
	'campos'
	{ after(grammarAccess.getEntidadAccess().getCamposKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__3__Impl
	rule__Entidad__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__4__Impl
	rule__Entidad__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getCamposAssignment_4()); }
	(rule__Entidad__CamposAssignment_4)*
	{ after(grammarAccess.getEntidadAccess().getCamposAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__5__Impl
	rule__Entidad__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__6__Impl
	rule__Entidad__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getEntidadesKeyword_6()); }
	'entidades'
	{ after(grammarAccess.getEntidadAccess().getEntidadesKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__7__Impl
	rule__Entidad__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_7()); }
	'{'
	{ after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__8__Impl
	rule__Entidad__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getEntidadesAssignment_8()); }
	(rule__Entidad__EntidadesAssignment_8)*
	{ after(grammarAccess.getEntidadAccess().getEntidadesAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entidad__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Campo__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Campo__Group__0__Impl
	rule__Campo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCampoAccess().getCampoKeyword_0()); }
	'campo'
	{ after(grammarAccess.getCampoAccess().getCampoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Campo__Group__1__Impl
	rule__Campo__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCampoAccess().getNameAssignment_1()); }
	(rule__Campo__NameAssignment_1)
	{ after(grammarAccess.getCampoAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Campo__Group__2__Impl
	rule__Campo__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCampoAccess().getNombreAssignment_2()); }
	(rule__Campo__NombreAssignment_2)
	{ after(grammarAccess.getCampoAccess().getNombreAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Campo__Group__3__Impl
	rule__Campo__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCampoAccess().getTipoAssignment_3()); }
	(rule__Campo__TipoAssignment_3)
	{ after(grammarAccess.getCampoAccess().getTipoAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Campo__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCampoAccess().getLongitudAssignment_4()); }
	(rule__Campo__LongitudAssignment_4)
	{ after(grammarAccess.getCampoAccess().getLongitudAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entidad__NombreAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntidadAccess().getNombreSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getEntidadAccess().getNombreSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__CamposAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntidadAccess().getCamposCampoParserRuleCall_4_0()); }
		ruleCampo
		{ after(grammarAccess.getEntidadAccess().getCamposCampoParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entidad__EntidadesAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntidadAccess().getEntidadesEntidadParserRuleCall_8_0()); }
		ruleEntidad
		{ after(grammarAccess.getEntidadAccess().getEntidadesEntidadParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__NombreAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCampoAccess().getNombreSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getCampoAccess().getNombreSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__TipoAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCampoAccess().getTipoSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getCampoAccess().getTipoSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Campo__LongitudAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCampoAccess().getLongitudINTTerminalRuleCall_4_0()); }
		RULE_INT
		{ after(grammarAccess.getCampoAccess().getLongitudINTTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_URL : ('http'|'https') '://' ('a'..'z'|'A'..'Z'|'_'|'-'|'('|')'|'\\'|'/'|'.'|'0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
