import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ConteneurFenetre17 extends JPanel implements ActionListener {

	Timer chrono = new Timer(10, this);
	int dx = 0;

	public ConteneurFenetre17() {

		super();
		chrono.start();
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// peindre la fenetre
		g.setColor(Color.PINK);
		g.fillRect(0, 0, 400, 300);
		// Peindre le rectangle
		g.setColor(Color.BLUE);
		g.fillRect(10 + dx, 10, 20, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		dx = dx + 1;
		repaint();
	}
}
