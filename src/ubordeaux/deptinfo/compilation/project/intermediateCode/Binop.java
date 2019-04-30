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

	public final static int PLUS = 0, MINUS = 1, MUL = 2, DIV = 3, AND = 4, OR = 5, LSHIFT = 6, RSHIFT = 7, ARSHIFT = 8,
			XOR = 9;

	public String toString() {
		String BOP="";
		switch(binop) {
		case 0 :
			BOP ="PLUS";
			break;
		case 1:
			BOP="MINUS";
			break;
		case 2:
			BOP="MUL";
			break;
		case 3:
			BOP="DIV";
			break;
		case 4:
			BOP="AND";
			break;
		case 5:
			BOP="OR";
			break;
		case 6:
			BOP="LSHIFT";
			break;
		case 7:
			BOP="RSHIFT";
			break;
		case 8:
			BOP="ARSHIFT";
			break;
		case 9:
			BOP="XOR";
			break;
		default: break;
		}
		return "Binop(" + left.toString() +","+ BOP +","+ right.toString()+")";
	}
}
