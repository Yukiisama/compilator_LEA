package ubordeaux.deptinfo.compilation.project.main;

import java.io.FileReader;
import java.util.Iterator;

import ubordeaux.deptinfo.compilation.project.node.Node;
import ubordeaux.deptinfo.compilation.project.node.NodeList;

public class Main {
	private static boolean checksType;
	private static String error_type = new String("");
	public static void add_error_type(String error) {
		error_type += error + "\n"; 
	}

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
					System.out.println("Créer code intermédiaire");
					//result.generateIntermediateCode();
					
					System.err.println("*** Analyse syntaxique ok");
					if (checksType) {
						
						if (!result.checksType() || error_type.compareTo("")!=0) {
							System.err.println("*** Erreur de typage (add_by_student) ");
						}
						else if (!result.checksType()) {
							System.err.println("*** Erreur de typage");
						}
						else {
							System.err.println("*** Typage correct");
							result.generateIntermediateCode();
						}
						}
					
				} catch (beaver.Parser.Exception e) {
					System.err.println("*** Erreur de syntaxe: " + arg + ":" + e.getMessage());
				}
			}

		}
		if(checksType==true)
			if(error_type !=null) 
				System.err.format(error_type );
			
			
		
	}
}