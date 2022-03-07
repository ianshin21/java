package com.kh.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame implements ActionListener {
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;
	
	public ScoreFrame() {
		super("ScoreFrame");
		
		this.setBounds(300, 200, 300, 150);
	
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();

		
		panel1.add(new JLabel("점수를 입력하세요"));

		this.add(panel1, "North");
		

		panel2.add(new JLabel("자바 : "));
		
		javaScore = new JTextField(7);
		panel2.add(javaScore);

		panel2.add(new JLabel("SQL : "));
		
		sqlScore = new JTextField(7);
		panel2.add(sqlScore);
		
		calcBtn = new JButton("계산하기"); 
		panel2.add(calcBtn);  

		this.add(panel2, "Center");
		
		
		panel3.add(new JLabel("총점 : "));
		
		total = new JTextField(7);
		total.setEditable(false);  
		panel3.add(total);

		panel3.add(new JLabel("평균 : "));
		
		average = new JTextField(7);
		average.setEditable(false);   
		panel3.add(average);

		this.add(panel3, "South");

		calcBtn.addActionListener(this); 
		javaScore.addActionListener(this);		
		sqlScore.addActionListener(this);		

		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int value1 = Integer.parseInt(javaScore.getText());
		int value2 = Integer.parseInt(sqlScore.getText());
		String sum = value1 + value2 + "";
		String mean = (value1 + value2) / 2 + "";
		
		total.setText(sum);
		average.setText(mean);
		javaScore.setText("");
		sqlScore.setText("");
		
	}

}
