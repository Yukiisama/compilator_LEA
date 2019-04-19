package ubordeaux.deptinfo.compilation.project.main;

import java.io.FileReader;

import ubordeaux.deptinfo.compilation.project.node.Node;

public class Main {
	private static boolean checksType;

	public static void main(String[] args) throws Exception {
		for (String arg : args) {
			if (arg.charAt(0) == '-') {
				if (arg.equals("-checkType"))
					checksType = true;
			} else {
				ScannerExpr input = new ScannerExpr(new FileReader(arg));
				ParserExpr parser = new ParserExpr();
				try {
					System.err.println("*** Fichier " + arg);
					Node result = (Node) parser.parse(input);
					System.out.println(result.toString());
					System.err.println("*** Analyse syntaxique ok");
					if (checksType) {
						if (!result.checksType())
							System.err.println("*** Erreur de typage");
						else
							System.err.println("*** Typage correct");
					}
				} catch (beaver.Parser.Exception e) {
					System.err.println("*** Erreur de syntaxe: " + arg + ":" + e.getMessage());
				}
			}

		}
	}
}