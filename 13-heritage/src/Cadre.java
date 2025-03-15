
public class Cadre extends Employe {

	private double prime;

	public Cadre(String pNom, double pSalaire, double pPrime) {

		super(pNom, pSalaire);
		prime = pPrime;
	}

	public double getPrime() {

		return prime;
	}

	@Override
	public double getSalaire() {

		return super.getSalaire() + prime;
	}

	@Override
	public String toString() {

		return "Cadre [nom=" + super.getNom() + ", salaire =" + this.getSalaire() + "]";
	}

}
