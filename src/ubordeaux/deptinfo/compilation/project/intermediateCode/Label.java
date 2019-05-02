package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Label extends Stm {
	private LabelLocation label;

	public Label(LabelLocation label) {
		super();
		this.label = label;
	}

	@Override
	public String toString() {
		return "Label ( " + label.toString() + " )";
	}
	
	
}
