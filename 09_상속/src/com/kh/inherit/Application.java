package com.kh.inherit;

import com.kh.inherit.after.Desktop;
import com.kh.inherit.after.SmartPhone;
import com.kh.inherit.after.Tv;

//import com.kh.inherit.before.Desktop;
//import com.kh.inherit.before.SmartPhone;
//import com.kh.inherit.before.Tv;

public class Application {

	public static void main(String[] args) {
		
		// Desktop 객체 생성
		Desktop desktop = new Desktop("삼성", "d-01", "플렉스북?", 2000000, false);
		
		// SmartPhone 객체 생성
		SmartPhone phone = new SmartPhone("애플", "s-01", "아이폰 se2", 550000, "KT");

		// Tv 객체 생성 
		Tv tv = new Tv("엘지", "t-01", "올레드 벽걸이 TV", 2500000, 60);
		
		System.out.println(desktop.information());
		System.out.println(phone.information());
		System.out.println(tv.information());
		
		// 데스크탑, 스마트폰, 텔레비젼 객체를 각각 만들어서 관리하고 있다. 
		// 이 세 가지 클래스에는 공통적인 인스턴스 변수와 메소드들이 존재한다. 
		// 수정과 같은 유지보수를 할 때는 각각을 수정해줘야 해서 유지보수가 어렵다. 
		
		desktop.setBrand("apple");
		
		System.out.println(desktop.getBrand());
	}

}
