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
	JMenu mnNewMenu_A = new JMenu("1");
	JMenu mnNewMenu_B = new JMenu("#1");
	JMenu mnNewMenu_C = new JMenu("2");
	JMenu mnNewMenu_D = new JMenu("#2");
	JMenu mnNewMenu_E = new JMenu("3");
	JMenu mnNewMenu_F = new JMenu("4");
	JMenu mnNewMenu_G = new JMenu("#4");
	JMenu mnNewMenu_H = new JMenu("5");
	JMenu mnNewMenu_I = new JMenu("#5");
	JMenu mnNewMenu_J = new JMenu("6");
	JMenu mnNewMenu_K = new JMenu("#6");
	JMenu mnNewMenu_L = new JMenu("7");
	
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
		pitches.add(mnNewMenu_A);
		pitches.add(mnNewMenu_B);
		pitches.add(mnNewMenu_C);
		pitches.add(mnNewMenu_D);
		pitches.add(mnNewMenu_E);
		pitches.add(mnNewMenu_F);
		pitches.add(mnNewMenu_G);
		pitches.add(mnNewMenu_H);
		pitches.add(mnNewMenu_I);
		pitches.add(mnNewMenu_J);
		pitches.add(mnNewMenu_K);
		pitches.add(mnNewMenu_L);
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
			if(source.equals(mnNewMenu_A)) {
				addOctaves(mnNewMenu_A);
				pitchSelectItem = mnNewMenu_A;
			} else if(source.equals(mnNewMenu_B)) {
				pitchSelectItem = mnNewMenu_B;
				addOctaves(mnNewMenu_B);
			} else if(source.equals(mnNewMenu_C)) {
				addOctaves(mnNewMenu_C);
				pitchSelectItem = mnNewMenu_C;
			} else if(source.equals(mnNewMenu_D)) {
				addOctaves(mnNewMenu_D);
				pitchSelectItem = mnNewMenu_D;
			} else if(source.equals(mnNewMenu_E)) {
				addOctaves(mnNewMenu_E);
				pitchSelectItem = mnNewMenu_E;
			} else if(source.equals(mnNewMenu_F)) {
				addOctaves(mnNewMenu_F);
				pitchSelectItem = mnNewMenu_F;
			} else if(source.equals(mnNewMenu_G)) {
				addOctaves(mnNewMenu_G);
				pitchSelectItem = mnNewMenu_G;
			} else if(source.equals(mnNewMenu_H)) {
				addOctaves(mnNewMenu_H);
				pitchSelectItem = mnNewMenu_H;
			} else if(source.equals(mnNewMenu_I)) {
				addOctaves(mnNewMenu_I);
				pitchSelectItem = mnNewMenu_I;
			} else if(source.equals(mnNewMenu_J)) {
				addOctaves(mnNewMenu_J);
				pitchSelectItem = mnNewMenu_J;
			} else if(source.equals(mnNewMenu_K)) {
				addOctaves(mnNewMenu_K);
				pitchSelectItem = mnNewMenu_K;
			} else if(source.equals(mnNewMenu_L)) {
				addOctaves(mnNewMenu_L);
				pitchSelectItem = mnNewMenu_L;
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
		char direction = direction(name);
		
		if(direction == MyButton.DIRECTION_N) { //it's black already
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

		String newName = "" + MyButton.SIDE_N + MyButton.COLOR_N + MyButton.DIRECTION_N +
				type(kp.selectedButton.getName()) + MyButton.PITCH_N + MyButton.UNDERLINE + 
				kp.selectedButton.getText();
		
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
		if(side(name) == MyButton.SIDE_N) {
			return;
		}
		String newName = replaceStringByIndex(name, MyButton.SIDE_INDEX, side);
		newName = replaceStringByIndex(newName, MyButton.COLOR_INDEX, 
				KeyboardPiano.getColorOnDiffSide(name.charAt(MyButton.COLOR_INDEX)));
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
	
	public void resetButton() {
		String newName = null;
		String oldName = kp.selectedButton.getName(); 
		char pitch = getPitchValueByName(pitchSelectItem.getText());
		char octave = octaveSelectedValue;
		
		if(side(oldName) == MyButton.SIDE_N) {
			char side = MyButton.SIDE_L; //default L;
			char color = MyButton.COLOR_W; 
			char direction = MyButton.DIRECTION_U; 
			char type = type(oldName);
			newName = "" + side + color + direction + type + 
					pitch + MyButton.UNDERLINE + octave;
		} else {
			newName = renameButtonByPitchOctave(oldName, pitch, octave);
		}
		
		kp.selectedButton.setName(newName);
		kp.selectedButton.setImageAndWavByName(newName);
		kp.selectedButton.repaint();
	}
	
	private String renameButtonByPitchOctave(String name, char pitch, char octave) {
		String newName = replaceStringByIndex(name, MyButton.PITCH_INDEX, pitch);
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
		if(text.equals(mnNewMenu_A.getText())) {
			pitch = MyButton.PITCH_A;
		} else if(text.equals(mnNewMenu_B.getText())) {
			pitch = MyButton.PITCH_B;
		} else if(text.equals(mnNewMenu_C.getText())) {
			pitch = MyButton.PITCH_C;
		} else if(text.equals(mnNewMenu_D.getText())) {
			pitch = MyButton.PITCH_D;
		} else if(text.equals(mnNewMenu_E.getText())) {
			pitch = MyButton.PITCH_E;
		} else if(text.equals(mnNewMenu_F.getText())) {
			pitch = MyButton.PITCH_F;
		} else if(text.equals(mnNewMenu_G.getText())) {
			pitch = MyButton.PITCH_G;
		} else if(text.equals(mnNewMenu_H.getText())) {
			pitch = MyButton.PITCH_H;
		} else if(text.equals(mnNewMenu_I.getText())) {
			pitch = MyButton.PITCH_I;
		} else if(text.equals(mnNewMenu_J.getText())) {
			pitch = MyButton.PITCH_J;
		} else if(text.equals(mnNewMenu_K.getText())) {
			pitch = MyButton.PITCH_K;
		} else if(text.equals(mnNewMenu_L.getText())) {
			pitch = MyButton.PITCH_L;
		}
		return pitch;
	}
	
	public void setSelectedByName(String name) {
		if(name == null) {
			System.out.println("The name is empty");
			return;
		}
		
		char direction = direction(name);
		if(direction == MyButton.DIRECTION_N) {
			return;
		}
		
		char side = side(name);
		char pitch = pitch(name);
		sideCase(side);
		pitchCase(pitch);
		
		/*
		 * Shows the octave window on actionPerformed();
		 */
//		char octave = octave(name);
//		octaveCase(octave, findSelectedMenuOnPitch(mnNewMenu_PitchOctave), true);
	}
	
	private void pitchCase(char pitch) {
		switch(pitch) {
		case MyButton.PITCH_A : 
			setSelectedByIcon(mnNewMenu_A, true);
			break;
		case MyButton.PITCH_B :
			setSelectedByIcon(mnNewMenu_B, true);
			break;
		case MyButton.PITCH_C : 
			setSelectedByIcon(mnNewMenu_C, true);
			break;
		case MyButton.PITCH_D : 
			setSelectedByIcon(mnNewMenu_D, true);
			break;
		case MyButton.PITCH_E : 
			setSelectedByIcon(mnNewMenu_E, true);
			break;
		case MyButton.PITCH_F : 
			setSelectedByIcon(mnNewMenu_F, true);
			break;
		case MyButton.PITCH_G :
			setSelectedByIcon(mnNewMenu_G, true);
			break;
		case MyButton.PITCH_H : 
			setSelectedByIcon(mnNewMenu_H, true);
			break;
		case MyButton.PITCH_I :
			setSelectedByIcon(mnNewMenu_I, true);
			break;
		case MyButton.PITCH_J :
			setSelectedByIcon(mnNewMenu_J, true);
			break;
		case MyButton.PITCH_K :
			setSelectedByIcon(mnNewMenu_K, true);
			break;
		case MyButton.PITCH_L :
			setSelectedByIcon(mnNewMenu_L, true);
			break;
		}
	}
	
	private void sideCase(char side) {
		switch(side) {
		case MyButton.SIDE_L :
			if(!mntmNewMenuItem_LeftHand.isSelected()) {
				setSelectedByIcon(mntmNewMenuItem_LeftHand, true);
			}
			break;
		case MyButton.SIDE_R :
			if(!mntmNewMenuItem_RightHand.isSelected()) {
				setSelectedByIcon(mntmNewMenuItem_RightHand, true);
			}
			break;
		}
	}
	
	private void octaveCase(char octave, JMenu menus, boolean select) {
		if(side(kp.selectedButton.getName()) == MyButton.SIDE_N) { //N case
			return;
		}
		int intOctave = Integer.parseInt(String.valueOf(octave));
		setSelectedByIcon(menus.getItem(MyButton.NUM_OCTAVES-intOctave), select);
	}
	
	private static char direction(String name) {
		return name.charAt(MyButton.DIRECTION_INDEX);
	}
	
	private static char side(String name) {
		return name.charAt(MyButton.SIDE_INDEX);
	}
	
	private static char type(String name) {
		return name.charAt(MyButton.TYPE_INDEX);
	}
	
	private static char pitch(String name) {
		return name.charAt(MyButton.PITCH_INDEX);
	}
	
	private static char octave(String name) {
		return name.charAt(MyButton.OCTAVE_INDEX);
	}
	
}
