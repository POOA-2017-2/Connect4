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
import java.awt.GridLayout;

public class AboutUs extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AboutUs dialog = new AboutUs();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AboutUs() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JLabel lblUABC = new JLabel("");
			lblUABC.setHorizontalAlignment(SwingConstants.CENTER);
			lblUABC.setIcon(new ImageIcon(AboutUs.class.getResource("/img/uabc.png")));
			contentPanel.add(lblUABC, BorderLayout.NORTH);
		}
		{
			JPanel pnlProgramadores = new JPanel();
			contentPanel.add(pnlProgramadores, BorderLayout.CENTER);
			pnlProgramadores.setLayout(new BorderLayout(0, 0));
			{
				JPanel panelJesus = new JPanel();
				pnlProgramadores.add(panelJesus, BorderLayout.WEST);
				panelJesus.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNombre = new JLabel("Foto");
					panelJesus.add(lblNombre, BorderLayout.WEST);
				}
				{
					JPanel panelDatosJ = new JPanel();
					panelJesus.add(panelDatosJ, BorderLayout.CENTER);
					panelDatosJ.setLayout(new GridLayout(4, 1, 0, 0));
					{
						JLabel lblJesusEspinoza = new JLabel("Jesus Espinoza");
						panelDatosJ.add(lblJesusEspinoza);
					}
					{
						JLabel lblIngIndustrial = new JLabel("Ing Industrial");
						panelDatosJ.add(lblIngIndustrial);
					}
				}
			}
			{
				JPanel panel = new JPanel();
				pnlProgramadores.add(panel, BorderLayout.EAST);
				panel.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblFoto = new JLabel("Foto");
					panel.add(lblFoto);
				}
				{
					JPanel panel_1 = new JPanel();
					panel.add(panel_1, BorderLayout.WEST);
					panel_1.setLayout(new GridLayout(4, 1, 0, 0));
					{
						JLabel lblIsraelIslas = new JLabel("Israel Islas");
						panel_1.add(lblIsraelIslas);
					}
					{
						JLabel lblIngComputacion = new JLabel("Ing Computacion");
						panel_1.add(lblIngComputacion);
					}
				}
			}
		}
	}

}
