package ubordeaux.deptinfo.compilation.project.node;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Stm;
import ubordeaux.deptinfo.compilation.project.type.Type;

public abstract class NodeStm extends Node {

	protected Type type;
	protected Stm stm;

	public NodeStm(Node... abstTrees) {
		super(abstTrees);
	}

	public Type getType() {
		return this.type;
	}
	
	public Stm getStm() {
		return this.stm;
	}

}
