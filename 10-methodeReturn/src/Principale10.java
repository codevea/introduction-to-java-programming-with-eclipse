import java.util.Scanner;

public class Principale10 {

	static double calculePrixSolde(double prixArticle, double tauxSolde) {

		double prixSolde;
		prixSolde = (1 - tauxSolde / 100) * prixArticle;
		return prixSolde;
	}

	public static void main(String[] args) {

		double tauxSolde = 0;
		double prixArticle = 0;

		Scanner clavier = new Scanner(System.in);

		System.out.println("Pour saisir un décimal au clavier, on utilise la virgule.");
		System.out.print("Entrer le prix de l'article non soldé : ");
		prixArticle = clavier.nextDouble();
		System.out.print("Entrer le pourcentage de réduction : ");
		tauxSolde = clavier.nextDouble();
		clavier.close();

		System.out.println("Le prix de l'article soldé est : " + calculePrixSolde(prixArticle, tauxSolde) + " €.");
	}
}
