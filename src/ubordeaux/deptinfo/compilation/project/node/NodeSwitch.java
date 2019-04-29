package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.ExpStm;

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
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeSwitch failed on generateIntermediateCode");
			return;
		}
		//Generer les codes intermédiaires pour ses fils.
		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();
		
		super.stm = new ExpStm(this.getNodeStm().getStm(), this.getNodeExp().getExp());
		
	
	}
	
}
