package com.kh.chapter1.container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

//프레임을 생성하는 방법 2
// 	-JFrame 클래스를 직접 객체로 생성 후 해당 프레임 객체의 설정 값을 변경하는 방법
public class JFrameView2 {
	
	public void showJFrame() {
//		JFrame frame = new JFrame();   //JFrame 객체 생성
//		frame.setTitle("MyFrame2");		// 생성된 프레임 이름 설정
		
		JFrame frame = new JFrame("MyFrame2");   //JFrame 객체 생성과 동시에 Title 설정
		
		frame.setLocation(300, 200);		
		frame.setSize(800, 500);
		frame.setResizable(false);
		
		try {
			frame.setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
