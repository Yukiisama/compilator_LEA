package ubordeaux.deptinfo.compilation.project.node;
//Student : modify NodeExp to NodeStm
public final class NodeCaseList extends NodeStm {

	public NodeCaseList() {
		super();
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}

	@Override
	public NodeCaseList clone() {
		return new NodeCaseList();
	}

	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeCaseList failed on generateIntermediateCode");
			return;
		}
	
		
	}
}
