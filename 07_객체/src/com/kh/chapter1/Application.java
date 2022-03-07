package com.kh.chapter1;

import com.kh.chapter1.encapsulation.Student;

public class Application {

	/*
	 * 추상화와 캡슐화
	 * 
	 * 1. 추상화 
	 * 		- 프로그램에서 사용할 객체들이 가진 공퉁의 특성들을 파악하고 불필요한 특성들을 제거하는 과정
	 * 		- 최종적으로 선정된 속성들을 가지고 어떠한 자료형으로, 어떠한 변수명으로 사용할 지 정리해서 코드로 작성
	 * 
	 * 2. 캡슐화
	 * 		- 추상화를 통해서 정의된 속성들과 기능을 하나로 묶어 관리하는 기법 중 하나로 
	 * 			클래스의 가장 중요한 목적인 데이터 접근 제한을 원칙으로 외부로부터 데이터의 직접 접근을 막고
	 *          대신에 데이터를 간접적으로 처리하는 메소드들을 클래스 내부에 작성하여 제공하는 방법
	 *      - 객체의 필드, 메소드를 하나로 묶고 실제 구현 내용을 감추는 것
	 *      - 외부에서 객체의 내부를 알지 못하며 객체가 노출해서 제공하는 필드나 메소드만(public) 이용할 수 있다.
	 */
	
	public static void main(String[] args) {
		// 만약에 변수만을 가지고 프로그램에서 필요한 객체들을 만들어 본다면?
		// 문인수 학생 객체 만들기
		String name1 = "문인수";
		int age1 = 20;
		int sNum1 = 1001;
		int math1 = 90;
		
		
		// 공원상 학생 객체 만들기
		String name2 = "공원상";
		int age2 = 18;
		int sNum2 = 1002;
		int math2 = 80;
		
		// 수백, 수천 명의 학생 객체가 있어야 한다면? 관리 불능,
		// 특히 변수명을 달리해야 하고. 누구나 접근, 수정 가능 
		// => 클래스 생성 : 객체를 만드는 틀, 객체를 찍어 내자
		
		
		
		// 1. 클래스를 만들고 나서 객체로 만들기 위해서는 new 연산자 통해서 heap 영역에 생성해야 한다.
		// abstraction의 Student 클래스
/*
		Student moon = new Student();  	// 객체 생성
		Student kong = new Student();
		
		// 필드에 접근해서 값을 초기화
		moon.name = "문인수";
		moon.age = 20;
		moon.height = 180.7;
		moon.sNum = 1001;
		moon.gender = "남자";
		moon.mathscore = 100;
		
		kong.name = "공원상";
		kong.age = 19;
		kong.height = 160;
		kong.sNum = 1002;
		kong.gender = "남자";
		kong.mathscore = 100;
		
				
		// 필드에 직접 접근해서 값을 가져오기.
			System.out.println(moon.name + "님의 나이는 " + moon.age + "이고 수학점수는 " 
						+ moon.mathscore + "입니다.");
			System.out.println(kong.name + "님의 나이는 " + kong.age + "이고 수학점수는 " 
					+ kong.mathscore + "입니다.");

		// 여전히 필드에 직접 접근해서 외부에서 값을 변경할 수 있다.
		// 즉 public 으로 작업 하면 외부에서 직접 접근, 값 변경, 조회 가능

		
		
		// -> 캡슐화 작업으로 외부에서 직접 접근 불가능 하게 함
		//    encapsulation의 Student 클래스
		 * 
		com.kh.chapter1.encapsulation.Student ismoon = new com.kh.chapter1.encapsulation.Student();
*/			// 다른 패키지 끼리 같은 클래스 명이 있다면 패키지 경로를 다 적어 줘야 한다.
		// => import를 지우고 바꿔라 
		
		Student moon = new Student();
		
//		moon.name = "문인수"; 
//		moon.age = 21; 
//		moon.height = 190; // 클래스가 private로 캡슐화 되었으므로 직접 접근 불가 
		
		// 간접 접근 되도록 getter와 setter를 사용한다. 
		
		moon.setName("문인수");
		moon.setAge(21);
		moon.setHeight(183.4);
		moon.setGender("남자");
		moon.setMathscore(88);
		moon.setsNum(1001);
		
//		moon.method();   	
		// 같은 클래스내이기 때문에 이 메소드내에서 필드에 접근하여 수정, 혹은 입력한 값들이 출력됨 
		
		System.out.println();
		System.out.println(moon.getName() + "님의 나이는 " + moon.getAge() + "이고 수학점수는 " 
				+ moon.getMathscore() + "입니다.");
		System.out.println("=========================");
		
		System.out.println(moon.information());
		System.out.println("========================");
		
		System.out.println(moon.toString());
//		moon.information();   // information이라는 메소드는 자체로 출력문을 가지고 있지 않다. 
							// moon 객체가 제공한 정보를 취합하여 -> 정보들을 문자열로 반환해준다. 
		System.out.println(moon);	// toString을 열었기 때문에 moon.toString()와 같다. 
									// toString이 없으면 주소값 나옴

		moon.method();   	// 같은 클래스내이기 때문에 이 메소드내에서 필드에 접근하여 수정, 혹은 입력한 값들이 출력됨 
		
	}

}
