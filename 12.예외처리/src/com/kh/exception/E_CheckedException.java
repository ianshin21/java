package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_CheckedException {
	
	/*
	 * CheckedException 
	 * 	- Exception을 상속하고 있는 예외들을 CheckedException 이라고 한다.
	 * 	- 컴파일 시 예외 처리 코드가 있는지 검사하는 예외를 말한다 
	 *  - 해당 예외에 대해 예외처리가 되어있지 않으면 컴파일 에러를 발생시킨다.(try~catch, throws)통해서 예외를 던져줘야 한다.
	 * 	- 조건문이나 소스코드 수정으로는 해결되지 않는다. 예측불가능하다. 주로 외부에 매개체와 입출력이 일어날 때 주로 발생
	 */
	
	public void method1() throws IOException {
		method2();
		
	}

	public void method2() throws IOException {
		//Scanner와 같이 키보드로 값을 입려받을 수 있는 객체. 문자열로만
		
		String str = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아무 문자열을 입력해주세요 : ");
		str = br.readLine();
		
		System.out.println(str);
	}
}
