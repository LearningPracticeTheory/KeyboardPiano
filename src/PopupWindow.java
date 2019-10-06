import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;

public class PopupWindow {

	private MyButton myButton;
	public String buttonName = null;
	private KeyboardPiano kp; 

	public PopupWindow(MyButton button, KeyboardPiano kp) {
		this.kp = kp;
		myButton = button;
		buttonName = myButton.name;
		addPopUpMenu();
	}
	
	private void addPopup(Component component, final JPopupMenu popup) {
		/*
		 * button's mouse listener
		 */
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
				kp.selectedButton = myButton;
				/*
				 * initialized selection
				 */
				kp.popupWindowManager.setSelectedByName(myButton.getName());
			}
		});
	}
	
	JPopupMenu popupMenu = new JPopupMenu();

	private void addPopUpMenu() {
		addPopup(myButton, popupMenu);
		popupMenu.add(kp.popupWindowManager.mnNewMenu_PitchOctave);
		
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_X1);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_S1);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_X2);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_S2);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_X3);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_X4);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_S4);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_X5);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_S5);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_X6);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_S6);
		kp.popupWindowManager.mnNewMenu_PitchOctave.add(kp.popupWindowManager.mnNewMenu_X7);
		
		kp.popupWindowManager.unselectAllItems(kp.popupWindowManager.mnNewMenu_PitchOctave);
		
		popupMenu.add(kp.popupWindowManager.mnNewMenu_Channel);
		kp.popupWindowManager.mnNewMenu_Channel.add(kp.popupWindowManager.mntmNewMenuItem_LeftHand);
		kp.popupWindowManager.mnNewMenu_Channel.add(kp.popupWindowManager.mntmNewMenuItem_RightHand);
		
		kp.popupWindowManager.unselectAllItems(kp.popupWindowManager.mnNewMenu_Channel);

		popupMenu.add(kp.popupWindowManager.mntmNewMenuItem_Clear);
	}
	
}
