package conecta4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtID;
	private JTextField txtEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registro() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelUsuarios = new JPanel();
		contentPane.add(panelUsuarios, BorderLayout.SOUTH);
		panelUsuarios.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panelUsuarios.add(scrollPane);
		
		JList list = new JList();
		list.setBackground(new Color(245, 222, 179));
		scrollPane.setViewportView(list);
		
		JPanel panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.CENTER);
		panelDatos.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(255, 127, 80));
		panelDatos.add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnAgregar = new JButton("Agregar");
		panelBotones.add(btnAgregar);
		
		JButton btnEditar = new JButton("Editar");
		panelBotones.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panelBotones.add(btnEliminar);
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setBackground(new Color(255, 127, 80));
		panelDatos.add(panelRegistro, BorderLayout.CENTER);
		panelRegistro.setLayout(new GridLayout(3, 2, 0, 3));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 0));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBackground(new Color(255, 127, 80));
		panelRegistro.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(new Color(255, 228, 181));
		panelRegistro.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(new Color(255, 255, 0));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBackground(new Color(255, 127, 80));
		panelRegistro.add(lblId);
		
		txtID = new JTextField();
		txtID.setBackground(new Color(255, 222, 173));
		panelRegistro.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setForeground(new Color(255, 255, 0));
		lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdad.setBackground(new Color(255, 127, 80));
		panelRegistro.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBackground(new Color(255, 222, 173));
		panelRegistro.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Registro.class.getResource("/img/connect4.png")));
		contentPane.add(label, BorderLayout.NORTH);
	}

}
