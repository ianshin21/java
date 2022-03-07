package com.kh.chapter4.component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextComponent extends JFrame implements ActionListener {

	private JPanel panel;   // 기본적으로 FlowLayout을 갖는다.
	private JButton button;
	private JTextField text;
	private JTextField result; 
	private JTextArea textArea;
	
	public A_TextComponent() {		
		super("제곱 계산하기");
		
		this.setBounds(300, 200, 300, 300);
		
		// 패널 생성 
		panel = new JPanel();
		// 패널에 라벨 생성하면서 추가하기
		panel.add(new JLabel("숫자 입력 : "));
		
		//텍스트 필드 생성
		text = new JTextField(15);
		panel.add(text);
		
		// 패널에 라벨 생성하면서 추가하기
		panel.add(new JLabel("제곱한 값"));

		// 결과 출력 텍스트 필드 생성 
		result = new JTextField(15);
		result.setEditable(false);   //사용자로부처 값을 입력 받지 못하게 설정하는 메소드
		panel.add(result);		
		
		button = new JButton("계산하기");  //버턴 생성
		panel.add(button);  //버턴을 패널에 추가 
		
		textArea = new JTextArea(10, 25); //히스토리 출력용 텍스터 영역
		textArea.setEditable(false);
		panel.add(textArea);
		
		// JFrame에 패널을 추가 
		this.add(panel);

		//이벤트 처리
		
//		ActionListener listener = this;
		
//		button.addActionListener(new ActionListener());  / 무명클래스 코드
		
		button.addActionListener(this);  //버턴이 클릭되었을 때 
		text.addActionListener(this);		// TextField에 엔터가 눌렸을 때
	
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int value = Integer.parseInt(text.getText());
		String square = value * value + "";
		
		result.setText(square);
		textArea.append(square + "\n");
		text.setText("");
	}
	
	
}
