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
	
	public KeyboardHook(KeyboardPiano kp) {
		this.kp = kp;
	}

	private class KeyboardProc implements LowLevelKeyboardProc {

		private int key = 0;
		
		@Override
		public LRESULT callback(int code, WPARAM wParam, KBDLLHOOKSTRUCT event) {
			if(code >= 0) {
				key = event.vkCode;
				switchKey(key);
				return new LRESULT(1); //KIA all keys
			}
			return User32.INSTANCE.CallNextHookEx(hhk, code, wParam, null);
		}
		
		public void switchKey(int key) {
			switch(key) {
			case KeyboardPiano.VK_ESC :
				 break;
			case KeyboardPiano.VK_F1 :
				 break;
			case KeyboardPiano.VK_F2 :
				 break;
			case KeyboardPiano.VK_F3 :
				 break;
			case KeyboardPiano.VK_F4 :
				 break;
			case KeyboardPiano.VK_F5 :
				 break;
			case KeyboardPiano.VK_F6 :
				 break;
			case KeyboardPiano.VK_F7 :
				 break;
			case KeyboardPiano.VK_F8 :
				 break;
			case KeyboardPiano.VK_F9 :
				 break;
			case KeyboardPiano.VK_F10 :
				 break;
			case KeyboardPiano.VK_F11 :
				 break;
			case KeyboardPiano.VK_F12 :
				 break;
			case KeyboardPiano.VK_BACK_QUOTE :
				 break;
			case KeyboardPiano.VK_1 :
				 break;
			case KeyboardPiano.VK_2 :
				 break;
			case KeyboardPiano.VK_3 :
				 break;
			case KeyboardPiano.VK_4 :
				 break;
			case KeyboardPiano.VK_5 :
				 break;
			case KeyboardPiano.VK_6 :
				 break;
			case KeyboardPiano.VK_7 :
				 break;
			case KeyboardPiano.VK_8 :
				 break;
			case KeyboardPiano.VK_9 :
				 break;
			case KeyboardPiano.VK_0 :
				 break;
			case KeyboardPiano.VK_MINUS :
				 break;
			case KeyboardPiano.VK_EQUALS :
				 break;
			case KeyboardPiano.VK_BACKSPACE :
				 break;

			case KeyboardPiano.VK_TAB :
				 break;
			case KeyboardPiano.VK_Q :
				 break;
			case KeyboardPiano.VK_W :
				 break;
			case KeyboardPiano.VK_E :
				 break;
			case KeyboardPiano.VK_R :
				 break;
			case KeyboardPiano.VK_T :
				 break;
			case KeyboardPiano.VK_Y :
				 break;
			case KeyboardPiano.VK_U :
				 break;
			case KeyboardPiano.VK_I :
				 break;
			case KeyboardPiano.VK_O :
				 break;
			case KeyboardPiano.VK_P :
				 break;
			case KeyboardPiano.VK_OPEN_BRACKET :
				 break;
			case KeyboardPiano.VK_CLOSE_BRACKET :
				 break;
			case KeyboardPiano.VK_BACKSLASH :
				 break;

			case KeyboardPiano.VK_CAPS_LOCK :
				 break;
			case KeyboardPiano.VK_A :
				 break;
			case KeyboardPiano.VK_S :
				 break;
			case KeyboardPiano.VK_D :
				 break;
			case KeyboardPiano.VK_F :
				 break;
			case KeyboardPiano.VK_G :
				 break;
			case KeyboardPiano.VK_H :
				 break;
			case KeyboardPiano.VK_J :
				 break;
			case KeyboardPiano.VK_K :
				 break;
			case KeyboardPiano.VK_L :
				 break;
			case KeyboardPiano.VK_SEMICOLON :
				 break;
			case KeyboardPiano.VK_QUOTE :
				 break;
			case KeyboardPiano.VK_ENTER :
				/*
				 * Two cases
				 */
				 break;
			case KeyboardPiano.VK_SHIFT_LEFT :
				 break;
			case KeyboardPiano.VK_Z :
				 break;
			case KeyboardPiano.VK_X :
				 break;
			case KeyboardPiano.VK_C :
				 break;
			case KeyboardPiano.VK_V :
				 break;
			case KeyboardPiano.VK_B :
				 break;
			case KeyboardPiano.VK_N :
				 break;
			case KeyboardPiano.VK_M :
				 break;
			case KeyboardPiano.VK_COMMA :
				 break;
			case KeyboardPiano.VK_PERIOD :
				 break;
			case KeyboardPiano.VK_SLASH :
				 break;
			case KeyboardPiano.VK_SHIFT_RIGHT :
				 break;
			case KeyboardPiano.VK_CTRL_LEFT :
				 break;
			case KeyboardPiano.VK_WIN_LEFT :
				 break;
			case KeyboardPiano.VK_ALT_LEFT :
				 break;
			case KeyboardPiano.VK_SPACE :
				 break;
			case KeyboardPiano.VK_ALT_RIGHT :
				 break;
			case KeyboardPiano.VK_WIN_RIGHT :
				 break;
			case KeyboardPiano.VK_CTRL_RIGHT :
				 break;

			case KeyboardPiano.VK_PRINT_SCREEN :
				 break;
			case KeyboardPiano.VK_SCROLL_LOCK :
				 break;
			case KeyboardPiano.VK_PAUSE :
				 break;
			case KeyboardPiano.VK_INSERT :
				 break;
			case KeyboardPiano.VK_HOME :
				 break;
			case KeyboardPiano.VK_PAGE_UP :
				 break;
			case KeyboardPiano.VK_DELETE :
				 break;
			case KeyboardPiano.VK_END :
				 break;
			case KeyboardPiano.VK_PAGE_DOWN :
				 break;
			case KeyboardPiano.VK_UP :
				 break;
			case KeyboardPiano.VK_LEFT :
				 break;
			case KeyboardPiano.VK_DOWN :
				 break;
			case KeyboardPiano.VK_RIGHT :
				 break;

			case KeyboardPiano.VK_NUM_LOCK :
				 break;
			case KeyboardPiano.VK_NUMPAD_DIVIDE :
				 break;
			case KeyboardPiano.VK_NUMPAD_MULTIPLY :
				 break;
			case KeyboardPiano.VK_NUMPAD_MINUS :
				 break;
			case KeyboardPiano.VK_NUMPAD_7 :
				 break;
			case KeyboardPiano.VK_NUMPAD_8 :
				 break;
			case KeyboardPiano.VK_NUMPAD_9 :
				 break;
			case KeyboardPiano.VK_NUMPAD_4 :
				 break;
			case KeyboardPiano.VK_NUMPAD_5 :
				 break;
			case KeyboardPiano.VK_NUMPAD_6 :
				 break;
			case KeyboardPiano.VK_NUMPAD_1 :
				 break;
			case KeyboardPiano.VK_NUMPAD_2 :
				 break;
			case KeyboardPiano.VK_NUMPAD_3 :
				 break;
			case KeyboardPiano.VK_NUMPAD_0 :
				 break;
			case KeyboardPiano.VK_NUMPAD_DECIMAL :
				 break;
			case KeyboardPiano.VK_NUMPAD_PLUS :
				 break;
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
