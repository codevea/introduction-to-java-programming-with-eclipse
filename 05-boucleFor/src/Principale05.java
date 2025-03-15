import java.util.Scanner;

public class Principale05 {

	/**
	 * Un capital est placé durant n années à un taux annuel d'intérêts composés de
	 * t% Calculer les intérêts acquis au bout des n années. Exercice :
	 * https://www.youtube.com/@MathMaurer
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Déclaration des variables
		int nombreAnnees, i;
		double tauxInteret, capitalInitial, capitalFinal;

		// Création d'un objet de la classe Scanner nommé clavier.
		Scanner clavier = new Scanner(System.in);
		// Enregistrement des valeurs tapées par l'utilisateur :
		System.out.print("Quel est le montant du capital à placer (en €) ? ");
		capitalInitial = clavier.nextDouble();
		System.out.print("Combien d'années le capital va-t-il être placé ? ");
		nombreAnnees = clavier.nextInt();
		System.out.print("Quel est le taux d'intérêt du placement ? ");
		tauxInteret = clavier.nextDouble();

		capitalFinal = capitalInitial;

		// Boucle for
		for (i = 1; i <= nombreAnnees; i++) {
			capitalFinal = (1 + tauxInteret / 100) * capitalFinal;
		}

		// Affichage du résultat dans la console :
		System.out.print("Les intérêts acquis au bout de " + nombreAnnees + " an(s) sont de ");
		System.out.printf("%6.2f", capitalFinal - capitalInitial); // Formatage 8 chiffres dont 2 décimales.
		System.out.printf(" €");

		// Libération de la mémoire réservée à l'objet clavier.
		clavier.close();
	}
}
