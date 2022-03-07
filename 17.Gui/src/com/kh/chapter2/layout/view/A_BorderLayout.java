package com.kh.chapter2.layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {
	
	private JButton north;
	private JButton south;
	private JButton east;
	private JButton west;
	private JButton center;
	
	
	public A_BorderLayout() {
		// 부모의 생성자를 호출하여 프레임의 타이틀을 설정
		super("BorderLayout");
		
		//프레임의 위치 및 크기 설정
		this.setBounds(300, 200, 800, 500);
		
		//프렝에 컴포넌트 배치 지정 방식을 설정
		// JFrame의 기본 배치 지정 방식이 BorderLayout이기 때문에 생략 가능
//		this.setLayout(new BorderLayout());
		
		//현재 프레임에 적용된 레이아웃 출력하는 메소드
		System.out.println(this.getLayout());
		
		//버턴 컴포넘트 생성 (버턴 텍스트)
		north = new JButton("북");
		south = new JButton("남");
		east = new JButton("동");
		west = new JButton("서");
		center = new JButton("가운데");
		
		// JButton 객체가 만들어졌을 뿐 실제 화면에 추가하기 위해서는 
		// JFrame의 add 메소드를 통해서 화면에 추가해야 한다. 
		this.add(center, "Center");
		this.add(west, "West");
		this.add(east, "East");
		this.add(south, "South");
		this.add(north, "North");
		
		// 
//		this.add(new JButton("나는 어디에 위치하나요?"));
		
		
		
		// 프레임이 보이게 하는 메소드와 프로세스를 종료시키는 메소드 호출은 필수로 작성
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}
