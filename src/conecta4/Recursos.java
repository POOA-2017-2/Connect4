package conecta4;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Recursos {

	public static BufferedImage tablero;
	public static BufferedImage amarilla;
	public static BufferedImage roja;
	
	public Recursos() {
		// TODO Auto-generated constructor stub
	}
	public static void init() {
		try {
			tablero = ImageIO.read(Recursos.class.getResource("/img/4inARowBG.png"));
			amarilla = ImageIO.read(Recursos.class.getResource("/img/token_0.png"));
			roja = ImageIO.read(Recursos.class.getResource("/img/token_1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//metodo provisional para prueba 
	public void render (Graphics g) {
		g.drawImage(tablero, 0, 0, null);
	}
	/*No se utilizara la clase de ImageManager ya que no se recortara ni se trabajara con sprites.
	 * La url de las imagenes se definen aqui y se mandan llamar en la clase -- */
}
