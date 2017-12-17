package conecta4;

import java.awt.image.BufferedImage;

public class Ficha {

	private BufferedImage Color;
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int jugador;
	
	
	
	public Ficha(BufferedImage color, int x, int y, int ancho, int alto, int jugador) {
		Color = color;
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.jugador = jugador;
	}

	public BufferedImage getColor() {
		return Color;
	}

	public void setColor(BufferedImage color) {
		Color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getJugador() {
		return jugador;
	}

	public void setJugador(int jugador) {
		this.jugador = jugador;
	}
	
}
