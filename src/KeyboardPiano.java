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

	private JFrame frmKeyboardpiano;
	private JTextField textField;
	private JTextField textField_1;
	private Color backGround = new Color(230, 231, 235);

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

	/**
	 * Create the application.
	 */
	public KeyboardPiano() {
		initialize();
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
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(backGround);
		
		JToggleButton toggleButton_13 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_14 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_15 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_16 = new JToggleButton("New toggle button");
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(backGround);
		
		JToggleButton toggleButton_17 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_18 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_19 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_20 = new JToggleButton("New toggle button");
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(backGround);
		
		JToggleButton toggleButton_21 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_22 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_23 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_24 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_13, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_14, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_15, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_16, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_20, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_19, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_18, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_17, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_21, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_22, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_23, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_24, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_13, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_14, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_15, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_16, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_20, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_19, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_18, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_17, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_21, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_22, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_23, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_24, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_10.setLayout(gl_panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(backGround);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_1 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_2 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_3 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_4 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_5 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_6 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_7 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_8 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_9 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_10 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_11 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_12 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addComponent(tglbtnNewToggleButton_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_11, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_10, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_12, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnNewToggleButton_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_11, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_10, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_12, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_11.setLayout(gl_panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(backGround);
		
		JToggleButton toggleButton_25 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_26 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_27 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_28 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_29 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_30 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_31 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_32 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_33 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_34 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_35 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_36 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_37 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_38 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addComponent(toggleButton_25, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_26, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_27, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_28, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_30, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_29, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_31, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_32, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_33, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_35, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_34, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_37, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_36, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_38, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_25, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_26, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_27, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_28, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_30, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_29, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_31, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_32, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_33, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_35, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_34, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_37, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_36, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_38, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_12.setLayout(gl_panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(backGround);
		
		JToggleButton toggleButton_39 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_40 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_41 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_42 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_43 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_44 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_45 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_46 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_47 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_48 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_49 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_50 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_51 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addComponent(toggleButton_39, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_40, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_41, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_42, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_44, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_43, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_45, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_46, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_47, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_49, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_48, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_50, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_51, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_39, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_40, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_41, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_42, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_44, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_43, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_45, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_46, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_47, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_49, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_48, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_50, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_51, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_13.setLayout(gl_panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(backGround);
		
		JToggleButton toggleButton_52 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_53 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_54 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_55 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_56 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_57 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_58 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_59 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_60 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_61 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_62 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_63 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addComponent(toggleButton_52, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_53, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_54, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_55, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_57, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_56, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_58, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_59, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_60, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_62, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_61, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_63, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_52, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_53, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_54, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_55, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_57, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_56, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_58, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_59, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_60, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_62, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_61, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_63, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_14.setLayout(gl_panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(backGround);
		
		JToggleButton toggleButton_64 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_65 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_66 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_67 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_68 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_69 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_70 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_71 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addComponent(toggleButton_64, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_65, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_66, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_67, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_71, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_70, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_69, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_68, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_64, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_65, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_66, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_67, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_71, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_70, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_69, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_68, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
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
		
		JToggleButton toggleButton_72 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_73 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_74 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addComponent(toggleButton_72, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_73, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_74, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_72, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_73, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_74, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_19.setLayout(gl_panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(backGround);
		
		JToggleButton toggleButton_75 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_76 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_77 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_20 = new GroupLayout(panel_20);
		gl_panel_20.setHorizontalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addComponent(toggleButton_75, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_76, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_77, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_20.setVerticalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addGroup(gl_panel_20.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_75, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_76, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_77, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_20.setLayout(gl_panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(backGround);
		
		JToggleButton toggleButton_78 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_79 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_80 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_21 = new GroupLayout(panel_21);
		gl_panel_21.setHorizontalGroup(
			gl_panel_21.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_21.createSequentialGroup()
					.addComponent(toggleButton_78, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_79, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_80, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_21.setVerticalGroup(
			gl_panel_21.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_21.createSequentialGroup()
					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_78, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_79, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_80, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
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
		
		JToggleButton toggleButton_81 = new JToggleButton("New toggle button");
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(backGround);
		GroupLayout gl_panel_23 = new GroupLayout(panel_23);
		gl_panel_23.setHorizontalGroup(
			gl_panel_23.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_23.createSequentialGroup()
					.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_81, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_23.setVerticalGroup(
			gl_panel_23.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_23.createSequentialGroup()
					.addGroup(gl_panel_23.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_81, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_23.setLayout(gl_panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(backGround);
		
		JToggleButton toggleButton_82 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_83 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_84 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_24 = new GroupLayout(panel_24);
		gl_panel_24.setHorizontalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_24.createSequentialGroup()
					.addComponent(toggleButton_82, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_83, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_84, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_24.setVerticalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_24.createSequentialGroup()
					.addGroup(gl_panel_24.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_82, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_83, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_84, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
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
		
		JToggleButton toggleButton_88 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_89 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_90 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_29 = new GroupLayout(panel_29);
		gl_panel_29.setHorizontalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addComponent(toggleButton_88, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_89, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_90, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_29.setVerticalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_88, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_89, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_90, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_29.setLayout(gl_panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(backGround);
		
		JToggleButton toggleButton_104 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_30 = new GroupLayout(panel_30);
		gl_panel_30.setHorizontalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addComponent(toggleButton_104, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_30.setVerticalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addComponent(toggleButton_104, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_30.setLayout(gl_panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(backGround);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(backGround);
		
		JToggleButton toggleButton_91 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_92 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_93 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_38 = new GroupLayout(panel_38);
		gl_panel_38.setHorizontalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addComponent(toggleButton_91, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_92, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_93, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_38.setVerticalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_91, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_92, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_93, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_38.setLayout(gl_panel_38);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(backGround);
		
		JToggleButton toggleButton_94 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_95 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_96 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_37 = new GroupLayout(panel_37);
		gl_panel_37.setHorizontalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addComponent(toggleButton_94, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_95, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_96, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_37.setVerticalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_94, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_95, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_96, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
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
		
		JToggleButton toggleButton_105 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_32 = new GroupLayout(panel_32);
		gl_panel_32.setHorizontalGroup(
			gl_panel_32.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addComponent(toggleButton_105, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_32.setVerticalGroup(
			gl_panel_32.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addComponent(toggleButton_105, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_32.setLayout(gl_panel_32);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(backGround);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(backGround);
		
		JToggleButton toggleButton_97 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_98 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_99 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_35 = new GroupLayout(panel_35);
		gl_panel_35.setHorizontalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addComponent(toggleButton_97, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_98, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_99, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_35.setVerticalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_97, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_98, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_99, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		panel_35.setLayout(gl_panel_35);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(backGround);
		
		JToggleButton toggleButton_100 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_101 = new JToggleButton("New toggle button");
		
		JToggleButton toggleButton_102 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_36 = new GroupLayout(panel_36);
		gl_panel_36.setHorizontalGroup(
			gl_panel_36.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_36.createSequentialGroup()
					.addComponent(toggleButton_100, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_101, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(toggleButton_102, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_36.setVerticalGroup(
			gl_panel_36.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_36.createSequentialGroup()
					.addGroup(gl_panel_36.createParallelGroup(Alignment.LEADING)
						.addComponent(toggleButton_100, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_101, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(toggleButton_102, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
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
		
		JToggleButton toggleButton_106 = new JToggleButton("New toggle button");
		GroupLayout gl_panel_34 = new GroupLayout(panel_34);
		gl_panel_34.setHorizontalGroup(
			gl_panel_34.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addComponent(toggleButton_106, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel_34.setVerticalGroup(
			gl_panel_34.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addComponent(toggleButton_106, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
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
