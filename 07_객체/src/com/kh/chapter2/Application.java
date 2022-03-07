package com.kh.chapter2;

import com.kh.chapter2._class.Person;
// import com.kh.chapter2._class.Phone;

public class Application {

	public static void main(String[] args) {
		
		// Person이라는 클래스(사용자 정의 자료형)를 먼저 만들어서 값을 넣어보자.
		
		Person ismoon = new Person();
		
		ismoon.setName("문인수");
		ismoon.setAge(20);
		ismoon.setEmail("ismoon@iei.or.kr");
		ismoon.setGender('M');
		ismoon.setPhone("아이폰 se2", "애플", 4.7); // Phone -> Person 통해 와서 여기서 직접 초기화 
		
		System.out.println(ismoon.whoAreYou());
		
	//	Phone phone = new Phone(); // 이렇게 객체 생성하고 싶은데 안됨. 
	//	Phone 클래스는 default라서 다른 패키지에 있는 Application에서 호출 불가
	//	phone.setName("아이폰") 객체 생성이 안되니 여기서 이렇게 입력 불가
	//  1. person 인스턴트변수에서 private String phone을 private Phone phone = new Phone(); 
	//			으로 바꾸고 객체 생성
	//  setPhone에서 매개변수를 통해 클래스 Phone 필드에 접근 
	//  Application -> Person객체를 통해 값 초기화 

	}

}
