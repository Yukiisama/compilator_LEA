package ubordeaux.deptinfo.compilation.project.main;

/**
 * This class lists terminals used by the
 * grammar specified in "ParserExpr.grammar".
 */
public class Terminals {
	static public final short EOF = 0;
	static public final short IDENTIFIER = 1;
	static public final short MINUS = 2;
	static public final short LPAR = 3;
	static public final short INTEGER_LIT = 4;
	static public final short NOT = 5;
	static public final short STRING_LIT = 6;
	static public final short TRUE = 7;
	static public final short FALSE = 8;
	static public final short NULL = 9;
	static public final short CIRCUMFLEX = 10;
	static public final short PLUS = 11;
	static public final short TIMES = 12;
	static public final short DIV = 13;
	static public final short AND = 14;
	static public final short OR = 15;
	static public final short INFERIOR = 16;
	static public final short INFERIOR_EQ = 17;
	static public final short SUPERIOR = 18;
	static public final short SUPERIOR_EQ = 19;
	static public final short EQUALS = 20;
	static public final short DIFF = 21;
	static public final short SEMI = 22;
	static public final short RPAR = 23;
	static public final short IF = 24;
	static public final short SWITCH = 25;
	static public final short NEW = 26;
	static public final short DISPOSE = 27;
	static public final short PRINT = 28;
	static public final short PRINTLN = 29;
	static public final short READLN = 30;
	static public final short RETURN = 31;
	static public final short WHILE = 32;
	static public final short ARRAY = 33;
	static public final short STRUCT = 34;
	static public final short STR = 35;
	static public final short INT = 36;
	static public final short BOOL = 37;
	static public final short COLON = 38;
	static public final short BEGIN = 39;
	static public final short LBRACKET = 40;
	static public final short RBRACKET = 41;
	static public final short COMMA = 42;
	static public final short END = 43;
	static public final short EQ = 44;
	static public final short FUNCTION = 45;
	static public final short PROCEDURE = 46;
	static public final short DOUBLE_DOT = 47;
	static public final short CASE = 48;
	static public final short DEFAULT = 49;
	static public final short VAR = 50;
	static public final short OF = 51;
	static public final short LCURLY_BRACKET = 52;
	static public final short RCURLY_BRACKET = 53;
	static public final short THEN = 54;
	static public final short ELSE = 55;
	static public final short DO = 56;
	static public final short TYPE = 57;

	static public final String[] NAMES = {
		"EOF",
		"IDENTIFIER",
		"MINUS",
		"LPAR",
		"INTEGER_LIT",
		"NOT",
		"STRING_LIT",
		"TRUE",
		"FALSE",
		"NULL",
		"CIRCUMFLEX",
		"PLUS",
		"TIMES",
		"DIV",
		"AND",
		"OR",
		"INFERIOR",
		"INFERIOR_EQ",
		"SUPERIOR",
		"SUPERIOR_EQ",
		"EQUALS",
		"DIFF",
		"SEMI",
		"RPAR",
		"IF",
		"SWITCH",
		"NEW",
		"DISPOSE",
		"PRINT",
		"PRINTLN",
		"READLN",
		"RETURN",
		"WHILE",
		"ARRAY",
		"STRUCT",
		"STR",
		"INT",
		"BOOL",
		"COLON",
		"BEGIN",
		"LBRACKET",
		"RBRACKET",
		"COMMA",
		"END",
		"EQ",
		"FUNCTION",
		"PROCEDURE",
		"DOUBLE_DOT",
		"CASE",
		"DEFAULT",
		"VAR",
		"OF",
		"LCURLY_BRACKET",
		"RCURLY_BRACKET",
		"THEN",
		"ELSE",
		"DO",
		"TYPE"
	};
}
