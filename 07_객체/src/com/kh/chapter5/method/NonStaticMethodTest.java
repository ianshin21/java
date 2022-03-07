package com.kh.chapter5.method;

import com.kh.chapter4.constructor.User;

public class NonStaticMethodTest {

	/*
	 * 메소드
	 * 	[표현법]
	 * 		[접근제한자][예약어] 반환형 메소드명 ([매개변수]) {
	 * 			수행내용
	 * 			[return] [반환값];				
	 * 							[ ] : 있어도 되고 없어도 된다는 표시 : void 는 반환값 없음.
	 * 		}
	 */
	
	// 1. 매개변수, 반환값 없는 메소드 	
	public void method1() {
		// 아무 값도 반환하지 않고 메소드 내용만 수행 후 종료된다. 
		System.out.println("매개변수와 반환값이 둘다 없는 메소드입니다. return 없어도 됩니다.");
	}

	
	// 2. 매개변수 없고 반환값만 있는 메소드
	public String method2() {
		String str = "매개변수가 없지만 반환값이 있는 메소드입니다.";
		return str;
		
//		return "매개변수가 없지만 반환값이 있는 메소드입니다.";   //이렇게만 해줘도 된다. 
	}
	
	
	// 3. 매개변수가 있고 반환값이 없는 메소드
	//	  매개변수 : 코드블럭 안에서 사용하는 변수
	//  이 메소드는 호출하는 곳에서 전달한 값을 받아서 처리만 하는 메소드. 
	//  반환하지 않고. 출력은 sys.out이 하는 것이므로 return과는 다르다.
	public void method3(int num1, int num2) {
		System.out.println("매개변수 있고 반환값이 없는 메소드입니다.");
		System.out.println("입력 받은 매개변수  num1 + num2 = " + (num1 + num2));
	}
	
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		int result = num1 * num2;
		return result; 
//		return num1 * num2;
	}
	
	
	// 5. 매개변수로 객체를 전달받는 메소드
	//    매개변수로 객체가 전달되거나 반환값으로 객체가 반환될 때는 객체의 참조값(주소)이 전달 또는 반환된다.	
	public void method5(User user) {
		user.setAge(30);
	}
	
//	 java 메소드에서 배열, 객체 리턴 참조하기
//	배열, 클래스 등 참조형을 매개변수로 전달 시에는 데이터의 주소 값을
//	전달하기 때문에 매개변수를 수정하면 본래의 데이터가 수정됨(얕은 복사)
}


















