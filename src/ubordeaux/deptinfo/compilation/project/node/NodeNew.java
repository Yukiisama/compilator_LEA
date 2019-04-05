package ubordeaux.deptinfo.compilation.project.node;

public final class NodeNew extends Node {

	public NodeNew(Node stm) {
		super(stm);
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}

	@Override
	public NodeNew clone() {
		return new NodeNew((Node) this.get(0).clone());
	}

}
