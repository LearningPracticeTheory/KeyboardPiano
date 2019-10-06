import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PopupWindowManage {

	private KeyboardPiano kp;
	
	JMenu mnNewMenu_PitchOctave = new JMenu("Pitch/Octave");
	JMenu mnNewMenu_X1 = new JMenu("1");
	JMenu mnNewMenu_S1 = new JMenu("#1");
	JMenu mnNewMenu_X2 = new JMenu("2");
	JMenu mnNewMenu_S2 = new JMenu("#2");
	JMenu mnNewMenu_X3 = new JMenu("3");
	JMenu mnNewMenu_X4 = new JMenu("4");
	JMenu mnNewMenu_S4 = new JMenu("#4");
	JMenu mnNewMenu_X5 = new JMenu("5");
	JMenu mnNewMenu_S5 = new JMenu("#5");
	JMenu mnNewMenu_X6 = new JMenu("6");
	JMenu mnNewMenu_S6 = new JMenu("#6");
	JMenu mnNewMenu_X7 = new JMenu("7");
	
	JMenu mnNewMenu_Channel = new JMenu("Channel");
	JMenuItem mntmNewMenuItem_LeftHand = new JMenuItem("Left Hand");
	JMenuItem mntmNewMenuItem_RightHand = new JMenuItem("Right Hand");
	
	JMenuItem mntmNewMenuItem_Clear = new JMenuItem("Clear");
	
	private static JMenuItem mntmNewMenuItem_8 = new JMenuItem("+4");
	private static JMenuItem mntmNewMenuItem_7 = new JMenuItem("+3");
	private static JMenuItem mntmNewMenuItem_6 = new JMenuItem("+2");
	private static JMenuItem mntmNewMenuItem_5 = new JMenuItem("+1");
	private static JMenuItem mntmNewMenuItem_4 = new JMenuItem("+0");
	private static JMenuItem mntmNewMenuItem_3 = new JMenuItem("-1");
	private static JMenuItem mntmNewMenuItem_2 = new JMenuItem("-2");
	private static JMenuItem mntmNewMenuItem_1 = new JMenuItem("-3");
	private static JMenuItem mntmNewMenuItem_0 = new JMenuItem("-4");

	PopupWindowManage(KeyboardPiano kp) {
		this.kp = kp;
		initPitches(pitches);
		initOctaves(octaves);
		addActionListenerForItems();
		addMouseListenerForAllMenus(pitches);
	}
	
	/*
	 * include JMenu & JMenuItem, cause JMenu extends JMenuItem
	 * KIA
	 */
	private static List<JMenuItem> octaves = new ArrayList<>();
	private static List<JMenu> pitches = new ArrayList<>();
	
	private void initOctaves(List<JMenuItem> octaves) {
		octaves.add(mntmNewMenuItem_8);
		octaves.add(mntmNewMenuItem_7);
		octaves.add(mntmNewMenuItem_6);
		octaves.add(mntmNewMenuItem_5);
		octaves.add(mntmNewMenuItem_4);
		octaves.add(mntmNewMenuItem_3);
		octaves.add(mntmNewMenuItem_2);
		octaves.add(mntmNewMenuItem_1);
		octaves.add(mntmNewMenuItem_0);
	}
	
	private void initPitches(List<JMenu> pitches) {
		pitches.add(mnNewMenu_X1);
		pitches.add(mnNewMenu_S1);
		pitches.add(mnNewMenu_X2);
		pitches.add(mnNewMenu_S2);
		pitches.add(mnNewMenu_X3);
		pitches.add(mnNewMenu_X4);
		pitches.add(mnNewMenu_S4);
		pitches.add(mnNewMenu_X5);
		pitches.add(mnNewMenu_S5);
		pitches.add(mnNewMenu_X6);
		pitches.add(mnNewMenu_S6);
		pitches.add(mnNewMenu_X7);
	}
	
	private void addMouseListenerForAllMenus(List<JMenu> pitches) {
		// TODO Auto-generated method stub
		for(JMenu pitch : pitches) {
			pitch.addMouseListener(mouseMonitor);
		}
	}

	MouseMonitor mouseMonitor = new MouseMonitor();
	
	private class MouseMonitor extends MouseAdapter {

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
//			super.mouseEntered(e);
			Object source = e.getSource();
System.out.println("mouse");
			/*
			 * set pitchSelectItem one by one
			 */
//			pitchSelectItem = (JMenu)source;
//			System.out.println(pitchSelectItem.toString());
			/*
			 * replace by for loop
			 */
			if(source.equals(mnNewMenu_S1)) {
//				mnNewMenu_S1.setSelected(true);
//				System.out.println("Enter_S1");
				pitchSelectItem = mnNewMenu_S1;
				/*
				System.out.println("Item count1 = " + mnNewMenu_S1.getItemCount());
				if(mnNewMenu_S1.getItemCount() != 0) {
					System.out.println("Item count2 = " + mnNewMenu_S1.getItemCount());
					return;
				}
				*/
				addOctaves(mnNewMenu_S1);
			} else if(source.equals(mnNewMenu_X1)) {
				addOctaves(mnNewMenu_X1);
				pitchSelectItem = mnNewMenu_X1;
			} else if(source.equals(mnNewMenu_X2)) {
				addOctaves(mnNewMenu_X2);
				pitchSelectItem = mnNewMenu_X2;
			} else if(source.equals(mnNewMenu_S2)) {
				addOctaves(mnNewMenu_S2);
				pitchSelectItem = mnNewMenu_S2;
			} else if(source.equals(mnNewMenu_X3)) {
				addOctaves(mnNewMenu_X3);
				pitchSelectItem = mnNewMenu_X3;
			} else if(source.equals(mnNewMenu_X4)) {
				addOctaves(mnNewMenu_X4);
				pitchSelectItem = mnNewMenu_X4;
			} else if(source.equals(mnNewMenu_S4)) {
				addOctaves(mnNewMenu_S4);
				pitchSelectItem = mnNewMenu_S4;
			} else if(source.equals(mnNewMenu_X5)) {
				addOctaves(mnNewMenu_X5);
				pitchSelectItem = mnNewMenu_X5;
			} else if(source.equals(mnNewMenu_S5)) {
				addOctaves(mnNewMenu_S5);
				pitchSelectItem = mnNewMenu_S5;
			} else if(source.equals(mnNewMenu_X6)) {
				addOctaves(mnNewMenu_X6);
				pitchSelectItem = mnNewMenu_X6;
			} else if(source.equals(mnNewMenu_S6)) {
				addOctaves(mnNewMenu_S6);
				pitchSelectItem = mnNewMenu_S6;
			} else if(source.equals(mnNewMenu_X7)) {
				addOctaves(mnNewMenu_X7);
				pitchSelectItem = mnNewMenu_X7;
			} 
		}
		/*
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
//			super.mouseExited(e);
			if(e.getSource().equals(mnNewMenu_S1)) {
//				mnNewMenu_S1.setSelected(false);
				System.out.println("Out_S1");
			} else if(e.getSource().equals(mnNewMenu_X1)) {
//				mnNewMenu_S1.setSelected(false);
				System.out.println("Out_X1");
			}
		}
		*/
	}
	
	/**
	 * 
	 * @param menu the items in Pitch, instead of Octave
	 */
	private void addOctaves (JMenu menu) {
		
		menu.add(mntmNewMenuItem_8);
		menu.add(mntmNewMenuItem_7);
		menu.add(mntmNewMenuItem_6);
		menu.add(mntmNewMenuItem_5);
		menu.add(mntmNewMenuItem_4);
		menu.add(mntmNewMenuItem_3);
		menu.add(mntmNewMenuItem_2);
		menu.add(mntmNewMenuItem_1);
		menu.add(mntmNewMenuItem_0);
		
		unselectAllItems(menu); //add unselected icon
		
		char octave = octave(kp.selectedButton.getName());
		
		if(isSelected(menu)) {
			octaveCase(octave, menu, true);
		} else { //KIA, unselectAllItems already did is it's unselected
			octaveCase(octave, menu, false);
		}
		
	}
	
	private static boolean isSelected(JMenuItem item) {
		return item.getIcon().equals(KeyboardPiano.selectIcon);
	}
	
	private void addActionListenerForItems() {
		mntmNewMenuItem_Clear.addActionListener(actionAdapter);
		mntmNewMenuItem_LeftHand.addActionListener(actionAdapter);
		mntmNewMenuItem_RightHand.addActionListener(actionAdapter);
		
		for(JMenuItem item : octaves) {
			item.addActionListener(actionAdapter);
		}
	}
	
	/*
	 * there are only ones select
	 */
	public void clear(String name) {
		/*
		 * if it is already Black, then return and do nothing 
		 */
		char sharp = sharp(name);
		
		if(sharp == MyButton.N) { //it's black already
			return;
		}
		
		/*
		 * find out the select item first, then unselect the items below
		 * after clear, the selected item doesn't cancel
		 * cause time when right click, it creates a new PopupWindow
		 * so JMenu should be the variable of MyButton, and it includes all the JMenuItems
		 * well, it's no necessary, just change the name of button and reset image and wav
		 */
		for(int i = 0; i < mnNewMenu_PitchOctave.getItemCount(); i++) {
			JMenu menu = (JMenu)mnNewMenu_PitchOctave.getItem(i);
			if(isSelected(menu)) {
				unselectAllItems(menu);
			}
		}
		
		unselectAllItems(mnNewMenu_PitchOctave);
		unselectAllItems(mnNewMenu_Channel);
		/*
		 * after making all the black icons for each key, then replace this temporary name
		 */
		String newName = "NNRNA_Win";
		
		kp.selectedButton.setName(newName);
		kp.selectedButton.setImageAndWavByName(newName);
		kp.selectedButton.repaint();
	}
	
	
	/*
	 * Action for item clicks
	 */
	ActionAdapter actionAdapter = new ActionAdapter();

	private static JMenu pitchSelectItem = null;
	private static char octaveSelectedValue = '0'; 
	
	private class ActionAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object item = e.getSource();
			unselectAllItems(mnNewMenu_PitchOctave);
			unselectAllItems(octaves);
			
			if(item == mntmNewMenuItem_Clear) {
//System.out.println("Clear");
				clear(kp.selectedButton.getName());
				return;
			} else if(item.equals(mntmNewMenuItem_LeftHand)) {
				setSide(kp.selectedButton.getName(), KeyboardPiano.L);
				return;
			} else if(item.equals(mntmNewMenuItem_RightHand)) {
				setSide(kp.selectedButton.getName(), KeyboardPiano.R);
				return;
			} else if(item.equals(mntmNewMenuItem_8)) {
				/*
				// * too many output?????????????????
				System.out.println("88888888888");
				 */
				
				if(octaveSelectedValue != MyButton.OCTAVE_8) {
					octaveSelectedValue = MyButton.OCTAVE_8;
					/*
					System.out.println(pitchSelectItem == null);
					System.out.println(pitchSelectItem.getText());
//					System.out.println(myButton.name);
					System.out.println(selectedButton.getName());
					System.out.println(selectedButton.getText());
//					System.out.println(pitchSelectItem.getName()); //NULL;
					*/
					
				}
				
//				setSelectedByIcon(mntmNewMenuItem_8, true);
			} else if(item.equals(mntmNewMenuItem_7)) {
				
				octaveSelectedValue = MyButton.OCTAVE_7;
//				setSelectedByIcon(mntmNewMenuItem_7, true);
			} else if(item.equals(mntmNewMenuItem_6)) {
				
//				System.out.println(countNum++);
				
				octaveSelectedValue = MyButton.OCTAVE_6;
				
//				setSelectedByIcon(mntmNewMenuItem_6, true);
			} else if(item.equals(mntmNewMenuItem_5)) {
				octaveSelectedValue = MyButton.OCTAVE_5;
				
//				setSelectedByIcon(mntmNewMenuItem_5, true);
			} else if(item.equals(mntmNewMenuItem_4)) {
				octaveSelectedValue = MyButton.OCTAVE_4;
//				setSelectedByIcon(mntmNewMenuItem_4, true);
			} else if(item.equals(mntmNewMenuItem_3)) {
				octaveSelectedValue = MyButton.OCTAVE_3;
//				setSelectedByIcon(mntmNewMenuItem_3, true);
			} else if(item.equals(mntmNewMenuItem_2)) {
				octaveSelectedValue = MyButton.OCTAVE_2;
//				setSelectedByIcon(mntmNewMenuItem_2, true);
			} else if(item.equals(mntmNewMenuItem_1)) {
				octaveSelectedValue = MyButton.OCTAVE_1;
//				setSelectedByIcon(mntmNewMenuItem_1, true);
			} else if(item.equals(mntmNewMenuItem_0)) {
				octaveSelectedValue = MyButton.OCTAVE_0;
//				setSelectedByIcon(mntmNewMenuItem_0, true);
			}
			resetButton();
//			setSelectedByIcon(pitchSelectItem, true);
		}
		
	}
	
	private void setSide(String name, char side) {
		String newName = replaceStringByIndex(name, MyButton.SIDE_INDEX, side);
		newName = replaceStringByIndex(newName, MyButton.COLOR_INDEX, 
				KeyboardPiano.getColorOnDiffSide(name.charAt(MyButton.COLOR_INDEX)));
System.out.println("$%^ old Name = " + kp.selectedButton.getName() + " new Name = " + newName);
		kp.selectedButton.setName(newName);
		kp.selectedButton.setImageAndWavByName(newName);
		kp.selectedButton.repaint();
	}
	
	/*
	 * set unselected icon for all items
	 * NEED optimization: if it's already unselected, do nothing 
	 */
	public void unselectAllItems(JMenu items) {
		for(int i = 0; i < items.getItemCount(); i++) {
//		for(int i = 2; i < items.getItemCount(); i++) {
			setSelectedByIcon(items.getItem(i), false);
		}
	}
	
	private void unselectAllItems(List<JMenuItem> items) {
		for(JMenuItem item : items) {
			setSelectedByIcon(item, false);
		}
	}

	private void setSelectedByIcon(JMenuItem item, boolean selected) {
		/*
		 * 5395 each time, what the heck?????????
		 */
		if(item == null) {
//			System.out.println("ITEM NULL " + count++); 
			return;
		}
		if(selected) {
			item.setIcon(KeyboardPiano.selectIcon);
		} else {
			item.setIcon(KeyboardPiano.unselectIcon);
		}
	}
	
	private void resetButton() {
		String newName = renameButtonBySharpPitchOctave(
				kp.selectedButton.getName(), 
				getSharpValueByName(pitchSelectItem.getText()), 
				getPitchValueByName(pitchSelectItem.getText()), 
				octaveSelectedValue);
		System.out.println("Old Name = " + kp.selectedButton.getName() +
			" new Name = " + newName);
		kp.selectedButton.setName(newName);
		kp.selectedButton.setImageAndWavByName(newName);
		
		System.out.println("after setName -> getName = " + kp.selectedButton.getName() + 
				" button up path = " + kp.selectedButton.imageUpPath);
		kp.selectedButton.repaint();
	}
	
	private String renameButtonBySharpPitchOctave(String name, 
			char sharp, char pitch, char octave) {
		String newName = replaceStringByIndex(name, MyButton.SHARP_INDEX, sharp);
		newName = replaceStringByIndex(newName, MyButton.PITCH_INDEX, pitch);
		newName = replaceStringByIndex(newName, MyButton.OCTAVE_INDEX, octave);
		return newName;
	}
	
	/*
	 * call it three times
	 */
	private String replaceStringByIndex(String name, int index, char newChar) {
		String head = name.substring(0, index);
		head += newChar;
		String tail = name.substring(index+1, name.length());
		head += tail;
		return head;
	}
	
	/**
	 * use with sharp(); 
	 * @param text the text of JMenu
	 * @return
	 */
	private char getPitchValueByName(String text) { //JMenu.getName();
		char pitch = '0';
		if(text.equals(mnNewMenu_S1.getText()) || text.equals(mnNewMenu_S1.getText())) {
			pitch = MyButton.PITCH_1;
		} else if(text.equals(mnNewMenu_S2.getText()) || text.equals(mnNewMenu_S2.getText())) {
			pitch = MyButton.PITCH_2;
		} else if(text.equals(mnNewMenu_X3.getText())) {
			pitch = MyButton.PITCH_3;
		} else if(text.equals(mnNewMenu_S4.getText()) || text.equals(mnNewMenu_S4.getText())) {
			pitch = MyButton.PITCH_4;
		} else if(text.equals(mnNewMenu_S5.getText()) || text.equals(mnNewMenu_S5.getText())) {
			pitch = MyButton.PITCH_5;
		} else if(text.equals(mnNewMenu_S6.getText()) || text.equals(mnNewMenu_S6.getText())) {
			pitch = MyButton.PITCH_6;
		} else if(text.equals(mnNewMenu_X7.getText())) {
			pitch = MyButton.PITCH_7;
		}
		return pitch;
	}
	
	
	/**
	 * 
	 * @param text the text of JMenu
	 * @return
	 */
	private char getSharpValueByName(String text) {
		if(text.length() == 1) {
			return 'X';
		} else if(text.length() == 2) {
			return 'S';
		}
		return 'N';
	}
	
	
	
	/*
	 * add component or components? and boolean select
	 * for initialized
	 * publish this method even if it's only use inside, 
	 * it's core method, public it can easily noticed it by color of outline window
	 * if it's private, it can show out whether it's used or not
	 */
	private static int count = 0;
	public void setSelectedByName(String name) {
		
		if(name == null) {
			System.out.println("NULL " + count++);
			return;
		}
		char sharp = sharp(name);
		if(sharp == MyButton.N) {
			return;
		}
		
		char side = side(name);
		char pitch = pitch(name);
//		char octave = octave(name);
		
		sideCase(side);
		pitchCase(pitch, sharp);
//		octaveCase(octave, findSelectedMenuOnPitch(mnNewMenu_PitchOctave), true);
		
	}
	
	/*
	 * sharp and pitch case
	 */
	private void pitchCase(char pitch, char sharp) {
//System.out.println(pitch + " " + sharp);
		switch(pitch) {
		case MyButton.PITCH_1 : 
			sharpCase(sharp, mnNewMenu_S1, mnNewMenu_X1);
			break;
		case MyButton.PITCH_2 :
			sharpCase(sharp, mnNewMenu_S2, mnNewMenu_X2);
			break;
		case MyButton.PITCH_3 : 
//			mnNewMenu_X3.setSelected(true);
			sharpCase(sharp, null, mnNewMenu_X3);
			break;
		case MyButton.PITCH_4 : 
			sharpCase(sharp, mnNewMenu_S4, mnNewMenu_X4);
			break;
		case MyButton.PITCH_5 : 
			sharpCase(sharp, mnNewMenu_S5, mnNewMenu_X5);
			break;
		case MyButton.PITCH_6 : 
			sharpCase(sharp, mnNewMenu_S6, mnNewMenu_X6);
			break;
		case MyButton.PITCH_7 : 
			sharpCase(sharp, null, mnNewMenu_X7);
			break;
		}
	}
	
	/*
	 * sharp from pitch
	 */
	private void sharpCase(char sharp, JMenu menuS, JMenu menuX) {
		if(menuS == null) {
//			menuX.setSelected(true);
			setSelectedByIcon(menuX, true);
			return;
		}
		if(sharp == MyButton.S) {
//System.out.println("S");
//			menuS.setSelected(true);
			setSelectedByIcon(menuS, true);
		} else if(sharp == MyButton.X) {
//System.out.println("X");
//			menuX.setSelected(true);
			setSelectedByIcon(menuX, true);
		}
	}
	
	/*
	 * only one select? 
	 */
	private void sideCase(char side) {
		switch(side) {
		case MyButton.L :
//System.out.println(side);
			if(!mntmNewMenuItem_LeftHand.isSelected()) {
//				mntmNewMenuItem_LeftHand.setSelected(true);
				setSelectedByIcon(mntmNewMenuItem_LeftHand, true);
			}
			break;
		case MyButton.R :
			if(!mntmNewMenuItem_RightHand.isSelected()) {
//				mntmNewMenuItem_RightHand.setSelected(true);
				setSelectedByIcon(mntmNewMenuItem_RightHand, true);
			}
			break;
		}
	}
	
	/*
	 * Attention: octave value should be change, start from 1(+4), end at 9(-4)
	 * reverse looks so weird and inconvenient
	 */
	private void octaveCase(char octave, JMenu menus, boolean select) {
		int intOctave = Integer.parseInt(String.valueOf(octave));
//System.out.println(menus.getItemCount());
//		menus.getItem(OCTAVE_SIZE-intOctave).setSelected(true);
		setSelectedByIcon(menus.getItem(intOctave), select);
	}
	
	private static char sharp(String name) {
		return name.charAt(MyButton.SHARP_INDEX);
	}
	
	private static char side(String name) {
		return name.charAt(MyButton.SIDE_INDEX);
	}
	
	private static char pitch(String name) {
		return name.charAt(MyButton.PITCH_INDEX);
	}
	
	private static char octave(String name) {
		return name.charAt(MyButton.OCTAVE_INDEX);
	}
	
}
