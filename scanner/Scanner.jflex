import beaver.Symbol;
import beaver.Scanner;

%%

%class Scanner
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	System.out.println(yytext()); return new Symbol(Terminals.EOF);
%eofval}
%unicode
%line
%column

Identifier = [a-zA-Z_][a-zA-Z0-9_]*
Integer = [0-9]+
Decimal = ({Integer}(\.{Integer})?)|(\.{Integer})
Float = [+-]{Decimal}([eE][+-]?{Integer})?

%%

"begin"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.BEGIN, yyline, yycolumn); }
"end"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.END, yyline, yycolumn); }

//TYPES
"type"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.TYPE, yyline, yycolumn); }
"string"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.STR, yyline, yycolumn, yytext()); }
"integer"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.INT, yyline, yycolumn, new Integer(yytext())); }
"boolean"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.BOOL, yyline, yycolumn, new Boolean(yytext())); }

//
".."			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DOUBLE_DOT, yyline, yycolumn); }
"array"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.ARRAY, yyline, yycolumn); }
"of"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.OF, yyline, yycolumn); }
"^"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.CIRCUMFLEX, yyline, yycolumn); }
"."				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.STRUCT, yyline, yycolumn); }
":"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.COLON, yyline, yycolumn); }
"procedure"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.PROCEDURE, yyline, yycolumn); }

"function"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.FUNCTION, yyline, yycolumn); }

{Integer}		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.INTEGER, yyline, yycolumn); }
{Identifier}	{ System.out.println("*** " + yytext()); return new Symbol(Terminals.STRING, yyline, yycolumn); }

//BRACKETS
"(" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.LPAR, yyline, yycolumn); }
")" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.RPAR, yyline, yycolumn); }
"{"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.LCURLY_BRACKET, yyline, yycolumn); }
"}"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.RCURLY_BRACKET, yyline, yycolumn); }
"["				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.LBRACKET, yyline, yycolumn); }
"]"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.RBRACKET, yyline, yycolumn); }

//
"Var"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.VAR, yyline, yycolumn); }
"New"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.NEW, yyline, yycolumn); }
"Dispose"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DISPOSE, yyline, yycolumn); }
"println"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.PRINTLN, yyline, yycolumn); }
"readln"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.READLN, yyline, yycolumn); }
"return"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.RETURN, yyline, yycolumn); }

//
"if"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.IF, yyline, yycolumn); }
"then"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.THEN, yyline, yycolumn); }
"else"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.ELSE, yyline, yycolumn); }
"while"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.WHILE, yyline, yycolumn); }
"do"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DO, yyline, yycolumn); }
"switch"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.SWITCH, yyline, yycolumn); }
"case"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.CASE, yyline, yycolumn); }
"default"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DEFAULT, yyline, yycolumn); }

//Operations
"+" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.PLUS, yyline, yycolumn); }
"-" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.MINUS, yyline, yycolumn); }
"*" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.TIMES, yyline, yycolumn); }
"/" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.DIV, yyline, yycolumn); }
"!"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.NOT, yyline, yycolumn); }
"||"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.OR, yyline, yycolumn); }
"&&"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.AND, yyline, yycolumn); }
"<"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.INFERIOR, yyline, yycolumn); }
"<="			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.INFERIOR_EQ, yyline, yycolumn); }
">"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.SUPERIOR, yyline, yycolumn); }
">="			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.SUPERIOR_EQ, yyline, yycolumn); }
"=="			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.EQUALS, yyline, yycolumn); }
"!="			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DIFF, yyline, yycolumn); }
"=" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.EQ, yyline, yycolumn); }
"," 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.COMMA, yyline, yycolumn); }
";" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.SEMI, yyline, yycolumn); }

"true"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.TRUE, yyline, yycolumn); }
"false"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.FALSE, yyline, yycolumn); }
"null"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.NULL, yyline, yycolumn); }

[^]|\n		{ }
