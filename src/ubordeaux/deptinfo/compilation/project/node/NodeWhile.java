package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Cjump;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Relop;

public final class NodeWhile extends NodeStm {

	public NodeWhile(Node boolExpr, Node stm) {
		super(boolExpr, stm);
	}

	@Override
	public boolean checksType() {
		super.checksType();
		if (!get(0).checksType())
			return false;
		if (!get(1).checksType())
			return false;
		return true;
	}

	@Override
	public NodeWhile clone() {
		return new NodeWhile((Node) this.getExp().clone(), (Node) this.clone());
	}

	private Node getExp() {
		return this.get(0);
	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeWhile failed on generateIntermediateCode");
			return;
		}

		NodeRel rel = (NodeRel) getExp();
		int rel_val=-1;
		if(rel.getName() == "&&")
			rel_val = Relop.AND;
		if(rel.getName() == "||")
			rel_val = Relop.OR;
		if(rel.getName() == "<")
			rel_val = Relop.LT;
		if(rel.getName() == "<=")
			rel_val = Relop.LE;
		if(rel.getName() == ">")
			rel_val = Relop.GT;
		if(rel.getName() == ">=")
			rel_val = Relop.GE;
		if(rel.getName() == "==")
			rel_val = Relop.EQ;
		if(rel.getName() == "!=")
			rel_val = Relop.NE;
		if(rel.getName() == "!")
			rel_val = Relop.NOT;
		LabelLocation t = new LabelLocation();
		LabelLocation f = new LabelLocation();
		super.stm= new Cjump(rel_val, rel.getOp1().getExp(), rel.getOp2().getExp(), t, f);

	}

}
