import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class MyButton extends JToggleButton {

	private static final long serialVersionUID = 1L;
	
	public static final int SIDE_INDEX = 0; 
	public static final int COLOR_INDEX = 1;
	public static final int DIRECTION_INDEX = 2;
	public static final int TYPE_INDEX = 3;
	public static final int PITCH_INDEX = 4; //pitch
	
	//underline index = 5;
	public static final int OCTAVE_INDEX = 6;//octave/name
	private static final char N = 'N';
	
	/*
	 * side
	 */
	public static final char SIDE_L = 'L';
	public static final char SIDE_R = 'R';
	public static final char SIDE_N = N;
	
	/*
	 * color
	 */
	public static final char COLOR_W = 'W';
	public static final char COLOR_G = 'G';
	public static final char COLOR_L = 'L';
	public static final char COLOR_B = 'B';
	public static final char COLOR_N = N;
	
	private static final int TYPE_A_LENGTH = 42;
	private static final int TYPE_B_LENGTH = 66;
	private static final int TYPE_C_LENGTH = 90;
	private static final int TYPE_D_LENGTH = 112;
	private static final int TYPE_E_LENGTH = 322;
	
	/*
	 * direction
	 */
	public static final char DIRECTION_U = 'U';
	public static final char DIRECTION_D = 'D';
	public static final char DIRECTION_N = N;
	
	/*
	 * type
	 */
	public static final char TYPE_A = 'A';
	public static final char TYPE_B = 'B';
	public static final char TYPE_C = 'C';
	public static final char TYPE_D = 'D';
	public static final char TYPE_E = 'E';
	public static final char TYPE_F = 'F';
	public static final char TYPE_N = N;
	
	private static final int WIDTH = 42;
	private static final int HEIGHT = 38; //most of all height
	private static final int SPECIAL_HEIGHT = 80; //NUMPAD PLUS & ENTER
	private static final int ARC_WIDTH = 10;
	private static final int ARC_HEIGHT = 10;
	
	/*
	 * pitch
	 */
	public static final char PITCH_A = 'A'; //  1
	public static final char PITCH_B = 'B'; // #1
	public static final char PITCH_C = 'C'; //  2
	public static final char PITCH_D = 'D'; // #2
	public static final char PITCH_E = 'E'; //  3
	public static final char PITCH_F = 'F'; //  4
	public static final char PITCH_G = 'G'; // #4
	public static final char PITCH_H = 'H'; //  5
	public static final char PITCH_I = 'I'; // #5
	public static final char PITCH_J = 'J'; //  6
	public static final char PITCH_K = 'K'; // #6
	public static final char PITCH_L = 'L'; //  7
	public static final char PITCH_N = N;
	
	/*
	 * octave
	 */
	public static final char OCTAVE_8 = '8'; // +4
	public static final char OCTAVE_7 = '7'; // +3
	public static final char OCTAVE_6 = '6'; // +2
	public static final char OCTAVE_5 = '5'; // +1
	public static final char OCTAVE_4 = '4'; // +0
	public static final char OCTAVE_3 = '3'; // -1
	public static final char OCTAVE_2 = '2'; // -2
	public static final char OCTAVE_1 = '1'; // -3
	public static final char OCTAVE_0 = '0'; // -4
	public static final char OCTAVE_N = N;
	public static final int NUM_OCTAVES = 8;
	
	public static final String UNDERLINE = "_";
	
	private KeyboardPiano kp;
	public String name = null;
	private String imageName = null; //default is U & N
	private String imageUpPath = null;
	private String imageDownPath = null;
	private String wavPath = null;
	
	private ImageIcon imageUp = null;
	private ImageIcon imageDown = null;
	
	public PopupWindow popupWindow = null; 
	
	/**
	 * 
	 * @param kp KeyboardPiano, the main class
	 * @param text the string displayed on the toggle button
	 * @param name the attributes of button, includes sharp, side, color, etc
	 */
	MyButton(KeyboardPiano kp, String text, String name) {
		super(text);
		
		this.name = name;
        setOpaque(false);
        /*
         * the super class will paint the area of button
         * if the argument is true, which is default
         */
        setContentAreaFilled(false);
        
		this.kp = kp;
		
		setImageAndWavByName(name);
		
        this.setHorizontalTextPosition(SwingConstants.CENTER); //Text displays on center
        this.setBorderPainted(false); //do NOT paint the border of the button

        this.addMouseListener(new MouseMonitor(this));
	}
	
	public void setImageAndWavByName(String name) { //UpName
		imageName = name;
		name = name.trim();
		imageUpPath = getPath(name);
		imageUp = new ImageIcon(imageUpPath);
		imageDownPath = getPath(getImageDownName(name));
		wavPath = getWavPath(name);
		imageDown = new ImageIcon(imageDownPath);
		
		modifyImageByType(imageName.charAt(TYPE_INDEX));
	}
	
	private void setImageByType(int type, int widthMinus, int heightMinus) {
		imageUp.setImage(imageUp.getImage().getScaledInstance(type-widthMinus, HEIGHT-heightMinus, Image.SCALE_DEFAULT));
    	imageDown.setImage(imageDown.getImage().getScaledInstance(type-widthMinus, HEIGHT-heightMinus, Image.SCALE_DEFAULT));
	}
	
	private void modifyImageByType(int type) { //char type actually
		switch(type) {
		case TYPE_A :
			setImageByType(TYPE_A_LENGTH, 2, 2);
			break;
		case TYPE_B :
			setImageByType(TYPE_B_LENGTH, 3, 2);
			break;
		case TYPE_C :
			setImageByType(TYPE_C_LENGTH, 4, 2);
			break;
		case TYPE_D :
			setImageByType(TYPE_D_LENGTH, 3, 2);
			break;
		case TYPE_E :
			setImageByType(TYPE_E_LENGTH, 6, 2);
			break;
		case TYPE_F :
			/*
			 * Numpad_+ & Numpad_Enter are just a bit different
			 */
			imageUp.setImage(imageUp.getImage().getScaledInstance(WIDTH-2, SPECIAL_HEIGHT-2, Image.SCALE_DEFAULT));
        	imageDown.setImage(imageDown.getImage().getScaledInstance(WIDTH-2, SPECIAL_HEIGHT-2, Image.SCALE_DEFAULT));
			break;
		}
		
	}
	
	private void fillRectByType(Graphics2D g2d, int type) { //char actually
		switch(type) {
		case TYPE_A :
			g2d.fillRoundRect(0, 0, TYPE_A_LENGTH, HEIGHT, ARC_WIDTH, ARC_HEIGHT); //make Rectangle more beautiful
			break;
		case TYPE_B :
			g2d.fillRoundRect(0, 0, TYPE_B_LENGTH, HEIGHT, ARC_WIDTH, ARC_HEIGHT);
			break;
		case TYPE_C :
			g2d.fillRoundRect(0, 0, TYPE_C_LENGTH, HEIGHT, ARC_WIDTH, ARC_HEIGHT);
			break;
		case TYPE_D :
			g2d.fillRoundRect(0, 0, TYPE_D_LENGTH, HEIGHT, ARC_WIDTH, ARC_HEIGHT);
			break;
		case TYPE_E :
			g2d.fillRoundRect(0, 0, TYPE_E_LENGTH, HEIGHT, ARC_WIDTH, ARC_HEIGHT);
			break;
		case TYPE_F :
			/*
			 * Numpad_+ & Numpad_Enter are just a bit different
			 */
			g2d.fillRoundRect(0, 0, WIDTH, SPECIAL_HEIGHT, ARC_WIDTH, ARC_HEIGHT);
			break;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.GRAY);
        
        fillRectByType(g2d, imageName.charAt(TYPE_INDEX));
        
		if(this.isSelected()) {
			g2d.drawImage(imageDown.getImage(), 1, 1, null);
			/*
			 * play music once
			 */
			kp.cachedThreadPool.execute(new MusicPlayer(getType(), wavPath));
		} else { //default is Up
			g2d.drawImage(imageUp.getImage(), 1, 1, null);
		}
		
	}
	
	private String getWavPath(String name) {
		String tmp = getWavName(name);
		if(tmp == null) {
			return null;
		}
		return kp.getWavPath(tmp);
	}
	
	private String getWavName(String name) {
		if(name.charAt(DIRECTION_INDEX) == DIRECTION_N) {
			return null;
		}
		String tmp = "";
		tmp += String.valueOf(name.charAt(PITCH_INDEX));
		tmp += String.valueOf(name.charAt(OCTAVE_INDEX));
		return tmp;
	}

	private String getImageDownName(String name) {
		if(name.charAt(DIRECTION_INDEX) == DIRECTION_N) {
			return name;
		}
		return replaceColorDirection(name);
	}
	
	private String replaceColorDirection(String name) {
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

	private String getPath(String upImageName) {
		return kp.getImgPath(upImageName);
	}
	
	private char getType() {
		return imageName.charAt(SIDE_INDEX);
	}
	
	private class MouseMonitor extends MouseAdapter {
		
		MyButton button = null;
		
		MouseMonitor(MyButton button) {
			this.button = button;
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			if(e.getButton() == MouseEvent.BUTTON1) {
				button.setSelected(true);
			} else if(e.getButton() == MouseEvent.BUTTON3) {
				button.popupWindow = new PopupWindow(button, kp); 
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			button.setSelected(false);
		}

		@Override
		public void mouseExited(MouseEvent e) { 
			button.setSelected(false);
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
