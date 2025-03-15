import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ConteneurFenetre16 extends JPanel {

	Color couleur1 = new Color(100, 200, 250); // Couleur RGB
	Font police1 = new Font("Arial", Font.BOLD, 20);

	ImageIcon icone = new ImageIcon("images/boutonderose.gif");
	Image image = icone.getImage();

	public ConteneurFenetre16() {

		super(); // peut-être facultatif.
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(couleur1);
		g.drawRect(10, 10, 200, 250);
		g.setColor(Color.GREEN);
		g.fillRect(20, 20, 180, 230);
		g.setColor(Color.MAGENTA);
		g.fillOval(40, 40, 100, 140);
		g.setColor(Color.BLACK);
		g.drawString("Dessin", 260, 50);
		g.drawImage(image, 260, 100, null);
	}

}
