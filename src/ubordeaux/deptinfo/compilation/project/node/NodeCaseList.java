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

	@Override
	public NodeCaseList clone() {
		return new NodeCaseList();
	}

	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeCaseList failed on generateIntermediateCode");
			return;
		}
		
		//On va stocker les cases dans une StmList.
		StmList cases = new StmList(null, null);
		//On commence par le dernier élément, on rajoute petit à petit càd en tête de la liste.
		for(int i = this.size()-1; i>=0; i--) {
			NodeStm stm = (NodeStm) this.get(0);
			stm.generateIntermediateCode();//Genère le code intermédiaire des noeuds fils.
			cases.add(stm.getStm());
		}
		
		super.stm = cases;
		
		System.out.println(super.stm.toString());
	}
}
