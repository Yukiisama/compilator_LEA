package ubordeaux.deptinfo.compilation.project.intermediateCode;

//import beaver.Symbol;

/**
 * A Label represents an address in assembly language.
 */

public class LabelLocation {
	private String name;
	private static int count;

	private LabelLocation(String name) {
		super();
		this.name = name;
	}

	/**
	 * Makes a new label with an arbitrary name.
	 */
	public LabelLocation() {
		this("L" + count++);
	}

	/**
	 * Makes a new label whose name is the same as a symbol.
	 */
	//public LabelLocation(Symbol s) {
//		this(s.toString());
//	}

	/**
	 * a printable representation of the label, for use in assembly language output.
	 */
	public String toString() {
		return name;
	}

}
