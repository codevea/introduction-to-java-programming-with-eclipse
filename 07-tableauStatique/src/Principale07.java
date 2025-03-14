import java.util.Scanner;

public class Principale07 {

	public static void main(String[] args) {

		// Déclaration des variables.
		int nombreAnnees = 0, i = 0;
		double tauxInteret = 0, capitalInitial = 0, capitalFinal = 0;

		// Enregistrement des valeurs tapées par l'utilisateur
		System.out.print("Quel est le montant du capital à placer (en €) ? ");
		// Création d'un objet de la classe Scanner nommé clavier.
		Scanner clavier = new Scanner(System.in);
		capitalInitial = clavier.nextDouble();
		System.out.print("Combien d'années le capital va-t-il être placé ? ");
		nombreAnnees = clavier.nextInt();
		System.out.print("Quel est le taux d'intérêt du placement ? ");
		tauxInteret = clavier.nextDouble();

		capitalFinal = capitalInitial;

		// Tableau
		double tabInterets[] = new double[nombreAnnees];

		// Boucle for
		for (i = 0; i < tabInterets.length; i++) {
			capitalFinal = (1 + tauxInteret / 100) * capitalFinal;
			tabInterets[i] = capitalFinal - capitalInitial;
			System.out.print("Les intérêts aquis au bout de " + (i + 1) + " an(s) sont de ");
			System.out.printf("%6.2f", tabInterets[i]);
			System.out.println(" €. ");
		}
		// Libération de la mémoire réservée à l'objet clavier.
		clavier.close();
	}
}
