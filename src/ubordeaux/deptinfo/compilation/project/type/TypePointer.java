package ubordeaux.deptinfo.compilation.project.type;

public class TypePointer extends TypeComplex {

	public TypePointer(Type t) {
		super(t);
	}

	public TypePointer() {
		super();
	}

	@Override
	public Type clone() {
		if (get(0)!=null)
			return new TypePointer((Type) get(0).clone());
		else
			return new TypePointer(null);
	}

	@Override
	public boolean attestWellFormed() {
		if (!this.get(0).attestWellFormed())
			return false;
		return true;
	}

}
