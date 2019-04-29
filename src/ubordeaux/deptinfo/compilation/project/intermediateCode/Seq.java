package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Seq extends Stm {
	private Stm left, right;

	public Seq(Stm left, Stm right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "Seq ( " + left.toString() + ", " + right.toString() + " )";
	}
	
	

}
