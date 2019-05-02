package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.type.TypeRange;
import ubordeaux.deptinfo.compilation.project.type.TypeString;
import ubordeaux.deptinfo.compilation.project.type.TypeItemEnum;
import ubordeaux.deptinfo.compilation.project.type.TypePointer;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Binop;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Const;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Eseq;
import ubordeaux.deptinfo.compilation.project.intermediateCode.ExpStm;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Mem;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Move;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Temp;
import ubordeaux.deptinfo.compilation.project.intermediateCode.TempValue;
import ubordeaux.deptinfo.compilation.project.main.Main;
import ubordeaux.deptinfo.compilation.project.type.Type;
import ubordeaux.deptinfo.compilation.project.type.TypeArray;
import ubordeaux.deptinfo.compilation.project.type.TypeBoolean;
import ubordeaux.deptinfo.compilation.project.type.TypeComplex;
import ubordeaux.deptinfo.compilation.project.type.TypeInt;

public final class NodeArrayAccess extends NodeExp {

	// t [i]
	public NodeArrayAccess(NodeExp t, NodeExp i) {
		super(t, i);
		if(t.type instanceof TypeComplex) {
		if ((t!=null) && (((TypeComplex) t.type).size() == 2))
			type = ((TypeComplex) t.type).get(1);
		}
	
		}
		

	@Override
	public boolean checksType() {
		super.checksType();
		TypeArray typeArray = (TypeArray)((NodeExp)this.get(0)).getType();
		TypeRange typeRangeOREnum = typeArray.getRangeOREnum();
		Type typeArg = ((NodeExp)get(1)).getType();

		// Si l'index n'est pas du type attendu 
		if (typeArg.getClass() != typeRangeOREnum.getFirst().getClass()) {
			System.err.println("type de l'index incorrect");
			return false;
		}
		// Si l'index est un enum, mais pas le bon
		if ((typeArg instanceof TypeItemEnum)
				&& ((TypeItemEnum) typeArg).getRefEnumRange()  != ((TypeItemEnum) typeRangeOREnum.getFirst()).getRefEnumRange()) {
			System.err.println("type de l'index incorrect");
			return false;
		}		
		// Si la valeur constante de l'index depasse
		if ((typeArg.compareTo(typeRangeOREnum.getFirst()) < 0) 
			|| (typeArg.compareTo(((TypeRange) typeRangeOREnum).getLast()) > 0)) {
			System.err.println("index constant hors tableau");
			return false;
		}			
		return true;
	}

	@Override
	public NodeArrayAccess clone() {
		return new NodeArrayAccess((NodeExp) get(0).clone(), (NodeExp) get(1).clone());
	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeArrayAcces failed on generateIntermediateCode");
			return;
		}
		
		//Generer les codes intermédiaires pour ses fils.
		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();
		
		
		int eltSize = 0;
		if(this.getType() instanceof TypeInt) eltSize = 4;
		if(this.getType() instanceof TypeBoolean) eltSize = 1;
		if(this.getType() instanceof TypeString) eltSize = 64;
		if(this.getType() instanceof TypePointer) eltSize = 4;
		
		super.exp = new Mem(
				new Binop(Binop.PLUS, 
						((NodeExp) this.get(0)).getExp(), 
						new Binop (Binop.MUL,
								new Const (eltSize), 
								((NodeExp) this.get(0)).getExp())));
		
		System.out.println("NodeArrayAcces => " + super.exp.toString());
	}

}
