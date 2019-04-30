package ubordeaux.deptinfo.compilation.project.type;

public abstract class TypeRange extends TypeAtomic {

	protected Type first;
	protected Type last;
	private boolean range_type = false;

	public TypeRange(Type min, Type max) {
		super();
		this.first = min;
		this.last = max;
	}

	public boolean isRange_type() {
		return range_type;
	}
	
	public void setRange_type(boolean range_type) {
		this.range_type = range_type;
	}
	
	public Type getFirst() {
		return first;
	}

	public Type getLast() {
		return last;
	}

	@Override
	public String toString() {
		return super.toString() + '[' + first.toString() + ".." + last.toString() + ']';
	}

}
