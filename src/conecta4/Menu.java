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
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private static Menu frame;
	String[] nombres = {"Juan", "Pedro", "Mateo"};

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
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
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
		mntmEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estadisticas est = new Estadisticas();
				est.setVisible(true);
			}
		});
		mnVer.add(mntmEstadisticas);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmReglas = new JMenuItem("Reglas");
		mnAyuda.add(mntmReglas);
		
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
		
		JButton btnJugar = new JButton("Jugar!");
		btnJugar.setIcon(new ImageIcon(Menu.class.getResource("/com/sun/java/swing/plaf/windows/icons/HomeFolder.gif")));
		btnJugar.setForeground(Color.RED);
		btnJugar.setBackground(Color.YELLOW);
		panelBotones.add(btnJugar);
		
		JPanel panelMarcador = new JPanel();
		panelMarcador.setBackground(new Color(47, 79, 79));
		contentPane.add(panelMarcador, BorderLayout.NORTH);
		
		JLabel lblMarcador = new JLabel("Marcador1");
		lblMarcador.setForeground(Color.RED);
		panelMarcador.add(lblMarcador);
		
		JLabel lblNombre1 = new JLabel("Nombre1");
		lblNombre1.setForeground(Color.RED);
		panelMarcador.add(lblNombre1);
		
		JLabel lblVs = new JLabel("VS");
		lblVs.setForeground(Color.WHITE);
		panelMarcador.add(lblVs);
		
		JLabel lblNombre2 = new JLabel("Nombre2");
		lblNombre2.setForeground(Color.YELLOW);
		panelMarcador.add(lblNombre2);
		
		JLabel lblMarcador2 = new JLabel("Marcador2");
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
		
		if(pnlPresentacion.isVisible()) {
			panelMarcador.setVisible(false);
		}
		
		ImageIcon redicon = new ImageIcon(Menu.class.getResource("/img/luchador.png"));
		ImageIcon yellowicon = new ImageIcon(Menu.class.getResource("/img/crazy.png"));
		
		/*Acciones de los botones*/
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Comandos para escoger los dos jugadores 
				String jugador1 = (String) JOptionPane.showInputDialog(contentPane, "Jugador #1 con Ficha Roja", "Escoger Jugador", JOptionPane.INFORMATION_MESSAGE, redicon, nombres, nombres[0]);
				String jugador2 = (String) JOptionPane.showInputDialog(contentPane, "Jugador #2 con Ficha Amarilla", "Escoger Jugador", JOptionPane.INFORMATION_MESSAGE, yellowicon, nombres, nombres[0]);
				
				//Comandos para mostrar los jugadores seleccionados
				//tratar de implmentarlo con switch-case
				if(jugador1.equalsIgnoreCase("Juan")){
					lblNombre1.setText(jugador1);
				}
				if(jugador2.equalsIgnoreCase("Mateo")) {
					lblNombre2.setText(jugador2);
				}
				
				//Comandos para mostrar el layout Tablero-------
				CardLayout c = (CardLayout) panelJuego.getLayout();
				c.next(panelJuego);
				c.show(panelJuego, "Tablero");
				pnlTablero.setFocusable(true);
				btnJugar.setEnabled(false); 
				
				//btnJugar.setVisible(false);
				panelMarcador.setVisible(true);
				panelBotones.setBackground(new Color(47, 79, 79));

			}
		});
	}
}
