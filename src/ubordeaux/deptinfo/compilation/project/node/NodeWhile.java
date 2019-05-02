package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Cjump;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Jump;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Label;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Relop;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Seq;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Stm;
import ubordeaux.deptinfo.compilation.project.intermediateCode.StmList;

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
		
		
		System.out.println("CI : NodeWhile");
		//Genère le code intermédiaire des noeuds fils.
		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();
		
		
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
		//Seq T
		LabelLocation t = new LabelLocation();
		
		
		Stm stm = ((NodeList)this.get(1)).getStm();
	
		
		Seq seqT = new Seq(new Label(t),stm);
		//Label while
		LabelLocation label_while = new LabelLocation();
		Jump jmp_while = new Jump(label_while);
		//Seq jmp
		Seq seq_jmp = new Seq(seqT,jmp_while);
		//Seq F
		LabelLocation f = new LabelLocation();
		Seq seqF = new Seq(seq_jmp,new Label(f));
		//Seq Cjmp
		Cjump c = new Cjump(rel_val,rel.getOp1().getExp(), rel.getOp2().getExp(), t, f);
		Seq seq_Cjmp = new Seq(new Label(label_while),c);
		
		//Seq final
		super.stm = new Seq(seq_Cjmp,seqF);
		
		System.out.println("NodeWhile =>"+ super.stm.toString());
	}

}
