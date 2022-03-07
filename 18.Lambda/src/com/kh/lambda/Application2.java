package com.kh.lambda;

import com.kh.lambda.basic.B_Functional;
import com.kh.lambda.basic.functional.C_FuncInterface;
import com.kh.lambda.basic.functional.D_Func;

public class Application2 {

	public static void main(String[] args) {

		
		System.out.println("==========B_method5 연습=================");
		
		B_Functional func = new B_Functional();
		func.method5();

		
		D_Func func2 = new D_Func();
//		func.method(100, 10);
		System.out.println(func2.method(200, 10));
		
		
		C_FuncInterface func3 = new D_Func();
		System.out.println(func3.method(300, 10));
		
		System.out.println("== 이상은 람다식과 상관 없음 ==");
		
//		D_Func func4 = new D_Func(new C_FuncInterface() {			
//			@Override
//			public int method(int a, int b) {				
//				return a -b;
//			}
//		});
		// 	다음 경우와 비교 
//			Thread thread;		
//			thread = new Thread(new Runnable(){
//			// Thread 클래스는 Runnable을 구현하고 있으나 또한 Runnable을 매개값으로 하는 생성자를 가지고 있다. 
		    // D_Func 클래스는 C_FuncInterface를 구현하고 있다. 그러나 C_FuncInterface를 매개값으로 하는 생성자가 없다. 그래서 에러남 
		
		//"익명 구현 객체를 사용한 Thread 생성"
		C_FuncInterface func5 = new C_FuncInterface() {
			
			@Override
			public int method(int a, int b) {
				
				return a -b;
			}
		};
		
		System.out.println(func5.method(400, 10));
		
		//"람다식을 사용한 Thread 생성"
		C_FuncInterface func6 = (a, b) -> a * b;
		System.out.println(func6.method(400, 10));
		
		func6 = (a, b) -> a + b;
		System.out.println(func6.method(400, 10));
		
		// func6 객체는 한 번 생성되었으므로 반복 사용 가능 
		
		// 이하 주석 부분은 생성자가 없어서 안됨
//		C_FuncInterface func7 = new C_FuncInterface((a, b) -> a * b);
//		System.out.println(func7.method(400, 10));		
//		
//		C_FuncInterface func6;	
//		func6 = new C_FuncInterface((a, b) -> a + b);
//		System.out.println(func6.method(400, 10));
				
		System.out.println();
		
		
	}

}
