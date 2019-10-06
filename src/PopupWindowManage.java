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
	
	public static List<JMenuItem> octaves = new ArrayList<>();
	public static List<JMenu> pitches = new ArrayList<>();
	
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
		for(JMenu pitch : pitches) {
			pitch.addMouseListener(mouseMonitor);
		}
	}

	MouseMonitor mouseMonitor = new MouseMonitor();
	
	private class MouseMonitor extends MouseAdapter {

		@Override
		public void mouseEntered(MouseEvent e) {
			Object source = e.getSource();
			if(source.equals(mnNewMenu_S1)) {
				pitchSelectItem = mnNewMenu_S1;
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

	}
	
	/**
	 * 
	 * @param menu the pitches or the channels, instead of JMenuItem
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
		} else { //unselectAllItems() already unselected them
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
	 * there is only ones selected
	 */
	public void clear(String name) {
		char sharp = sharp(name);
		
		if(sharp == MyButton.N) { //it's black already
			return;
		}
		
		/*
		 * unselected all the JMenuItems
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
		 * after updating all the black icons for each key
		 * replace this temporary name then
		 */
		String newName = "NNRNA_Win";
		
		kp.selectedButton.setName(newName);
		kp.selectedButton.setImageAndWavByName(newName);
		kp.selectedButton.repaint();
	}
	
	
	ActionAdapter actionAdapter = new ActionAdapter();

	private static JMenu pitchSelectItem = null;
	private static char octaveSelectedValue = '0'; 
	
	/*
	 * Action for item clicks
	 */
	private class ActionAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object item = e.getSource();
			unselectAllItems(mnNewMenu_PitchOctave);
			unselectAllItems(octaves);
			
			if(item == mntmNewMenuItem_Clear) {
				clear(kp.selectedButton.getName());
				return;
			} else if(item.equals(mntmNewMenuItem_LeftHand)) {
				setSide(kp.selectedButton.getName(), KeyboardPiano.L);
				return;
			} else if(item.equals(mntmNewMenuItem_RightHand)) {
				setSide(kp.selectedButton.getName(), KeyboardPiano.R);
				return;
			} else if(item.equals(mntmNewMenuItem_8)) {
				octaveSelectedValue = MyButton.OCTAVE_8;
			} else if(item.equals(mntmNewMenuItem_7)) {
				octaveSelectedValue = MyButton.OCTAVE_7;
			} else if(item.equals(mntmNewMenuItem_6)) {
				octaveSelectedValue = MyButton.OCTAVE_6;
			} else if(item.equals(mntmNewMenuItem_5)) {
				octaveSelectedValue = MyButton.OCTAVE_5;
			} else if(item.equals(mntmNewMenuItem_4)) {
				octaveSelectedValue = MyButton.OCTAVE_4;
			} else if(item.equals(mntmNewMenuItem_3)) {
				octaveSelectedValue = MyButton.OCTAVE_3;
			} else if(item.equals(mntmNewMenuItem_2)) {
				octaveSelectedValue = MyButton.OCTAVE_2;
			} else if(item.equals(mntmNewMenuItem_1)) {
				octaveSelectedValue = MyButton.OCTAVE_1;
			} else if(item.equals(mntmNewMenuItem_0)) {
				octaveSelectedValue = MyButton.OCTAVE_0;
			}
			resetButton();
		}
		
	}
	
	private void setSide(String name, char side) {
		String newName = replaceStringByIndex(name, MyButton.SIDE_INDEX, side);
		newName = replaceStringByIndex(newName, MyButton.COLOR_INDEX, 
				KeyboardPiano.getColorOnDiffSide(name.charAt(MyButton.COLOR_INDEX)));
System.out.println("$% Old Name = " + kp.selectedButton.getName() + " new Name = " + newName);
		kp.selectedButton.setName(newName);
		kp.selectedButton.setImageAndWavByName(newName);
		kp.selectedButton.repaint();
	}
	
	/*
	 * unselected all items below the menu
	 */
	public void unselectAllItems(JMenu items) {
		for(int i = 0; i < items.getItemCount(); i++) {
			setSelectedByIcon(items.getItem(i), false);
		}
	}
	
	private void unselectAllItems(List<JMenuItem> items) {
		for(JMenuItem item : items) {
			setSelectedByIcon(item, false);
		}
	}

	private void setSelectedByIcon(JMenuItem item, boolean selected) {
		if(item == null) {
			System.out.println("The item is null");
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
		System.out.println("((( Old Name = " + kp.selectedButton.getName() +
			" new Name = " + newName);
		kp.selectedButton.setName(newName);
		kp.selectedButton.setImageAndWavByName(newName);
		kp.selectedButton.repaint();
	}
	
	private String renameButtonBySharpPitchOctave(String name, 
			char sharp, char pitch, char octave) {
		String newName = replaceStringByIndex(name, MyButton.SHARP_INDEX, sharp);
		newName = replaceStringByIndex(newName, MyButton.PITCH_INDEX, pitch);
		newName = replaceStringByIndex(newName, MyButton.OCTAVE_INDEX, octave);
		return newName;
	}
	
	private String replaceStringByIndex(String name, int index, char newChar) {
		String head = name.substring(0, index);
		head += newChar;
		String tail = name.substring(index+1, name.length());
		head += tail;
		return head;
	}
	
	/**
	 * @param text the text of JMenu, rather than the name of JMenu 
	 * @return
	 */
	private char getPitchValueByName(String text) {
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
	
	public void setSelectedByName(String name) {
		
		if(name == null) {
			System.out.println("The name is empty");
			return;
		}
		char sharp = sharp(name);
		if(sharp == MyButton.N) {
			return;
		}
		
		char side = side(name);
		char pitch = pitch(name);
		sideCase(side);
		pitchCase(pitch, sharp);
		
		/*
		 * Shows the octave window on actionPerformed();
		 */
//		char octave = octave(name);
//		octaveCase(octave, findSelectedMenuOnPitch(mnNewMenu_PitchOctave), true);
	}
	
	private void pitchCase(char pitch, char sharp) {
		switch(pitch) {
		case MyButton.PITCH_1 : 
			sharpCase(sharp, mnNewMenu_S1, mnNewMenu_X1);
			break;
		case MyButton.PITCH_2 :
			sharpCase(sharp, mnNewMenu_S2, mnNewMenu_X2);
			break;
		case MyButton.PITCH_3 : 
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
			setSelectedByIcon(menuX, true);
			return;
		}
		if(sharp == MyButton.S) {
			setSelectedByIcon(menuS, true);
		} else if(sharp == MyButton.X) {
			setSelectedByIcon(menuX, true);
		}
	}
	
	private void sideCase(char side) {
		switch(side) {
		case MyButton.L :
			if(!mntmNewMenuItem_LeftHand.isSelected()) {
				setSelectedByIcon(mntmNewMenuItem_LeftHand, true);
			}
			break;
		case MyButton.R :
			if(!mntmNewMenuItem_RightHand.isSelected()) {
				setSelectedByIcon(mntmNewMenuItem_RightHand, true);
			}
			break;
		}
	}
	
	private void octaveCase(char octave, JMenu menus, boolean select) {
		int intOctave = Integer.parseInt(String.valueOf(octave));
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
