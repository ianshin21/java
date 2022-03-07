package com.kh.chapter5.method;

public class StaticMethodTest {

	/*
	 * Static 메소드
	 * 	[표현법]
	 * 		[접근제한자] static [예약어] 반환형 메소드명 ([매개변수]) {
	 * 			수행내용
	 * 			[return] [반환값];	
	 * 					[ ] : 있어도 되고 없어도 된다는 표시 : void 는 반환값 없음.
	 * 		}
	 * 		- 객체 생성할 필요가 없음
	 * 		- 프로그램 시작 시에 정적메모리 영역에 메소드가 저장되기 때문
	 * 		- 클래스명. 메소드명 [전달값];
	 */
	
	// static이 붙은 클래스변수는 프로그램 실행시에 정적메모리 영역에 저장된다.
	public static int num1 = 10;
	public static int num2 = 20;
	
	public static void method1() {
		// 반환형이 void인 메소드는 반환값이 없어야 하는데 
		// return문 사용할 때 return문 뒤에 반환값이 오면 에러
		//		return 0;   에러 발생
		// return; 이렇게 반환값 없이 사용은 가능 
		
		System.out.println(num1 + num2);
		
		num2++;		
		
		return;
	}
	
	
	public static int method2() {
//		int num1 = 5;			// 이 변수가 들어잇으면 return 에서는 이 내부변수를 먼저 본다. 
//		int num2 = 7;			// 외부변수(클래스변수)를 사용하고 싶으면 아래와 같이
//		return StaticMethodTest.num1 * StaticMethodTest.num2;	
								// this 사용하지 않고 클래스명으로 접근하는 법
//		return this.num1 * this.num2;		//static에서는 this 사용할 수 없다. 
// 객체의 인스턴스변수에 접근하는 것이 아닌 정적메모리의 age에 접근해야 되기 때문에 this 사용 불가
		return num1 * num2;
	}
	
	
	public static void method3(String name) {
		System.out.println(name + "님의 방문을 환영합니다.");
	}
	
	
	public static String method4(String name) {
		return name + "님의 방문을 환영합니다.";
	}

}
