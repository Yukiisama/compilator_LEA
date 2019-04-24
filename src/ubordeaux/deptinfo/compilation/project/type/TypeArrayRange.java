package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

public class TypeArrayRange extends TypeRange {
	private boolean from_enum = false;
	public TypeArrayRange(Type min, Type max) {
		super(min, max);
	}

	@Override
	public boolean attestWellFormed() {
		if (getLast() instanceof TypeInt) {
			if (!(getFirst() instanceof TypeInt))
				return false;
			if (((TypeInt) getFirst()).getConst_value() >= ((TypeInt) getLast()).getConst_value())
				return false;
		} else if (getLast() instanceof TypeItemEnum) {
			if (!(getFirst() instanceof TypeItemEnum))
				return false;
			if (!((TypeItemEnum) getFirst()).getRefEnumRange().equals(((TypeItemEnum) getLast()).getRefEnumRange()))
				return false;
			if (((TypeItemEnum) getFirst()).getConst_value() >= ((TypeItemEnum) getLast()).getConst_value())
				return false;
		}
		return true;
	}

	@Override
	public ClonableSymbol clone() {
		TypeArrayRange nw = new TypeArrayRange((Type) first.clone(), (Type) last.clone());
		nw.setFrom_enum(from_enum);
		return nw;
	}

	public boolean getFrom_enum() {
		return from_enum;
	}

	public void setFrom_enum(boolean from_enum) {
		this.from_enum = from_enum;
	}
	
}
