package com.kh.chapter1.string;

import java.util.StringTokenizer;

public class C_StringTokenizer {
	
	public void method1() {
		
		String str = "Java,Oracle,JDBM,HTML,CSS,Spring";
		
		//구분자를 이용하여 문자열을 분리 
		
		// 1. String 클래스의 split 메소드를 이용하는 방법
		// split(string regex) : String[] => 입력받은 구분자로 문자열을 분리, 문자열 배열로 담아 리턴
		
		String[] arr = str.split(",");				// (", ") : 정규표현식 응용
		
		System.out.println("============Spting 클래스의 split 메소드를 이용==========");
		System.out.println("분리 후 문자열의 개수 : " + arr.length);
		
		for (String a : arr) {
			System.out.println(a);
		}
		
		// 2. StringTokenizer 이용하는 방법 
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("============StringTokenizer를 이용==============");
		System.out.println("분리 후 문자열의 개수 : " + stn.countTokens());
		
		
		System.out.println("for문을 통한 출력");
		
		int num = stn.countTokens();

		for (int i = 0; i < num; i++) {
			System.out.println(stn.nextToken());
		}
		
		System.out.println("hasMoreTokens? : " + stn.hasMoreTokens());
		System.out.println("while 문을 통한 출력");
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}

}
