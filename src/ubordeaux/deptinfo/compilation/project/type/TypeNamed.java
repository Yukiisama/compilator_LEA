package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

public class TypeNamed extends TypeAtomic {

	private String name;


	public TypeNamed(String name) {
		super();
		this.name = name;
	}

	@Override
	public ClonableSymbol clone() {
		return new TypeNamed(name);
	}
	
	@Override
	public String toString() {
		return super.toString() + '_' + name;
	}


}
