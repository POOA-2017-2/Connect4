package conecta4;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Musica {

	private Clip clip;
	
	public Musica(String s) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(s));
			clip = AudioSystem.getClip();
			clip.open(ais);
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void play() {
		clip.start();
	}
	
	public void stop() {
		if(clip.isRunning()) {
			clip.stop();
		}
	}
	
	public void close() {
		stop();
		clip.close();
	}
}
