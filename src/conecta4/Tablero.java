package conecta4;

import java.awt.Color;
import java.awt.Component;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*Panel para dibujar el tablero donde se estara jugando.
 * CardLayout del Juego*/

public class Tablero extends JPanel {

	private BufferedImage roja;
	private BufferedImage amarilla;
	private BufferedImage ball;
	//private JLabel fichaAmarilla;
	//private JLabel fichaRoja;
	
	public Tablero() {
		setLayout(null);
		setBackground(new Color(47, 79, 79));
		
		//ESTO SOLO SIRVE PARA ASIGNAR LA IMAGEN AL OBJETO DEL TIPO BUFFEREDIMAGE
		try {
			roja = ImageIO.read(getClass().getResourceAsStream("/img/Red.png"));
			amarilla = ImageIO.read(getClass().getResourceAsStream("/img/Amarilla.png"));
			ball = ImageIO.read(getClass().getResourceAsStream("/img/ballnew.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new LineBorder(new Color(255, 215, 0)));
		FlowLayout flowLayout = (FlowLayout) panelBotones.getLayout();
		flowLayout.setVgap(6);
		flowLayout.setAlignOnBaseline(true);
		flowLayout.setHgap(26);
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
		
		//------------------------Fichas de muestra-------------------------------------
		JLabel lbl1 = new JLabel();
		lbl1.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
		lbl1.setOpaque(false);
		lbl1.setBounds(27, 42, 60, 60);
		add(lbl1);
		
		JLabel lbl2 = new JLabel();
		lbl2.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
		lbl2.setOpaque(false);
		lbl2.setBounds(97, 42, 60, 60);
		add(lbl2);
		
		JLabel lbl3 = new JLabel();
		lbl3.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
		lbl3.setOpaque(false);
		lbl3.setBounds(167, 42, 60, 60);
		add(lbl3);
		
		JLabel lbl4 = new JLabel();
		lbl4.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
		lbl4.setOpaque(false);
		lbl4.setBounds(237, 42, 60, 60);
		add(lbl4);
		
		JLabel lbl5 = new JLabel();
		lbl5.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
		lbl5.setOpaque(false);
		lbl5.setBounds(307, 42, 60, 60);
		add(lbl5);
		
		JLabel lbl6 = new JLabel();
		lbl6.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
		lbl6.setOpaque(false);
		lbl6.setBounds(377, 42, 60, 60);
		add(lbl6);
		
		JLabel lbl7 = new JLabel();
		lbl7.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
		lbl7.setOpaque(false);
		lbl7.setBounds(447, 42, 60, 60);
		add(lbl7);
		//ACCIONES DE LOS BOTONES
		/*Implementar que cuando sea el cambio de turno del jugador, las fichas de muestra cambien de color 
		al turno correspiente*/
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl1.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
				lbl2.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
				lbl3.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
				lbl4.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
				lbl5.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
				lbl6.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
				lbl7.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
			}
		});
		btnDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
				lbl2.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
				lbl3.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
				lbl4.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
				lbl5.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
				lbl6.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
				lbl7.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
			}
		});
		
	}
	
	public void paintComponent(Graphics g) {
		/*Metodo que pinta el Tablero*/
		
		super.paintComponent(g);
		
		//PINTA LAS FICHAS PRIMERO
		//FICHAS DE MUESTRA
		g.drawImage(ball, 23, 43, ball.getWidth(), ball.getHeight(), null);
		
		g.drawImage(amarilla, 27, 468, amarilla.getWidth(), amarilla.getHeight(), null);
		g.drawImage(roja, 97, 468, amarilla.getWidth(), amarilla.getHeight(), null);
		g.drawImage(amarilla, 167, 468, amarilla.getWidth(), amarilla.getHeight(), null);
		g.drawImage(roja, 237, 468, amarilla.getWidth(), amarilla.getHeight(), null);
		
		/*
		g.drawImage(roja, 301, 42, roja.getWidth(), roja.getHeight(), null);
		g.drawImage(roja, 371, 42, amarilla.getWidth(), amarilla.getHeight(), null);
		g.drawImage(roja, 441, 42, roja.getWidth(), roja.getHeight(), null);
		*/
		//TABLERO DESPUES
		Image imagen=new ImageIcon(Escenario.class.getResource("/img/4inARowBG.png")).getImage();
		int x=getWidth()/2 - imagen.getWidth(this)/2;
		int y=getHeight()/1 - imagen.getHeight(this)/1;
		g.drawImage(imagen, x, y, this);
	}
	
}
