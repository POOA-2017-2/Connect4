package conecta4;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dimension;

public class Presentacion extends JPanel {

	/*Clase que va dibujar un panel que es la primera pantalla de juego (bienvenida o algo asi)*/



 
		public Presentacion(){
			this.setSize(300, 200); //se selecciona el tamaño del panel
}
 
//Se crea un método cuyo parámetro debe ser un objeto Graphics
 
		public void paint(Graphics grafico) {
			Dimension height = getSize();
 
			//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

			ImageIcon Img = new ImageIcon(getClass().getResource("/img/conecta4.png"));
			//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

			grafico.drawImage(Img.getImage(), 0, 0, height.width, 400, null);

			setOpaque(false);
			super.paintComponent(grafico);
		}
}
		

	
	


