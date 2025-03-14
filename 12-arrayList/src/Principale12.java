import java.util.ArrayList;

public class Principale12 {

	public static void main(String[] args) {

		ArrayList<Corpulence> tbPatients = new ArrayList<Corpulence>();

		Corpulence patient01 = new Corpulence("Jean D", 180, 75);
		tbPatients.add(patient01);
		Corpulence patient02 = new Corpulence("Régis D", 170, 80);
		tbPatients.add(patient02);
		Corpulence patient03 = new Corpulence("Marie M", 160, 45);
		tbPatients.add(patient03);

		System.out.println("Affiche le tableau");
		System.out.println("------------------");
		for (int i = 0; i < tbPatients.size(); i++) {
			System.out.println(tbPatients.get(i).toString() + "\n");
		}

		// Ajout d'un élement dans le tableau
		Corpulence patient04 = new Corpulence("Régis D", 170, 80);
		tbPatients.add(patient04);

		System.out.println("Affiche le tableau (Ajout d'un élement dans le tableau)");
		System.out.println("------------------");
		for (int i = 0; i < tbPatients.size(); i++) {
			System.out.println(tbPatients.get(i).toString() + "\n");
		}

		// Suppresion d'un élement du tableau
		for (int i = 0; i < tbPatients.size(); i++) {
			if (patient04.equals(tbPatients.get(i)) == true) {
				tbPatients.remove(i);
			}
		}

		System.out.println("Affiche le tableau (Suppresion d'un élement du tableau)");
		System.out.println("------------------");
		for (int i = 0; i < tbPatients.size(); i++) {
			System.out.println(tbPatients.get(i).toString() + "\n");
		}
	}

}
