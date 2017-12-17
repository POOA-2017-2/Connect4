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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.BorderLayout;

/*Panel para dibujar el tablero donde se estara jugando.
 * CardLayout del Juego*/

public class Tablero extends JPanel implements ActionListener{

	private BufferedImage roja;
	private BufferedImage amarilla;
	private BufferedImage ball;
	

	private JButton btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnReset;
	private Ficha[][] Tablero = new Ficha[6][7];
	public int contador =0;
	
	private Musica sound;
	private JTextField txtField;
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
		panelBotones.setBounds(0, 0, 450, 35);
		panelBotones.setBackground(new Color(47, 79, 79));
		add(panelBotones);
		
		btnUno = new JButton("1");

		btnUno.addActionListener(this);
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
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
		
		
		txtField = new JTextField();
		txtField.setFont(new Font("Tahoma", Font.PLAIN, 33));
		txtField.setHorizontalAlignment(SwingConstants.CENTER);
		txtField.setForeground(new Color(255, 255, 224));
		txtField.setBackground(new Color(47, 79, 79));
		txtField.setText("EMPATE");
		txtField.setEditable(false);
		txtField.setBounds(107, 46, 268, 51);
		add(txtField);
		txtField.setColumns(10);
		
		btnReset = new JButton();
		btnReset.setBounds(10, 46, 87, 51);
		add(btnReset);
		btnReset.addActionListener(this);
		btnReset.setText("Reset");
		
		
		txtField.setVisible(false);
}
	
	
	public void paintComponent(Graphics g) {
		/*Metodo que pinta el Tablero*/
		
		super.paintComponent(g);
	

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
		btnReset.setVisible(true);
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
		
		if(contador %2==0){
			
			
			return amarilla;
			}
		else
			
			
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
			
			ganador(logicaTablero.setFicha(Tablero, escojeImagen(contador), 0,escojeJugador(contador)),contador);
			repaint();
			
		}
		else if(e.getSource() == btnDos){
			contador ++;
			ganador(logicaTablero.setFicha(Tablero, escojeImagen(contador), 1,escojeJugador(contador)),contador);
			
			repaint();
		
		}
		else if(e.getSource() == btnTres){
			contador ++;
			ganador(logicaTablero.setFicha(Tablero, escojeImagen(contador), 2,escojeJugador(contador)),contador);
			repaint();
		}
		else if(e.getSource() == btnCuatro){
			contador ++;
			ganador(logicaTablero.setFicha(Tablero, escojeImagen(contador), 3,escojeJugador(contador)),contador);
			repaint();
		}
		else if(e.getSource() == btnCinco){
			contador ++;
			ganador(logicaTablero.setFicha(Tablero, escojeImagen(contador), 4,escojeJugador(contador)),contador);
			repaint();
		}
		else if(e.getSource() == btnSeis){
			contador ++;
			ganador(logicaTablero.setFicha(Tablero, escojeImagen(contador), 5,escojeJugador(contador)),contador);
			repaint();
		}
		else {
			contador ++;
			ganador(logicaTablero.setFicha(Tablero, escojeImagen(contador), 6,escojeJugador(contador)),contador);
			//logicaTablero.setFicha(Tablero, escojeImagen(contador), 6,escojeJugador(contador));
			repaint();
		}
		if(e.getSource() == btnReset){
			logicaTablero.llenarTablero(Tablero);
			controlBotones(true);
			txtField.setText(" ");
			contador = 0;
			sound.stop();
			
			repaint();
			
		}
	}
	public void ganador(int ganador,int contador){
		System.out.println(" "+ganador);
		if(ganador==1||ganador==2){
			Image imagen=new ImageIcon(Tablero.class.getResource("/img/Red.png")).getImage();
			txtField.setText("GANADOR "+ganador );
			txtField.setVisible(true);
			
			controlBotones(false);
			sound = new Musica("/music/win.wav");
			sound.play();
			
		}
		if(contador == 42&&ganador==0){
			txtField.setVisible(true);
			
		}
	}
	public void controlBotones(boolean afirma){
		btnUno.setEnabled(afirma);
		btnDos.setEnabled(afirma);
		btnTres.setEnabled(afirma);
		btnCuatro.setEnabled(afirma);
		btnCinco.setEnabled(afirma);
		btnSeis.setEnabled(afirma);
		btnSiete.setEnabled(afirma);
	}
}
