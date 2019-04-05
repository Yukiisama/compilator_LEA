package ubordeaux.deptinfo.compilation.project.type;

import java.util.Vector;

// Tout type qui compose d'autres types
public abstract class TypeComplex extends Type {

	protected Vector<Type> componant;

	public TypeComplex() {
		super();
		this.componant = new Vector<Type>();
	}

	public TypeComplex(Vector<Type> componant) {
		super();
		this.componant = componant;
	}

	public TypeComplex(Type... ts) {
		this();
		addAll(ts);
	}

	public void add(Type t) {
		this.componant.add(t);
	}

	public void addAll(Type... ts) {
		for (Type t : ts)
			this.componant.add(t);
	}

	public Type get(int n) {
		return componant.get(n);
	}

	@Override
	public boolean equals(Type obj) {
		// System.out.println("EQ" + this + " = " + obj);
		if (this.getClass() != obj.getClass())
			return false;
		if (!(obj instanceof TypeComplex))
			return false;
		TypeComplex real_t = (TypeComplex) obj;
		if (componant.size() != real_t.componant.size())
			return false;
		for (int i = 0; i < componant.size(); ++i)
			if (!componant.get(i).equals(real_t.componant.get(i)))
				return false;
		return true;
	}

	public int size() {
		return componant.size();
	}

	@Override
	public Type mapping(Subst subst) {
		Vector<Type> clone = new Vector<Type>();
		for (Type t : componant)
			clone.add(t.mapping(subst));
		componant = clone;
		return this;
	}

	@Override
	public String toString() {
		String ret = this.getClass().getSimpleName();
		if (this.componant.size() > 0)
			ret += '(';
		boolean first = true;
		for (Type elt : this.componant) {
			if (first)
				first = false;
			else
				ret += ", ";
			ret += elt.toString();
		}
		if (this.componant.size() > 0)
			ret += ')';
		return ret;
	}

	public void set(int i, Type type) {
		this.componant.set(i, type);
	}

}
