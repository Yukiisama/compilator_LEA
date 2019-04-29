package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Const extends Exp {
	private int value;

	public Const(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "Const ( " + this.value + " )";
	}
	
	

}
