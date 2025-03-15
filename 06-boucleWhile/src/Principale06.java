import java.util.Scanner;

public class Principale06 {

	/**
	 * Un capital est placé durant n années à un taux annuel d'intérêts composés de
	 * t% Calculer combien d'années il faut pour obtenir un gain donné. Exercice :
	 * https://www.youtube.com/@MathMaurer
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Déclaration des variables
		int nombreAnnees = 0;
		double tauxInteret = 0, capitalInitial = 0, capitalFinal = 0, gain = 0;

		// Création d'un objet de la classe Scanner nommé clavier.
		Scanner clavier = new Scanner(System.in);

		// Enregistrement des valeurs tapées par l'utilisateur :
		System.out.print("Quel est le montant du capital à placer (en €) ? ");
		capitalInitial = clavier.nextDouble();
		System.out.print("Quel est le taux d'intérêt du placement ? ");
		tauxInteret = clavier.nextInt();
		System.out.print("Quel est le gain souhaité (en €) ? ");
		gain = clavier.nextDouble();

		capitalFinal = capitalInitial;

		// Boucle while
		while (capitalFinal - capitalInitial < gain) {
			nombreAnnees++;
			capitalFinal = (1 + tauxInteret / 100) * capitalFinal;
		}

		// Affichage du résultat dans la console :
		System.out.print("Le gain de ");
		System.out.printf("%6.0f", gain);
		System.out.printf(" € sera atteint au bout de " + nombreAnnees + " an(s).");

		// Libération de la mémoire réservée à l'objet clavier.
		clavier.close();
	}
}
