package com.kh.practice;

import com.kh.HelloWorld;

/* 클래스명  대문자로 시작 
 * 			여러개의 단어가 있을 때는 단어 앞자리마다 대문자로, 낙타 표기법
 * 메서드명 -> 소문자로 시작 
 * 				여러개의 단어가 있을 때는 단어 앞자리마다 대문자로, 낙타 표기법 
 */
public class ValuePrinter {
	public void print() {
		System.out.println(123); // 정수값 출력
		System.out.println(3.14); // 실수값 출력
		
		// 연산 결과 -> 따옴표 없이
		System.out.println(40+125);  // 정수
		System.out.println(1.23-0.12); // 실수 double 
		
		// 문자 하나 작은따옴표
		System.out.println('a');
		System.out.println('b');
		System.out.println((int)'b');

		//문자 연산 
		System.out.println('b' + 1);
		System.out.println((char)('b' + 1)); //형변환 연산자
		
		System.out.println("안녕하세요 \n");
		System.out.print("안녕하세요 " + 123);
		System.out.println();

		System.out.print("안녕하세요" + "네에");
		System.out.println();
		System.out.println("안녕하세요 " + (40 + 125));
		
		
		HelloWorld h = new HelloWorld();  //import 연습 : 다른 package이기 때문에 import함
	}	
}
