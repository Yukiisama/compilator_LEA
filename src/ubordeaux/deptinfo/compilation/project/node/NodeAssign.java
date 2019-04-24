package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Move;
import ubordeaux.deptinfo.compilation.project.type.Type;

public final class NodeAssign extends NodeStm {

	public NodeAssign(NodeExp lhs, NodeExp rhs) {
		super(lhs, rhs);
		
	}

	@Override
	public boolean checksType() {
		super.checksType();
		if (!get(0).checksType())
			return false;
		if (!get(1).checksType())
			return false;
		Type lhsType = this.getLhs().getType();
		Type rhsType = this.getRhs().getType();
		if (lhsType == null || rhsType == null || !lhsType.equals(rhsType))
			return false;
		else
			return true;
	}

	private NodeExp getLhs() {
		return (NodeExp) this.get(0);
	};

	private NodeExp getRhs() {
		return (NodeExp) this.get(1);
	}

	@Override
	public NodeAssign clone() {
		return new NodeAssign((NodeExp) getLhs().clone(), (NodeExp) getRhs().clone());
	};
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeAssign failed on generateIntermediateCode");
			return;
		}

		//Genère le code intermédiaire des noeuds fils.
		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();
		
		super.stm = new Move(this.getLhs().getExp(),this.getRhs().getExp());
	}

}
