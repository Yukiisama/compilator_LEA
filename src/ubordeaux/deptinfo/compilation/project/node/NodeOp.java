package ubordeaux.deptinfo.compilation.project.node;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Binop;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Const;


public class NodeOp extends NodeExp {

	protected String name;

	// Opération binaire
	// f : E X F -> F
	public NodeOp(String name, NodeExp op1, NodeExp op2) {
		super(op1, op2);
		this.name = name;
		// le type d'un opérateur 
		// On regarde le type du premier paramètre pour savoir le type du NodeExp 
		// (le type du résultat de l'opération).
		NodeExp exprFct = (NodeExp) this.get(1);
		type = exprFct.type;
	}

	public NodeOp(String name, NodeExp op) {
		super(op);
		this.name = name;
		// le type d'un opérateur 
		NodeExp exprFct = (NodeExp) this.get(0);
		type = exprFct.type;
	}

	@Override
	public boolean checksType() {
		super.checksType();
		if ((super.size() > 1) && getOp2()!=null && !this.getOp1().getType().equals(this.getOp2().getType()))
			return false;
		return true;
	}

	private NodeExp getOp1() {
		return (NodeExp) this.get(0);
	};

	private NodeExp getOp2() {
		return (NodeExp) this.get(1);
	}

	@Override
	public NodeOp clone() {
		if (this.size()==1)
			return new NodeOp(name, (NodeExp) getOp1().clone());
		else if (this.size()==2)
			return new NodeOp(name, (NodeExp) getOp1().clone(), (NodeExp) getOp2().clone());
		return null;
	};
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeOp failed on generateIntermediateCode");
			return;
		}

		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();

		if(this.name == "+")
			super.exp = new Binop(Binop.PLUS,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == "-") {
			if(this.size()<2) {
				super.exp = new Binop(Binop.MINUS,new Const(0),this.getOp1().getExp());
			}else {
				super.exp = new Binop(Binop.MINUS,this.getOp1().getExp(),this.getOp2().getExp());
			}
		}
			
		if(this.name == "*")
			super.exp = new Binop(Binop.MUL,this.getOp1().getExp(),this.getOp2().getExp());
		if(this.name == "/")
			super.exp = new Binop(Binop.DIV,this.getOp1().getExp(),this.getOp2().getExp());
		
		System.out.println(super.exp.toString());
	}

}
