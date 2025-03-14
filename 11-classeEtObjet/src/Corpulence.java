
public class Corpulence {

	// Variables d'instance :
	private int taille;
	private int poids;

	/**
	 * Constructeur par défaut
	 */
	public Corpulence() {
		
		taille = 0;
		poids = 0;
	}

	/**
	 * Constructeur avec paramètres
	 * 
	 * @param pTaille
	 * @param pPoids
	 */
	public Corpulence(int pTaille, int pPoids) {
		
		taille = pTaille;
		poids = pPoids;
	}

	// GETTERS

	public int getTaille() {
		
		return taille;
	}

	public int getPoids() {
		
		return poids;
	}

	// SETTER

	public void setTaille(int pTaille) {
		
		if (pTaille >= 0) {
			taille = pTaille;
		} else {
			System.out.print("La valeur proposée est incorrecte.");
		}
	}

	public void setPoids(int pPoids) {
		
		if (pPoids >= 0) {
			poids = pPoids;
		} else {
			System.out.print("La valeur proposée est incorrecte.");
		}
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
