package com.kh.chapter2.layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_NullLayout extends JFrame {
	
	public E_NullLayout () {
		
		super("NullLayout");

		this.setBounds(300, 200, 800, 500);

		// Layout 지정 없이 위치 지정하는 방법
		this.setLayout(null);
		
		JLabel label = new JLabel("이름 : ");
		label.setLocation(50, 100);
		label.setSize(200, 50);
		
		JTextField textField = new JTextField(20);
		textField.setLocation(110, 100);
		textField.setSize(200, 50);
		
		JButton button = new JButton("추가");
		button.setLocation(350, 100);
		button.setSize(100, 50);
		
		this.add(label);
		this.add(textField);
		this.add(button);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}
