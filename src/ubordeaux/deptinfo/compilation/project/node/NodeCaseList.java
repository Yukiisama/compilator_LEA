package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Call;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Name;
import ubordeaux.deptinfo.compilation.project.intermediateCode.StmList;

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
	
	public void add(Node elt) {
		if(elt.size()<2) {
			this.elts.add(elt);
		}
		else {
			for(int i = 0; i<elt.size(); i++)
				this.elts.add(elt.get(i));
		}
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
		
		//Genère le code intermédiaire des noeuds fils.
		for (int i = 0; i<this.size(); i++) {
			this.get(i).generateIntermediateCode();
			System.out.println("3333333 fils CaseList" +this.get(i));
		}
		
	}
}
