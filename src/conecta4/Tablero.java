package conecta4;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*Panel para dibujar el tablero donde se estara jugando.
 * CardLayout del Juego*/

public class Tablero extends JPanel {

	private JLabel fichaAmarilla;
	private JLabel fichaRoja;
	
	public Tablero() {
		setLayout(null);
		
		//Pinta las fichas
		fichaAmarilla = new JLabel();
		fichaAmarilla.setIcon(new ImageIcon(Tablero.class.getResource("/img/token_0.png")));
		fichaAmarilla.setOpaque(true);
		fichaAmarilla.setBounds(10, 10, 60, 60);
		add(fichaAmarilla);
		
		fichaRoja = new JLabel();
		fichaRoja.setIcon(new ImageIcon(Tablero.class.getResource("/img/token_1.png")));
		fichaRoja.setOpaque(true);
		fichaRoja.setBounds(80, 10, 60, 60);
		add(fichaRoja);
		
	}
	
	public void paintComponent(Graphics g) {
		//Pinta Tablero
		super.paintComponent(g);
		Image imagen=new ImageIcon(Tablero.class.getResource("/img/4inARowBG.png")).getImage();
		int x=getWidth()/2 - imagen.getWidth(this)/2;
		int y=getHeight()/2 - imagen.getHeight(this)/2;
		g.drawImage(imagen, x, y, this);
	}

}
