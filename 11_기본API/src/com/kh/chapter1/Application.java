package com.kh.chapter1;

import com.kh.chapter1.string.A_String;
import com.kh.chapter1.string.B_StringBuilder;
import com.kh.chapter1.string.C_StringTokenizer;

public class Application {

	/*
	 * 1. API란
	 * 	- Application Programming Interface 
	 * 		운영체제나 프로그래밍언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻함
	 * 	- 자바 API는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다. (라이브러리라고 부르기도 한다.)
	 * 
	 * 2. String
	 * 	- 불변의 클래스이다. 객체 생성하면 속성을 변경할 수 없다. 문자열을 변경하면 새로운 주소값을 가진 새로운 객체가 새로 생긴다
	 * 	- 변경이 적고 읽기가 많은(읽기만 하는) 경우에 사용하는 것이 좋다.
	 * 
	 * 3. StringBilder & StringBuffer
	 * 	- 가변의 클래스이다. 
	 * 	- 16개 문자를 저장할 수 있는 버퍼가 미리 생성되고 문자가 저장됨에 따라서 자동으로 증가한다. 
	 * 	- StringBilder & StringBuffer의 차이점은 동기화가 되느냐 안 되느냐의 차이 (쓰레드에 안전하냐 아니냐)
	 * 		멀티쓰레드 환경 -> StringBuffer 사용 권장
	 * 		단일쓰레드 환경 -> StringBilder 사용 권장
	 * 
	 * 4. StringTokenizer
	 *	- 생성자로 전달받은 문자열을 구분자를 이용하여 문자열을 분리한다.
	 *	- 분리된 최소 단위를 토큰이라 부른다.
	 */
	
	public static void main(String[] args) {
		
		new A_String().method1();
		new A_String().method2();
		new B_StringBuilder().method1();
		new B_StringBuilder().method2();
		
		new C_StringTokenizer().method1();
	}

}
