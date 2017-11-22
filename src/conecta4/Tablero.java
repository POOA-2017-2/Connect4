package conecta4;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tablero {

	private BufferedImage tablero;
	private Conecta4 conecta; //temporal para prueba
	
	public Tablero(Conecta4 conecta) {
		// TODO Auto-generated constructor stub
		tablero = Recursos.tablero;		//Recibe la imagen del tablero que esta en recursos
	}
	
	/*metodo para dibujar el tablero*/
	public void render(Graphics g) {
		g.drawImage(tablero, 0, 0, null);
		//g.dispose();
	}

	public BufferedImage getTablero() {
		return tablero;
	}

	public void setTablero(BufferedImage tablero) {
		this.tablero = tablero;
	}
	
	

}
