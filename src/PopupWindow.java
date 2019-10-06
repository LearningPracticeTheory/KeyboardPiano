import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupWindow {

	private MyButton myButton;
	public String buttonName = null;
	private KeyboardPiano kp; 

	public PopupWindow(MyButton button, KeyboardPiano kp) {
		this.kp = kp;
		myButton = button;
		buttonName = myButton.name;
System.out.println("*{"+myButton.getName());
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
//System.out.println("Popup?");
				/*
				 * initialized selection
				 */
				kp.popupWindowManager.setSelectedByName(myButton.getName());
			}
		});
	}
	

	private static Font font = new Font(null, Font.BOLD, 16);
	
	
	/*
	 * DON'T set Selection, just record the octave selected value
	 * rename button
	 */
	
	private static int countNum = 0;
	
	private JMenu findSelectedMenuOnPitch(JMenu menus) {
		JMenu menu = null;
		for(int i = 0; i < menus.getItemCount(); i++) {
//			if(menus.getItem(i).isSelected()) {
			/*
			 * identify whether is selected by Icon, that's a smart way
			 * rather than create a class and extend the Menus 
			 */
			if(menus.getItem(i).getIcon().equals(kp.selectIcon)) {
				menu = (JMenu)menus.getItem(i);
				break;
			}
		}
		return menu;
	}
	
	JPopupMenu popupMenu = new JPopupMenu();

	private void addPopUpMenu() {
		addPopup(myButton, popupMenu);
System.out.println("addPopUpMenu");
		popupMenu.add(kp.popupWindowManager.mnNewMenu_PitchOctave);
		
//		kp.mnNewMenu_X1.setIcon(kp.unselectIcon);
		
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
		
		
		/* replace by down
		for(JMenu menu : menus) {
			menu.setIcon(unselectIcon);
		}
		*/
		
		kp.popupWindowManager.unselectAllItems(kp.popupWindowManager.mnNewMenu_PitchOctave);
		
//		for(int i = 0; i < mnNewMenu_PitchOctave.getItemCount(); i++) {
		/*
		 * ignore 0 and 1 for test
		 */
		// KIA all, replace by MouseMonitor 
		/*
		for(int i = 2; i < mnNewMenu_PitchOctave.getItemCount(); i++) {
			JMenu item = (JMenu)mnNewMenu_PitchOctave.getItem(i);
//			System.out.println(item.getText());
			addOctaves(item);
		}
		*/
		/*************
		 * Test here *
		 *************/
		

		
		/*************
		 * Test here *
		 *************/
		
		
		popupMenu.add(kp.popupWindowManager.mnNewMenu_Channel);
		kp.popupWindowManager.mnNewMenu_Channel.add(kp.popupWindowManager.mntmNewMenuItem_LeftHand);
		kp.popupWindowManager.mnNewMenu_Channel.add(kp.popupWindowManager.mntmNewMenuItem_RightHand);
		
		kp.popupWindowManager.unselectAllItems(kp.popupWindowManager.mnNewMenu_Channel);

		/*
		 * clear is a special case
		 */
		popupMenu.add(kp.popupWindowManager.mntmNewMenuItem_Clear);
	}
	
}
