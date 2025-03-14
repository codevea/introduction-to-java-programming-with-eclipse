// importation de l'outil Scanner
import java.util.Scanner;

public class Principale02 {

	public static void main(String[] args) {
		
		// Déclaration des variables :
		int  diviseur;
		double dividende, quotient;
		
		// Création d'un objet de la classe Scanner nommé clavier.
		Scanner clavier = new Scanner(System.in);
		// Enregistrement des valeurs tapées par l'utilisateur :
		System.out.print("Entrer le dividende : ");
		// Enregistrement d'un nombre décimal tapé au clavier.
		dividende = clavier.nextDouble();
		System.out.print("Entrer le diviseur : ");
		// Enregistrement d'un nombre entier tapé au clavier.
		diviseur = clavier.nextInt();
		
		
		// Calcul du quotient :
		quotient = dividende / diviseur;
		
		// Affichage du résultat dans la console :
		System.out.print("le quotient de la division est : " + quotient);
		// Libération de la mémoire réservée à l'objet clavier.
		clavier.close();
	}
}
