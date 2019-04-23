package ubordeaux.deptinfo.compilation.project.node;

public final class NodeSwitch extends NodeStm {

	public NodeSwitch(Node e, Node stm) {
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
		return new NodeSwitch((Node) this.getExp().clone(), (Node) this.clone());
	}


	private Node getExp() {
		return this.get(0);
	}

}
