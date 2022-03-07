package com.kh.chapter2.layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame {
	
	public B_FlowLayout() {
		super("FlowLayout");
		
		this.setBounds(300, 200, 500, 300);

//		this.setLayout(new FlowLayout());		//기본적으로 가운데 정렬
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));		// static field 사용
//		this.setLayout(new FlowLayout(FlowLayout.RIGHT));		
		this.setLayout(new FlowLayout(FlowLayout.LEADING));		
//		this.setLayout(new FlowLayout(FlowLayout.TRAILING));		
//		this.setLayout(new FlowLayout(FlowLayout.CENTER));		
		
		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
		this.add(new JButton("4"));
		this.add(new JButton("5"));
		this.add(new JButton("6"));
		this.add(new JButton("7"));
		this.add(new JButton("8"));
		this.add(new JButton("9"));
		this.add(new JButton("10"));
		this.add(new JButton("11"));
		this.add(new JButton("12"));
		this.add(new JButton("13"));
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
