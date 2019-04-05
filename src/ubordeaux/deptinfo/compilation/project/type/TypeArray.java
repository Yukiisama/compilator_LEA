package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

public class TypeArray extends TypeComplex {

	public TypeArray(Type t1, Type t2) {
		super(t1, t2);
	}

	@Override
	public boolean attestWellFormed() {
		if (!this.getRangeOREnum().attestWellFormed())
			return false;
		if (!this.getType().attestWellFormed())
			return false;
		return true;
	}

	public TypeRange getRangeOREnum() {
		return (TypeRange) this.get(0);
	}

	private Type getType() {
		return this.get(1);
	}

	@Override
	public ClonableSymbol clone() {
		Type result = new TypeArray((Type) this.get(0).clone(), (Type) this.get(1).clone());
		return result;
	}

}
