import javax.swing.JToggleButton;

public class MyButton extends JToggleButton {

	private static final long serialVersionUID = 1L;
	private static final int SHARP_INDEX = 0;
//	private static final int SIDE_INDEX = 1; 
	private static final int COLOR_INDEX = 2;
	private static final int DIRECTION_INDEX = 3;
//	private static final int TYPE_INDEX = 4;
	private static final int PITCH_INDEX = 5; //pitch
	private static final int OCTAVE_INDEX = 7;//octave
	
	/*
	 * if the name start from "N", which means the index of "_" is 5
	 * else the other case is 6
	 */
	
	private KeyboardPiano kp;
	private String text = null;
	private String imageUpPath = null;
	private String imageDownPath = null;
	private String wavPath = null;
	
	MyButton(KeyboardPiano kp, String text, String name) {
		this.kp = kp;
		this.text = text;
		setImage(name);
	}
	
	public void setImage(String name) { //UpName
		imageUpPath = getImageUpPath(name);
		imageDownPath = getImageDownPath(getImageDownName(name));
		wavPath = getWavPath(name);
//System.out.println(imageUpName + " " + imageUpPath);
//System.out.println(imageDownName + " " + imageDownPath);
//System.out.println(wavName);
	}
	
	private String getWavPath(String name) {
		return kp.getWavPath(getWavName(name));
	}
	
	private String getWavName(String name) {
		if(name.startsWith("N")) {
			return null;
		}
		String tmp = String.valueOf(name.charAt(SHARP_INDEX));
		tmp += String.valueOf(name.charAt(PITCH_INDEX));
		tmp += String.valueOf(name.charAt(OCTAVE_INDEX));
		return tmp;
	}

	private String getImageDownPath(String downImageName) {
		return kp.getPicPath(downImageName);
	}

	private String getImageDownName(String name) {
		return replaceColorDirection(name);
	}
	
	private String replaceColorDirection(String name) {
//		String thatCD = getColorDirection(name); //that
//		String thisCD = kp.getDownColorDirection(thatCD);
		String thisCD = kp.getDownColorDirection(getColorDirection(name));
		String tmp = name.substring(0, COLOR_INDEX); //[0, color)
		tmp += thisCD;
		tmp += name.substring(DIRECTION_INDEX+1);
		return tmp;
	}
	
	/*
	 * get color & direction from [color, direction] of name
	 */
	private String getColorDirection(String name) {
		return name.substring(COLOR_INDEX, DIRECTION_INDEX+1);
	}

	private String getImageUpPath(String upImageName) {
		return kp.getPicPath(upImageName);
	}
	
}
