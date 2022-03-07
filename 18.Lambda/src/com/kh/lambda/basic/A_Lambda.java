package com.kh.lambda.basic;

public class A_Lambda {
	/*
	 * 람다식(Lambda Expressions)
	 * 	- 자바는 함수적 프로그래밍을 위해서 자바 8부터 람다식을 지원한다. 
	 * 	- 람다식은 익명 함수를 생성하기 위한 식으로 객체 지향 언어 보다는 함수 지향 언어에 가깝다. 
	 * 	- 람다식은 매개변수를 가지는 함수와 같은 코드 블럭이지만 런타임시에는 인터페이스의 익명 구현 객체를 생성한다. 
	 * 	- 람다식을 사용하면 코드가 간결해지고, 컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 가져올 수 있다. 
	 * 	
	 * 	 [표현법]
	 * 		([타입 매개변수, ...]) -> {
	 * 			실행문;
	 * 			...
	 * 		};	
	 * 
	 * 		- "([타입 매개변수, ...])"는 중괄호 블럭({ })을 실행하는 필요한 값을 제공하는 역할을 한다. (매개변수)
	 * 		- "->" 기호는 매개 변수를 이용해서 중괄호({})를 실행한다는 뜻으로 생각하면 된다. 
	 * 		- 예시) 
	 * 			- (int a) -> {System.out.println(a);}; - 기본형
	 * 			- (a) -> {System.out.println(a);}; - 매개변수의 타입은 생략 가능 (런타임시에 대입되는 값에 따라 자동으로 인식)
	 * 			- a -> System.out.println(a); - 매개변수가 하나일 때 & 실행문이 하나일 때 : 소괄호, 중괄호 생략 가능
	 * 			- () -> {실행문;...}; - 매개변수가 없으면 매개변수 자리가 없어지므로 빈 괄호()를 반드시 사용해야 한다. 
	 * 			- (a, b) -> { return a + b; }; - 결과값을 리턴해야 한다면 return 문으로 결과값을 지정한다. 
	 * 			- (a, b) -> a + b; -중괄호에 리턴문 하나만 있으면 return문과 중괄호({})를 생략할 수 있다.  
	 */

	public void method1() {
		
		Thread thread;
		
		thread = new Thread(new Runnable(){
			// Thread 클래스는 Runnable을 구현하고 있으나 또한 Runnable을 매개값으로 하는 생성자를 가지고 있다. 
			// Runnable을 매개값으로 하는 생성자가 없으면 이렇게 new를 써서 구현할 수 없음
			@Override
			public void run() {
				System.out.println("익명 구현 객체를 사용한 Thread 생성");				
				}
		});
		
		thread.start();
//		thread.run();

//		D_Func func4 = new D_Func(new C_FuncInterface() {			
//			@Override
//			public int method(int a, int b) {				
//				return a -b;
//			}
//		});
	    // D_Func 클래스는 C_FuncInterface를 구현하고 있다. 그러나 C_FuncInterface를 매개값으로 하는 생성자가 없다. 그래서 에러남 		
		
		System.out.println("------------------------------------");
		
//		thread = new Thread(() -> {
//			System.out.println("람다식을 사용한 Thread 생성");
//		});
		
		thread = new Thread(() -> System.out.println("람다식을 사용한 Thread 생성"));
//		thread = () -> System.out.println("람다식을 사용한 Thread 생성");
				// 위 처럼 new로 객체 생성없이 사용할 수 없다. Thread() 클래스는 functional interface가 아니기 때문 
				// 아래 Runnable() 클래스는 추상 메소드가 단 하나뿐인 functional interface이기  때문에 가능
				// 익명구현 객체 : 상속이나 인터페이스 구현을 통해서 새로 클래스를 만들지 않고 바로 생성해서 사용하는 객체 
		thread.start();
		
		// 의미 없음, 콘솔에 이쁘게 출력하려고 넣어둠
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		System.out.println("------------------------------------");
		// 익명구현 객체 : 상속이나 인터페이스 구현을 통해서 새로 클래스를 만들지 않고 바로 생성해서 사용하는 객체 
		
//		Runnable runnable;
//		
////		runnable = new Runnable() {
////			
////			@Override
////			public void run() {
////				System.out.println("익명 구현 객체를 사용한 Thread 생성");				
////			}
////		};		
//		
//		runnable = () ->  {
//		System.out.println("람다식을 사용한 Thread 생성");
//		};		
//		
//		runnable.run();
		
	}
}














