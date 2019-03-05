import javax.swing.JToggleButton;

import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HMODULE;
import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.platform.win32.WinUser.HHOOK;
import com.sun.jna.platform.win32.WinUser.KBDLLHOOKSTRUCT;
import com.sun.jna.platform.win32.WinUser.LowLevelKeyboardProc;

public class KeyboardHook implements Runnable {

	KeyboardPiano kp;
	private HHOOK hhk = null;
	private LowLevelKeyboardProc keyboardProc = new KeyboardProc();
	
	private static final int FLAG_DOWN = 1;
	private static final int FLAG_UP = FLAG_DOWN + 128;
	private static final int FLAG_NUMPAD_DOWN = 0;
	private static final int FLAG_NUMPAD_UP = FLAG_NUMPAD_DOWN + 128;
	/*
	 * after Alt pressed, then the Enter's & NumpadEnter's flags change 
	 */
	private static final int FLAG_ALT_NUMPAD_ENTER_DOWN = 32;
	private static final int FLAG_ALT_NUMPAD_ENTER_UP = FLAG_ALT_NUMPAD_ENTER_DOWN + 128;
	private static final int FLAG_ALT_ENTER_DOWN = 33;
	private static final int FLAG_ALT_ENTER_UP = FLAG_ALT_ENTER_DOWN + 128;
	
	public KeyboardHook(KeyboardPiano kp) {
		this.kp = kp;
	}

	private class KeyboardProc implements LowLevelKeyboardProc {

		private int flags = 0;
		
		/*
		 * catch vkCode & flags to identify different key type
		 */
		@Override
		public LRESULT callback(int code, WPARAM wParam, KBDLLHOOKSTRUCT event) {
			if(code >= 0) {
				int key = event.vkCode;
				int type = Integer.parseInt(wParam.toString());
				flags = event.flags;
				switchKey(key, type);
				return new LRESULT(1); //KIA all keys
			}
			return User32.INSTANCE.CallNextHookEx(hhk, code, wParam, null);
		}
		
		/*
		 * handle all kind of keys
		 */
		public void switchKey(int key, int type) {
			switch(key) {
			case KeyboardPiano.VK_ESC :
				select(kp.tglbtnEsc, type);
				break;
			case KeyboardPiano.VK_F1 :
				select(kp.tglbtnF_1, type);
				break;
			case KeyboardPiano.VK_F2 :
				select(kp.tglbtnF_2, type);
				break;
			case KeyboardPiano.VK_F3 :
				select(kp.tglbtnF_3, type);
				break;
			case KeyboardPiano.VK_F4 :
				select(kp.tglbtnF_4, type);
				break;
			case KeyboardPiano.VK_F5 :
				select(kp.tglbtnF_5, type);
				break;
			case KeyboardPiano.VK_F6 :
				select(kp.tglbtnF_6, type);
				break;
			case KeyboardPiano.VK_F7 :
				select(kp.tglbtnF_7, type);
				 break;
			case KeyboardPiano.VK_F8 :
				select(kp.tglbtnF_8, type);
				 break;
			case KeyboardPiano.VK_F9 :
				select(kp.tglbtnF_9, type);
				 break;
			case KeyboardPiano.VK_F10 :
				select(kp.tglbtnF_10, type);
				 break;
			case KeyboardPiano.VK_F11 :
				select(kp.tglbtnF_11, type);
				 break;
			case KeyboardPiano.VK_F12 :
				select(kp.tglbtnF_12, type);
				break;
				
			case KeyboardPiano.VK_BACK_QUOTE :
				select(kp.tglbtnBackquote, type);
				break;
			case KeyboardPiano.VK_1 :
				select(kp.tglbtn_1, type);
				break;
			case KeyboardPiano.VK_2 :
				select(kp.tglbtn_2, type);
				break;
			case KeyboardPiano.VK_3 :
				select(kp.tglbtn_3, type);
				break;
			case KeyboardPiano.VK_4 :
				select(kp.tglbtn_4, type);
				break;
			case KeyboardPiano.VK_5 :
				select(kp.tglbtn_5, type);
				break;
			case KeyboardPiano.VK_6 :
				select(kp.tglbtn_6, type);
				break;
			case KeyboardPiano.VK_7 :
				select(kp.tglbtn_7, type);
				break;
			case KeyboardPiano.VK_8 :
				select(kp.tglbtn_8, type);
				break;
			case KeyboardPiano.VK_9 :
				select(kp.tglbtn_9, type);
				break;
			case KeyboardPiano.VK_0 :
				select(kp.tglbtn_0, type);
				break;
			case KeyboardPiano.VK_MINUS :
				select(kp.tglbtnMinus, type);
				break;
			case KeyboardPiano.VK_EQUALS :
				select(kp.tglbtnEquals, type);
				break;
			case KeyboardPiano.VK_BACKSPACE :
				select(kp.tglbtnBackspace, type);	
				break;
			case KeyboardPiano.VK_TAB :
				select(kp.tglbtnTab, type);
				break;
			case KeyboardPiano.VK_Q :
				select(kp.tglbtnQ, type);
				break;
			case KeyboardPiano.VK_W :
				select(kp.tglbtnW, type);
				break;
			case KeyboardPiano.VK_E :
				select(kp.tglbtnE, type);
				break;
			case KeyboardPiano.VK_R :
				select(kp.tglbtnR, type);
				break;
			case KeyboardPiano.VK_T :
				select(kp.tglbtnT, type);
				break;
			case KeyboardPiano.VK_Y :
				select(kp.tglbtnY, type);
				break;
			case KeyboardPiano.VK_U :
				select(kp.tglbtnU, type);
				break;
			case KeyboardPiano.VK_I :
				select(kp.tglbtnI, type);
				break;
			case KeyboardPiano.VK_O :
				select(kp.tglbtnO, type);
				break;
			case KeyboardPiano.VK_P :
				select(kp.tglbtnP, type);
				break;
			case KeyboardPiano.VK_OPEN_BRACKET :
				select(kp.tglbtnOpenbracket, type);
				break;
			case KeyboardPiano.VK_CLOSE_BRACKET :
				select(kp.tglbtnClosebracket, type);
				break;
			case KeyboardPiano.VK_BACKSLASH :
				select(kp.tglbtnBackslash, type);
				break;
				
			case KeyboardPiano.VK_CAPS_LOCK :
				select(kp.tglbtnCaps, type);
				break;
			case KeyboardPiano.VK_A :
				select(kp.tglbtnA, type);
				break;
			case KeyboardPiano.VK_S :
				select(kp.tglbtnS, type);
				break;
			case KeyboardPiano.VK_D :
				select(kp.tglbtnD, type);
				break;
			case KeyboardPiano.VK_F :
				select(kp.tglbtnF, type);
				break;
			case KeyboardPiano.VK_G :
				select(kp.tglbtnG, type);
				break;
			case KeyboardPiano.VK_H :
				select(kp.tglbtnH, type);
				break;
			case KeyboardPiano.VK_J :
				select(kp.tglbtnJ, type);
				break;
			case KeyboardPiano.VK_K :
				select(kp.tglbtnK, type);
				break;
			case KeyboardPiano.VK_L :
				select(kp.tglbtnL, type);
				break;
			case KeyboardPiano.VK_SEMICOLON :
				select(kp.tglbtnSemicolon, type);
				break;
			case KeyboardPiano.VK_QUOTE :
				select(kp.tglbtnQuote, type);
				break;

			case KeyboardPiano.VK_SHIFT_LEFT :
				select(kp.tglbtnShiftleft, type);
				break;
			case KeyboardPiano.VK_Z :
				select(kp.tglbtnZ, type);
				break;
			case KeyboardPiano.VK_X :
				select(kp.tglbtnX, type);
				break;
			case KeyboardPiano.VK_C :
				select(kp.tglbtnC, type);
				break;
			case KeyboardPiano.VK_V :
				select(kp.tglbtnV, type);
				break;
			case KeyboardPiano.VK_B :
				select(kp.tglbtnB, type);
				break;
			case KeyboardPiano.VK_N :
				select(kp.tglbtnN, type);
				break;
			case KeyboardPiano.VK_M :
				select(kp.tglbtnM, type);
				break;
			case KeyboardPiano.VK_COMMA :
				select(kp.tglbtnComma, type);
				break;
			case KeyboardPiano.VK_PERIOD :
				select(kp.tglbtnPeriod, type);
				break;
			case KeyboardPiano.VK_SLASH :
				select(kp.tglbtnSlash, type);
				break;
			case KeyboardPiano.VK_SHIFT_RIGHT :
				select(kp.tglbtnShiftright, type);
				break;
				
			case KeyboardPiano.VK_CTRL_LEFT :
				select(kp.tglbtnCtrlleft, type);
				break;
			case KeyboardPiano.VK_WIN_LEFT :
				select(kp.tglbtnWinleft, type);
				break;
			case KeyboardPiano.VK_SPACE :
				select(kp.tglbtnSpace, type);
				break;
			case KeyboardPiano.VK_WIN_RIGHT :
				select(kp.tglbtnWinright, type);
				break;
			case KeyboardPiano.VK_CTRL_RIGHT :
				select(kp.tglbtnCtrlright, type);
				break;
				
			case KeyboardPiano.VK_PRINT_SCREEN :
				select(kp.tglbtnPrtsc, type);
				break;
			case KeyboardPiano.VK_SCROLL_LOCK :
				select(kp.tglbtnScrlk, type);
				break;
			case KeyboardPiano.VK_PAUSE :
				select(kp.tglbtnPause, type);
				break;
				
			case KeyboardPiano.VK_NUM_LOCK :
				select(kp.tglbtnNum, type);
				break;
			case KeyboardPiano.VK_NUMPAD_DIVIDE :
				select(kp.tglbtnNumpaddivide, type);
				break;
			case KeyboardPiano.VK_NUMPAD_MULTIPLY :
				select(kp.tglbtnNumpadmultiply, type);
				break;
			case KeyboardPiano.VK_NUMPAD_MINUS :
				select(kp.tglbtnNumpadminus, type);
				break;
			case KeyboardPiano.VK_NUMPAD_7 :
				select(kp.tglbtnNumpad_7, type);
				break;
			case KeyboardPiano.VK_NUMPAD_8 :
				select(kp.tglbtnNumpad_8, type);
				break;
			case KeyboardPiano.VK_NUMPAD_9 :
				select(kp.tglbtnNumpad_9, type);
				break;
			case KeyboardPiano.VK_NUMPAD_4 :
				select(kp.tglbtnNumpad_4, type);
				break;
			case KeyboardPiano.VK_NUMPAD_5 :
			case KeyboardPiano.VK_NUMPAD_5_FLAG:
				select(kp.tglbtnNumpad_5, type);
				break;
			case KeyboardPiano.VK_NUMPAD_6 :
				select(kp.tglbtnNumpad_6, type);
				break;
			case KeyboardPiano.VK_NUMPAD_1 :
				select(kp.tglbtnNumpad_1, type);
				break;
			case KeyboardPiano.VK_NUMPAD_2 :
				select(kp.tglbtnNumpad_2, type);
				break;
			case KeyboardPiano.VK_NUMPAD_3 :
				select(kp.tglbtnNumpad_3, type);
				break;
			case KeyboardPiano.VK_NUMPAD_0 :
				select(kp.tglbtnNumpad_0, type);
				break;
			case KeyboardPiano.VK_NUMPAD_DECIMAL :
				select(kp.tglbtnNumpaddecimal, type);
				break;
			case KeyboardPiano.VK_NUMPAD_PLUS :
				select(kp.tglbtnNumpadplus, type);
				break;
			
			/*
			 * special case
			 */
			case KeyboardPiano.VK_FN : //-1
				select(kp.tglbtnFn, type);
				break;
			case KeyboardPiano.VK_ALT_LEFT :
				select(kp.tglbtnAltleft, type);
				break;
			case KeyboardPiano.VK_ALT_RIGHT :
				select(kp.tglbtnAltright, type);
				break;
				
			case KeyboardPiano.VK_INSERT :
				flagCase(kp.tglbtnIns, kp.tglbtnNumpad_0);
				break;
			case KeyboardPiano.VK_HOME :
				flagCase(kp.tglbtnHome, kp.tglbtnNumpad_7);
				break;
			case KeyboardPiano.VK_PAGE_UP :
				flagCase(kp.tglbtnPgup, kp.tglbtnNumpad_9);
				break;
			case KeyboardPiano.VK_DELETE :
				flagCase(kp.tglbtnDel, kp.tglbtnNumpaddecimal);
				break;
			case KeyboardPiano.VK_END :
				flagCase(kp.tglbtnEnd, kp.tglbtnNumpad_1);
				break;
			case KeyboardPiano.VK_PAGE_DOWN :
				flagCase(kp.tglbtnPgdn, kp.tglbtnNumpad_3);
				break;
				
			case KeyboardPiano.VK_UP :
				flagCase(kp.tglbtnUp, kp.tglbtnNumpad_8);
				break;
			case KeyboardPiano.VK_LEFT :
				flagCase(kp.tglbtnLeft, kp.tglbtnNumpad_4);
				break;
			case KeyboardPiano.VK_DOWN :
				flagCase(kp.tglbtnDown, kp.tglbtnNumpad_2);
				break;
			case KeyboardPiano.VK_RIGHT :
				flagCase(kp.tglbtnRight, kp.tglbtnNumpad_6);
				break;
			
			case KeyboardPiano.VK_ENTER : //two case
				if(flags == FLAG_NUMPAD_UP || flags == FLAG_ALT_NUMPAD_ENTER_UP) {
					kp.tglbtnEnter.setSelected(false);
				} else if(flags == FLAG_UP || flags == FLAG_ALT_ENTER_UP) {
					kp.tglbtnNumpadenter.setSelected(false);
				} 
				if(flags == FLAG_NUMPAD_DOWN || flags == FLAG_ALT_NUMPAD_ENTER_DOWN) {
					buttonSelected(kp.tglbtnEnter);
				} else if(flags == FLAG_DOWN || flags == FLAG_ALT_ENTER_DOWN) {
					buttonSelected(kp.tglbtnNumpadenter);
				}
				break;
			}
			
		}
		
		private void flagCase(JToggleButton button, JToggleButton numpadButton) {
			if(flags == FLAG_NUMPAD_DOWN || flags == FLAG_ALT_NUMPAD_ENTER_DOWN) {
				buttonSelected(numpadButton);
			} else if(flags == FLAG_DOWN || flags == FLAG_ALT_ENTER_DOWN) {
				buttonSelected(button);
			} else if(flags == FLAG_ALT_ENTER_UP || flags == FLAG_UP) {
				button.setSelected(false);
			} else if(flags == FLAG_ALT_NUMPAD_ENTER_UP || flags == FLAG_NUMPAD_UP) {
				numpadButton.setSelected(false);
			}
		}

		private void buttonSelected(JToggleButton button) {
 			if(button.isSelected()) {
 				return;
 			}
 			button.setSelected(true);
		}

		public void select(JToggleButton jtb, int type) {
			if(type == KeyboardPiano.ALT_UP
					|| type == KeyboardPiano.TYPE_ALT_UPDATE_BUTTON_UP 
					|| type == KeyboardPiano.TYPE_OTHERS_BUTTON_UP) {
				jtb.setSelected(false);
			} else if( type == KeyboardPiano.ALT_DOWN
					|| type == KeyboardPiano.TYPE_ALT_UPDATE_BUTTON_DOWN
					|| type == KeyboardPiano.TYPE_OTHERS_BUTTON_DOWN) {
				buttonSelected(jtb);
			}
		}
		
	}

	@Override
	public void run() {
		
		HMODULE hMod = Kernel32.INSTANCE.GetModuleHandle(null);
		hhk = User32.INSTANCE.SetWindowsHookEx(User32.WH_KEYBOARD_LL, keyboardProc, hMod, 0);
		WinUser.MSG msg = new WinUser.MSG();
		while ((User32.INSTANCE.GetMessage(msg, null, 0, 0)) != 0) { }
		
	}

}
