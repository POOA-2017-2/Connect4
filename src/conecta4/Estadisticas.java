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
			panelLugares.setLayout(new GridLayout(10, 3, 0, 0));
			{
				JLabel lblUno = new JLabel("1. ");
				lblUno.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblUno);
			}
			{
				JLabel lblPrimerlugar = new JLabel("PrimerLugar");
				lblPrimerlugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPrimerlugar);
			}
			{
				JLabel lblPuntosPrimero = new JLabel("10000");
				lblPuntosPrimero.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosPrimero);
			}
			{
				JLabel lblDos = new JLabel("2. ");
				lblDos.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblDos);
			}
			{
				JLabel lblSegundolugar = new JLabel("SegundoLugar");
				lblSegundolugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblSegundolugar);
			}
			{
				JLabel lblPuntosSegundo = new JLabel("9000");
				lblPuntosSegundo.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosSegundo);
			}
			{
				JLabel lblTres = new JLabel("3. ");
				lblTres.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblTres);
			}
			{
				JLabel lblTercerlugar = new JLabel("Tercerlugar");
				lblTercerlugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblTercerlugar);
			}
			{
				JLabel lblPuntosTercero = new JLabel("8000");
				lblPuntosTercero.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosTercero);
			}
			{
				JLabel lblCuatro = new JLabel("4. ");
				lblCuatro.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblCuatro);
			}
			{
				JLabel lblCuartolugar = new JLabel("CuartoLugar");
				lblCuartolugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblCuartolugar);
			}
			{
				JLabel lblPuntosCuarto = new JLabel("7000");
				lblPuntosCuarto.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosCuarto);
			}
			{
				JLabel lblCinco = new JLabel("5. ");
				lblCinco.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblCinco);
			}
			{
				JLabel lblQuintolugar = new JLabel("QuintoLugar");
				lblQuintolugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblQuintolugar);
			}
			{
				JLabel lblPuntosQuinto = new JLabel("6000");
				lblPuntosQuinto.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosQuinto);
			}
			{
				JLabel lblSeis = new JLabel("6. ");
				lblSeis.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblSeis);
			}
			{
				JLabel lblSextolugar = new JLabel("SextoLugar");
				lblSextolugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblSextolugar);
			}
			{
				JLabel lblPuntosSexto = new JLabel("5000");
				lblPuntosSexto.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosSexto);
			}
			{
				JLabel lblSiete = new JLabel("7. ");
				lblSiete.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblSiete);
			}
			{
				JLabel lblSeptimolugar = new JLabel("SeptimoLugar");
				lblSeptimolugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblSeptimolugar);
			}
			{
				JLabel lblPuntosSeptimo = new JLabel("4000");
				lblPuntosSeptimo.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosSeptimo);
			}
			{
				JLabel lblOcho = new JLabel("8. ");
				lblOcho.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblOcho);
			}
			{
				JLabel lblOctavolugar = new JLabel("OctavoLugar");
				lblOctavolugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblOctavolugar);
			}
			{
				JLabel lblPuntosOctavo = new JLabel("3000");
				lblPuntosOctavo.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosOctavo);
			}
			{
				JLabel lblNueve = new JLabel("9. ");
				lblNueve.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblNueve);
			}
			{
				JLabel lblNovenolugar = new JLabel("NovenoLugar");
				lblNovenolugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblNovenolugar);
			}
			{
				JLabel lblPuntosNoveno = new JLabel("2000");
				lblPuntosNoveno.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosNoveno);
			}
			{
				JLabel lblDiez = new JLabel("10. ");
				lblDiez.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblDiez);
			}
			{
				JLabel lblDecimolugar = new JLabel("DecimoLugar");
				lblDecimolugar.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblDecimolugar);
			}
			{
				JLabel lblPuntosDecimo = new JLabel("1000");
				lblPuntosDecimo.setHorizontalAlignment(SwingConstants.CENTER);
				panelLugares.add(lblPuntosDecimo);
			}
		}
	}

}
