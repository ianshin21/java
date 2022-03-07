package com.kh.chapter3.event.view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_MouseAdapter  extends JFrame  {
	
	private int count = 0;
	
	public B_MouseAdapter() {
		
		super("MouseAdapter");
		
		this.setBounds(300, 200, 800, 500);

		JButton button = new JButton("무지개 버튼");	
		this.add(button);
//		this.add(new JButton("무지개 버튼").addMouseListener(l));
		
		button.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
//				button.setBackground(Color.RED);

				int num = count % 5;
				
				switch(num) {
				case 0: button.setBackground(Color.RED); break;
				case 1: button.setBackground(Color.ORANGE); break;
				case 2: button.setBackground(Color.YELLOW); break;
				case 3: button.setBackground(Color.GREEN); break;
				case 4: button.setBackground(Color.BLUE); break;
				}
				
				count++; 
			}
			
			
		});
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
