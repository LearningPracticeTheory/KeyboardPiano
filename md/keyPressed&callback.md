## keyPressed & callback

- **extends** `KeyAdapter` and **override** `keyPressed`

    ```java
    KeyboardHook hook = new KeyboardHook();
    
    @Override
    public void keyPressed(KeyEvent e) {
    	int key = e.getKeyCode();
    	int vKey = 0;
        vKey = hook.getKey();
        System.out.print("private static final int VK_" +
                KeyEvent.getKeyText(key).toUpperCase() + " = ");
    }
    ```
    
- **implements** `WinUser.LowLevelKeyboardProc.callback`

    ```java
    int key = 0;
    
    public LRESULT callback(int vkCode, WPARAM wParam, KBDLLHOOKSTRUCT event) {
    	if (vkCode >= 0) {
    		key = event.vkCode;
    		System.out.println(key + ";");
    	}
    	return User32.INSTANCE.CallNextHookEx(hhk, vkCode, wParam, null);
    }
    
	public int getKey() {
		return key;
	}
    ```

- Output Ex

    ```java
    private static final int VK_0 = 48;
    private static final int VK_A = 65;
    /*
     * left & right ctrl
     */
    private static final int VK_CTRL = 162;
    private static final int VK_CTRL = 163;
    ```
