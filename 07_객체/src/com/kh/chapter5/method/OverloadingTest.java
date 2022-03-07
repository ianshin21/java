package com.kh.chapter5.method;

public class OverloadingTest {
	// 메소드 오버로딩
	// 		- 한 클래스 내에 같은 메소드명으로 정의할 수 있는 방법
	//		- 매개변수의 자료형과 개수, 순서가 다르게 작성되어야만 한다. 
	// 		- 단, 매개변수명, 접근제한자, 반환형은 매소드 오버로딩에 영향을 주지 않는다. 
	
	public void test() {		
		// System.out.print(); 에러남 : //print 메소드는 매개변수 없으면 에러
		//		System은 클래스명이며 print, println 등은 메소드임을 보여준다.
	}
	
	public void test(int a) {
	
	}
	
	public void test(int a, String s) {			// test(10, "yes")
		
	}
	
	public void test(String s, int a) {			// test("yes", 10)
		
	}
	
	public void test(int a, int b) {
		
	}

	/*
	 * 
	 * 다음은 에러 발생 
	 *  - 매개변수명과는 상관없이 자료형의 개수와 순서가 같아서 에러가 발생
	 *  - 자료형의 개수 순서가 다르게 작성되어야 한다. 
	 
	public void test(int c, int d) {		
	}
	*/
	
	public void test(int a, int b, String s) {    
		
	}
	
	/*
	 * 다음은 에러 발생 
	 *   	- 반환형이 다르다고 오버로딩이 되는 것은 아니다. 
	 *   	- 메소드를 호출하는 시점에 매개변수가 동일하기 때문에 에러가 발생
	 *   	- 반환형과 상관없이 자료형의 개수, 순서가 다르게 작성되어야 한다. 
	 *   	- 반환값에 대해서는 관심이 없다. 즉, 입력이 중요
	 
	public int test(int a, int b, String s) {		
	}
			- 접근제한자가 다르다고 오버로딩이 되는 것은 아니다.
	private void test(int a, int b, String s) {    		
	}

	
	*/
	
	
	
}

















