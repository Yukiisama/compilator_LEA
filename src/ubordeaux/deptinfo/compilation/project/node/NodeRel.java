package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Relop;
import ubordeaux.deptinfo.compilation.project.type.TypeBoolean;
import ubordeaux.deptinfo.compilation.project.type.TypeInt;

public class NodeRel extends NodeExp {

	protected String name;

	// Relation binaire
	// f : E X F -> {0,1}
	public NodeRel(String name, Node op1, Node op2) {
		super(op1, op2);
		this.name = name;
		this.type = new TypeBoolean();
	}

	@Override
	public boolean checksType() {
		super.checksType();
		if ((!(this.getOp1().getType() instanceof TypeInt)) || (!(this.getOp2().getType() instanceof TypeInt)))
			return false;
		return true;
	}

	public NodeExp getOp1() {
		return (NodeExp) this.get(0);
	};

	public NodeExp getOp2() {
		return (NodeExp) this.get(1);
	}
	

	public String getName() {
		return name;
	}

	@Override
	public NodeRel clone() {
		return new NodeRel(name, (Node) getOp1().clone(), (Node) getOp2().clone());
	};
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeRel failed on generateIntermediateCode");
			return;
		}

		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();

		if(this.name == "&&")
			super.exp = new Relop(Relop.AND,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == "||")
			super.exp = new Relop(Relop.OR,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == "<")
			super.exp = new Relop(Relop.LT,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == "<=")
			super.exp = new Relop(Relop.LE,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == ">")
			super.exp = new Relop(Relop.GT,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == ">=")
			super.exp = new Relop(Relop.GE,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == "==")
			super.exp = new Relop(Relop.EQ,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == "!=")
			super.exp = new Relop(Relop.NE,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == "!")
			super.exp = new Relop(Relop.NOT,this.getOp1().getExp(),this.getOp2().getExp());
	}
}
