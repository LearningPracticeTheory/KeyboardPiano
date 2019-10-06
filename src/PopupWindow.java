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
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupWindow {

	private MyButton myButton;

	public PopupWindow(MyButton button) {
		myButton = button;
		addPopUpMenu();
		addActionListener();
		selectIcon.setImage(selectIcon.getImage().getScaledInstance(ICON_LENGTH, ICON_LENGTH, Image.SCALE_DEFAULT));
		unselectIcon.setImage(unselectIcon.getImage().getScaledInstance(ICON_LENGTH, ICON_LENGTH, Image.SCALE_DEFAULT));
	}
	
	private void addPopup(Component component, final JPopupMenu popup) {
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
				setSelectedByName(myButton.getName());
			}
		});
	}
	
	private static final int ICON_LENGTH = 20;
	
	ImageIcon selectIcon = new ImageIcon("img2.png");
	ImageIcon unselectIcon = new ImageIcon("img3.png");
	Font font = new Font(null, Font.BOLD, 16);
	
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
	
	/*
	 * include JMenu & JMenuItem, cause JMenu extends JMenuItem
	 */
	List<JMenu> menus = new ArrayList<>();
	
	ActionAdapter actionAdapter = new ActionAdapter();
	
	private void addActionListener() {
		mntmNewMenuItem_Clear.addActionListener(actionAdapter);
		mntmNewMenuItem_LeftHand.addActionListener(actionAdapter);
		mntmNewMenuItem_RightHand.addActionListener(actionAdapter);
	}
	
	private class ActionAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object menuItem = e.getSource();
			if(menuItem == mntmNewMenuItem_Clear) {
//System.out.println("Clear");
				clear(myButton.getName());
			}
			/*
			 * other components
			 */
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
		
		myButton.setName(newName);
		myButton.setImageAndWavByName(newName);
		myButton.repaint();
	}
	
	private void addOctaves (JMenu menu) {
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("+4");
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("+3");
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("+2");
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("+1");
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("+0");
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("-1");
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("-2");
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("-3");
		JMenuItem mntmNewMenuItem_0 = new JMenuItem("-4");
		
		mntmNewMenuItem_8.setIcon(selectIcon);
		menu.add(mntmNewMenuItem_8);
		menu.add(mntmNewMenuItem_7);
		menu.add(mntmNewMenuItem_6);
		menu.add(mntmNewMenuItem_5);
		menu.add(mntmNewMenuItem_4);
		menu.add(mntmNewMenuItem_3);
		menu.add(mntmNewMenuItem_2);
		menu.add(mntmNewMenuItem_1);
		menu.add(mntmNewMenuItem_0);
		
		unselectAllItems(menu);
		
	}
	
	/*
	 * add component or components? and boolean select
	 * for initialized
	 * publish this method even if it's only use inside, 
	 * it's core method, public it can easily noticed it by color of outline window
	 * if it's private, it can show out whether it's used or not
	 */
	public void setSelectedByName(String name) {
		if(name == null) {
			System.out.println("NULL");
			return;
		}
		char sharp = sharp(name);
		if(sharp == MyButton.N) {
			return;
		}
		
		char side = side(name);
		char pitch = pitch(name);
		char octave = octave(name);
		
		sideCase(side);
		pitchCase(pitch, sharp);
		octaveCase(octave, findSelectedMenuOnPitch(mnNewMenu_PitchOctave));
	}
	
	private char sharp(String name) {
		return name.charAt(MyButton.SHARP_INDEX);
	}
	
	private char side(String name) {
		return name.charAt(MyButton.SIDE_INDEX);
	}
	
	private char pitch(String name) {
		return name.charAt(MyButton.PITCH_INDEX);
	}
	
	private char octave(String name) {
		return name.charAt(MyButton.OCTAVE_INDEX);
	}
	
	/*
	 * Attention: octave value should be change, start from 1(+4), end at 9(-4)
	 * reverse looks so weird and inconvenient
	 */
	private void octaveCase(char octave, JMenu menus) {
		int intOctave = Integer.parseInt(String.valueOf(octave));
//System.out.println(menus.getItemCount());
//		menus.getItem(OCTAVE_SIZE-intOctave).setSelected(true);
		setSelectedByIcon(menus.getItem(intOctave), true);
	}
	
	private JMenu findSelectedMenuOnPitch(JMenu menus) {
		JMenu menu = null;
		for(int i = 0; i < menus.getItemCount(); i++) {
//			if(menus.getItem(i).isSelected()) {
			/*
			 * identify whether is selected by Icon, that's a smart way
			 * rather than create a class and extend the Menus 
			 */
			if(menus.getItem(i).getIcon().equals(selectIcon)) {
				menu = (JMenu)menus.getItem(i);
				break;
			}
		}
		return menu;
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
	
	private boolean isSelected(JMenuItem item) {
		return item.getIcon().equals(selectIcon);
	}
	
	private void setSelectedByIcon(JMenuItem item, boolean selected) {
		if(selected) {
			item.setIcon(selectIcon);
		} else {
			item.setIcon(unselectIcon);
		}
	}
	
	/*
	 * set unselected icon for all items
	 * NEED optimization: if it's already unselected, do nothing 
	 */
	private void unselectAllItems(JMenu items) {
		for(int i = 0; i < items.getItemCount(); i++) {
			setSelectedByIcon(items.getItem(i), false);
		}
	}
	
	private void addPopUpMenu() {
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(myButton, popupMenu);
		
		popupMenu.add(mnNewMenu_PitchOctave);
		
		mnNewMenu_X1.setIcon(unselectIcon);
		
		mnNewMenu_PitchOctave.add(mnNewMenu_X1);
		mnNewMenu_PitchOctave.add(mnNewMenu_S1);
		mnNewMenu_PitchOctave.add(mnNewMenu_X2);
		mnNewMenu_PitchOctave.add(mnNewMenu_S2);
		mnNewMenu_PitchOctave.add(mnNewMenu_X3);
		mnNewMenu_PitchOctave.add(mnNewMenu_X4);
		mnNewMenu_PitchOctave.add(mnNewMenu_S4);
		mnNewMenu_PitchOctave.add(mnNewMenu_X5);
		mnNewMenu_PitchOctave.add(mnNewMenu_S5);
		mnNewMenu_PitchOctave.add(mnNewMenu_X6);
		mnNewMenu_PitchOctave.add(mnNewMenu_S6);
		mnNewMenu_PitchOctave.add(mnNewMenu_X7);
		
		/*
		 * KIA ???????????
		 */
		menus.add(mnNewMenu_X1);
		menus.add(mnNewMenu_S1);
		menus.add(mnNewMenu_X2);
		menus.add(mnNewMenu_S2);
		menus.add(mnNewMenu_X3);
		menus.add(mnNewMenu_X4);
		menus.add(mnNewMenu_S4);
		menus.add(mnNewMenu_X5);
		menus.add(mnNewMenu_S5);
		menus.add(mnNewMenu_X6);
		menus.add(mnNewMenu_S6);
		menus.add(mnNewMenu_X7);
		
		/* replace by down
		for(JMenu menu : menus) {
			menu.setIcon(unselectIcon);
		}
		*/
		
		unselectAllItems(mnNewMenu_PitchOctave);
		
		for(int i = 0; i < mnNewMenu_PitchOctave.getItemCount(); i++) {
			JMenu item = (JMenu)mnNewMenu_PitchOctave.getItem(i);
//			System.out.println(item.getText());
			addOctaves(item);
		}
		
		/* same function as up
		for(JMenu menu : menus) {
			addOctaves(menu);
		}
		*/
		
		popupMenu.add(mnNewMenu_Channel);
		mnNewMenu_Channel.add(mntmNewMenuItem_LeftHand);
		mnNewMenu_Channel.add(mntmNewMenuItem_RightHand);
		
		unselectAllItems(mnNewMenu_Channel);

		/*
		 * clear is a special case
		 */
		popupMenu.add(mntmNewMenuItem_Clear);
	}

}
