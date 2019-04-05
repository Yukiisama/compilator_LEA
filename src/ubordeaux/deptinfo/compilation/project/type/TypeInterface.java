package ubordeaux.deptinfo.compilation.project.type;

public interface TypeInterface {

	// Atteste que le type est bien formé
	public boolean attestWellFormed();
	
	// Affiche le type dans un format lisible
	public String toString();

	// teste l'égalité entre deux types
	public boolean equals(Type obj);

	// Réalise l'unification d'un type avec un autre.
	// La valeur de retour est fausse si l'unification échoue
	// et dans le cas contraire, le résultat se trouve dans result.
	// Cette méthode n'est pas utilisée dans le projet, mais peut l'être 
	// par la suite
	public boolean unifyWith(Subst result, Type obj);

}
