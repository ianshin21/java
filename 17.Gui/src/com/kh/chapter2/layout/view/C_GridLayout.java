package com.kh.chapter2.layout.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {
	

	public C_GridLayout() {
		super("GridLayout");
		
		this.setBounds(300, 200, 800, 500);

		// 컴포넌트들을 가로, 세로 일정 수만큼 배치하고자 할 때 주로 사용
		// 윗 줄부터 시작 왼쪽에서 오른쪽으로 움직이며 컴포넌트들을 배치
//		this.setLayout(new GridLayout(5, 5));
		this.setLayout(new GridLayout(5, 5, 10, 20));	// 가로 칸, 세로 간, 가로 갭, 세로 갭
		
		for (int i = 1; i < 26; i++) {
			this.add(new JButton(Integer.valueOf(i).toString()));
//			this.add(new JButton(i + " "));			
		}
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
