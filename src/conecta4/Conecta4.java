package conecta4;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Conecta4 implements Runnable{

	private boolean activo;
	private Thread t;
	private Graphics g;
	private Tablero tablero;
	private Display ventana;
	private BufferStrategy bs;
	private Recursos recursos;
	
	
	/*Esta clase no recibe parametros del main*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public Conecta4() {
		start();
	}
	
	
	public void init() {
		ventana = new Display(500,500,"Conecta Cuatro");
		ventana.getCanvas().setFocusable(true);
		Recursos.init();
		tablero= new Tablero(this); //se comenta porque Tablero no necesita nada de Conecta4 
	}
	
	public synchronized void start() {
		if(activo)
			return;
		activo=true;
		t = new Thread(this);
		t.start();
	}
	public synchronized void stop() {
		if(!activo)
			return;
		activo=false;
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void render() {
		bs=ventana.getCanvas().getBufferStrategy();
		if(bs==null) {
			ventana.getCanvas().createBufferStrategy(3);
			return;
		}
		g=bs.getDrawGraphics();
		g.clearRect(0, 0, 490, 490);
		recursos.render(g);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		init();
		render();
	}


	public Graphics getG() {
		return g;
	}


	public void setG(Graphics g) {
		this.g = g;
	}


	public Tablero getTablero() {
		return tablero;
	}


	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	
	
}
