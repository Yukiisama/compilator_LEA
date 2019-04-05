package ubordeaux.deptinfo.compilation.project.intermediateCode;

public interface IntermediateCode {

	// Pour un affichage lisible
	public String toString();
	
	// Transforme l'arbre pour éliminer les ESEQ locaux
	public void canonicalTransformation();
	
}
