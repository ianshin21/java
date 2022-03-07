package com.kh.variable;

public class A_Variable {
	public void printValue() {
		int r = 10;
		int h = 20; 
		double pi = 3.141592653589793;

		
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
		
	}
	
	public void declareVariable () {
		
		boolean isTrue;
		
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		float fNum;
		double dNum; 
		
		char ch = 'a';
		String name = "홍길동"; //참조형   //관습적인가?
//		char ch;
//		String name;
//		
//		ch = 'a';
//		name = "홍길동";
		
		// 변수의 초기화 
		isTrue = false; 
		bNum = 11;
		sNum = 12;
		iNum = 300;
		lNum=3141592653589793L;
		fNum=897932876354.374689f;
		dNum=3.27;
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);

		System.out.println("ch : " + ch);
		System.out.println("name : " + name);

		System.out.println("isTrue : " + isTrue);

		// 대소문자 구분하여 변수명 다르게 쓰기, 예약어 사용 void =\ Void 등등 변수명에 대한 
		// 1age (*) age(o) 
		// 특수문자 사용에 대하여 
		
	}

}
