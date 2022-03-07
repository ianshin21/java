package com.kh.chapter2.layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame {

	public D_CardLayout() {
		super("CardLayout");

		this.setBounds(300, 200, 800, 500);

		// Panel을 이용 카드 판을 여러개 만들어서 겹쳐놓고 
		// 이벤트를 이용해서 다른 판이 보이도록 코드를 작성 
//		this.setLayout( new CardLayout());
		
		CardLayout card = new CardLayout();
		this.setLayout(card);
//		this.setLayout(null);   -> NullLayout 으로
		
		//패널 만들기 
		// 패널은 다른 컴포넌트를 포함 할 수 있는 컨테이어이다.
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		// 패널에 배경색 지정
		panel1.setBackground(Color.BLUE);
		panel2.setBackground(Color.GREEN);
		panel3.setBackground(new Color(213, 87, 206));
		
		// 패널에 라벨 추가 (텍스터 형태의 컴포넌트)
		panel1.add(new JLabel("Panel1"));
		panel2.add(new JLabel("Panel2"));
		panel3.add(new JLabel("Panel3"));
		
		// 프레임에 패널을 추가 
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		
		// 패널에 이벤트 추가 
		// 해당 패널을 클릭할 때마다 발생하는 이벤트를 처리하여 다음 패널이 보이도록 코드 작성 
		
		// 익명클래스/익명객체 추상클래스는 객체 생성할 수 없다 그러나 이런 식으로 사용 / 일회용

		panel1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
//				super.mouseClicked(e);
				
				if (e.getButton() == 1) {  // 마우스 왼쪽버튼 클릭시
					card.next(panel1.getParent());
				}
				
				if(e.getButton() == 3) {  //마우스 오르쪽 버튼 틀릭시
					card.previous(panel1.getParent());
				}
			}			
		});
		
		panel2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
//				super.mouseClicked(e);
				
				if (e.getButton() == 1) {  // 마우스 왼쪽버튼 클릭시
					card.next(panel2.getParent());
				}
				
				if(e.getButton() == 3) {  //마우스 오르쪽 버튼 틀릭시
					card.previous(panel2.getParent());
				}
			}			
		});
		
		panel3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
//				super.mouseClicked(e);
				
				if (e.getButton() == 1) {  // 마우스 왼쪽버튼 클릭시
					card.next(panel3.getParent());
				}
				
				if(e.getButton() == 3) {  //마우스 오르쪽 버튼 틀릭시
					card.previous(panel3.getParent());
				}
			}			
		});
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
