package com.kh.chapter3.event.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_MouseListener extends JFrame {
	
	public A_MouseListener() {
		super("MouseListener");
		
		this.setBounds(300, 200, 800, 500);
		
		JPanel panel = new JPanel();
		
		this.add(panel);
		
		panel.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent e) {	
				System.out.println("mousePressed");
				// 마우스 클릭할 때 발생하는 이벤트를 처리하는 이벤트 핸들러
//				System.out.println("X : " + e.getX() + ", Y : " + e.getY());				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {	
				System.out.println("mouseClicked");
				// 마우스 뗄 때 발생하는 이벤트를 처리하는 이벤트 핸들러
//				System.out.println("X : " + e.getX() + ", Y : " + e.getY());
			}
			
						
			@Override
			public void mouseReleased(MouseEvent e) {	
				System.out.println("mouseReleased");
				// 마우스 뗄 때 발생하는 이벤트를 처리하는 이벤트 핸들러
//				System.out.println("X : " + e.getX() + ", Y : " + e.getY());
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered");
				// 이벤트가 패널 안에 들어갈 때 발생하는 이벤트 
//				System.out.println("X : " + e.getX() + ", Y : " + e.getY());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {		
				System.out.println("mouseExited");
				// 이벤트가 패널 안에서 나갈 때 발생하는 이벤트 
//				System.out.println("X : " + e.getX() + ", Y : " + e.getY());
			}
			
		});
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
