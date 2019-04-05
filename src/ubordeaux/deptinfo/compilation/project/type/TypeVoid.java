package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

public class TypeVoid extends TypeAtomic {

	@Override
	public ClonableSymbol clone() {
		return new TypeVoid();
	}

}
