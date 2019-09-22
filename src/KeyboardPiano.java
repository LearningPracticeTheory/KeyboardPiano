import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyboardPiano {

	ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
	KeyboardHook keyboardHook = null;
	
	 JFrame frmKeyboardpiano = new JFrame();
	 JTextField textField;
	 JTextField textField_1;
	 Color backGround = new Color(230, 231, 235);
	 MyButton tglbtnEsc = new MyButton(this, "Esc", "NNRNA_Esc");
	 MyButton tglbtnF_1 = new MyButton(this, "F1", "NNRNA_F1");
	 MyButton tglbtnF_2 = new MyButton(this, "F2", "NNRNA_F2");
	 MyButton tglbtnF_3 = new MyButton(this, "F3", "NNRNA_F3");
	 MyButton tglbtnF_4 = new MyButton(this, "F4", "NNRNA_F4");
	 MyButton tglbtnF_5 = new MyButton(this, "F5", "NNRNA_F5");
	 MyButton tglbtnF_6 = new MyButton(this, "F6", "NNRNA_F6");
	 MyButton tglbtnF_7 = new MyButton(this, "F7", "NNRNA_F7");
	 MyButton tglbtnF_8 = new MyButton(this, "F8", "NNRNA_F8");
	 MyButton tglbtnF_9 = new MyButton(this, "F9", "NNRNA_F9");
	 MyButton tglbtnF_10 = new MyButton(this, "F10", "NNRNA_F10");
	 MyButton tglbtnF_11 = new MyButton(this, "F11", "NNRNA_F11");
	 MyButton tglbtnF_12 = new MyButton(this, "F12", "NNRNA_F12");
	
	 MyButton tglbtnBackquote = new MyButton(this, "BackQuote", "NNRNA_BackQuote");
	 MyButton tglbtn_1 = new MyButton(this, "1", "SLWUA1_3");
	 MyButton tglbtn_2 = new MyButton(this, "2", "SLWUA2_3");
	 MyButton tglbtn_3 = new MyButton(this, "3", "XLWUA4_3");
	 MyButton tglbtn_4 = new MyButton(this, "4", "SLWUA4_3");
	 MyButton tglbtn_5 = new MyButton(this, "5", "SLWUA5_3");
	 MyButton tglbtn_6 = new MyButton(this, "6", "SLWUA6_3");
	 MyButton tglbtn_7 = new MyButton(this, "7", "XLWUA1_2");
	 MyButton tglbtn_8 = new MyButton(this, "8", "SLWUA1_2");
	 MyButton tglbtn_9 = new MyButton(this, "9", "SLWUA2_2");
	 MyButton tglbtn_0 = new MyButton(this, "0", "XLWUA4_2");
	 MyButton tglbtnMinus = new MyButton(this, "Minus", "SLWUA4_2"); //-
	 MyButton tglbtnEquals = new MyButton(this, "Equals", "SLWUA5_2"); //=
	 MyButton tglbtnBackspace = new MyButton(this, "BackSpace", "NNRNC_Backspace");
	
	 MyButton tglbtnTab = new MyButton(this, "Tab", "NNRNB_Tab");
	 MyButton tglbtnQ = new MyButton(this, "Q", "SLWUA1_4");
	 MyButton tglbtnW = new MyButton(this, "W", "SLWUA2_4");
	 MyButton tglbtnE = new MyButton(this, "E", "XLWUA4_4");
	 MyButton tglbtnR = new MyButton(this, "R", "SLWUA4_4");
	 MyButton tglbtnT = new MyButton(this, "T", "SLWUA5_4");
	 MyButton tglbtnY = new MyButton(this, "Y", "SLWUA6_4");
	 MyButton tglbtnU = new MyButton(this, "U", "XLWUA1_3");
	 MyButton tglbtnI = new MyButton(this, "I", "SLWUA1_3");
	 MyButton tglbtnO = new MyButton(this, "O", "SLWUA2_3");
	 MyButton tglbtnP = new MyButton(this, "P", "XLWUA4_3");
	 MyButton tglbtnClosebracket = new MyButton(this, "CloseBracket", "SLWUA5_3"); //[  
	 MyButton tglbtnOpenbracket = new MyButton(this, "OpenBracket", "SLWUA4_3"); //]
	 MyButton tglbtnBackslash = new MyButton(this, "BackSlash", "SLWUB6_3"); //\
	
	 MyButton tglbtnCaps = new MyButton(this, "Caps", "NNRNC_Caps");
	 MyButton tglbtnA = new MyButton(this, "A", "SLWUA1_5");
	 MyButton tglbtnS = new MyButton(this, "S", "SLWUA2_5");
	 MyButton tglbtnD = new MyButton(this, "D", "XLWUA4_5");
	 MyButton tglbtnF = new MyButton(this, "F", "SLWUA4_5");
	 MyButton tglbtnG = new MyButton(this, "G", "SLWUA5_5");
	 MyButton tglbtnH = new MyButton(this, "H", "SLWUA6_5");
	 MyButton tglbtnJ = new MyButton(this, "J", "XLWUA1_4");
	 MyButton tglbtnK = new MyButton(this, "K", "SLWUA1_4");
	 MyButton tglbtnL = new MyButton(this, "L", "SLWUA2_4");
	 MyButton tglbtnSemicolon = new MyButton(this, "Semicolon", "XLWUA4_4"); //;
	 MyButton tglbtnQuote = new MyButton(this, "Quote", "SLWUA4_4"); //'
	 MyButton tglbtnEnter = new MyButton(this, "Enter", "NNRNC_Enter");
	
	 MyButton tglbtnShiftleft = new MyButton(this, "ShiftLeft", "XLWUD1_6");
	 MyButton tglbtnZ = new MyButton(this, "Z", "SLWUA1_6");
	 MyButton tglbtnX = new MyButton(this, "X", "SLWUA2_6");
	 MyButton tglbtnC = new MyButton(this, "C", "XLWUA4_6");
	 MyButton tglbtnV = new MyButton(this, "V", "SLWUA4_6");
	 MyButton tglbtnB = new MyButton(this, "B", "SLWUA5_6");
	 MyButton tglbtnN = new MyButton(this, "N", "SLWUA6_6");
	 MyButton tglbtnM = new MyButton(this, "M", "XLWUA1_5");
	 MyButton tglbtnComma = new MyButton(this, "Comma", "SLWUA1_5"); //,
	 MyButton tglbtnPeriod = new MyButton(this, "Period", "SLWUA2_5"); //.
	 MyButton tglbtnSlash = new MyButton(this, "Slash", "XLWUA4_5"); ///
	 MyButton tglbtnShiftright = new MyButton(this, "ShiftRight", "NNRND_Shift");
	
	 MyButton tglbtnCtrlleft = new MyButton(this, "CtrlLeft", "NNRNB_Ctrl");
	 MyButton tglbtnWinleft = new MyButton(this, "WinLeft", "NNRNA_Win");
	 MyButton tglbtnAltleft = new MyButton(this, "AltLeft", "SLWUA6_6");
	 MyButton tglbtnSpace = new MyButton(this, "Space", "NNRNE_Space");
	 MyButton tglbtnCtrlright = new MyButton(this, "CtrlRight", "NNRNB_Ctrl");
	
	/*
	 * Can not catch Fn anyway, whether use KeyEvent/vkCode
	 */
	 MyButton tglbtnFn = new MyButton(this, "Fn", "NNRNA_Fn");
	
	 MyButton tglbtnWinright = new MyButton(this, "WinRight", "NNRNA_Win");
	 MyButton tglbtnAltright = new MyButton(this, "AltRight", "NNRNA_Alt");
	
	 MyButton tglbtnPrtsc = new MyButton(this, "PrtSc", "NNRNA_Play");
	 MyButton tglbtnScrlk = new MyButton(this, "ScrLk", "NNRNA_Rec");
	 MyButton tglbtnPause = new MyButton(this, "Pause", "NNRNA_Stop");
	 MyButton tglbtnIns = new MyButton(this, "Ins", "SRLUA4_2");
	 MyButton tglbtnHome = new MyButton(this, "Home", "SRLUA5_2");
	 MyButton tglbtnPgup = new MyButton(this, "PgUp", "SRLUA6_2");
	 MyButton tglbtnDel = new MyButton(this, "Del", "SRLUA1_2");
	 MyButton tglbtnEnd = new MyButton(this, "End", "SRLUA2_2");
	 MyButton tglbtnPgdn = new MyButton(this, "PgDn", "XRLUA4_2");
	 MyButton tglbtnUp = new MyButton(this, "Up", "SRLUA4_5");
	 MyButton tglbtnLeft = new MyButton(this, "Left", "SRLUA1_5");
	 MyButton tglbtnDown = new MyButton(this, "Down", "SRLUA2_5");
	 MyButton tglbtnRight = new MyButton(this, "Right", "XRLUA4_5");	
	
	 MyButton tglbtnNum = new MyButton(this, "Num", "SRLUA4_3");
	 MyButton tglbtnNumpaddivide = new MyButton(this, "NumPadDivide", "SRLUA5_3");
	 MyButton tglbtnNumpadmultiply = new MyButton(this, "NumPadMultiply", "SRLUA6_3");
	 MyButton tglbtnNumpadminus = new MyButton(this, "NumPadMinus", "XRLUA1_2");
	 MyButton tglbtnNumpad_7 = new MyButton(this, "NumPad_7", "XRLUA1_3");
	 MyButton tglbtnNumpad_8 = new MyButton(this, "NumPad_8", "SRLUA1_3");
	 MyButton tglbtnNumpad_9 = new MyButton(this, "NumPad_9", "SRLUA2_3");
	 MyButton tglbtnNumpad_4 = new MyButton(this, "NumPad_4", "SRLUA4_4");
	 MyButton tglbtnNumpad_5 = new MyButton(this, "NumPad_5", "SRLUA5_4");
	 MyButton tglbtnNumpad_6 = new MyButton(this, "NumPad_6", "SRLUA6_4");
	 MyButton tglbtnNumpad_1 = new MyButton(this, "NumPad_1", "SRLUA1_4");
	 MyButton tglbtnNumpad_2 = new MyButton(this, "NumPad_2", "SRLUA2_4");
	 MyButton tglbtnNumpad_3 = new MyButton(this, "NumPad_3", "XRLUA4_4");
	 MyButton tglbtnNumpad_0 = new MyButton(this, "NumPad_0", "SRLUC5_5");
	 MyButton tglbtnNumpaddecimal = new MyButton(this, "NumPadDecimal", "SRLUA6_5");
	 MyButton tglbtnNumpadplus = new MyButton(this, "NumPadPlus", "XRLUF4_3");
	 MyButton tglbtnNumpadenter = new MyButton(this, "NumPadEnter", "XRLUF1_4");
	
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
	
	/**
	 * Create the application.
	 */
	public KeyboardPiano() {
		new MainFrame(this).initialize(frmKeyboardpiano);
		new MusicPlayer(getWavPath("START")).start();
		keyboardHook = new KeyboardHook(this);
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
			// TODO Auto-generated method stub
			if(keyboardHook != null && !keyboardHook.isFocused && 
					window.frmKeyboardpiano.isFocused()) {
				keyboardHook.setHookOn();
			}
		}

		@Override
		public void windowLostFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			if(keyboardHook != null && keyboardHook.isFocused &&
					!window.frmKeyboardpiano.isFocused()) {
				keyboardHook.setHookOff();
			}
		}

	}
	
	/*
	 * get path of picture from the key
	 */
	public String getPicPath(String key) {
		return PropertiesManage.getPicProperty(key);
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
	
}
