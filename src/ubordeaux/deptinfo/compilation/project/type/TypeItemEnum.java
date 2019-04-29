package ubordeaux.deptinfo.compilation.project.type;

public class TypeItemEnum extends TypeAtomic {

	private Integer const_value;
	private String refEnumRange;
	private String Enum_name = "";
	

	public TypeItemEnum(int value, String refEnumRange,String Enum_name) {
		super();
		this.const_value = value;
		this.refEnumRange = refEnumRange;
		this.Enum_name = Enum_name;
	}
	public TypeItemEnum(int value, String refEnumRange) {
		super();
		this.const_value = value;
		this.refEnumRange = refEnumRange;
		this.Enum_name = Enum_name; // i.e empty ""

	}
	@Override
	public TypeItemEnum clone() {
		return new TypeItemEnum(const_value, refEnumRange,Enum_name);
	}

	public Integer getValue() {
		return this.const_value;
	}

	@Override
	public String toString() {
		return super.toString() + '@' + this.refEnumRange + '=' + const_value + " nom :" + Enum_name;
	}

	@Override
	public boolean attestWellFormed() {
		return true;
	}

	public Integer getConst_value() {
		return this.const_value;
	}

	@Override
	public boolean equals(Type obj) {
		if (!super.equals(obj))
			return false;
		else
		if (const_value != ((TypeItemEnum)obj).const_value)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Type o) {
		if (o instanceof TypeItemEnum) {
			TypeItemEnum real_object = (TypeItemEnum) o;
			return const_value.compareTo(real_object.const_value);
		}
		return 0;
	}
	
	public String getRefEnumRange() {
		return refEnumRange;
	}

	public void setRefEnumRange(String refEnumRange) {
		this.refEnumRange = refEnumRange;
	}

	public String getEnum_name() {
		return Enum_name;
	}

	public void setEnum_name(String enum_name) {
		Enum_name = enum_name;
	}
	
	

}
