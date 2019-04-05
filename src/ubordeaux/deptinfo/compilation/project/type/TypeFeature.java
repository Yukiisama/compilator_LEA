package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

public class TypeFeature extends TypeComplex {

	private String name;

	public TypeFeature(String name, Type t) {
		super(t);
		this.name = name;
	}

	@Override
	public boolean attestWellFormed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClonableSymbol clone() {
		return new TypeFeature(this.name, (Type)this.get(0).clone());
	}

	@Override
	public String toString() {
		String ret = '[' + name + ':';
		for (Type elt : this.componant) {
			ret += elt.toString();
		}
		ret += ']';
		return ret;
	}

	public Type getType() {
		return this.componant.get(0);
	}

	public String getName() {
		return name;
	}

}
