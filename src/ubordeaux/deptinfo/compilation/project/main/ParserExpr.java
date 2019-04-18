package ubordeaux.deptinfo.compilation.project.main;

import java.util.Iterator;
import ubordeaux.deptinfo.compilation.project.environment.*;
import ubordeaux.deptinfo.compilation.project.type.*;
import beaver.*;
import java.util.ArrayList;
import ubordeaux.deptinfo.compilation.project.node.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "ParserExpr.grammar".
 */
public class ParserExpr extends Parser {

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pjLsTu5LKGFRlx04M8YcA84WL40mbDGLH4EYWglGGGec1G4bGisB1B2IZD058KAG6feg8" +
		"8qWqe5Z1AKL0KmOQzOtSykvdTRDvkdadm#$p3Uz$PcJltt9cvktVlpWKYSz4L9w43ckCALC" +
		"8pE1hbSGmge2BYS2oEm$4u0IUYCbgW8Sx5HJW75wCzBi6biXjRiG1bPL#m3xVX4Lo5wz09t" +
		"T0JlT4N6QY22z24SInPm$xDM8LofOrD$WgKGV$ms2A1s47M09oCdSWh8ljj0G$#J8ygGQPL" +
		"ysTTH9oJ$xCufnv6dAjB4AVQOSGPL88uDGuZphKbY5FpCEBSMe8uPyQCqpHcdAUAZ9E8cLY" +
		"CXLY4Dv276vdlAJWDrR4Kf#CC9A4sKb0NzN4M4iYzJD$0OMY9yHxtZW0t4IREHorbTtIPyb" +
		"20cQoSP$4SHxN6Iiwa3LhXIiHx$fi5HlKYjuwEN8hfkCcBi3h0lPpSUieTYflHrlFR9S1D8" +
		"xU1Scz13dDnkLD3vdYsCdDmDqPxp341vZXo6obt0YPYeCST4k1E8RUnSgTZ6WPxt1aX6Pod" +
		"pCVmEBDmcRD2c1SgSoxcumdlRdqMOCx4lNWG3#4kt8FxS3yUm73Fzd28RLA8xT4GMsw8xRK" +
		"Gsri#Mt2T7x6Kr98bdygNc8UdgNtYQDd8GewdtU1gia#rThfIil4yzvKdCHQJCG8ZCQhOMX" +
		"RkT7pDeVQ2Uat4wtp3Dr5RYTM8U6jr3TPXEVUgpaxChkZko32lYUWXxs0PvMnwNkjvS6KYD" +
		"l9ztO14UOFzBuRqsnN3ovGlOJrU3UbFrPc$WXtyk$O#QksdCbrbfihhlJqn2vkSsMxaVmdU" +
		"n7O0Mx1EVeF$TpkYVf8dUTmjcz1FKxwdpUYh1VVNLjmDst2tQiVdwJvDW$kgnRjN1cLP#zX" +
		"VzpW#xxxS3#D2#ghmAs3FeYhdTYhdKespAOYJmFwwt1bJIXtRviSL6Hk1s45M2hzAVRX3Xt" +
		"ku9aRs9SlK7HSUf$oHE4VYC4wjKiOnMHTrO9NJoLdBALwbrK0hhKfQQvt4ciRqVFPa$44Uj" +
		"r#0QxAYI$3OyHxp#W3JvQInrZCvPW1dSYshmJZMIEwesZ5pQS3xqTlZ9iJaDcQrd#nnusDo" +
		"a#YtbiTj6397bsbmN7sFQGIOjNpSsgnJ6WNgsGBksONyzkNNqEKcnSWWdi$3y9WzO#PQdok" +
		"dw3lhheREh32xiYBlZXx$cosupezOIcwfxLXwUrfvQeQd3VIqEDNSbLAUgweArr8DrjarMM" +
		"cVMMpDu5grVINx8fdE6vvARG0jwTuAl1BzUKvmOxeopAl9VEBesTubaWdNWojDvtrDrVwaa" +
		"7wxOh0SNdY$6pt1oTkrH#TMbEp9CQdEREtH$RX$nOiuywiZlXyo9Uh7U0ciE7RTPzTJ8fzI" +
		"r23YY8x4ZKGb8iFkBmq0GtX9eznROEEP1JnxWgTNiBe5FYCEadCAKPNe14IEennEUHRbIif" +
		"p02k5iYLb8ygsb1TITg5iHzc3qXxNdx8NntIcf6wCeCoa$C6NqmpQRWRCSZxRBxnKewr2Vj" +
		"kiIyvTbFF3vsMkvfZVydLh9DjjrPx7zdZcaQXzKscheVfiwkUfleXwHnt3EVDy2NJMlkMqf" +
		"LFPexbLLFiQskzWkwMsDxCzWJYMjjNgwpILRMYxHVN1nBqwvW2nZUtCuZz3ininAiesY7Fa" +
		"yp6l8wwcp#tg$ntj7qei8Phxnenb$rxAnThUGEJIZvlpBXzt8R7Jr#OwiPuWbcYStHndptj" +
		"HuRmYITg$AyfUaQXCP17LrLQVQAtwwHoptyTF9JZlo6Z2NbSD2TzwYTZppr3z2g82eVSxab" +
		"x0CnRmlVg3lbVORUfRAFeKzzuN1TjduVdXLfLwR$61ng#aiftAOIftgFmaNvgcoYegwwdK#" +
		"sFsLZb4vOZed6YR7hGPQmkthMN5cHzv1wFQNnNeaHIVtjYdDoayXjyYOBpsDLDRhif3Qc#b" +
		"UIPhM##JPRzd1xNlEzzyqfJ7$S78ySrzHd7czU$pDYRvVCvJwTqpFdU#BsQNmcFCLL7jcqe" +
		"NsvgcEMH7vRGvNoAnY77hezhV#dB93V8ZzNpzMmjqVczXZF7rlHqSYrsy2t$BFdW$ULMsoC" +
		"loacoMJP8hByf6sI3BvHbvMfwIR8UnNd9udKlC8MOHZnCpYSS8VWraEZ6Du6ujZn1JYDd4e" +
		"yxuoJ99FSsJXsM#ewrrhY$8H9aWusMSZ9LLPAsZBLjMEdtPyhmZLpZNvvphivhpQogN4K#g" +
		"ljIRqH9P88iTZJkUV23lg$qz#LL#aKFoi$maFyeFyhry9z$I$hby8r$xxWY$fVAnwX$90TK" +
		"#LFaLyQxiSVGlPBzQzwfSA8la5SgtYPsoGxPxNjzohjkSw#ko5RwVl2dsS$bB$jJsxmHtFG" +
		"pbkQiiJsGWJ5pZmE1vBy8Jdy6AEnnTVEX0T5LqvBZBwAiJQnqRtUXx4EqkkjD$3t8oA3ESC" +
		"qo4Pr0G9Z8TsDLHn3b3sZMJ$OrDfnpCli6KQKwjQB9QD5WhbY7AiOe2OR2MieZyEgiPVVGY" +
		"hnVRpHKjOg0L#Qt9lu2Itql2u4dJ8WoUYYsUYosUZ2sUZIsUZYsUbur2QCznxJdNIoWlPLv" +
		"svJpGENj6UAe4OR4ID8W8OLUJbiAlnxBvONXe6e8X$m25uVlN");

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};
 
	static class Events extends beaver.Parser.Events {
		public void syntaxError(Symbol token) {
			System.err.format("*** Erreur de syntaxe en ligne %d, colonne %d. Token inattendu: %s\n",
				Symbol.getLine(token.getStart()),
				Symbol.getColumn(token.getStart()),
				Terminals.NAMES[token.getId()]);
		}
	}
	
	public void semanticError(String msg, Symbol token) {
			System.err.format("*** " + msg + " ligne %d, colonne %d\n",
				Symbol.getLine(token.getStart()),
				Symbol.getColumn(token.getStart()));
		}
		
	private Environment typeEnvironment = new Environment("types");
	private Environment procedureEnvironment = new Environment("procedures");
	private StackEnvironment stackEnvironment = new StackEnvironment("local variables stack");
	private String type_declaration_name;

	private final Action[] actions;

	public ParserExpr() {
		super(PARSING_TABLES);
		actions = new Action[] {
			RETURN6,	// [0] program = type_declaration_part variable_declaration_part procedure_definition_part BEGIN statement_list END; returns 'END' although none is marked
			Action.NONE,  	// [1] type_declaration_part = 
			RETURN2,	// [2] type_declaration_part = TYPE type_declaration_list; returns 'type_declaration_list' although none is marked
			new Action() {	// [3] type_declaration_list = type_declaration_list type_declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [4] type_declaration_list = type_declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN4,	// [5] type_declaration = type_declaration_head EQ type SEMI; returns 'SEMI' although none is marked
			Action.RETURN,	// [6] type_declaration_head = IDENTIFIER
			Action.RETURN,	// [7] type = simple_type
			Action.RETURN,	// [8] type = named_type
			Action.RETURN,	// [9] type = index_type
			Action.RETURN,	// [10] type = array_type
			Action.RETURN,	// [11] type = pointer_type
			Action.RETURN,	// [12] type = structure_type
			new Action() {	// [13] simple_type = STR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new TypeString();
				}
			},
			new Action() {	// [14] simple_type = INT
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new TypeInt();
				}
			},
			new Action() {	// [15] simple_type = BOOL
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new TypeBoolean();
				}
			},
			new Action() {	// [16] named_type = IDENTIFIER.name
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					 return new NodeId(name, new TypeInt());
				}
			},
			Action.RETURN,	// [17] index_type = enumerated_type
			Action.RETURN,	// [18] index_type = subrange_type
			new Action() {	// [19] enumerated_type = init_enumerated_type LPAR identifier_list.t_list RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t_list = _symbols[offset + 3];
					final IdentifierList t_list = (IdentifierList) _symbol_t_list.value;
					 
	return new TypeEnumRange(new TypeItemEnum(0,t_list.first()),new TypeItemEnum(t_list.size()-1,t_list.last()));
				}
			},
			new Action() {	// [20] init_enumerated_type = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					return new TypeEnumRange();
				}
			},
			new Action() {	// [21] subrange_type = INTEGER_LIT.min DOUBLE_DOT INTEGER_LIT.max
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_min = _symbols[offset + 1];
					final Integer min = (Integer) _symbol_min.value;
					final Symbol _symbol_max = _symbols[offset + 3];
					final Integer max = (Integer) _symbol_max.value;
					 return new TypeArrayRange(new TypeInt(min), new TypeInt(max));
				}
			},
			new Action() {	// [22] subrange_type = IDENTIFIER.min DOUBLE_DOT IDENTIFIER.max
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_min = _symbols[offset + 1];
					final String min = (String) _symbol_min.value;
					final Symbol _symbol_max = _symbols[offset + 3];
					final String max = (String) _symbol_max.value;
					 return new TypeArrayRange(new TypeNamed(min), new TypeNamed(max));
				}
			},
			new Action() {	// [23] array_type = ARRAY LBRACKET range_type.t1 RBRACKET OF type.t2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t1 = _symbols[offset + 3];
					final Type t1 = (Type) _symbol_t1.value;
					final Symbol _symbol_t2 = _symbols[offset + 6];
					final Type t2 = (Type) _symbol_t2.value;
					 return new TypeArray(t1,t2);
				}
			},
			Action.RETURN,	// [24] range_type = enumerated_type
			Action.RETURN,	// [25] range_type = subrange_type
			Action.RETURN,	// [26] range_type = named_type
			new Action() {	// [27] pointer_type = CIRCUMFLEX type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final Type t = (Type) _symbol_t.value;
					 return new TypePointer(t);
				}
			},
			new Action() {	// [28] structure_type = STRUCT LCURLY_BRACKET feature_list_type.t RCURLY_BRACKET
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 3];
					final TypeFeatureList t = (TypeFeatureList) _symbol_t.value;
					 return new TypeStruct(t);
				}
			},
			new Action() {	// [29] feature_list_type = feature_list_type.t feature_type
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final TypeFeatureList t = (TypeFeatureList) _symbol_t.value;
					 return new TypeFeatureList(t);
				}
			},
			Action.RETURN,	// [30] feature_list_type = feature_type
			new Action() {	// [31] feature_type = IDENTIFIER.id COLON type.t SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 return new TypeFeature(id, t);
				}
			},
			Action.NONE,  	// [32] variable_declaration_part = 
			RETURN2,	// [33] variable_declaration_part = VAR variable_declaration_list; returns 'variable_declaration_list' although none is marked
			new Action() {	// [34] variable_declaration_list = variable_declaration_list.list variable_declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_list = _symbols[offset + 1];
					final Type list = (Type) _symbol_list.value;
					 return new TypeList(list);
				}
			},
			Action.RETURN,	// [35] variable_declaration_list = variable_declaration
			RETURN4,	// [36] variable_declaration = identifier_list COLON type SEMI; returns 'SEMI' although none is marked
			new Action() {	// [37] identifier_list = identifier_list.list COMMA IDENTIFIER.name
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_list = _symbols[offset + 1];
					final IdentifierList list = (IdentifierList) _symbol_list.value;
					final Symbol _symbol_name = _symbols[offset + 3];
					final String name = (String) _symbol_name.value;
					 list.add(name); return list;
				}
			},
			new Action() {	// [38] identifier_list = IDENTIFIER.name
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					 IdentifierList list = new IdentifierList(); list.add(name); return list;
				}
			},
			Action.NONE,  	// [39] procedure_definition_part = 
			Action.RETURN,	// [40] procedure_definition_part = procedure_definition_list
			new Action() {	// [41] procedure_definition_list = procedure_definition_list procedure_definition
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [42] procedure_definition_list = procedure_definition
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN2,	// [43] procedure_definition = procedure_definition_head block; returns 'block' although none is marked
			RETURN2,	// [44] procedure_definition = procedure_definition_head SEMI; returns 'SEMI' although none is marked
			Action.RETURN,	// [45] procedure_definition_head = procedure_head
			RETURN5,	// [46] procedure_head = PROCEDURE IDENTIFIER LPAR argt_part RPAR; returns 'RPAR' although none is marked
			new Action() {	// [47] procedure_head = FUNCTION IDENTIFIER.func LPAR argt_part.list RPAR COLON type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_func = _symbols[offset + 2];
					final String func = (String) _symbol_func.value;
					final Symbol _symbol_list = _symbols[offset + 4];
					final NodeList list = (NodeList) _symbol_list.value;
					final Symbol _symbol_t = _symbols[offset + 7];
					final Type t = (Type) _symbol_t.value;
					 return new NodeCallFct(func, new TypeFunct(func,new TypeTuple(), t), list);
				}
			},
			Action.NONE,  	// [48] argt_part = 
			Action.RETURN,	// [49] argt_part = argt_list
			new Action() {	// [50] argt_list = argt_list.list COMMA argt.arg
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_list = _symbols[offset + 1];
					final NodeList list = (NodeList) _symbol_list.value;
					final Symbol _symbol_arg = _symbols[offset + 3];
					final Node arg = (Node) _symbol_arg.value;
					 list.add(arg); return list;
				}
			},
			new Action() {	// [51] argt_list = argt.arg
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_arg = _symbols[offset + 1];
					final Node arg = (Node) _symbol_arg.value;
					 NodeList list = new NodeList(); list.add(arg); return list;
				}
			},
			new Action() {	// [52] argt = IDENTIFIER.name COLON type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 return new NodeId(name, t);
				}
			},
			RETURN4,	// [53] block = variable_declaration_part BEGIN statement_list END; returns 'END' although none is marked
			new Action() {	// [54] statement_list = statement_list.list statement.stm
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_list = _symbols[offset + 1];
					final Node list = (Node) _symbol_list.value;
					final Symbol _symbol_stm = _symbols[offset + 2];
					final Node stm = (Node) _symbol_stm.value;
					 list.add(stm); return list;
				}
			},
			new Action() {	// [55] statement_list = statement.stm
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_stm = _symbols[offset + 1];
					final Node stm = (Node) _symbol_stm.value;
					 NodeList list = new NodeList(); list.add(stm); return list;
				}
			},
			Action.RETURN,	// [56] statement = simple_statement
			Action.RETURN,	// [57] statement = structured_statement
			Action.RETURN,	// [58] simple_statement = assignment_statement
			Action.RETURN,	// [59] simple_statement = procedure_statement
			Action.RETURN,	// [60] simple_statement = new_statement
			Action.RETURN,	// [61] simple_statement = dispose_statement
			Action.RETURN,	// [62] simple_statement = println_statement
			Action.RETURN,	// [63] simple_statement = readln_statement
			Action.RETURN,	// [64] simple_statement = return_statement
			new Action() {	// [65] assignment_statement = variable_access.stm EQ expression.e SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_stm = _symbols[offset + 1];
					final NodeExp stm = (NodeExp) _symbol_stm.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeAssign(stm, e);
				}
			},
			RETURN2,	// [66] procedure_statement = procedure_expression SEMI; returns 'SEMI' although none is marked
			Action.RETURN,	// [67] procedure_expression = IDENTIFIER.name LPAR expression_part RPAR
			Action.NONE,  	// [68] expression_part = 
			Action.RETURN,	// [69] expression_part = expression_list
			new Action() {	// [70] expression_list = expression_list.list COMMA expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_list = _symbols[offset + 1];
					final NodeExp list = (NodeExp) _symbol_list.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 list.add(e); return list;
				}
			},
			new Action() {	// [71] expression_list = expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 NodeList list = new NodeList(); list.add(e); return list;
				}
			},
			new Action() {	// [72] new_statement = NEW variable_access.stm SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_stm = _symbols[offset + 2];
					final NodeExp stm = (NodeExp) _symbol_stm.value;
					 return new NodeNew(stm);
				}
			},
			new Action() {	// [73] dispose_statement = DISPOSE variable_access.stm SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_stm = _symbols[offset + 2];
					final NodeExp stm = (NodeExp) _symbol_stm.value;
					 return new NodeDispose(stm);
				}
			},
			new Action() {	// [74] println_statement = PRINTLN expression.e SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeCallFct("println", new TypeFunct("println",new TypeTuple(), new TypeVoid()), new NodeList(e));
				}
			},
			new Action() {	// [75] readln_statement = READLN.func expression.e SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol func = _symbols[offset + 1];
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeCallFct("readln", new TypeFunct("readln",new TypeTuple(), new TypeVoid()), new NodeList(e));
				}
			},
			new Action() {	// [76] return_statement = RETURN expression.e SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeReturn(e);
				}
			},
			Action.RETURN,	// [77] structured_statement = block.block
			Action.RETURN,	// [78] structured_statement = if_statement
			Action.RETURN,	// [79] structured_statement = while_statement
			Action.RETURN,	// [80] structured_statement = switch_statement
			new Action() {	// [81] if_statement = IF expression.e THEN statement.stm
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					final Symbol _symbol_stm = _symbols[offset + 4];
					final Node stm = (Node) _symbol_stm.value;
					 return new NodeIf(e, stm);
				}
			},
			new Action() {	// [82] if_statement = IF expression.e THEN statement.stm1 ELSE statement.stm2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					final Symbol _symbol_stm1 = _symbols[offset + 4];
					final Node stm1 = (Node) _symbol_stm1.value;
					final Symbol _symbol_stm2 = _symbols[offset + 6];
					final Node stm2 = (Node) _symbol_stm2.value;
					 return new NodeIf(e, stm1, stm2);
				}
			},
			new Action() {	// [83] while_statement = WHILE expression.e DO statement.stm
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					final Symbol _symbol_stm = _symbols[offset + 4];
					final Node stm = (Node) _symbol_stm.value;
					 return new NodeWhile(e, stm);
				}
			},
			new Action() {	// [84] switch_statement = SWITCH expression.e BEGIN case_statement_list.stm END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					final Symbol _symbol_stm = _symbols[offset + 4];
					final NodeCaseList stm = (NodeCaseList) _symbol_stm.value;
					 return new NodeSwitch(e, stm);
				}
			},
			RETURN3,	// [85] case_statement_list = case_statement_list.list case_statement.case1 case_default.case2; returns 'case2' although more are marked
			Action.RETURN,	// [86] case_statement_list = case_statement.case
			new Action() {	// [87] case_statement = CASE identifier_list COLON statement.stm
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_stm = _symbols[offset + 4];
					final Node stm = (Node) _symbol_stm.value;
					 return new NodeCase(stm);
				}
			},
			Action.NONE,  	// [88] case_default = 
			new Action() {	// [89] case_default = DEFAULT COLON statement.stm
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_stm = _symbols[offset + 3];
					final Node stm = (Node) _symbol_stm.value;
					 return new NodeCase(stm);
				}
			},
			new Action() {	// [90] variable_access = IDENTIFIER.name
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					 return new NodeId(name, new TypeInt());
				}
			},
			new Action() {	// [91] variable_access = variable_access.e LBRACKET expression RBRACKET
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return e;
				}
			},
			new Action() {	// [92] variable_access = expression.e CIRCUMFLEX
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodePtrAccess(e);
				}
			},
			new Action() {	// [93] expression = expression.e1 PLUS expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("+", e1, e2);
				}
			},
			new Action() {	// [94] expression = expression.e1 MINUS expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("-", e1, e2);
				}
			},
			new Action() {	// [95] expression = MINUS expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeOp("-", e);
				}
			},
			new Action() {	// [96] expression = expression.e1 TIMES expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("*", e1, e2);
				}
			},
			new Action() {	// [97] expression = expression.e1 DIV expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("/", e1, e2);
				}
			},
			new Action() {	// [98] expression = expression.e1 AND expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("&&", e1, e2);
				}
			},
			new Action() {	// [99] expression = expression.e1 OR expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("||", e1, e2);
				}
			},
			new Action() {	// [100] expression = NOT expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeOp("!", e);
				}
			},
			new Action() {	// [101] expression = expression.e1 INFERIOR expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("<", e1, e2);
				}
			},
			new Action() {	// [102] expression = expression.e1 INFERIOR_EQ expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("<=", e1, e2);
				}
			},
			new Action() {	// [103] expression = expression.e1 SUPERIOR expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp(">", e1, e2);
				}
			},
			new Action() {	// [104] expression = expression.e1 SUPERIOR_EQ expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp(">=", e1, e2);
				}
			},
			new Action() {	// [105] expression = expression.e1 EQUALS expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("==", e1, e2);
				}
			},
			new Action() {	// [106] expression = expression.e1 DIFF expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("!=", e1, e2);
				}
			},
			new Action() {	// [107] expression = LPAR expression.e RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return e;
				}
			},
			Action.RETURN,	// [108] expression = procedure_expression
			Action.RETURN,	// [109] expression = variable_access
			Action.RETURN,	// [110] expression = literal
			new Action() {	// [111] literal = INTEGER_LIT.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final Integer e = (Integer) _symbol_e.value;
					 return new NodeLiteral(new TypeInt(), e);
				}
			},
			new Action() {	// [112] literal = STRING_LIT.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final String e = (String) _symbol_e.value;
					 return new NodeLiteral(new TypeString(), e);
				}
			},
			new Action() {	// [113] literal = TRUE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new NodeLiteral(new TypeBoolean(), true);
				}
			},
			new Action() {	// [114] literal = FALSE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new NodeLiteral(new TypeBoolean(), false);
				}
			},
			new Action() {	// [115] literal = NULL
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new NodeLiteral(new TypeVoid(), null);
				}
			}
		};

 
	report = new Events();
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
