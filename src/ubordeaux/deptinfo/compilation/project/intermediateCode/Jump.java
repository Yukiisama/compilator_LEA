package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Jump extends Stm {
	public Exp exp;
	public LabelLocationList targets;

	public Jump(Exp exp, LabelLocationList targets) {
		super();
		this.exp = exp;
		this.targets = targets;
	}

	public Jump(LabelLocation target) {
		this(new Name(target), new LabelLocationList(target, null));
	}
}
