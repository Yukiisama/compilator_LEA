package ubordeaux.deptinfo.compilation.project.type;

import ubordeaux.deptinfo.compilation.project.main.ClonableSymbol;

// Expression de type
public abstract class Type extends ClonableSymbol implements Comparable<Type>, TypeInterface {

	// Atteste que le type est bien form'e
	public abstract boolean attestWellFormed();
	
	// Affiche dans un format lisible
	public String toString() {
	System.err.println("*** " + this.getClass().getSimpleName() + ".clone() return null");
	return null;
	}

	// teste l'égalité entre deux expressions de type
	public abstract boolean equals(Type obj);

	// Applique une substitution à une expression de type
	public abstract Type mapping(Subst subst);

	/*
	 * Algorithme d’unification: Soit A et B deux expressions de type \theta est le
	 * mgcu de A et B:
	 *
	 * \theta = \epsilon
	 * 
	 * Tant que \sigma = Diff(\theta(A), \theta(B)) n'est pas vide faire
	 * 
	 * \theta = \sigma \circ \theta
	 * 
	 * Fin faire
	 * 
	 * Si \sigma est vide, alors \theta est le mgcu sinon A et B ne sont pas
	 * unifiables
	 * 
	 * Remarque: On ne vérifie pas qu'une différence est acceptable, mais seulement qu'elle est non vide
	 *  En cas de boucle (parce que A (resp. B) contiendrait B (resp. A)), on sort de la boucle
	 */
	public boolean unifyWith(Subst result, Type obj) {
		//System.err.println("unif: " + this + " et " + obj);
		Subst theta = new Subst();
		Type a = this;
		Type b = obj;
		Subst sigma;
		while(true) {
			a = a.mapping(theta);
			b = b.mapping(theta);
			//System.err.println("a: " + a);
			//System.err.println("b: " + b);
			sigma = a.diff(b);
			if (sigma == null)
				return false;
			if (sigma.isEmpty())
				break;
			int oldSize = theta.size();
			theta = theta.add(sigma);
			//System.err.println("theta: " + theta);
			if (theta.size()==oldSize)
				break;
		} 
		if (sigma.isEmpty()) {
			result.setMap(theta.getMap());
			return true;
		}
		return false;
	}

	/*
	 * Définition: Une différence Diff(A, B) où A et B sont deux expressions de type
	 * est
	 * 
	 * - \emptyset si A = B
	 * 
	 * - Diff (f, f’) U Diff(t1, t1’) U … U Diff(tk, tk’) si A = f(t1, … ,tk) et B=
	 * f’(t1', … ,tk’) on simplifie en disant f=f'
	 * 
	 * - {{A,B}} dans les autres cas
	 * 
	 */
	private Subst diff(Type obj) {
		Subst result = new Subst();
		if (this instanceof TypeTemplate)
			result.add(((TypeTemplate)this).getName(), obj);
		else if (obj instanceof TypeTemplate)
			result.add(((TypeTemplate)obj).getName(), this);
		else if ((this instanceof TypeComplex) 
				&& (obj instanceof TypeComplex) 
				&& (this.getClass() == obj.getClass())
				&& ((TypeComplex) this).size() == ((TypeComplex) obj).size()) {
			for (int i = 0; i < ((TypeComplex) this).size(); ++i) {
				Subst subst = ((TypeComplex)this).get(i).diff(((TypeComplex)obj).get(i));
				if (subst != null)
					result.add(subst);
				else
					return null;
			}
		} 
		else if ((this instanceof TypeAtomic) && (obj instanceof TypeAtomic) && (this.equals(obj))) {
			// nothing
		}
		else {
			System.err.println("Erreur d'unification: " + this + " différent de  " + obj);
			return null;
		}
		return result;

	}

	@Override
	public int compareTo(Type o) {
		// TODO Auto-generated method stub
		System.err.println("TODO: " + this.getClass().getSimpleName() + ".compareTo(Type o)");
		return 0;
	}

	@Override
	public ClonableSymbol clone() {
		// TODO Auto-generated method stub
		System.err.println("TODO: " + this.getClass().getSimpleName() + ".clone()");
		return null;
	}

}
