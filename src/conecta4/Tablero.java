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

//import testing.Tablero;
import javax.swing.border.LineBorder;

import logica.logicaTablero;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*Panel para dibujar el tablero donde se estara jugando.
 * CardLayout del Juego*/

public class Tablero extends JPanel implements ActionListener{

	private BufferedImage roja;
	private BufferedImage amarilla;
	private BufferedImage ball;

	private JButton btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete;
	private Ficha[][] Tablero = new Ficha[6][7];
	public int contador =0;
	boolean player1=false;
	boolean player2=false;

	private Musica sound;
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
		logicaTablero.llenarTablero(Tablero);
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
		
		btnUno = new JButton("1");

		btnUno.addActionListener(this);
		panelBotones.add(btnUno);
		
		btnDos = new JButton("2");
		btnDos.addActionListener(this);
		panelBotones.add(btnDos);
		
		btnTres = new JButton("3");
		btnTres.addActionListener(this);
		panelBotones.add(btnTres);
		
		btnCuatro = new JButton("4");
		btnCuatro.addActionListener(this);
		panelBotones.add(btnCuatro);
		
		btnCinco = new JButton("5");
		btnCinco.addActionListener(this);
		panelBotones.add(btnCinco);
		
		btnSeis = new JButton("6");
		btnSeis.addActionListener(this);
		panelBotones.add(btnSeis);
		
		btnSiete = new JButton("7");
		btnSiete.addActionListener(this);
		panelBotones.add(btnSiete);
		
	
		
		
		//------------------------Fichas de muestra-------------------------------------
//		JLabel lbl1 = new JLabel();
//		lbl1.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//		lbl1.setOpaque(false);
//		lbl1.setBounds(27, 42, 60, 60);
//		add(lbl1);
//		
//		JLabel lbl2 = new JLabel();
//		lbl2.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//		lbl2.setOpaque(false);
//		lbl2.setBounds(97, 42, 60, 60);
//		add(lbl2);
//		
//		JLabel lbl3 = new JLabel();
//		lbl3.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//		lbl3.setOpaque(false);
//		lbl3.setBounds(167, 42, 60, 60);
//		add(lbl3);
//		
//		JLabel lbl4 = new JLabel();
//		lbl4.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//		lbl4.setOpaque(false);
//		lbl4.setBounds(237, 42, 60, 60);
//		add(lbl4);
//		
//		JLabel lbl5 = new JLabel();
//		lbl5.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//		lbl5.setOpaque(false);
//		lbl5.setBounds(307, 42, 60, 60);
//		add(lbl5);
//		
//		JLabel lbl6 = new JLabel();
//		lbl6.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//		lbl6.setOpaque(false);
//		lbl6.setBounds(377, 42, 60, 60);
//		add(lbl6);
//		
//		JLabel lbl7 = new JLabel();
//		lbl7.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//		lbl7.setOpaque(false);
//		lbl7.setBounds(447, 42, 60, 60);
//		add(lbl7);
		//ACCIONES DE LOS BOTONES
		/*Implementar que cuando sea el cambio de turno del jugador, las fichas de muestra cambien de color 
		al turno correspiente*/
//		btnUno.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				lbl1.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
//				lbl2.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
//				lbl3.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
//				lbl4.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
//				lbl5.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
//				lbl6.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
//				lbl7.setIcon(new ImageIcon(Tablero.class.getResource("/img/Roja.png")));
//			}
//		});
//		btnDos.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				lbl1.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//				lbl2.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//				lbl3.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//				lbl4.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//				lbl5.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//				lbl6.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//				lbl7.setIcon(new ImageIcon(Tablero.class.getResource("/img/Amarilla.png")));
//			}
//		});
		
	}
	
	
	public void paintComponent(Graphics g) {
		/*Metodo que pinta el Tablero*/
		
		super.paintComponent(g);
		//PINTA LAS FICHAS PRIMERO
		//FICHAS DE MUESTRA

//		g.drawImage(ball, 23, 43, ball.getWidth(), ball.getHeight(), null);
//		
//		g.drawImage(amarilla, 27, 468, amarilla.getWidth(), amarilla.getHeight(), null);
//		g.drawImage(roja, 97, 468, amarilla.getWidth(), amarilla.getHeight(), null);
//		g.drawImage(amarilla, 167, 468, amarilla.getWidth(), amarilla.getHeight(), null);
//		g.drawImage(roja, 237, 468, amarilla.getWidth(), amarilla.getHeight(), null);
//		
		/*
		g.drawImage(roja, 301, 42, roja.getWidth(), roja.getHeight(), null);
		g.drawImage(roja, 371, 42, amarilla.getWidth(), amarilla.getHeight(), null);
		g.drawImage(roja, 441, 42, roja.getWidth(), roja.getHeight(), null);
		*/

		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				//System.out.println(Tablero[i][j].getX());
				g.drawImage(Tablero[i][j].getColor(),Tablero[i][j].getX(),Tablero[i][j].getY(),Tablero[i][j].getAlto(),Tablero[i][j].getAncho(), null);
			}
		}
		

		//TABLERO DESPUES
		Image imagen=new ImageIcon(Tablero.class.getResource("/img/4inARowBG.png")).getImage();
		int x=getWidth()/2 - imagen.getWidth(this)/2;
		int y=getHeight()/1 - imagen.getHeight(this)/1;
		g.drawImage(imagen, x, y, this);
	}
	
	public int escojeJugador(int contador){
		int tipo =0;
		if(contador %2==0){
			
			tipo =1;
		
			}
		else{
			tipo = 2;
		}	
		return tipo;
		}


	
	
	public BufferedImage escojeImagen(int contador){
		boolean player = false;
		if(contador %2==0){
			player1=true;
			
			return amarilla;
			}
		else
			player1=false;
			player2=false;
			
			return roja;
			}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//int uno=0;
		BufferedImage imagen;
		sound = new Musica("/music/token.wav");
		sound.play();
		
		if(e.getSource() == btnUno){
			contador ++;
			
			logicaTablero.setFicha(Tablero, escojeImagen(contador),0,escojeJugador(contador));
			repaint();
			
		}
		else if(e.getSource() == btnDos){
			contador ++;
			logicaTablero.setFicha(Tablero, escojeImagen(contador),1,escojeJugador(contador));
			
			repaint();
		
		}
		else if(e.getSource() == btnTres){
			contador ++;
			logicaTablero.setFicha(Tablero, escojeImagen(contador),2,escojeJugador(contador));
			repaint();
		}
		else if(e.getSource() == btnCuatro){
			contador ++;
			logicaTablero.setFicha(Tablero, escojeImagen(contador),3, escojeJugador(contador));
			repaint();
		}
		else if(e.getSource() == btnCinco){
			contador ++;
			logicaTablero.setFicha(Tablero, escojeImagen(contador),4, escojeJugador(contador));
			repaint();
		}
		else if(e.getSource() == btnSeis){
			contador ++;
			logicaTablero.setFicha(Tablero, escojeImagen(contador),5, escojeJugador(contador));
			repaint();
		}
		else {
			contador ++;
			logicaTablero.setFicha(Tablero, escojeImagen(contador), 6,escojeJugador(contador));
			repaint();
		}

	}
	
}
