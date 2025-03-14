import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConteneurFenetre extends JPanel {

	// Etiquette
	private JLabel etiquette;
	private JButton button;
	private JTextField champTexte;
	// Image
	private JLabel imageLbl;
	private ImageIcon iconPhoto;

	public ConteneurFenetre() {

		super(); // peut-être facultatif.
		this.proprietesConteneur();
	}

	private void proprietesConteneur() {

		this.setLayout(null); // On n'utilise aucun gestionnaire de disposition (positionnement absolu).
		this.propEtiquette();
		this.propButton();
		this.propchampTexte();
		this.afficheImage();

	}

	private void propEtiquette() {

		etiquette = new JLabel();
		this.etiquette.setBounds(20, 20, 350, 20);
		this.etiquette.setText("Texte de l'étiquette");
		this.add(etiquette); // Permet d’ajouter l’étiquette au conteneur.
	}

	private void propButton() {

		button = new JButton();
		this.button.setBounds(30, 50, 90, 20);
		this.button.setText("Appuyer");
		this.add(button);
	}

	private void propchampTexte() {

		champTexte = new JTextField();
		this.champTexte.setBounds(130, 50, 100, 20);
		this.add(champTexte);

	}

	private void afficheImage() {

		imageLbl = new JLabel();
		iconPhoto = new ImageIcon("images/boutonderose.gif");
		this.imageLbl.setBounds(100, 100, 64, 64);
		this.imageLbl.setIcon(iconPhoto); // On intègre l’image à son conteneur.
		this.add(imageLbl);

	}

}
