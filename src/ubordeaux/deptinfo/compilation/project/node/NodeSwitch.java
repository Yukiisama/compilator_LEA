package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.ExpStm;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Relop;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Stm;

public final class NodeSwitch extends NodeStm {

	public NodeSwitch(NodeExp e, Node stm) {
		super(e, stm);
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
	public NodeSwitch clone() {
		return new NodeSwitch((NodeExp) this.getNodeExp().clone(), (Node) this.clone());
	}

	//On a modifie le type de retour en NodeExp et le nom de la fonction en getNodeExp
	private NodeExp getNodeExp() {
		return (NodeExp)this.get(0);
	}
	private NodeStm getNodeStm() {
		return (NodeStm)this.get(1);
	}
	
	public Node switchCreate (int index) {
		NodeCase c = (NodeCase) this.get(1).get(index);
		System.out.println("========+++++++++>>>>> "+c.get(0)+" cristiano "+this.get(0));
		if(index==this.get(1).size()-1) {
			System.out.println("========+++++++++>>>>> "+c.get(0));
			return c.get(0);
		}
		index = index+1;
		return new NodeIf(
					new NodeRel(
							"==",//,
							new NodeId(c.getNameValue(),this.getNodeExp().getType()),
							this.get(0)),
					c.get(0),
					switchCreate(index));
		

	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeSwitch failed on generateIntermediateCode");
			return;
		}
		//Generer les codes intermédiaires pour ses fils.
		System.out.println("3333333 fils Switch size" +this.size());
		for (int i = 0; i<this.size(); i++) {
			System.out.println("3333333 fils Switch " +this.get(i));
			this.get(i).generateIntermediateCode();
		}
			
			
		NodeStm sw = (NodeStm) switchCreate(0);
		System.out.println("sw ========================" + sw);
		sw.generateIntermediateCode();
		
		super.stm = sw.getStm();
		
		//System.out.println(super.stm.toString());
	}
	
}
