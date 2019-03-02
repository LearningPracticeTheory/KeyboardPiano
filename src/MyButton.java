import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class MyButton extends JToggleButton {

	private static final long serialVersionUID = 1L;
	private static final int SHARP_INDEX = 0;
//	private static final int SIDE_INDEX = 1; 
	private static final int COLOR_INDEX = 2;
	private static final int DIRECTION_INDEX = 3;
	private static final int TYPE_INDEX = 4;
	private static final int PITCH_INDEX = 5; //pitch
	private static final int OCTAVE_INDEX = 7;//octave
	private static final char N = 'N';
	
	private static final int A_TYPE = 42;
	private static final int B_TYPE = 66;
	private static final int C_TYPE = 90;
	private static final int D_TYPE = 112;
	private static final int E_TYPE = 322;
	private static final char A = 'A';
	private static final char B = 'B';
	private static final char C = 'C';
	private static final char D = 'D';
	private static final char E = 'E';
	private static final char F = 'F';
	
	private static final int WIDTH = 42;
	private static final int HEIGHT = 38; //most of all height
	private static final int SPECIAL_HEIGHT = 80; //NUMPAD PLUS & ENTER
	private static final int ARC_WIDTH = 10;
	private static final int ARC_HEIGHT = 10;
	
	/*
	 * if the name start from "N", which means the index of "_" is 5
	 * else the other case is 6
	 */
	
	private KeyboardPiano kp;
	private String text = null;
	private String imageName = null; //default is U & N
	private String imageUpPath = null;
	private String imageDownPath = null;
	private String wavPath = null;
	
	private ImageIcon imageUp = null;
	private ImageIcon imageDown = null;
	
	MyButton(KeyboardPiano kp, String text, String name) {
		super(text);
        setOpaque(false);
        /*
         * the super class will paint the area of button
         * if the argument is true, which is default
         */
        setContentAreaFilled(false);
        
		this.kp = kp;
		this.text = text;
		setImage(name);
        this.setHorizontalTextPosition(SwingConstants.CENTER); //Text displays on center
        this.setBorderPainted(false); //do NOT paint the border of the button
//		this.setPreferredSize(new Dimension(WIDTH, HEIGHT)); //the size of button(most of the case)
        this.setPreferredSize(new Dimension(100, 100));
	}
	
	public void setImage(String name) { //UpName
		imageName = name;
		imageUpPath = getPath(name);
		imageUp = new ImageIcon(imageUpPath);
		/*
		if(imageName.indexOf(DIRECTION_INDEX) == N) {
			return; //imageDownPath & wavPath & imageDownIcon == null;
		}
		*/
		imageDownPath = getPath(getImageDownName(name));
		wavPath = getWavPath(name);
		imageDown = new ImageIcon(imageDownPath);
//System.out.println(imageUpName + " " + imageUpPath);
//System.out.println(imageDownName + " " + imageDownPath);
//System.out.println(wavName);
	}
	
	private void graphicsImageSet(Graphics2D g2d, int type, int widthMinus, int heightMinus) {
		imageUp.setImage(imageUp.getImage().getScaledInstance(type-widthMinus, HEIGHT-heightMinus, Image.SCALE_DEFAULT));
    	imageDown.setImage(imageDown.getImage().getScaledInstance(type-widthMinus, HEIGHT-heightMinus, Image.SCALE_DEFAULT));
        g2d.fillRoundRect(0, 0, type, HEIGHT, ARC_WIDTH, ARC_HEIGHT); //make Rectangle more beautiful
	}
	
	private void switchCase(Graphics2D g2d, int type) {
//		System.out.println("-" + type);
		switch(type) {
		case A :
			graphicsImageSet(g2d, A_TYPE, 2, 2);
			break;
		case B :
			graphicsImageSet(g2d, B_TYPE, 3, 2);
			break;
		case C :
			graphicsImageSet(g2d, C_TYPE, 4, 2);
			break;
		case D :
			graphicsImageSet(g2d, D_TYPE, 3, 2);
			break;
		case E :
			graphicsImageSet(g2d, E_TYPE, 6, 2);
			break;
		case F :
			imageUp.setImage(imageUp.getImage().getScaledInstance(WIDTH-2, SPECIAL_HEIGHT-2, Image.SCALE_DEFAULT));
        	imageDown.setImage(imageDown.getImage().getScaledInstance(WIDTH-2, SPECIAL_HEIGHT-2, Image.SCALE_DEFAULT));
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

        switchCase(g2d, imageName.charAt(TYPE_INDEX));
        
		if(this.isSelected()) {
			/*
			if(imageDown == null) { //the NO Direction case which is Brown
				return;
			}
			*/
			g2d.drawImage(imageDown.getImage(), 1, 1, null);
			/*
			 * play music once
			 */
//			System.out.println("selected" + imageDown);
		} else { //default is Up
			g2d.drawImage(imageUp.getImage(), 1, 1, null);
//			System.out.println("NON-selected" + imageUp);
		}
		
//        super.paintComponent(g); //super class will do paint
	}
	
	private String getWavPath(String name) {
		String tmp = getWavName(name);
		if(tmp == null) {
			return null;
		}
		return kp.getWavPath(tmp);
	}
	
	private String getWavName(String name) {
		if(name.charAt(DIRECTION_INDEX) == N) {
			return null;
		}
		String tmp = String.valueOf(name.charAt(SHARP_INDEX));
		tmp += String.valueOf(name.charAt(PITCH_INDEX));
		tmp += String.valueOf(name.charAt(OCTAVE_INDEX));
		return tmp;
	}

	private String getImageDownName(String name) {
		if(name.charAt(DIRECTION_INDEX) == N) {
			return name;
		}
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

	private String getPath(String upImageName) {
		
		if(upImageName.equals("NNRNC_Enter")) {
			System.out.println(kp.getPicPath(upImageName));
		}
		
		return kp.getPicPath(upImageName);
	}

}
