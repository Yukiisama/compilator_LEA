package ubordeaux.deptinfo.compilation.project.type;

public abstract class TypeRange extends TypeAtomic {

	protected Type first;
	protected Type last;

	public TypeRange(Type min, Type max) {
		super();
		this.first = min;
		this.last = max;
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
