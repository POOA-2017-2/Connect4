package conecta4;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Presentacion extends JPanel {

	/*Clase que va dibujar un panel que es la primera pantalla de juego (bienvenida o algo asi)*/
	public Presentacion() {

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image imagen = new ImageIcon(Presentacion.class.getResource("/img/conecta4.png")).getImage();
		int x=getWidth()/2 - imagen.getWidth(this)/2;
		int y=getHeight()/2 - imagen.getHeight(this)/2;
		g.drawImage(imagen, x, y, this);
	}

}
