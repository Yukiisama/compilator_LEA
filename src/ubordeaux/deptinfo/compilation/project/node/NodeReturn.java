package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Eseq;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Move;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Name;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Temp;
import ubordeaux.deptinfo.compilation.project.intermediateCode.TempValue;

public final class NodeReturn extends NodeStm {

	public NodeReturn(NodeExp e) {
		super(e);
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}

	@Override
	public NodeReturn clone() {
		return new NodeReturn((NodeExp) get(0).clone());
	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeReturn failed on generateIntermediateCode");
			return;
		}
		
		NodeExp ret = (NodeExp) this.get(0);
		ret.generateIntermediateCode();
		
		this.stm = new Move(new Temp(new TempValue()),ret.getExp());
		
		//Il aurait pu considérer que l'expression que l'on a en paramètre est un Eseq
		//On aurait alors récupérer :
		//	-un stm équivalent au Label de retour.
		//	-un exp équivalent à la valeur de retour.
		//Ensuite, on aurait construit un Seq avec pour fils droit un Move vers un Temp
		//et pour fils gauche un Jump vers un le Label de retour. 
	}

}
