package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

public class TypeEnumRange extends TypeRange {

	private String name;
	private static int uniqName;
	private String list[];
	
	public TypeEnumRange(TypeItemEnum min, TypeItemEnum max) {
		super(min, max);
		this.name = Integer.toString(uniqName++);
		this.list = new String[(max.getValue()-min.getValue())+1];
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

	public String[] getList() {
		return list;
	}

	public void setList(String[] list) {
		this.list = list;
	}

	public String[] getListName(int i) {
		return list;
	}

	public void setListName(int i,String name) {
		this.list[i] = name;
	}
	
}
