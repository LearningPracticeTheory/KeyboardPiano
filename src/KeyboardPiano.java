import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class KeyboardPiano {

	 JFrame frmKeyboardpiano;
	 JTextField textField;
	 JTextField textField_1;
	 Color backGround = new Color(230, 231, 235);
	 JToggleButton tglbtnEsc = new MyButton(this, "Esc", "NNRNA_Esc");
	 JToggleButton tglbtnF_1 = new MyButton(this, "F1", "NNRNA_F1");
	 JToggleButton tglbtnF_2 = new MyButton(this, "F2", "NNRNA_F2");
	 JToggleButton tglbtnF_3 = new MyButton(this, "F3", "NNRNA_F3");
	 JToggleButton tglbtnF_4 = new MyButton(this, "F4", "NNRNA_F4");
	 JToggleButton tglbtnF_5 = new MyButton(this, "F5", "NNRNA_F5");
	 JToggleButton tglbtnF_6 = new MyButton(this, "F6", "NNRNA_F6");
	 JToggleButton tglbtnF_7 = new MyButton(this, "F7", "NNRNA_F7");
	 JToggleButton tglbtnF_8 = new MyButton(this, "F8", "NNRNA_F8");
	 JToggleButton tglbtnF_9 = new MyButton(this, "F9", "NNRNA_F9");
	 JToggleButton tglbtnF_10 = new MyButton(this, "F10", "NNRNA_F10");
	 JToggleButton tglbtnF_11 = new MyButton(this, "F11", "NNRNA_F11");
	 JToggleButton tglbtnF_12 = new MyButton(this, "F12", "NNRNA_F12");
	
	 JToggleButton tglbtnBackquote = new MyButton(this, "BackQuote", "NNRNA_BackQuote");
	 JToggleButton tglbtn_1 = new MyButton(this, "1", "SLWUA1_3");
	 JToggleButton tglbtn_2 = new MyButton(this, "2", "SLWUA2_3");
	 JToggleButton tglbtn_3 = new MyButton(this, "3", "XLWUA4_3");
	 JToggleButton tglbtn_4 = new MyButton(this, "4", "SLWUA4_3");
	 JToggleButton tglbtn_5 = new MyButton(this, "5", "SLWUA5_3");
	 JToggleButton tglbtn_6 = new MyButton(this, "6", "SLWUA6_3");
	 JToggleButton tglbtn_7 = new MyButton(this, "7", "XLWUA1_2");
	 JToggleButton tglbtn_8 = new MyButton(this, "8", "SLWUA1_2");
	 JToggleButton tglbtn_9 = new MyButton(this, "9", "SLWUA2_2");
	 JToggleButton tglbtn_0 = new MyButton(this, "0", "XLWUA4_2");
	 JToggleButton tglbtnMinus = new MyButton(this, "Minus", "SLWUA4_2"); //-
	 JToggleButton tglbtnEquals = new MyButton(this, "Equals", "SLWUA5_2"); //=
	 JToggleButton tglbtnBackspace = new MyButton(this, "BackSpace", "NNRNC_Backspace");
	
	 JToggleButton tglbtnTab = new MyButton(this, "Tab", "NNRNB_Tab");
	 JToggleButton tglbtnQ = new MyButton(this, "Q", "SLWUA1_4");
	 JToggleButton tglbtnW = new MyButton(this, "W", "SLWUA2_4");
	 JToggleButton tglbtnE = new MyButton(this, "E", "XLWUA4_4");
	 JToggleButton tglbtnR = new MyButton(this, "R", "SLWUA4_4");
	 JToggleButton tglbtnT = new MyButton(this, "T", "SLWUA5_4");
	 JToggleButton tglbtnY = new MyButton(this, "Y", "SLWUA6_4");
	 JToggleButton tglbtnU = new MyButton(this, "U", "XLWUA1_3");
	 JToggleButton tglbtnI = new MyButton(this, "I", "SLWUA1_3");
	 JToggleButton tglbtnO = new MyButton(this, "O", "SLWUA2_3");
	 JToggleButton tglbtnP = new MyButton(this, "P", "XLWUA4_3");
	 JToggleButton tglbtnClosebracket = new MyButton(this, "CloseBracket", "SLWUA5_3"); //[  
	 JToggleButton tglbtnOpenbracket = new MyButton(this, "OpenBracket", "SLWUA4_3"); //]
	 JToggleButton tglbtnBackslash = new MyButton(this, "BackSlash", "SLWUB6_3"); //\
	
	 JToggleButton tglbtnCaps = new MyButton(this, "Caps", "NNRNC_Caps");
	 JToggleButton tglbtnA = new MyButton(this, "A", "SLWUA1_5");
	 JToggleButton tglbtnS = new MyButton(this, "S", "SLWUA2_5");
	 JToggleButton tglbtnD = new MyButton(this, "D", "XLWUA4_5");
	 JToggleButton tglbtnF = new MyButton(this, "F", "SLWUA4_5");
	 JToggleButton tglbtnG = new MyButton(this, "G", "SLWUA5_5");
	 JToggleButton tglbtnH = new MyButton(this, "H", "SLWUA6_5");
	 JToggleButton tglbtnJ = new MyButton(this, "J", "XLWUA1_4");
	 JToggleButton tglbtnK = new MyButton(this, "K", "SLWUA1_4");
	 JToggleButton tglbtnL = new MyButton(this, "L", "SLWUA2_4");
	 JToggleButton tglbtnSemicolon = new MyButton(this, "Semicolon", "XLWUA4_4"); //;
	 JToggleButton tglbtnQuote = new MyButton(this, "Quote", "SLWUA4_4"); //'
	 JToggleButton tglbtnEnter = new MyButton(this, "Enter", "NNRNC_Enter");
	
	 JToggleButton tglbtnShiftleft = new MyButton(this, "ShiftLeft", "XLWUD1_6");
	 JToggleButton tglbtnZ = new MyButton(this, "Z", "SLWUA1_6");
	 JToggleButton tglbtnX = new MyButton(this, "X", "SLWUA2_6");
	 JToggleButton tglbtnC = new MyButton(this, "C", "XLWUA4_6");
	 JToggleButton tglbtnV = new MyButton(this, "V", "SLWUA4_6");
	 JToggleButton tglbtnB = new MyButton(this, "B", "SLWUA5_6");
	 JToggleButton tglbtnN = new MyButton(this, "N", "SLWUA6_6");
	 JToggleButton tglbtnM = new MyButton(this, "M", "XLWUA1_5");
	 JToggleButton tglbtnComma = new MyButton(this, "Comma", "SLWUA1_5"); //,
	 JToggleButton tglbtnPeriod = new MyButton(this, "Period", "SLWUA2_5"); //.
	 JToggleButton tglbtnSlash = new MyButton(this, "Slash", "XLWUA4_5"); ///
	 JToggleButton tglbtnShiftright = new MyButton(this, "ShiftRight", "NNRND_Shift");
	
	 JToggleButton tglbtnCtrlleft = new MyButton(this, "CtrlLeft", "NNRNB_Ctrl");
	 JToggleButton tglbtnWinleft = new MyButton(this, "WinLeft", "NNRNA_Win");
	 JToggleButton tglbtnAltleft = new MyButton(this, "AltLeft", "SLWUA6_6");
	 JToggleButton tglbtnSpace = new MyButton(this, "Space", "NNRNE_Space");
	 JToggleButton tglbtnCtrlright = new MyButton(this, "CtrlRight", "NNRNB_Ctrl");
	
	/*
	 * Can not catch Fn anyway, whether use KeyEvent/vkCode
	 */
	 JToggleButton tglbtnFn = new MyButton(this, "Fn", "NNRNA_Fn");
	
	 JToggleButton tglbtnWinright = new MyButton(this, "WinRight", "NNRNA_Win");
	 JToggleButton tglbtnAltright = new MyButton(this, "AltRight", "NNRNA_Alt");
	
	 JToggleButton tglbtnPrtsc = new MyButton(this, "PrtSc", "NNRNA_Play");
	 JToggleButton tglbtnScrlk = new MyButton(this, "ScrLk", "NNRNA_Rec");
	 JToggleButton tglbtnPause = new MyButton(this, "Pause", "NNRNA_Stop");
	 JToggleButton tglbtnIns = new MyButton(this, "Ins", "SRLUA4_2");
	 JToggleButton tglbtnHome = new MyButton(this, "Home", "SRLUA5_2");
	 JToggleButton tglbtnPgup = new MyButton(this, "PgUp", "SRLUA6_2");
	 JToggleButton tglbtnDel = new MyButton(this, "Del", "SRLUA1_2");
	 JToggleButton tglbtnEnd = new MyButton(this, "End", "SRLUA2_2");
	 JToggleButton tglbtnPgdn = new MyButton(this, "PgDn", "XRLUA4_2");
	 JToggleButton tglbtnUp = new MyButton(this, "Up", "SRLUA4_5");
	 JToggleButton tglbtnLeft = new MyButton(this, "Left", "SRLUA1_5");
	 JToggleButton tglbtnDown = new MyButton(this, "Down", "SRLUA2_5");
	 JToggleButton tglbtnRight = new MyButton(this, "Right", "XRLUA4_5");	
	
	 JToggleButton tglbtnNum = new MyButton(this, "Num", "SRLUA4_3");
	 JToggleButton tglbtnNumpaddivide = new MyButton(this, "NumPadDivide", "SRLUA5_3");
	 JToggleButton tglbtnNumpadmultiply = new MyButton(this, "NumPadMultiply", "SRLUA6_3");
	 JToggleButton tglbtnNumpadminus = new MyButton(this, "NumPadMinus", "XRLUA1_2");
	 JToggleButton tglbtnNumpad_7 = new MyButton(this, "NumPad_7", "XRLUA1_3");
	 JToggleButton tglbtnNumpad_8 = new MyButton(this, "NumPad_8", "SRLUA1_3");
	 JToggleButton tglbtnNumpad_9 = new MyButton(this, "NumPad_9", "SRLUA2_3");
	 JToggleButton tglbtnNumpad_4 = new MyButton(this, "NumPad_4", "SRLUA4_4");
	 JToggleButton tglbtnNumpad_5 = new MyButton(this, "NumPad_5", "SRLUA5_4");
	 JToggleButton tglbtnNumpad_6 = new MyButton(this, "NumPad_6", "SRLUA6_4");
	 JToggleButton tglbtnNumpad_1 = new MyButton(this, "NumPad_1", "SRLUA1_4");
	 JToggleButton tglbtnNumpad_2 = new MyButton(this, "NumPad_2", "SRLUA2_4");
	 JToggleButton tglbtnNumpad_3 = new MyButton(this, "NumPad_3", "XRLUA4_4");
	 JToggleButton tglbtnNumpad_0 = new MyButton(this, "NumPad_0", "SRLUC5_5");
	 JToggleButton tglbtnNumpaddecimal = new MyButton(this, "NumPadDecimal", "SRLUA6_5");
	 JToggleButton tglbtnNumpadplus = new MyButton(this, "NumPadPlus", "XRLUF4_3");
	 JToggleButton tglbtnNumpadenter = new MyButton(this, "NumPadEnter", "XRLUF1_4");
	
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
	public static final int VK_NUMPAD_5 = 101;
	public static final int VK_NUMPAD_5_FLAG = 12; //0xc
	public static final int VK_NUMPAD_6 = 102;
	public static final int VK_NUMPAD_1 = 97;
	public static final int VK_NUMPAD_2 = 98;
	public static final int VK_NUMPAD_3 = 99;
	public static final int VK_NUMPAD_0 = 96;
	public static final int VK_NUMPAD_DECIMAL = 110;
	public static final int VK_NUMPAD_PLUS = 107;
	//public static final int VK_NUMPAD_ENTER 13; //VK_ENTER == VK_NUMPAD_ENTER == 13;

	public static final int VK_FN = -1; //which is never got
	
	public static final int TYPE_OTHERS_BUTTON_UP = 257;
	public static final int TYPE_OTHERS_BUTTON_DOWN = 256;
	public static final int TYPE_ALT_UPDATE_BUTTON_UP = 261;
	public static final int TYPE_ALT_UPDATE_BUTTON_DOWN = 260;
	public static final int ALT_UP = 257;
	public static final int ALT_DOWN = 260;

//	public int button_up = TYPE_OTHERS_BUTTON_UP; //0x0101
//	public int button_down = TYPE_ALT_UPDATE_BUTTON_DOWN; //0x0100
	
	public static final char L = 'L';
	public static final char R = 'R';
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyboardPiano window = new KeyboardPiano();
					window.frmKeyboardpiano.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
	
	/**
	 * Create the application.
	 */
	public KeyboardPiano() {
		initialize();
		new Thread(new KeyboardHook(this)).start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKeyboardpiano = new JFrame();
		frmKeyboardpiano.setTitle("KeyboardPiano");
//		frame.setBounds(100, 100, 1096, 756);
		frmKeyboardpiano.setSize(1086, 782);
		frmKeyboardpiano.setResizable(false);
		frmKeyboardpiano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKeyboardpiano.setLocationRelativeTo(null);
		frmKeyboardpiano.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(backGround);
		frmKeyboardpiano.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(73, 78, 83));
		panel.add(panel_1, BorderLayout.NORTH);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(46, 48, 54));
		panel.add(panel_2, BorderLayout.SOUTH);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(backGround);
		panel.add(panel_3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(backGround);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(backGround);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(backGround);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(backGround);
		
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(backGround);
		
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(backGround);
		
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addComponent(tglbtnEsc, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_10, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_11, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF_12, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnEsc, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_10, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_11, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF_12, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_10.setLayout(gl_panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(backGround);
		
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addComponent(tglbtnBackquote, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtn_0, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnMinus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnEquals, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnBackspace, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnBackquote, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtn_0, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnEquals, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnBackspace, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_11.setLayout(gl_panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(backGround);
		

		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addComponent(tglbtnTab, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnQ, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnW, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnE, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnR, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnT, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnY, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnU, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnI, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnO, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnP, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnOpenbracket, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnClosebracket, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnBackslash, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnTab, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnQ, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnW, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnE, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnR, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnT, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnY, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnU, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnI, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnO, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnP, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnOpenbracket, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnClosebracket, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnBackslash, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_12.setLayout(gl_panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(backGround);
		

		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addComponent(tglbtnCaps, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnA, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnS, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnD, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnF, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnG, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnH, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnJ, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnK, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnL, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnSemicolon, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnQuote, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnEnter, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnCaps, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnA, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnS, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnD, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnF, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnG, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnH, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnJ, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnK, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnL, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnSemicolon, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnQuote, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnEnter, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_13.setLayout(gl_panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(backGround);
		

		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addComponent(tglbtnShiftleft, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnZ, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnX, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnC, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnV, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnB, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnN, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnM, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnComma, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnPeriod, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnSlash, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnShiftright, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnShiftleft, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnZ, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnX, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnC, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnV, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnB, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnN, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnM, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnComma, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnPeriod, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnSlash, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnShiftright, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_14.setLayout(gl_panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(backGround);
		

		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addComponent(tglbtnCtrlleft, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnWinleft, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnAltleft, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnSpace, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnAltright, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnWinright, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnFn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnCtrlright, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnCtrlleft, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnWinleft, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnAltleft, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnSpace, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnAltright, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnWinright, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnFn, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnCtrlright, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_15.setLayout(gl_panel_15);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(backGround);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(backGround);
		
		JPanel panel_5 = new JPanel();
		
		JPanel panel_6 = new JPanel();
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(backGround);
		

		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addComponent(tglbtnPrtsc, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnScrlk, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnPause, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnPrtsc, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnScrlk, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnPause, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_19.setLayout(gl_panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(backGround);
		

		GroupLayout gl_panel_20 = new GroupLayout(panel_20);
		gl_panel_20.setHorizontalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addComponent(tglbtnIns, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnHome, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnPgup, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_20.setVerticalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addGroup(gl_panel_20.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnIns, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnHome, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnPgup, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_20.setLayout(gl_panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(backGround);
		
		GroupLayout gl_panel_21 = new GroupLayout(panel_21);
		gl_panel_21.setHorizontalGroup(
			gl_panel_21.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_21.createSequentialGroup()
					.addComponent(tglbtnDel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnEnd, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnPgdn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_21.setVerticalGroup(
			gl_panel_21.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_21.createSequentialGroup()
					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnDel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnEnd, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnPgdn, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_21.setLayout(gl_panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(backGround);
		GroupLayout gl_panel_22 = new GroupLayout(panel_22);
		gl_panel_22.setHorizontalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGap(0, 134, Short.MAX_VALUE)
		);
		gl_panel_22.setVerticalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGap(0, 39, Short.MAX_VALUE)
		);
		panel_22.setLayout(gl_panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(backGround);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(backGround);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(backGround);
		GroupLayout gl_panel_23 = new GroupLayout(panel_23);
		gl_panel_23.setHorizontalGroup(
			gl_panel_23.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_23.createSequentialGroup()
					.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnUp, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_23.setVerticalGroup(
			gl_panel_23.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_23.createSequentialGroup()
					.addGroup(gl_panel_23.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnUp, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_23.setLayout(gl_panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(backGround);
		

		GroupLayout gl_panel_24 = new GroupLayout(panel_24);
		gl_panel_24.setHorizontalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_24.createSequentialGroup()
					.addComponent(tglbtnLeft, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnDown, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnRight, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_24.setVerticalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_24.createSequentialGroup()
					.addGroup(gl_panel_24.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnLeft, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnDown, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnRight, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_24.setLayout(gl_panel_24);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		);
		panel_7.setLayout(gl_panel_7);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(backGround);
		GroupLayout gl_panel_27 = new GroupLayout(panel_27);
		gl_panel_27.setHorizontalGroup(
			gl_panel_27.createParallelGroup(Alignment.LEADING)
				.addGap(0, 135, Short.MAX_VALUE)
		);
		gl_panel_27.setVerticalGroup(
			gl_panel_27.createParallelGroup(Alignment.LEADING)
				.addGap(0, 41, Short.MAX_VALUE)
		);
		panel_27.setLayout(gl_panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(backGround);
		GroupLayout gl_panel_28 = new GroupLayout(panel_28);
		gl_panel_28.setHorizontalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGap(0, 44, Short.MAX_VALUE)
		);
		gl_panel_28.setVerticalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGap(0, 41, Short.MAX_VALUE)
		);
		panel_28.setLayout(gl_panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(backGround);
		
		GroupLayout gl_panel_29 = new GroupLayout(panel_29);
		gl_panel_29.setHorizontalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addComponent(tglbtnNum, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpaddivide, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpadmultiply, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_29.setVerticalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnNum, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpaddivide, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpadmultiply, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_29.setLayout(gl_panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(backGround);
		
		GroupLayout gl_panel_30 = new GroupLayout(panel_30);
		gl_panel_30.setHorizontalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addComponent(tglbtnNumpadminus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_30.setVerticalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addComponent(tglbtnNumpadminus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_30.setLayout(gl_panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(backGround);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(backGround);

		GroupLayout gl_panel_38 = new GroupLayout(panel_38);
		gl_panel_38.setHorizontalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addComponent(tglbtnNumpad_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpad_8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpad_9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_38.setVerticalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnNumpad_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpad_8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpad_9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_38.setLayout(gl_panel_38);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(backGround);
		

		GroupLayout gl_panel_37 = new GroupLayout(panel_37);
		gl_panel_37.setHorizontalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addComponent(tglbtnNumpad_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpad_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpad_6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_37.setVerticalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnNumpad_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpad_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpad_6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_37.setLayout(gl_panel_37);
		GroupLayout gl_panel_31 = new GroupLayout(panel_31);
		gl_panel_31.setHorizontalGroup(
			gl_panel_31.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_31.setVerticalGroup(
			gl_panel_31.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_31.createSequentialGroup()
					.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		);
		panel_31.setLayout(gl_panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(backGround);
		
		
		GroupLayout gl_panel_32 = new GroupLayout(panel_32);
		gl_panel_32.setHorizontalGroup(
			gl_panel_32.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addComponent(tglbtnNumpadplus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_32.setVerticalGroup(
			gl_panel_32.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addComponent(tglbtnNumpadplus, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_32.setLayout(gl_panel_32);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(backGround);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(backGround);
		
		GroupLayout gl_panel_35 = new GroupLayout(panel_35);
		gl_panel_35.setHorizontalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addComponent(tglbtnNumpad_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpad_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpad_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_35.setVerticalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnNumpad_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpad_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpad_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_35.setLayout(gl_panel_35);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(backGround);
		
		GroupLayout gl_panel_36 = new GroupLayout(panel_36);
		gl_panel_36.setHorizontalGroup(
			gl_panel_36.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_36.createSequentialGroup()
					.addComponent(tglbtnNumpad_0, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tglbtnNumpaddecimal, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_36.setVerticalGroup(
			gl_panel_36.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_36.createSequentialGroup()
					.addGroup(gl_panel_36.createParallelGroup(Alignment.BASELINE)
						.addComponent(tglbtnNumpaddecimal, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNumpad_0, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_36.setLayout(gl_panel_36);
		GroupLayout gl_panel_33 = new GroupLayout(panel_33);
		gl_panel_33.setHorizontalGroup(
			gl_panel_33.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_33.setVerticalGroup(
			gl_panel_33.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_33.createSequentialGroup()
					.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
		);
		panel_33.setLayout(gl_panel_33);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(backGround);
		
		GroupLayout gl_panel_34 = new GroupLayout(panel_34);
		gl_panel_34.setHorizontalGroup(
			gl_panel_34.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addComponent(tglbtnNumpadenter, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_34.setVerticalGroup(
			gl_panel_34.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addComponent(tglbtnNumpadenter, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_34.setLayout(gl_panel_34);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
		);
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_9.createSequentialGroup()
					.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_9.createSequentialGroup()
					.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_9.createSequentialGroup()
					.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
		);
		panel_9.setLayout(gl_panel_9);
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		);
		panel_8.setLayout(gl_panel_8);
		panel_4.setLayout(gl_panel_4);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 1050, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 1050, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 1050, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(28)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
		);
		panel_3.setLayout(gl_panel_3);
		
	}
}
