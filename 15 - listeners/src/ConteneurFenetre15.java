import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; // Touche du clavier
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConteneurFenetre15 extends JPanel implements ActionListener, MouseListener, KeyListener {

	// Etiquette
	private JLabel etiquette;
	private JButton button;
	private JTextField champTexte;
	// Image
	private JLabel imageLbl;
	private ImageIcon iconPhoto;

	public ConteneurFenetre15() {

		super(); // peut-être facultatif.
		this.proprietesConteneur();
	}

	private void proprietesConteneur() {

		this.setLayout(null); // On n'utilise aucun gestionnaire de disposition (positionnement absolu).
		this.propEtiquette();
		this.propButton();
		this.propchampTexte();
		this.afficheImage();
		this.addMouseListener(this); // Permet au conteneur de réagir au clic de la souris.
		this.addKeyListener(this);
		
		// Focus
		this.setFocusable(true);
		this.requestFocusInWindow();
	}

	private void propEtiquette() {

		etiquette = new JLabel();
		this.etiquette.setBounds(20, 20, 350, 20);
		this.etiquette.setText("Texte de l'étiquette 15");
		this.add(etiquette); // Permet d’ajouter l’étiquette au conteneur.
	}

	private void propButton() {

		button = new JButton();
		this.button.setBounds(30, 50, 90, 20);
		this.button.setText("Appuyer");
		this.add(button);
		this.button.addActionListener(this);
	}

	private void propchampTexte() {

		champTexte = new JTextField();
		this.champTexte.setBounds(130, 50, 100, 20);
		this.add(champTexte);
		this.champTexte.addActionListener(this);
	}

	private void afficheImage() {

		imageLbl = new JLabel();
		iconPhoto = new ImageIcon("images/boutonderose.gif");
		this.imageLbl.setBounds(100, 100, 64, 64);
		this.imageLbl.setIcon(iconPhoto); // On intègre l’image à son conteneur.
		this.add(imageLbl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.button) {

			this.etiquette.setText("On à cliqué sur le bouton !");

		} else if (e.getSource() == this.champTexte) {

			this.etiquette.setText(this.champTexte.getText());
		}
		this.requestFocusInWindow();
	}

	@Override
	public void mouseReleased(MouseEvent e) { // Relâcher le bouton gauche déclenche une action.

		// Déplace l’image à l’endroit où l’on a cliqué avec la souris.
		// Récupère la position de l’image (l’abscisse où l’on a cliqué : e.getX(),
		// l’ordonnée où l’on a cliqué : e.getY()).
		// Récupération de l’image et de sa hauteur et largeur :
		// (this.imageLbl.getWidth(), this.imageLbl.getHeight()).
		this.imageLbl.setBounds(e.getX(), e.getY(), this.imageLbl.getWidth(), this.imageLbl.getHeight());

		// Affiche la position du clic de la souris.
		this.etiquette.setText("Position de la souris : " + e.getX() + ", " + e.getY());
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	
		// Attention au focus !
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			
			this.imageLbl.setBounds(this.imageLbl.getX(), this.imageLbl.getY()-10,  this.imageLbl.getWidth(), this.imageLbl.getHeight());
			
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			
			this.imageLbl.setBounds(this.imageLbl.getX(), this.imageLbl.getY()+10,  this.imageLbl.getWidth(), this.imageLbl.getHeight());
			
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			
			this.imageLbl.setBounds(this.imageLbl.getX()-10, this.imageLbl.getY(),  this.imageLbl.getWidth(), this.imageLbl.getHeight());
			
		} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			this.imageLbl.setBounds(this.imageLbl.getX()+10, this.imageLbl.getY(),  this.imageLbl.getWidth(), this.imageLbl.getHeight());
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
