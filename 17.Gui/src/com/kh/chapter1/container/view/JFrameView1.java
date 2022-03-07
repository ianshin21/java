package com.kh.chapter1.container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

//프레임을 생성하는 방법 1
// - JFrame 클래스를 상속받아 생성자에서 프레임에 대한 설정 후
// 	 			Main 메소드에서 생성하는 방식 
public class JFrameView1 extends JFrame {
	
	// 기본 생성자 안에서 프레임의 기본 설정들을 세팅한다.
	// 다른 클래서에서 JFrameView1() 생성하면 아래의 생성자의 내용이 실행된다. 
	public JFrameView1() {				//여기는 생성자 안
		
//		super("MyFrame");  this 안 쓰고 super로 부모에 접근 이름 Title 설정 하는 방법
		
		// 프레임의 위치 설정 (x, y)
//		this.setLocation(300, 200);
		
		//프레임의 크기 설정 (width, height)
//		this.setSize(800, 500);
		
		// 프레임의 위치와 크기를 한번에 설정
		this.setBounds(300, 200, 800, 500);
		
		this.setTitle("MyFrame");
		
		try {
			//프레임 상단의 로고 이미지 변경
			this.setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 프레임 사이즈 조정을 할 수 있도록 설정된 메소드 
		// 기본값은 true -> false로 하면 사이즈 변경 안됨
		this.setResizable(false);     
		//여기까지 진행하면 아무것도 보이지 않는다.	
		
		// 프레임을 보이게 하는 메소드
		this.setVisible(true);							// 앞으로는 기본적으로 작성
		// 완전 종료를 위한 옵션
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 앞으로는 기본적으로 작성
		
		
		
	}

}
