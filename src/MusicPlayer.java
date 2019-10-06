import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer extends Thread {

	private static final float LEFT_VALUE = -3.5f;
	private static final float RIGHT_VALUE = +3.0f;
	
	private String musicPath; 
	private char musicType;
	
	public MusicPlayer(String wavPath) {
		this.musicPath = wavPath;
	}
	
	MusicPlayer(char musicType, String musicPath) {
		this.musicType = musicType;
		this.musicPath = musicPath;
	}

	private static int count = 0;
	
	@Override
	public void run() {
		if(musicPath == null) {
			return;
		}
		if(musicType == MyButton.SIDE_N) { //left or right or N
			return;
		}
		
		AudioInputStream ais = null;
		SourceDataLine line = null;
		
		try{
			ais = AudioSystem.getAudioInputStream(new File(musicPath));
			
			/*
			 * PCM_SIGNED 44100.0 Hz, 16 bit, mono, 2 bytes/frame, little-endian
			 */
			AudioFormat audioFormat = ais.getFormat();
			
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
			
			/*
			 * com.sun.media.sound.DirectAudioDevice$DirectSDL
			 */
			line = (SourceDataLine)AudioSystem.getLine(info);
			
			try {
				/*
				# There is insufficient memory for the Java Runtime Environment to continue.
				# Native memory allocation (malloc) failed to allocate 655536 bytes for Chunk::new
				 */
				line.open(audioFormat);
			} catch(LineUnavailableException e) {
				e.printStackTrace();
			}
			
			/*
			 * getControl after opened the SourceDataLine & before start it
			 */
			FloatControl gainControl = 
					(FloatControl)line.getControl(FloatControl.Type.MASTER_GAIN);
			
			if(musicType == KeyboardPiano.L) {
				gainControl.setValue(LEFT_VALUE); //set +- dB
			} else if(musicType == KeyboardPiano.R) {
				gainControl.setValue(RIGHT_VALUE);
			}
			
			line.start();
			
			/* NO need
			synchronized(line) {
				line.wait();
			}
			*/
			
			int BUFFER_SIZE = 1024;
			int intBytes=0;
			byte[] audioData=new byte[BUFFER_SIZE];
			
			while(intBytes != -1)
			{
				intBytes = ais.read(audioData, 0, BUFFER_SIZE);
				if(intBytes >= 0)
					line.write(audioData, 0, intBytes);				
			}
			
			System.out.println(count++);
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(line != null) {
				line.flush();
				line.close();
				line = null;
			}
			if(ais != null) {
				try {
					ais.close();
					ais = null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
