package com.kh.lambda;

import java.util.function.Supplier;

import com.kh.lambda.basic.A_Lambda;
import com.kh.lambda.basic.B_Functional;
import com.kh.lambda.basic.functional.A_FuncInterface;
import com.kh.lambda.basic.functional.C_FuncInterface;
import com.kh.lambda.basic.functional.D_Func;
import com.kh.lambda.standard_functional.A_Consumer;
import com.kh.lambda.standard_functional.B_Supplier;
import com.kh.lambda.standard_functional.C_Function;
import com.kh.lambda.standard_functional.D_Operator;
import com.kh.lambda.standard_functional.E_Predicate;

public class Application {

	public static void main(String[] args) {
		
//		new A_Lambda().method1();

		System.out.println("============================");
		
//		new A_FuncInterface().method();
		A_FuncInterface fi = new A_FuncInterface() {
			
			@Override
			public void method() {
				System.out.println("Application에서 익명 구현 객체를 사용한 인터페이스 구현");				
				
			}
		};
		fi.method();
		
		System.out.println("-------------------------------");
		
//		new B_Functional().method1();
//		new B_Functional().method2();
//		new B_Functional().method3();
//		new B_Functional().method4(200);
		

		System.out.println("==============================");
		
		/*
		 * 표준 함수적 인터페이스
		 * 	- 자바에서 제공되는 표준 API들에서 한 개의 추상메소드를 가지는 인터페이스들은 
		 *        모두 람다식을 이용해서 익명구현객체로 표현이 가능하다. (예: Runnable 인터페이스)
		 *  - 자바 8부터 빈번히 사용되는 함수적 인터페이스는 java.util.function 표준 API 페키지로 제공된다. 
		 *  	- 이 패키지의 목적은 메소드 또는 생성자의 매개 타입으로 사용되어 람다식을 대입할 수 있도록 하기 위해서이다. 
		 *  	- 자바 8부터 추가되거나 변경된 API는 이 표준 함수적 인터페이스들을 매개 타입으로 많이 사용한다.
		 *  - 표준 함수적 인터페이스는 용도에 따라 크게 Consumer, Supplier, Function, Operator, Predicate로 구분된다. 
		 */
		
		new A_Consumer().method1();
		
		Supplier<String> supplier = () -> "Supplier : 제네릭으로 지정된 타입의 객체를 리턴한다. Application에서 실행";		
		System.out.println(supplier.get());
		
		new B_Supplier().method1();
		new C_Function().method1();
		new D_Operator().method1();
		new E_Predicate().method1();
		
		
		System.out.println("===============================");
		
		/*
		 * 메소드 참조 (Method Reference) : 추후 공부할 것
		 */
		
		
	}

}
