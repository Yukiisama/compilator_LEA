package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

// Tout type non complexe non variable
public abstract class TypeAtomic extends Type {

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

	public boolean equals(Type obj) {
		return (this.getClass() == obj.getClass());
	}

	@Override
	public Type mapping(Subst subst) {
		return this;
	}

	@Override
	public boolean attestWellFormed() {
		return true;
	}

	@Override
	public abstract ClonableSymbol clone();
	
	

}
