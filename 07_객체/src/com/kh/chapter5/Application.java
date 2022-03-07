package com.kh.chapter5;

import com.kh.chapter4.constructor.User;
import com.kh.chapter5.initblock.InitBlockTest;
import com.kh.chapter5.method.NonStaticMethodTest;
import com.kh.chapter5.method.StaticMethodTest;

public class Application {

	public static void main(String[] args) {
		
		// =====================InitBlockTest=============== 
		
		// 인스턴스 변수 초기화 순서
		// 1. JVM이 정한 기본값으로 설정
		// 2. 명시적 초기화
		// 3. 인스턴스 초기화 블럭
		// 4. 생성자를 통한 초기화
		InitBlockTest test = new InitBlockTest();
		
		System.out.println("=============인스턴스 변수=============");
		System.out.println(test.getPhoneName());
		System.out.println(test.getPrice());
		
		// 클래스 변수 초기화 순서
		// 1. JVM이 정한 기본값으로 설정
		// 2. 명시적 초기화
		// 3. static 초기화 블럭
		System.out.println("======클래스 변수 (객체 생성 없이 호출)=====");
		System.out.println(InitBlockTest.getAge());
		System.out.println(InitBlockTest.getBrand());
		
		System.out.println("\n");
		
		
		
		
		
		System.out.println("=========NonStaticMethodTest========\n");

		NonStaticMethodTest test2 = new NonStaticMethodTest();
		
		
		// 1. 매개변수, 반환값이 없는 메소드 호출
		System.out.println("1. 매개변수, 반환값이 없는 메소드 호출");
		
		test2.method1();
		
		System.out.println("------------------------");
		
		
		// 2. 매개변수 없고 반환값이 있는 메소드 호출 
		System.out.println("2. 매개변수 없고 반환값이 있는 메소드 호출");
		
		String str = test2.method2();
		System.out.println(str);
//		test2.method2();	/이렇게만 하면 아무것도 출력이 안됨
							// 반환만 받았을 뿐이지 뭘 하라는 명령이 없다.
		System.out.println(str = test2.method2());		// 이래도 출력됨
		System.out.println(test2.method2());		// 이래도 출력됨

		System.out.println("------------------------");
		
		
		// 3. 매개변수 있고 반환값 없는 메소드 호출
		System.out.println(" 3. 매개변수 있고 반환값 없는 메소드 호출");
		
		test2.method3(10, 20);
		
		System.out.println("------------------------");
		
		
		// 4. 매개변수도 있고 반환값도 있는 메소드 호출
		System.out.println(" 4. 매개변수도 있고 반환값도 있는 메소드 호출");
		
		int result = test2.method4(30, 40);
		System.out.println("result : " + result);
		System.out.println(test2.method4(20, 30));
		
		System.out.println("------------------------");
		
		
		// 5.매개변수로 User 객체를 전달받는 메소드
		System.out.println("5.매개변수로 User 객체를 전달받는 메소드");
		
		User user = new User("ismoon", "pass01", "문인수");	// 객체 생성이 필요하고
		System.out.println(user.information());	// 이 부분은 클래스 User로 바로 갔다 온다
		
		test2.method5(user);	// 생성한 객체를 호출하고 -> Non----에서 나이 값을 입력하고
		System.out.println(user.information());		
								// User로 전달된 나이 값과 함께 기존에 있던 정보들을 받아왔다
		
		System.out.println("\n");
	
		
		
		
		
		System.out.println("==========StaticMethodTest============\n");
		
		// 객체 생성 없이 메소드 호출
		StaticMethodTest.method1();
		System.out.println("StaticMethodTest.num2 : " + StaticMethodTest.num2);
		
				
//		StaticMethodTest.method2();		//출력 명령이 없어 혼자서는 꽝!
		System.out.println("result : " + StaticMethodTest.method2());

		StaticMethodTest.method3("문인수");

		System.out.println(StaticMethodTest.method4("문인수"));


		
	}

}
