package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Cjump extends Stm {
	private int relop;
	private Exp left, right;
	private LabelLocation iftrue, iffalse;

	public Cjump(int relop, Exp left, Exp right, LabelLocation iftrue, LabelLocation iffalse) {
		super();
		this.relop = relop;
		this.left = left;
		this.right = right;
		this.iftrue = iftrue;
		this.iffalse = iffalse;
	}

	public final static int EQ = 0, NE = 1, LT = 2, GT = 3, LE = 4, GE = 5, ULT = 6, ULE = 7, UGT = 8, UGE = 9, AND = 10, OR = 11, NOT = 12;

	public static int notRel(int relop) {
		switch (relop) {
		case EQ:
			return NE;
		case NE:
			return EQ;
		case LT:
			return GE;
		case GE:
			return LT;
		case GT:
			return LE;
		case LE:
			return GT;
		case ULT:
			return UGE;
		case UGE:
			return ULT;
		case UGT:
			return ULE;
		case ULE:
			return UGT;
		default:
			throw new Error("bad relop in CJUMP.notRel");
		}
	}

	@Override
	public String toString() {
		String srelop="";
		switch (relop) {
		case EQ:
			srelop=""+"EQ";
		case NE:
			srelop=""+"NE";
		case LT:
			srelop=""+"LT";
		case GE:
			srelop=""+"GE";
		case GT:
			srelop=""+"GT";
		case LE:
			srelop=""+"LE";
		case ULT:
			srelop=""+"ULT";
		case UGE:
			srelop=""+"UGE";
		case UGT:
			srelop=""+"UGT";
		case ULE:
			srelop=""+"ULE";
		case AND:
			srelop=""+"AND";
		case OR:
			srelop=""+"OR";
		case NOT:
			srelop=""+"NOT";
		default:
			srelop="" +"bad relop in CJUMP";
		}
		if(left==null) {
			System.out.println("LEFT IS NULL"+left.toString());
		}
		if(right==null) {
			System.out.println("RIGHT IS NULL"+right.toString());
		}
		//return "Cjump ( "+srelop +", " + left.toString() + ", " +right.toString() + ", "
		//		+ iftrue.toString() + ", " + iffalse.toString() + " )";
		return "Cjump";
	}
	
	
}
