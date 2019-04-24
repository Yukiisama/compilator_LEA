package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Relop extends Exp {
	private int relop;
	private Exp left, right;

	public Relop(int op, Exp l, Exp r) {
		super();
		relop = op;
		left = l;
		right = r;
	}

	public final static int EQ = 0, NE = 1, LT = 2, GT = 3, LE = 4, GE = 5, ULT = 6, ULE = 7, UGT = 8, UGE = 9, AND = 10, OR = 11, NOT = 12;

	public String toString() {
		String result = new String();
		return result;
	}

}
