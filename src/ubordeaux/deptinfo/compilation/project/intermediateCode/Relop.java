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
		String srelop="";
		switch (relop) {
		case EQ:
			srelop=""+"EQ";
			break;
		case NE:
			srelop=""+"NE";
			break;
		case LT:
			srelop=""+"LT";
			break;
		case GE:
			srelop=""+"GE";
			break;
		case GT:
			srelop=""+"GT";
			break;
		case LE:
			srelop=""+"LE";
			break;
		case ULT:
			srelop=""+"ULT";
			break;
		case UGE:
			srelop=""+"UGE";
			break;
		case UGT:
			srelop=""+"UGT";
			break;
		case ULE:
			srelop=""+"ULE";
			break;
		case AND:
			srelop=""+"AND";
			break;
		case OR:
			srelop=""+"OR";
			break;
		case NOT:
			srelop=""+"NOT";
			break;
		default:
			srelop="" +"bad relop in Relop";
			break;
		}
		return "Relop ( "+srelop +", " + left.toString() + ", " +right.toString() + " )";
	}

}
