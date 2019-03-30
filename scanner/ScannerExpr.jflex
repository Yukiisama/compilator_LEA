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

Identifier = [a-zA-Z_][a-zA-Z0-9_]*
Integer = [0-9]+
Decimal = ({Integer}(\.{Integer})?)|(\.{Integer})
Float = [+-]{Decimal}([eE][+-]?{Integer})?

UFunction = sin|sqrt|round
BFunction = min|max|pow

%%

"+" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.PLUS, yyline, yycolumn); }
"-" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.MINUS, yyline, yycolumn); }
"*" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.TIMES, yyline, yycolumn); }
"/" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.DIV, yyline, yycolumn); }
"(" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.LPAR, yyline, yycolumn); }
")" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.RPAR, yyline, yycolumn); }
{UFunction}		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.UFCT, yyline, yycolumn, yytext()); }
{BFunction}		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.BFCT, yyline, yycolumn, yytext()); }
"=" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.EQ, yyline, yycolumn); }
"," 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.COMMA, yyline, yycolumn); }
";" 	        { System.out.println("*** " + yytext()); return new Symbol(Terminals.SEMI, yyline, yycolumn); }

{Integer}		{ System.out.println("*** " + yytext()); return new Symbol(Terminals.INTEGER, yyline, yycolumn, new Integer(yytext())); }
{Float}			{ System.out.println("*** " + yytext()); return new Symbol(Terminals.FLOAT, yyline, yycolumn, new Double(yytext())); }
{Identifier}	{ System.out.println("*** " + yytext()); return new Symbol(Terminals.ID, yyline, yycolumn, yytext()); }

[^]|\n		{ }
