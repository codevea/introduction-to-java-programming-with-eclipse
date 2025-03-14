public class Principale11 {

	public static void main(String[] args) {

		// Constructeur par défaut :
		Corpulence jean = new Corpulence();
		// Construteur avec paramètres : taille exprimée en cm/poids exprimé en kg.
		Corpulence pierre = new Corpulence(180, 85);

		System.out.println("Pierre : " + pierre.getPoids());
		jean.setTaille(190);
		System.out.println("Jean : " + jean.getTaille());
		System.out.println("Pierre : " + pierre.analyseImc());
	}
}
