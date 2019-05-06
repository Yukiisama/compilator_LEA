package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Cjump;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Const;
import ubordeaux.deptinfo.compilation.project.intermediateCode.ExpStm;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Jump;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Label;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Relop;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Seq;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Stm;

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
			System.out.println("NodeIf fai\n" + 
					"									led on generateIntermediateCode");
			return;
		}
		
		//Genère le code intermédiaire des noeuds fils.
		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();
		
		//Label T
		LabelLocation t = new LabelLocation();
		Label labelT =  new Label(t);
		//Label F
		LabelLocation f = new LabelLocation();
		Label labelF = new Label(f);
		//Cjump 
		Cjump c1 =  new Cjump(Relop.NE, ((NodeExp)this.get(0)).getExp(), new Const (0), t, f);
		//Then stm
		//NodeStm stmT = (NodeStm) this.getThenNode();
		
		Stm stmT;
		if(NodeExp.class.isAssignableFrom(this.getThenNode().getClass())) {
			stmT = new ExpStm (((NodeExp)this.getThenNode()).getExp());
		}else {
			stmT = ((NodeStm)this.getThenNode()).getStm();
		}
		if(getElseNode()!=null) {
			//label end
			LabelLocation end = new LabelLocation();
			//Jump end
			Jump jmpEnd = new Jump(end);
			//Seq T
			Seq seqT = new Seq(labelT,stmT);
			//Seq F
			Stm stmF;
			if(NodeExp.class.isAssignableFrom(this.getElseNode().getClass())) {
				stmF = new ExpStm (((NodeExp)this.getElseNode()).getExp());
			}else {
				stmF = ((NodeStm)this.getElseNode()).getStm();
			}
			Seq seqF = new Seq(labelF,stmF);
			//seq4
			Seq seq4 = new Seq(seqT,jmpEnd);
			//seq4
			Seq seq5 = new Seq(seqF,jmpEnd);
			//seq3
			Seq seq3 = new Seq(seq4,seq5);

			//seq2
			Seq seq2 = new Seq(c1,seq3);
			
			super.stm = new Seq(seq2,new Label(end));
		}else {
			super.stm = new Seq (
					c1,
					new Seq(
							new Seq(
									labelT,
									stmT),
							labelF)
					);
		}
		System.out.println(super.stm.toString());
	}

}
