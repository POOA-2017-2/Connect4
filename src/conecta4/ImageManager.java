package conecta4;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageManager {
	//clase de prueba. elimininar si de igual manera no se pinta el tablero
	public ImageManager() {
		// TODO Auto-generated constructor stub
		
	}
	public static BufferedImage cargaImagen(String path) {
		try {
			return ImageIO.read(ImageManager.class.getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
