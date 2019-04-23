package ubordeaux.deptinfo.compilation.project.node;

public final class NodeCase extends NodeStm {

	private String nameValue;
	private boolean defaultValue;
	
	public NodeCase(String nameValue, Node stm) {
		super(stm);
		this.nameValue = nameValue;
		this.defaultValue = false;
	}

	public NodeCase(Node stm) {
		this(null, stm);
		this.defaultValue = true;
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}

	@Override
	public NodeCase clone() {
		return new NodeCase(nameValue, (Node) this.clone());
	}



	public boolean isDefaultValue() {
		return defaultValue;
	}
	public String tostring() {
		String x ="";
		x+=nameValue;
		return x;

	}

}
