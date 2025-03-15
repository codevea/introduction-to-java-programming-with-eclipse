
public class Employe {

	private String nom;
	private double salaire;

	// Contructeur d'initialisation :
	public Employe(String pNom, double pSalaire) {

		nom = pNom;
		salaire = pSalaire;
	}

	public String getNom() {

		return nom;
	}

	public double getSalaire() {

		return salaire;
	}

	@Override
	public String toString() {

		return "Employe [nom=" + nom + ", salaire=" + salaire + "]";
	}

}
