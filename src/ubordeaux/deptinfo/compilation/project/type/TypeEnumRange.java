package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

public class TypeEnumRange extends TypeRange {

	private String name;
	private static int uniqName;
	
	public TypeEnumRange(TypeItemEnum min, TypeItemEnum max) {
		super(min, max);
		this.name = Integer.toString(uniqName++);
	}

	public TypeEnumRange(String name, TypeItemEnum first, TypeItemEnum max) {
		super(first, max);
		this.name = name;
	}

	public TypeEnumRange() {
		super(null, null);
		this.name = Integer.toString(uniqName++);
	}

	public void setFirst(Type min) {
		this.first = min;
	}

	public void setLast(Type max) {
		this.last = max;
	}

	@Override
	public ClonableSymbol clone() {
		return new TypeEnumRange(name, (TypeItemEnum)first, (TypeItemEnum)last);
	}

	@Override
	public String toString() {
		return super.toString() + '_' + name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public boolean attestWellFormed() {
		if (((TypeItemEnum)this.getFirst()).getConst_value() >= ((TypeItemEnum)this.getLast()).getConst_value())
			return false;
		return true;
	}

}
