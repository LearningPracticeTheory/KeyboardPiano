import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer extends Thread {

	private static final float LEFT_VALUE = -3.0f;
	private static final float RIGHT_VALUE = +3.0f;
	
	private String musicPath; 
	private Clip clip;
	private AudioInputStream audioInputStream = null;
	private BufferedInputStream buffer = null;
	private char musicType;
	
	public MusicPlayer(String wavPath) {
		this.musicPath = wavPath;
	}
	
	MusicPlayer(char musicType, String musicPath) {
		this.musicType = musicType;
		this.musicPath = musicPath;
	}


	@Override
	public void run() {

		if(musicPath == null) {
			return;
		}
		
		try {
			buffer = new BufferedInputStream(new FileInputStream(musicPath));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			audioInputStream = AudioSystem.getAudioInputStream(buffer);
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}  
		
		FloatControl gainControl = 
				(FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
		
		if(musicType == KeyboardPiano.L) {
			gainControl.setValue(LEFT_VALUE); //set +- dB
		} else if(musicType == KeyboardPiano.R) {
			gainControl.setValue(RIGHT_VALUE);
		}
		
		clip.start();
		
		/*
		 * it seems that it doesn't work well
		 * CPU usage will be like 30% while multiple type keys
		 */
		try {
			Thread.sleep(3000);
			if(!this.isInterrupted()) {
				this.interrupt();
			}
//			this.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
