package ubordeaux.deptinfo.compilation.project.intermediateCode;

//Comme Eseq mais extends Stm
public class ExpStm extends Stm {
	private Stm stm;
	private Exp exp;

	public ExpStm(Stm stm, Exp exp) {
		super();
		this.stm = stm;
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return "ExpStm ( " + this.stm.toString() + ", " + this.exp.toString() + " )";
	}

}
