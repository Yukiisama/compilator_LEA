package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Cjump;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Relop;

public final class NodeIf extends NodeStm {

	public NodeIf(Node boolExp, Node stm) {
		super(boolExp, stm);
	}

	public NodeIf(Node e, Node stm1, Node stm2) {
		super(e, stm1, stm2);
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}

	@Override
	public NodeIf clone() {
		Node expNode = this.getExpNode();
		Node thenNode = this.getThenNode();
		Node elseNode = this.getElseNode();
		if (elseNode == null)
			return new NodeIf((Node) expNode.clone(), (Node) thenNode.clone());
		else
			return new NodeIf((Node) expNode, (Node) thenNode.clone(), (Node) elseNode.clone());
	}

	private Node getExpNode() {
		return this.get(0);
	}

	private Node getElseNode() {
		if (this.size() == 3)
			return this.get(2);
		else
			return null;
	}

	private Node getThenNode() {
		return this.get(1);
	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeIf failed on generateIntermediateCode");
			return;
		}

		NodeRel rel = (NodeRel) getExpNode();
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
