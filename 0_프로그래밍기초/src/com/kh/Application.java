package com.kh;

// 주석 : 소스코드와는 무관 코드로 인식하지 않음 

/* 
 * 여러 줄 주석 
 * IDE 구성 요소
 * 1. 소스 코드 편집기
 * 2. 로컬 빌드 자동화
 * 3. 디버거 
 */
// ctrl + shift + o 자동으로 import 정리
// ctrl + . 에러로 이동 
// ctrl + 1 해결 책

import com.kh.practice.ValuePrinter;

public class Application {
	
	// 프로그램의 시작점
	// java.exe가 제일 먼저 실행되는 메소드
	public static void main(String[] args) {
		// 1) 실행할 메소드가 있는 클래스 생성
		// 클래스 사용할 이름 = new 클래스명(); 
		ValuePrinter printer = new ValuePrinter ();
		// com.kh.practice.ValuePrinter printer = new com.kh.practice.ValuePrinter (); 
		// 이름이 같은 클래스를 가진 다른 패키지를 import 할 때 패키지명, 경로를 적어준다.  
	
		printer.print();   // 메서드 호출
	}

}
