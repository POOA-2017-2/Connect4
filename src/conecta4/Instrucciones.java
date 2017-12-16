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
import java.awt.Color;

public class Instrucciones extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Instrucciones dialog = new Instrucciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Instrucciones() {
		setTitle("Instrucciones del Juego");
		setBounds(100, 100, 575, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 128, 128));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JLabel label = new JLabel("");
			label.setBackground(new Color(0, 128, 128));
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setIcon(new ImageIcon(Instrucciones.class.getResource("/img/connect4.png")));
			label.setOpaque(true);
			contentPanel.add(label, BorderLayout.NORTH);
		}
		{
			JPanel pnlIns = new JPanel();
			contentPanel.add(pnlIns, BorderLayout.CENTER);
			pnlIns.setLayout(new BorderLayout(0, 0));
			{
				JLabel lbltxt = new JLabel("Conecta 4 fichas consecutivas del mismo color en forma HORIZONTAL, VERTICAL o DIAGONAL");
				lbltxt.setForeground(new Color(255, 255, 255));
				lbltxt.setBackground(new Color(0, 128, 128));
				lbltxt.setHorizontalAlignment(SwingConstants.CENTER);
				lbltxt.setOpaque(true);
				pnlIns.add(lbltxt, BorderLayout.NORTH);
			}
			{
				JPanel pnlimg = new JPanel();
				pnlIns.add(pnlimg, BorderLayout.CENTER);
				pnlimg.setLayout(new GridLayout(1, 3, 0, 0));
				{
					JLabel lblH = new JLabel("");
					lblH.setForeground(new Color(0, 128, 128));
					lblH.setBackground(new Color(0, 128, 128));
					lblH.setIcon(new ImageIcon(Instrucciones.class.getResource("/img/horizontal.png")));
					lblH.setHorizontalAlignment(SwingConstants.CENTER);
					lblH.setOpaque(true);
					pnlimg.add(lblH);
				}
				{
					JLabel lblV = new JLabel("");
					lblV.setBackground(new Color(0, 128, 128));
					lblV.setIcon(new ImageIcon(Instrucciones.class.getResource("/img/vertical.png")));
					lblV.setHorizontalAlignment(SwingConstants.CENTER);
					lblV.setOpaque(true);
					pnlimg.add(lblV);
				}
				{
					JLabel lblD = new JLabel("");
					lblD.setBackground(new Color(0, 128, 128));
					lblD.setIcon(new ImageIcon(Instrucciones.class.getResource("/img/diagonal.png")));
					lblD.setHorizontalAlignment(SwingConstants.CENTER);
					lblD.setOpaque(true);
					pnlimg.add(lblD);
				}
			}
		}
	}

}
