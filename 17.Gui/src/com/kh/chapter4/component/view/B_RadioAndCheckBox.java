package com.kh.chapter4.component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class B_RadioAndCheckBox extends JFrame implements ActionListener, ItemListener {
	private JPanel topPanel;
	private JPanel centerPanel;
	private JPanel bottomPanel;
	private JRadioButton small;
	private JRadioButton medium;
	private JRadioButton large;	
	// 객체 배열을 사용하여 여러 개의 체크박스를 초기화
	private JCheckBox[] buttons = new JCheckBox[3];
	private String[] strArr = {"샷추가", "샷샷추가", "시럽추가"};
	private JLabel sizeLabel;
	private JLabel itemLabel;
	
	public B_RadioAndCheckBox () {		
		super("RadioAndCheckBox");
		
		this.setBounds(300, 200, 300, 150);

		topPanel = new JPanel();
		centerPanel = new JPanel();
		bottomPanel = new JPanel();
		ButtonGroup buttonGroup = new ButtonGroup();

		topPanel.add(new JLabel("어떤 커피를 주문하시겠습니까?"));
		this.add(topPanel, "North");
		
		
		// 라디오 버튼 생성
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
		
		buttonGroup.add(small);
		buttonGroup.add(medium);
		buttonGroup.add(large);
		
		centerPanel.add(small);
		centerPanel.add(medium);
		centerPanel.add(large);
		
		// 여러개의 체크박스를 반복문을 통해 초기화 & 패널에 추가
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(strArr[i]);
			
			centerPanel.add(buttons[i]);
		}
				
		this.add(centerPanel, "Center");
		
		// 결과 영역 
		sizeLabel = new JLabel("크기가 선택되지 않았습니다.");
		itemLabel = new JLabel("");
		
		bottomPanel.add(sizeLabel);
		bottomPanel.add(itemLabel);
		
		this.add(bottomPanel, "South");
		
		// 이벤트 처리
//		small.addActionListener(new ActionListener() {			
//		});
				
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
				
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addItemListener(this);
		}

		
//		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == small) {
			sizeLabel.setText("Small");
		} else if (e.getSource() == medium) {
			sizeLabel.setText("Medium");
		} else {
			sizeLabel.setText("Large");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String result = "";
		
		for (int i = 0; i < buttons.length; i++) {
			if(buttons[i].isSelected()) {
				result += buttons[i].getText() + " ";
				
			}
		}
		
		itemLabel.setText(result);
		
	}
	
	

}
