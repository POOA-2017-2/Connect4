package conecta4;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.sound.sampled.Clip;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private static Menu frame;
	private static Musica music;
	
	DefaultListModel<Jugadores> modelo = new DefaultListModel<Jugadores>();
/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int alto=java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		int ancho=java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		int x = (ancho/2) - (550/2); 
		int y = (alto/2) - (700/2);
		setBounds(x, y, 550, 660);
		setResizable(false);	//Para que no se pueda agrandar la pantalla
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);
		mntmNuevo.setEnabled(false);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmAgregarUsuario = new JMenuItem("Agregar Usuario");
		mntmAgregarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registro reg = new Registro();
				reg.setVisible(true);
			}
		});
		mnEditar.add(mntmAgregarUsuario);
		
		JMenu mnVer = new JMenu("Ver");
		menuBar.add(mnVer);
		
		JMenuItem mntmEstadisticas = new JMenuItem("Estadisticas");
		mnVer.add(mntmEstadisticas);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmInstrucciones = new JMenuItem("Instrucciones");
		mntmInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucciones ins = new Instrucciones();
				ins.setVisible(true);
			}
		});
		mnAyuda.add(mntmInstrucciones);
		
		JMenuItem mntmDesarrolladores = new JMenuItem("Desarrolladores");
		mntmDesarrolladores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AboutUs about = new AboutUs();
				about.setVisible(true);
			}
		});
		mnAyuda.add(mntmDesarrolladores);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.WHITE);
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnOneScreen = new JButton("Una Pantalla");
		btnOneScreen.setIcon(new ImageIcon(Menu.class.getResource("/javax/swing/plaf/metal/icons/ocean/expanded.gif")));
		btnOneScreen.setForeground(Color.RED);
		btnOneScreen.setBackground(Color.YELLOW);
		panelBotones.add(btnOneScreen);
		
		JButton btnTwoScreen = new JButton("Pantalla Dividida");
		btnTwoScreen.setBackground(Color.YELLOW);
		btnTwoScreen.setForeground(Color.RED);
		btnTwoScreen.setIcon(new ImageIcon(Menu.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed.gif")));
		panelBotones.add(btnTwoScreen);
		
		JPanel panelMarcador = new JPanel();
		panelMarcador.setBackground(new Color(47, 79, 79));
		contentPane.add(panelMarcador, BorderLayout.NORTH);
		
		JLabel lblMarcador = new JLabel("");
		lblMarcador.setForeground(Color.RED);
		panelMarcador.add(lblMarcador);
		panelMarcador.setVisible(false);
		
		JLabel lblNombre1 = new JLabel("");
		lblNombre1.setForeground(Color.RED);
		panelMarcador.add(lblNombre1);
		
		JLabel lblVs = new JLabel("VS");
		lblVs.setForeground(Color.WHITE);
		panelMarcador.add(lblVs);
		
		JLabel lblNombre2 = new JLabel("");
		lblNombre2.setForeground(Color.YELLOW);
		panelMarcador.add(lblNombre2);
		
		JLabel lblMarcador2 = new JLabel("");
		lblMarcador2.setForeground(Color.YELLOW);
		panelMarcador.add(lblMarcador2);
		
		//Panel del juego donde se va mostrar el tablero, presentacion o estadisticas (apenas por implmentar)
		JPanel panelJuego = new JPanel();
		contentPane.add(panelJuego, BorderLayout.CENTER);
		panelJuego.setLayout(new CardLayout(0,0));
		
		//Panel de la primera pantalla de bienvenida
		Presentacion pnlPresentacion = new Presentacion();
		panelJuego.add(pnlPresentacion, "Presentacion");
		
		//Panel del tablero donde se va estar jugando
		Tablero pnlTablero = new Tablero();
		panelJuego.add(pnlTablero, "Tablero");
		
		////Validaciones para el Menu y Musica del Menu
		if(pnlPresentacion.isVisible()) {
			mntmNuevo.setEnabled(false);
			music = new Musica("/music/menu.wav");
			music.play();
		}
		
		//Comandos para leer el archivo Jugadores 
		try {
			FileInputStream fis = new FileInputStream("Jugadores.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			modelo = (DefaultListModel<Jugadores>)ois.readObject();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ImageIcon redicon = new ImageIcon(Menu.class.getResource("/img/luchador.png"));
		ImageIcon yellowicon = new ImageIcon(Menu.class.getResource("/img/crazy.png"));
		
		//Acciones de los botones
		////BOTON UNA PANTALLA
		btnOneScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Comandos para escoger los dos jugadores 
				Object jugador1 = JOptionPane.showInputDialog(contentPane, "Jugador #1 con Ficha Roja", "Escoger Jugador", JOptionPane.INFORMATION_MESSAGE, redicon, modelo.toArray(), null);
				lblNombre1.setText(jugador1.toString());
				
				Object jugador2 = JOptionPane.showInputDialog(contentPane, "Jugador #2 con Ficha Amarilla", "Escoger Jugador", JOptionPane.INFORMATION_MESSAGE, yellowicon, modelo.toArray(), null);
				lblNombre2.setText(jugador2.toString());
				
				//Comandos para comenzar a jugar en el layout Tablero-------
				CardLayout c = (CardLayout) panelJuego.getLayout();
				c.next(panelJuego);
				c.show(panelJuego, "Tablero");
				pnlTablero.setFocusable(true);
				panelBotones.setBackground(new Color(47, 79, 79));
				music.stop(); //Detienen la musica del menu
				music = new Musica("/music/battle.wav"); //Comienza la musica del juego
				music.play();
				
				//validaciones
				if(pnlTablero.isVisible()) {
					panelMarcador.setVisible(true);
					mntmNuevo.setEnabled(true);
					btnOneScreen.setEnabled(false); 	
					btnTwoScreen.setEnabled(false);
					mntmEstadisticas.setEnabled(false);
					mntmAgregarUsuario.setEnabled(false);
				}
			}
		});
		
		////BOTON NUEVO
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(pnlTablero.isVisible()) {
					music.stop(); //Detiene la musica actual de batalla
					CardLayout c = (CardLayout) panelJuego.getLayout();
					c.next(panelJuego);
					c.show(panelJuego, "Presentacion");
					pnlPresentacion.setFocusable(true);
					//Pone la musica del menu
					music = new Musica("/music/menu.wav");
					music.play();
					
					//Validaciones en botones
					panelMarcador.setVisible(false);
					btnOneScreen.setEnabled(true);
					btnTwoScreen.setEnabled(true);
					panelBotones.setBackground(Color.WHITE);
					mntmNuevo.setEnabled(false);
					mntmEstadisticas.setEnabled(true);
					mntmAgregarUsuario.setEnabled(true);
				}
			}
		});
		
		/////BOTON ESTADISTICAS
		mntmEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estadisticas est = new Estadisticas();
				if(pnlTablero.isVisible()) {
					mntmEstadisticas.setEnabled(false);	
				}
				else if(pnlPresentacion.isVisible()) {
					mntmEstadisticas.setEnabled(true);
					est.setVisible(true);
				}
			}
		});
		
	/////BOTON SALIR
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pnlPresentacion.isVisible()) {
					System.exit(0);
				}
				else if(pnlTablero.isVisible()) {
					int reply = JOptionPane.showConfirmDialog(contentPane, "Estas Seguro que quieres salir? ","Salir del juego",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
					if(reply == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			}
		});
	}
}
