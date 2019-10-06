import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyboardPiano {

	ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
	KeyboardHook keyboardHook = null;
	
	 JFrame frmKeyboardpiano = new JFrame();
	 JTextField textField;
	 JTextField textField_1;
	 Color backGround = new Color(230, 231, 235);
	 MyButton tglbtnEsc = new MyButton(this, "Esc", "NNNAN_Esc");
	 MyButton tglbtn_F1 = new MyButton(this, "F1", "NNNAN_F1");
	 MyButton tglbtn_F2 = new MyButton(this, "F2", "NNNAN_F2");
	 MyButton tglbtn_F3 = new MyButton(this, "F3", "NNNAN_F3");
	 MyButton tglbtn_F4 = new MyButton(this, "F4", "NNNAN_F4");
	 MyButton tglbtn_F5 = new MyButton(this, "F5", "NNNAN_F5");
	 MyButton tglbtn_F6 = new MyButton(this, "F6", "NNNAN_F6");
	 MyButton tglbtn_F7 = new MyButton(this, "F7", "NNNAN_F7");
	 MyButton tglbtn_F8 = new MyButton(this, "F8", "NNNAN_F8");
	 MyButton tglbtn_F9 = new MyButton(this, "F9", "NNNAN_F9");
	 MyButton tglbtn_F10 = new MyButton(this, "F10", "NNNAN_F10");
	 MyButton tglbtn_F11 = new MyButton(this, "F11", "NNNAN_F11");
	 MyButton tglbtn_F12 = new MyButton(this, "F12", "NNNAN_F12");
	
	 MyButton tglbtnBackquote = new MyButton(this, "BackQuote", "NNNAN_BackQuote");
	 MyButton tglbtn_1 = new MyButton(this, "1", "LWUAB_5");
	 MyButton tglbtn_2 = new MyButton(this, "2", "LWUAD_5");
	 MyButton tglbtn_3 = new MyButton(this, "3", "LWUAF_5");
	 MyButton tglbtn_4 = new MyButton(this, "4", "LWUAG_5");
	 MyButton tglbtn_5 = new MyButton(this, "5", "LWUAI_5");
	 MyButton tglbtn_6 = new MyButton(this, "6", "LWUAK_5");
	 MyButton tglbtn_7 = new MyButton(this, "7", "LWUAA_6");
	 MyButton tglbtn_8 = new MyButton(this, "8", "LWUAB_6");
	 MyButton tglbtn_9 = new MyButton(this, "9", "LWUAD_6");
	 MyButton tglbtn_0 = new MyButton(this, "0", "LWUAF_6");
	 MyButton tglbtnMinus = new MyButton(this, "Minus", "LWUAG_6"); //-
	 MyButton tglbtnEquals = new MyButton(this, "Equals", "LWUAI_6"); //=
	 MyButton tglbtnBackspace = new MyButton(this, "BackSpace", "NNNCN_BackSpace");
	
	 MyButton tglbtnTab = new MyButton(this, "Tab", "NNNBN_Tab");
	 MyButton tglbtnQ = new MyButton(this, "Q", "LWUAB_4");
	 MyButton tglbtnW = new MyButton(this, "W", "LWUAD_4");
	 MyButton tglbtnE = new MyButton(this, "E", "LWUAF_4");
	 MyButton tglbtnR = new MyButton(this, "R", "LWUAG_4");
	 MyButton tglbtnT = new MyButton(this, "T", "LWUAI_4");
	 MyButton tglbtnY = new MyButton(this, "Y", "LWUAK_4");
	 MyButton tglbtnU = new MyButton(this, "U", "LWUAA_5");
	 MyButton tglbtnI = new MyButton(this, "I", "LWUAB_5");
	 MyButton tglbtnO = new MyButton(this, "O", "LWUAD_5");
	 MyButton tglbtnP = new MyButton(this, "P", "LWUAF_5");
	 MyButton tglbtnOpenbracket = new MyButton(this, "OpenBracket", "LWUAG_5"); //[
	 MyButton tglbtnClosebracket = new MyButton(this, "CloseBracket", "LWUAI_5"); //]
	 MyButton tglbtnBackslash = new MyButton(this, "BackSlash", "LWUBK_5"); //\
	
	 MyButton tglbtnCaps = new MyButton(this, "Caps", "NNNCN_Caps");
	 MyButton tglbtnA = new MyButton(this, "A", "LWUAB_3");
	 MyButton tglbtnS = new MyButton(this, "S", "LWUAD_3");
	 MyButton tglbtnD = new MyButton(this, "D", "LWUAF_3");
	 MyButton tglbtnF = new MyButton(this, "F", "LWUAG_3");
	 MyButton tglbtnG = new MyButton(this, "G", "LWUAI_3");
	 MyButton tglbtnH = new MyButton(this, "H", "LWUAK_3");
	 MyButton tglbtnJ = new MyButton(this, "J", "LWUAA_4");
	 MyButton tglbtnK = new MyButton(this, "K", "LWUAB_4");
	 MyButton tglbtnL = new MyButton(this, "L", "LWUAD_4");
	 MyButton tglbtnSemicolon = new MyButton(this, "Semicolon", "LWUAF_4"); //;
	 MyButton tglbtnQuote = new MyButton(this, "Quote", "LWUAG_4"); //'
	 MyButton tglbtnEnter = new MyButton(this, "Enter", "NNNCN_Enter");
	
	 MyButton tglbtnShiftleft = new MyButton(this, "ShiftLeft", "LWUDA_2");
	 MyButton tglbtnZ = new MyButton(this, "Z", "LWUAB_2");
	 MyButton tglbtnX = new MyButton(this, "X", "LWUAD_2");
	 MyButton tglbtnC = new MyButton(this, "C", "LWUAF_2");
	 MyButton tglbtnV = new MyButton(this, "V", "LWUAG_2");
	 MyButton tglbtnB = new MyButton(this, "B", "LWUAI_2");
	 MyButton tglbtnN = new MyButton(this, "N", "LWUAK_2");
	 MyButton tglbtnM = new MyButton(this, "M", "LWUAA_3");
	 MyButton tglbtnComma = new MyButton(this, "Comma", "LWUAB_3"); //,
	 MyButton tglbtnPeriod = new MyButton(this, "Period", "LWUAD_3"); //.
	 MyButton tglbtnSlash = new MyButton(this, "Slash", "LWUAF_3"); ///
	 MyButton tglbtnShiftright = new MyButton(this, "ShiftRight", "NNNDN_ShiftRight");
	
	 MyButton tglbtnCtrlleft = new MyButton(this, "CtrlLeft", "NNNBN_CtrlLeft");
	 MyButton tglbtnWinleft = new MyButton(this, "WinLeft", "NNNAN_WinLeft");
	 MyButton tglbtnAltleft = new MyButton(this, "AltLeft", "LWUAK_1");
	 MyButton tglbtnSpace = new MyButton(this, "Space", "NNNEN_Space");
	 MyButton tglbtnCtrlright = new MyButton(this, "CtrlRight", "NNNBN_CtrlRight");
	
	/*
	 * Can not catch Fn anyway, whether use KeyEvent/vkCode
	 */
	 MyButton tglbtnFn = new MyButton(this, "Fn", "NNNAN_Fn");
	
	 MyButton tglbtnWinright = new MyButton(this, "WinRight", "NNNAN_WinRight");
	 MyButton tglbtnAltright = new MyButton(this, "AltRight", "NNNAN_AltRight");
	
	 MyButton tglbtnPrtsc = new MyButton(this, "PrtSc", "NNNAN_PrtSc");
	 MyButton tglbtnScrlk = new MyButton(this, "ScrLk", "NNNAN_ScrLk");
	 MyButton tglbtnPause = new MyButton(this, "Pause", "NNNAN_Pause");
	 MyButton tglbtnIns = new MyButton(this, "Ins", "RLUAG_6");
	 MyButton tglbtnHome = new MyButton(this, "Home", "RLUAI_6");
	 MyButton tglbtnPgup = new MyButton(this, "PgUp", "RLUAK_6");
	 MyButton tglbtnDel = new MyButton(this, "Del", "RLUAB_6");
	 MyButton tglbtnEnd = new MyButton(this, "End", "RLUAD_6");
	 MyButton tglbtnPgdn = new MyButton(this, "PgDn", "RLUAF_6");
	 MyButton tglbtnUp = new MyButton(this, "Up", "RLUAG_3");
	 MyButton tglbtnLeft = new MyButton(this, "Left", "RLUAB_3");
	 MyButton tglbtnDown = new MyButton(this, "Down", "RLUAD_3");
	 MyButton tglbtnRight = new MyButton(this, "Right", "RLUAF_3");	
	
	 MyButton tglbtnNum = new MyButton(this, "Num", "RLUAG_5");
	 MyButton tglbtnNumpaddivide = new MyButton(this, "NumPadDivide", "RLUAI_5");
	 MyButton tglbtnNumpadmultiply = new MyButton(this, "NumPadMultiply", "RLUAK_5");
	 MyButton tglbtnNumpadminus = new MyButton(this, "NumPadMinus", "RLUAA_6");
	 MyButton tglbtnNumpad_7 = new MyButton(this, "NumPad_7", "RLUAA_5");
	 MyButton tglbtnNumpad_8 = new MyButton(this, "NumPad_8", "RLUAB_5");
	 MyButton tglbtnNumpad_9 = new MyButton(this, "NumPad_9", "RLUAD_5");
	 MyButton tglbtnNumpad_4 = new MyButton(this, "NumPad_4", "RLUAG_4");
	 MyButton tglbtnNumpad_5 = new MyButton(this, "NumPad_5", "RLUAI_4");
	 MyButton tglbtnNumpad_6 = new MyButton(this, "NumPad_6", "RLUAK_4");
	 MyButton tglbtnNumpad_1 = new MyButton(this, "NumPad_1", "RLUAB_4");
	 MyButton tglbtnNumpad_2 = new MyButton(this, "NumPad_2", "RLUAD_4");
	 MyButton tglbtnNumpad_3 = new MyButton(this, "NumPad_3", "RLUAF_4");
	 MyButton tglbtnNumpad_0 = new MyButton(this, "NumPad_0", "RLUCI_3");
	 MyButton tglbtnNumpaddecimal = new MyButton(this, "NumPadDecimal", "RLUAK_3");
	 MyButton tglbtnNumpadplus = new MyButton(this, "NumPadPlus", "RLUFF_5");
	 MyButton tglbtnNumpadenter = new MyButton(this, "NumPadEnter", "RLUFA_4");
	
	/*
	 * Without Fn key
	 */
	public static final int VK_ESC = 27;
	public static final int VK_F1 = 112;
	public static final int VK_F2 = 113;
	public static final int VK_F3 = 114;
	public static final int VK_F4 = 115;
	public static final int VK_F5 = 116;
	public static final int VK_F6 = 117;
	public static final int VK_F7 = 118;
	public static final int VK_F8 = 119;
	public static final int VK_F9 = 120;
	public static final int VK_F10 = 121;
	public static final int VK_F11 = 122;
	public static final int VK_F12 = 123;

	public static final int VK_BACK_QUOTE = 192;
	public static final int VK_1 = 49;
	public static final int VK_2 = 50;
	public static final int VK_3 = 51;
	public static final int VK_4 = 52;
	public static final int VK_5 = 53;
	public static final int VK_6 = 54;
	public static final int VK_7 = 55;
	public static final int VK_8 = 56;
	public static final int VK_9 = 57;
	public static final int VK_0 = 48;
	public static final int VK_MINUS = 189;
	public static final int VK_EQUALS = 187;
	public static final int VK_BACKSPACE = 8;

	public static final int VK_TAB = 9;
	public static final int VK_Q = 81;
	public static final int VK_W = 87;
	public static final int VK_E = 69;
	public static final int VK_R = 82;
	public static final int VK_T = 84;
	public static final int VK_Y = 89;
	public static final int VK_U = 85;
	public static final int VK_I = 73;
	public static final int VK_O = 79;
	public static final int VK_P = 80;
	public static final int VK_OPEN_BRACKET = 219;
	public static final int VK_CLOSE_BRACKET = 221;
	public static final int VK_BACKSLASH = 220;

	public static final int VK_CAPS_LOCK = 20;
	public static final int VK_A = 65;
	public static final int VK_S = 83;
	public static final int VK_D = 68;
	public static final int VK_F = 70;
	public static final int VK_G = 71;
	public static final int VK_H = 72;
	public static final int VK_J = 74;
	public static final int VK_K = 75;
	public static final int VK_L = 76;
	public static final int VK_SEMICOLON = 186;
	public static final int VK_QUOTE = 222;
	public static final int VK_ENTER = 13;

	public static final int VK_SHIFT_LEFT = 160;
	public static final int SHIFT_LEFT_SCAN_CODE = 42;
	public static final int VK_Z = 90;
	public static final int VK_X = 88;
	public static final int VK_C = 67;
	public static final int VK_V = 86;
	public static final int VK_B = 66;
	public static final int VK_N = 78;
	public static final int VK_M = 77;
	public static final int VK_COMMA = 188;
	public static final int VK_PERIOD = 190;
	public static final int VK_SLASH = 191;
	public static final int VK_SHIFT_RIGHT = 161;
	public static final int SHIFT_RIGHT_SCAN_CODE = 54;

	public static final int VK_CTRL_LEFT = 162;
	public static final int VK_WIN_LEFT = 91;
	public static final int VK_ALT_LEFT = 164;
	public static final int VK_SPACE = 32;
	public static final int VK_ALT_RIGHT = 165;
	public static final int VK_WIN_RIGHT = 92;
	public static final int VK_CTRL_RIGHT = 163;

	public static final int VK_PRINT_SCREEN = 44;
	public static final int VK_SCROLL_LOCK = 145;
	public static final int VK_PAUSE = 19;

	public static final int VK_INSERT = 45;
	public static final int VK_HOME = 36;
	public static final int VK_PAGE_UP = 33;
	public static final int VK_DELETE = 46;
	public static final int VK_END = 35;
	public static final int VK_PAGE_DOWN = 34;

	public static final int VK_UP = 38;
	public static final int VK_LEFT = 37;
	public static final int VK_DOWN = 40;
	public static final int VK_RIGHT = 39;

	public static final int VK_NUM_LOCK = 144;
	public static final int VK_NUMPAD_DIVIDE = 111;
	public static final int VK_NUMPAD_MULTIPLY = 106;
	public static final int VK_NUMPAD_MINUS = 109;
	public static final int VK_NUMPAD_7 = 103;
	public static final int VK_NUMPAD_8 = 104;
	public static final int VK_NUMPAD_9 = 105;
	public static final int VK_NUMPAD_4 = 100;
	public static final int VK_NUMPAD_5_A = 101;
	public static final int VK_NUMPAD_5_B = 12; //0xc
	public static final int VK_NUMPAD_6 = 102;
	public static final int VK_NUMPAD_1 = 97;
	public static final int VK_NUMPAD_2 = 98;
	public static final int VK_NUMPAD_3 = 99;
	public static final int VK_NUMPAD_0 = 96;
	public static final int VK_NUMPAD_DECIMAL = 110;
	public static final int VK_NUMPAD_PLUS = 107;

	public static final int VK_FN = -1; //which is never got
	
	public static final int KEY_PRESS_A = 260;
	public static final int KEY_PRESS_B = 256;
	public static final int KEY_RELEASE_A = 257;
	public static final int KEY_RELEASE_B = 261;

	public static final char L = 'L';
	public static final char R = 'R';
	
	public MyButton selectedButton = null;
	public PopupWindowManage popupWindowManager = null;
	public static ImageIcon selectIcon = 
			new ImageIcon(PropertiesManage.getImgProperty("select"));
	public static ImageIcon unselectIcon = 
			new ImageIcon(PropertiesManage.getImgProperty("unselect"));
	
	private static final int ICON_LENGTH = 20;
	
	/**
	 * Create the application.
	 */
	public KeyboardPiano() {
		new MainFrame(this).initialize(frmKeyboardpiano);
		new MusicPlayer(getWavPath("start")).start();
		keyboardHook = new KeyboardHook(this);
		
		selectIcon.setImage(selectIcon.getImage().getScaledInstance(ICON_LENGTH, ICON_LENGTH, Image.SCALE_DEFAULT));
		unselectIcon.setImage(unselectIcon.getImage().getScaledInstance(ICON_LENGTH, ICON_LENGTH, Image.SCALE_DEFAULT));
		
		popupWindowManager = new PopupWindowManage(this);
	}

	private static KeyboardPiano window = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new KeyboardPiano();
					window.frmKeyboardpiano.setVisible(true);
					WindowFocusAdapter wfa = window.new WindowFocusAdapter();
					window.frmKeyboardpiano.addWindowFocusListener(wfa);
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		});
	}
	
	private class WindowFocusAdapter implements WindowFocusListener {

		@Override
		public void windowGainedFocus(WindowEvent e) {
			if(keyboardHook != null && !keyboardHook.isFocused && 
					window.frmKeyboardpiano.isFocused()) {
				keyboardHook.setHookOn();
			}
		}

		@Override
		public void windowLostFocus(WindowEvent e) {
			if(keyboardHook != null && keyboardHook.isFocused &&
					!window.frmKeyboardpiano.isFocused()) {
				keyboardHook.setHookOff();
			}
		}

	}
	
	/*
	 * get path of picture from the key
	 */
	public String getImgPath(String key) {
		return PropertiesManage.getImgProperty(key);
	}
	
	/*
	 * get path of music(wav) from the key
	 */
	public String getWavPath(String key) {
		return PropertiesManage.getWavProperty(key);
	}
	
	/*
	 * return the other case of Color & Direction(U/D)
	 */
	public final String getDownColorDirection(String type) {
		if(type.equals("WU")) {
			return "GD";
		} else if(type.equals("LU")) {
			return "BD";
		} else if(type.equals("RX")) {
			return type;
		}
		return null;
	}
	
	public static final char getColorOnDiffSide(char type) {
		Character theOtherType = null;
		switch(type) {
		case MyButton.COLOR_W :
			theOtherType = MyButton.COLOR_L;
			break;
		case MyButton.COLOR_L :
			theOtherType = MyButton.COLOR_W;
			break;
		case MyButton.COLOR_G :
			theOtherType = MyButton.COLOR_B;
			break;
		case MyButton.COLOR_B :
			theOtherType = MyButton.COLOR_G;
			break;
		}
		System.out.println(theOtherType);
		return theOtherType;
	}
	
}
