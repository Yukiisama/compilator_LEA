package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Call;
import ubordeaux.deptinfo.compilation.project.intermediateCode.ExpList;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Name;
import ubordeaux.deptinfo.compilation.project.type.Type;

public final class NodeId extends NodeExp {

	protected String name;

	public NodeId(String name, Type type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String toString() {
		return this.getClass().getSimpleName() + "#" + name + ':' + type + '#';
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}

	protected String toDotNodeName() {
		return "NodeId " + name;
	}

	@Override
	public NodeId clone() {
		return new NodeId(name, type);
	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeCallFct failed on generateIntermediateCode");
			return;
		}
		
		LabelLocation label = new LabelLocation(this.name);
		super.exp = new Name(label);
	}
}
