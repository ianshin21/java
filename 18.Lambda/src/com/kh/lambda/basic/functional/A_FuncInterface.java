package com.kh.lambda.basic.functional;

@FunctionalInterface
public interface A_FuncInterface {

	//매개변수와 반환값이 없는 추상메소드
	public void method();
	
//	public void otherMethod();		// 메소드 두개 있으며 에러
	
	/*
	 * 함수형 인터페이스(Functional interface)는 1개의 추상 메소드를 갖고 있는 인터페이스를 말합니다. Single Abstract Method(SAM)라고 불리기도 합니다.
		예를들어, 아래와 같은 인터페이스를 함수형 인터페이스라고 합니다.
			public interface FunctionalInterface {
    			public abstract void doSomething(String text);
			}
		함수형 인터페이스를 사용하는 이유?
		함수형 인터페이스를 사용하는 이유는 자바의 람다식은 함수형 인터페이스로만 접근이 되기 때문입니다.
	 */

}
