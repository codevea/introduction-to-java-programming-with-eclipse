import java.util.Scanner;

public class Principale08 {

	public static void main(String[] args) {
		int n = 1;
		String motDePasse = new String(); // Création d'un objet String
		motDePasse = "";

		Scanner clavier = new Scanner(System.in);

		while (motDePasse.equals("SeSaMe") == false && n < 4) {
			System.out.println("Entrer le mot de passe : "); // Saisie du mot de passe.
			motDePasse = clavier.next();
			n++; // Incrémentation du compteur d'essais.
		}

		if (motDePasse.equals("SeSaMe")) {
			System.out.print("Merci. Vous pouvez entrer");
		} else {
			System.out.print("L'alarme va être déclenchée !");
		}

		clavier.close();
	}

}
