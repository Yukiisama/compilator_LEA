package ubordeaux.deptinfo.compilation.project.node;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Exp;

import ubordeaux.deptinfo.compilation.project.type.Type;

public abstract class NodeExp extends Node {

	protected Type type;
	protected Exp exp;

	public NodeExp(Node... abstTrees) {
		super(abstTrees);
	}

	public Type getType() {
		return this.type;
	}
	
	public Exp getExp() {
		return this.exp;
	}

}
