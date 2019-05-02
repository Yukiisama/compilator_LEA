package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Eseq;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Exp;
import ubordeaux.deptinfo.compilation.project.intermediateCode.ExpStm;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Label;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Mem;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Name;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Seq;

public final class NodeCase extends NodeStm {

	private String nameValue;
	private boolean defaultValue;
	
	public NodeCase(String nameValue, Node stm) {
		super(stm);
		this.nameValue = nameValue;
		this.defaultValue = false;
	}

	public NodeCase(Node stm) {
		this(null, stm);
		this.defaultValue = true;
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}

	@Override
	public NodeCase clone() {
		return new NodeCase(nameValue, (Node) this.clone());
	}

	public Exp getExpr() {
		LabelLocation c = new LabelLocation(this.getNameValue());
		return new Mem(new Name(c));
	}

	public boolean isDefaultValue() {
		return defaultValue;
	}
	
	public String getNameValue() {
		return nameValue;
	}
	
	public String tostring() {
		String x ="";
		x+=nameValue;
		return x;

	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeCase failed on generateIntermediateCode");
			return;
		}
		

		NodeStm stm_cast = (NodeStm) this.get(0);
		
		if(isDefaultValue()) {
			LabelLocation c = new LabelLocation(this.getNameValue());
			super.stm = new ExpStm(
					new Eseq(stm_cast.getStm(),
							new Mem(new Name(c))
							)
					);
		}else {
			LabelLocation c = new LabelLocation(nameValue);
			super.stm = new Seq(new Label(c), stm_cast.getStm());
		}
		System.out.println(super.stm.toString());
	}

}
