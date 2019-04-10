package ubordeaux.deptinfo.compilation.project.main;
import beaver.Symbol;
import beaver.Scanner;

%%

%class ScannerExpr
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


Commentaire = \/\*[^*]*\*\/|\/\/.*
Identifier = [a-zA-Z_][a-zA-Z0-9_]*
Integer = [0-9]+
Hexadecimal = 0x[a-fA-F0-9]+
String = "\""~"\""


%%

"var"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.VAR, yyline, yycolumn); }
"begin"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.BEGIN, yyline, yycolumn); }
"end"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.END, yyline, yycolumn); }
"type"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.TYPE, yyline, yycolumn); }
"string"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.STR, yyline, yycolumn, yytext()); }
"integer"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.INT, yyline, yycolumn); }
"boolean"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.BOOL, yyline, yycolumn, new Boolean(yytext())); }

".."			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DOUBLE_DOT, yyline, yycolumn); }
"array"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.ARRAY, yyline, yycolumn); }
"of"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.OF, yyline, yycolumn); }
"^"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.CIRCUMFLEX, yyline, yycolumn); }
"."				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.STRUCT, yyline, yycolumn); }
":"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.COLON, yyline, yycolumn); }

"procedure"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.PROCEDURE, yyline, yycolumn); }
"function"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.FUNCTION, yyline, yycolumn); }

"(" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.LPAR, yyline, yycolumn); }
")" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.RPAR, yyline, yycolumn); }
"{"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.LCURLY_BRACKET, yyline, yycolumn); }
"}"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.RCURLY_BRACKET, yyline, yycolumn); }
"["				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.LBRACKET, yyline, yycolumn); }
"]"				{ System.out.println("*** " + yytext()); return new Symbol(Terminals.RBRACKET, yyline, yycolumn); }

"new"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.NEW, yyline, yycolumn); }
"dispose"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DISPOSE, yyline, yycolumn); }
"println"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.PRINTLN, yyline, yycolumn); }
"readln"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.READLN, yyline, yycolumn); }
"return"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.RETURN, yyline, yycolumn); }

"if"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.IF, yyline, yycolumn); }
"then"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.THEN, yyline, yycolumn); }
"else"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.ELSE, yyline, yycolumn); }
"while"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.WHILE, yyline, yycolumn); }
"do"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DO, yyline, yycolumn); }
"switch"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.SWITCH, yyline, yycolumn); }
"case"			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.CASE, yyline, yycolumn); }
"default"		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.DEFAULT, yyline, yycolumn); }

"+" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.PLUS, yyline, yycolumn); }
"-" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.MINUS, yyline, yycolumn); }
"*" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.TIMES, yyline, yycolumn); }

{Commentaire} 	{ System.out.println("COMMENTAIRE:"+yytext());}

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

{Hexadecimal} 	{ System.out.println("*** " + yytext()); return new Symbol(Terminals.INTEGER_LIT, yyline, yycolumn, Integer.parseInt(yytext().substring(2),16)); }
{Integer}		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.INTEGER_LIT, yyline, yycolumn, new Integer(yytext())); }
{Identifier}	{ System.out.println("*** " + yytext()); return new Symbol(Terminals.IDENTIFIER, yyline, yycolumn, yytext()); }
{String}		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.STRING_LIT, yyline, yycolumn, yytext()); }

[^]|\n		{ }
