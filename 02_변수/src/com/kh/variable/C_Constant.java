package com.kh.variable;

public class C_Constant {
	
	public void finalConstant() {
		// 상수
		// [표현법] final 자료형 변수명;
		// 초기화 이후에는 값을 변경할 수 없다. 
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 30;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		age = 25;
//		AGE = 35;   	// 값을 바꾸면 애러남 final은 다시 값을 바꿀 수 없다. 
	}
}
