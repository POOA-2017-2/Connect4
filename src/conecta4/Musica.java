package conecta4;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Musica {

	public Musica() {
		// TODO Auto-generated constructor stub
	}

	//Musica para jugar uno a uno
	public void musicaJuego() {
		try {
			Clip music = AudioSystem.getClip();
			File m = new File("/music/battle.wav");
			music.open(AudioSystem.getAudioInputStream(m));
			music.open();
			music.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Sonido de aplauso
	public void musicaVictoria() {
		try {
			Clip victory = AudioSystem.getClip();
			File v = new File("/music/win.wav");
			victory.open(AudioSystem.getAudioInputStream(v));
			victory.open();
			victory.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Musica para el menu
	public void musicaMenu() {
		try {
			Clip menu = AudioSystem.getClip();
			File mn = new File("/music/menu.wav");
			menu.open(AudioSystem.getAudioInputStream(mn));
			menu.open();
			menu.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sonidoFicha() {
		try {
			Clip token = AudioSystem.getClip();
			File tk = new File("/music/token.wav");
			token.open(AudioSystem.getAudioInputStream(tk));
			token.open();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
