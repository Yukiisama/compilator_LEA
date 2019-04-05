package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

public class TypeFeatureList extends TypeComplex {

	public TypeFeatureList(Type t) {
		super(t);
	}

	@Override
	public boolean attestWellFormed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClonableSymbol clone() {
		return new TypeFeatureList((Type)this.get(0).clone());
	}

}
