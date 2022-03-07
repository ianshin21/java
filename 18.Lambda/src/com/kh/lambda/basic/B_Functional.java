package com.kh.lambda.basic;

import com.kh.lambda.basic.functional.A_FuncInterface;
import com.kh.lambda.basic.functional.B_FuncInterface;
import com.kh.lambda.basic.functional.C_FuncInterface;
import com.kh.lambda.basic.functional.D_Func;

public class B_Functional {
	/*
	 * 타겟타입(Target Type) 
	 * 	- 람다식은 매개변수를 가진 코드블럭이기 때문에 자바의 메소드 선언처럼 보여지지만 
	 *    자바는 메소드를 단독으로 선언할 수 없고 항상 클래스의 구성 멤버로 선언하기 때문에 
	 *    람다식은 단순히 메소드를 선언하는 것이 아니라 이 메소드를 가지고 있는 객체를 생성한다. 
	 *  - 람다식은 인터패이스 변수에 대입되고 람다식은 인터페이스의 익명 구현 객체를 생성한다. 
	 *  - 람다식은 대입될 인터페이스의 종류에 따라서 작성 방법이 달라지기 때문에 람다식이 대입될 
	 *      인터페이스를 타겟타입이라고 한다. 
	 * 
	 * 함수적 인터페이스(Functional Interface)
	 * 	- 모든 인터페이스가 타겟타입으로 사용할 수 있는 것은 아니다. 
	 * 	- 람다식은 하나의 메소드를 정의하기 때문에 두 개 이상의 추상메소드가 선언된 인터페이스는 
	 *     람다식을 이용해서 구현 객체를 생성할 수 없다. 
	 *  - 즉, 하나의 추상 메소드가 선언된 인터페이스만 람다식의 타겟이 될 수 있는데 이러한 인터페이스를 
	 *     함수적 인터페이스라고 한다. 
	 *  - 함수적 인터페이스를 선언할 때 @FunctionalInterface 어노테이션을 붙이면 두 개 이상의 추상메소드가 
	 *     선언되지 않도록 컴파일러가 체크해 준다. (두 개 이상의 추상메소드가 선언되면 컴파일 에러가 발생한다.)
	 *  - 물론 @FunctionalInterface 어노테이션이 없다고 해서 함수적 인터페이스가 아니란 뜻이 아니고, 
	 *     실수로 두 개 이상의 추상메소드를 선언하는 것을 방지하고 싶으면 붙여준다. 
	 */
	
	private int num = 100;
	
	public void method1() {
		
		A_FuncInterface fi = () -> {
			String str = "매개변수와 반환값이 없는 람다식1";
			
			System.out.println(str);
		};
		
		fi.method();
		
			// functional interface이기  때문에 new로 객체 생성없이 사용할 수 있다
		
		System.out.println("--------------------");
		
		fi = () -> {
			System.out.println("매개변수와 반환값이 없는 람다식2");
		};
		
		fi.method();
		
		// 실행문이 한 줄이라면 중괄호{} 생략 가능
		fi = () -> System.out.println("매개변수와 반환값이 없는 람다식3");
		
		fi.method();
		
		System.out.println();
	
		
		
//		A_FuncInterface fi = new A_FuncInterface() {
		fi = new A_FuncInterface() {
			
			@Override
			public void method() {
				System.out.println("익명 구현 객체를 사용한 인터페이스 구현");				
			}
		};
		// 익명구현 객체 : 상속이나 인터페이스 구현을 통해서 새로 클래스를 만들지 않고 바로 생성해서 사용하는 객체 
		
		fi.method();
	}
	
	public void method2() {
		B_FuncInterface fi = (int a) -> {
			System.out.println(a * 5);
		};
		
		fi.method(10);
		
		// 매개변수의 자료형을 생략 가능
		fi = (a) -> {
			System.out.println(a * 5);
		};
		
		fi.method(5);
		
		//매개변수가 하나이면 소괄호, 중괄호 생략 가능
		fi = a -> System.out.println(a * 5);
		
		fi.method(20);
		
		System.out.println();
	}
	
	public void method3() {
		
		C_FuncInterface fi = (int x, int y) -> {
			return x * y;
		};
		
		System.out.println("10 * 20 = " + fi.method(10, 20)); 
		
		//매개변수의 자료형, return 구문과 중괄호{} 생략 가능
		fi = (x, y) -> x + y;
		
		System.out.println("30 + 50 = " + fi.method(30, 50)); 
		
		
//		fi = new C_FuncInterface() {
//
//			@Override
//			public int method(int a, int b) {
//				// TODO Auto-generated method stub
//				return a + b;
//			}
//		};
		
		fi = (x, y) -> {
			return sum(x, y);
//			return this.sum(x, y);
		};
		
//		fi = (x, y) -> sum(x, y);
		
		System.out.println("50 + 50 = " + fi.method(50, 50)); 
	}
	
	private int sum(int a, int b) {
		return a + b;
	}
	
	
	public void method4(int arg) {
		int num = 20;
		
		// 람다식의 실행 블록에서는 인스턴스 변수 및 로컬 변수, 매개변수를 사용할 수 있다. 
		// 인스턴스 변수는 제약사항 없이 사용 가능하지만, 로컬변수(매개변수)는 제약사항이 따른다.
		// 람다식에서 this는 익명 구현 객체의 참조가 아니라 람다식을 실행한 객체의 참조이다. ***
		A_FuncInterface fi = () -> System.out.println(num);			// 20 (로컬 변수)
//		A_FuncInterface fi = () -> System.out.println(this.num);  	// 100 (인스턴스 변수)
		fi.method();
		
		
		fi = () -> {
			// 람다식에서 지역변수, 매개변수를 이용할 경우 로컬변수(또는 매개변수)는 final, effectively final 이어야 한다.
			// - 로컬변수(또는 매개변수)는 람다식에서 읽는 것은 허용하지만, 람다식 내부, 외부에서 변경할 수 없다.   
			// - 초기화된 이후 값이 한번도 변경되지 않는 변수를 effectively final이라고 한다. 
//			num = 10;		
//			arg = 300;
			
			System.out.println(arg + ", " + num);
		};
		fi.method();
		
	}
	
	public void method5() {
		int result;
		
		D_Func func = new D_Func();
		
		result = func.method(100, 10);	
		System.out.println(result);
		
		System.out.println(func.method(100, 10));
	}

}


























