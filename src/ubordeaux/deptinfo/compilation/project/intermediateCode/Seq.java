package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Seq extends Stm {
	private Stm left, right;

	public Seq(Stm left, Stm right) {
		super();
		this.left = left;
		this.right = right;
	}
	
	public void addR(Stm stm) {
		this.right = stm;
	}

	@Override
	public String toString() {
		return "Seq ( " + left.toString() + ", " + right.toString() + " )";
	}
	
	

}
