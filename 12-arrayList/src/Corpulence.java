public class Corpulence {

	// Variables d'instance :
	private String nom;
	private int taille;
	private int poids;

	/**
	 * Constructeur avec paramètres
	 * 
	 * @param pNom
	 * @param pTaille
	 * @param pPoids
	 */
	public Corpulence(String pNom, int pTaille, int pPoids) {

		nom = pNom;
		taille = pTaille;
		poids = pPoids;
	}

	public boolean equals(Corpulence objet) {

		if (objet.nom == this.nom && objet.taille == this.taille && objet.poids == this.poids) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {

		return "Corpulence [nom=" + nom + ", taille=" + taille + ", poids=" + poids + ", analyseImc()=" + analyseImc()
				+ "]";
	}

	// Méthode qui calcule l'imc de l'objet courant.
	private int calculImc() {

		int imc;

		if (poids <= 0 || taille <= 0) {
			imc = 0;
		} else {
			imc = (int) (10000 * poids / (double) (taille * taille));
		}
		return imc;
	}

	// Méthode qui analyse l'imc de l'objet courant.
	public String analyseImc() {

		int imc = this.calculImc();
		String str = new String();

		if (imc <= 16) {
			str = "Anorexie";
		} else if (imc >= 16 && imc < 20) {
			str = "Maigreur";
		} else if (imc >= 20 && imc < 26) {
			str = "Corpulence normale";
		} else if (imc >= 26 && imc < 30) {
			str = "Surpoids";
		} else {
			str = "Obésité";
		}
		return str;
	}
}
