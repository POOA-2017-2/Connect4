package conecta4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import testing.Escenario;
import javax.swing.border.LineBorder;

/*Panel para dibujar el tablero donde se estara jugando.
 * CardLayout del Juego*/

public class Tablero extends JPanel {

	private BufferedImage roja;
	private BufferedImage amarilla;
	private JLabel fichaAmarilla;
	private JLabel fichaRoja;
	
	/*
	 * COORDENADAS DE LOS ESPACIOS
	 * *******ULTIMA FILA********
	 * 			y=107 			*
	 * PRIMERA COLUMNA: x=21;	*
	 * SEGUNDA COLUMNA: x=91;	*
	 * TERCERA COLUMNA: x=161;	*
	 * CUARTA COLUMNA: x=231;	*
	 * QUINTA COLUMNA: x=301;	*
	 * SEXTA COLUMNA: x=371;	*
	 * SEPTIMA COLUMNA: x=441;	*
	 * **************************
	 * 
	 * 
	 * */
	
	public Tablero() {
		setLayout(null);
		setBackground(new Color(47, 79, 79));
		
		//ESTO SOLO SIRVE PARA ASIGNAR LA IMAGEN AL OBJETO DEL TIPO BUFFEREDIMAGE
		try {
			roja = ImageIO.read(getClass().getResourceAsStream("/img/token_1.png"));
			amarilla = ImageIO.read(getClass().getResourceAsStream("/img/token_0.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();
		
		//Pinta las fichas
		/*
		fichaAmarilla = new JLabel();
		fichaAmarilla.setIcon(new ImageIcon(Escenario.class.getResource("/img/token_0.png")));
		fichaAmarilla.setOpaque(false);
		fichaAmarilla.setBounds(115, 86, 60, 60);
		add(fichaAmarilla);
		*/
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new LineBorder(new Color(255, 215, 0)));
		FlowLayout flowLayout = (FlowLayout) panelBotones.getLayout();
		flowLayout.setAlignOnBaseline(true);
		flowLayout.setHgap(28);
		panelBotones.setBounds(0, 0, 550, 35);
		panelBotones.setBackground(new Color(47, 79, 79));
		add(panelBotones);
		
		JButton btnUno = new JButton("1");
		panelBotones.add(btnUno);
		
		JButton btnDos = new JButton("2");
		panelBotones.add(btnDos);
		
		JButton btnTres = new JButton("3");
		panelBotones.add(btnTres);
		
		JButton btnCuatro = new JButton("4");
		panelBotones.add(btnCuatro);
		
		JButton btnCinco = new JButton("5");
		panelBotones.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		panelBotones.add(btnSeis);
		
		JButton btnSiete = new JButton("7");
		panelBotones.add(btnSiete);
		
	}
	
	public void paintComponent(Graphics g) {
		/*Metodo que pinta el Tablero*/
		
		super.paintComponent(g);
		
		//PINTA LAS FICHAS PRIMERO
		//FICHAS DE MUESTRA
		g.drawImage(roja, 21, 37, roja.getWidth(), roja.getHeight(), null);
		g.drawImage(amarilla, 91, 37, amarilla.getWidth(), amarilla.getHeight(), null);
		g.drawImage(roja, 161, 37, roja.getWidth(), roja.getHeight(), null);
		g.drawImage(amarilla, 231, 37, amarilla.getWidth(), amarilla.getHeight(), null);
		g.drawImage(roja, 301, 37, roja.getWidth(), roja.getHeight(), null);
		g.drawImage(amarilla, 371, 37, amarilla.getWidth(), amarilla.getHeight(), null);
		g.drawImage(roja, 441, 37, roja.getWidth(), roja.getHeight(), null);
		
		//TABLERO DESPUES
		Image imagen=new ImageIcon(Escenario.class.getResource("/img/4inARowBG.png")).getImage();
		int x=getWidth()/2 - imagen.getWidth(this)/2;
		int y=getHeight()/1 - imagen.getHeight(this)/1;
		g.drawImage(imagen, x, y, this);
	}

}
