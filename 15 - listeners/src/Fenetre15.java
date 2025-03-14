import javax.swing.JFrame;

public class Fenetre15 extends JFrame {

	ConteneurFenetre15 pan;

	public Fenetre15() {
		
		super(); // peut-être facultatif
		proprietesFenetre();
	}

	private void proprietesFenetre() {

		this.setSize(400, 300); // Taille de la fenêtre
		this.setResizable(false); // Empêche le redimensionnement.
		this.setLocationRelativeTo(null); // Centre la fenêtre.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme le programme
		this.setAlwaysOnTop(true); // Permet à la fenêtre de rester toujours au-dessus.

		pan = new ConteneurFenetre15();
		this.setContentPane(pan);
	}
}
