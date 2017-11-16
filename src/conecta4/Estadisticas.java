package conecta4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Estadisticas extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Estadisticas dialog = new Estadisticas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Estadisticas() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JLabel lblConectaLogo = new JLabel("");
			lblConectaLogo.setHorizontalAlignment(SwingConstants.CENTER);
			lblConectaLogo.setIcon(new ImageIcon(Estadisticas.class.getResource("/img/connect4.png")));
			contentPanel.add(lblConectaLogo, BorderLayout.NORTH);
		}
		{
			JPanel panelLugares = new JPanel();
			contentPanel.add(panelLugares, BorderLayout.CENTER);
		}
	}

}
