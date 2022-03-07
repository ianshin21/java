package com.kh.chapter3.event.view;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class C_KeyListener extends JFrame {
	
	public C_KeyListener() {		
		super("KeyListener");
		
		this.setBounds(300, 200, 300, 200);
		
		JTextField textField = new JTextField();
		this.add(textField);
		
		// 메소드 호출 순서 
		// 1. 유니코드의 경우 keyPressed -> keyTyped -> keyReleased
		// 2. 유니코드 아닌 경우 keyPressed -> keyReleased 
		
		textField.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
//				// 키보드의 키를 누르는 순간 발생하는 이벤트를 처리하는 이벤트 핸들러
//				// 한글 입력하면 안 됨 
				System.out.println("keyPressed");
				char ch = e.getKeyChar();
				int keyCode = e.getKeyCode();
				
				boolean isAlt = e.isAltDown();
				boolean isControl = e.isControlDown();
				boolean isShift = e.isShiftDown();
				
				System.out.println(ch + " " + keyCode + " " + isAlt + " " + isControl + " " + isShift);
			}
			
			
			@Override
			public void keyTyped(KeyEvent e) {
				// 유니코드에 해당하는 키보드의 키를 누르는 순간 발생하는 이벤트를 처리하는 이벤트 핸들러
				// 한글 입력이 된다. 
				System.out.println("keyTyped");
//				char ch = e.getKeyChar();
//				int keyCode = e.getKeyCode();
//				
//				boolean isAlt = e.isAltDown();
//				boolean isControl = e.isControlDown();
//				boolean isShift = e.isShiftDown();
//				
//				System.out.println(ch + " " + keyCode + " " + isAlt + " " + isControl + " " + isShift);

				
			}


			@Override
			public void keyReleased(KeyEvent e) {
				// 키보드의 키를 떼는 순간 발생하는 이벤트를 처리하는 이벤트 핸들러
				System.out.println("keyReleased");
				
			}
			
			
		});
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	

}
