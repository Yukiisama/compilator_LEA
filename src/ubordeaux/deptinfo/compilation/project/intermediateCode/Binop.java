package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Binop extends Exp {
	private int binop;
	private Exp left, right;

	public Binop(int b, Exp l, Exp r) {
		super();
		binop = b;
		left = l;
		right = r;
	}

	public final static int PLUS = 0, MINUS = 1, MUL = 2, DIV = 3, AND = 4, OR = 5, SUP = 6, INF = 7, EQ = 8,
			INF_OR_EQ = 9, NOT = 10, SUP_OR_EQ = 11, DIFF = 12;

	public String toString() {
		String result = new String();
		return result;
	}

}
