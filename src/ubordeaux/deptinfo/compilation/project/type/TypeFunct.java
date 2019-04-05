	package ubordeaux.deptinfo.compilation.project.type;

// Type fonction arg -> ret
public class TypeFunct extends TypeComplex {

	private boolean defined;
	private String name;

	public TypeFunct(String name, TypeTuple params, Type ret) {
		super(params, ret);
		this.name = name;
	}

	public TypeTuple getParams(){
		return (TypeTuple) get(0);
	}
	
	public Type getRet(){
		return get(1);
	}
	
	public void setRet(Type type){
		super.set(1, type);
	}
	
	@Override
	public boolean attestWellFormed() {
		return true;
	}

	@Override
	public String toString() {
		return getParams() + " -> " + getRet() + " Defined: " + defined + " Name: " + name;
	}

	@Override
	public boolean equals(Type obj) {
		if (!(obj instanceof TypeFunct))
			return false;
		TypeFunct real_t = (TypeFunct) obj;
		return this.getParams().equals(real_t.getParams()) && this.getRet().equals(real_t.getRet());
	}

	@Override
	public TypeFunct clone() {
		TypeFunct result = new TypeFunct(this.name, this.getParams().clone(), (Type) this.getRet().clone());
		result.setDefined(defined);
		return result;
	}

	public void setDefined(boolean defined) {
		this.defined = defined;
	}

	public boolean getDefined() {
		return this.defined;
	}

	public String getName() {
		return this.name;
	}

}
