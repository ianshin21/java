package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * 증감 연산자 
	 * ++ : 피연산자의 값을 1 증가시키는 연산자
	 *      ++값, --값 (전위 연산자): 먼저 증감 연산하고 나서 다른 연산(대입연산) 수핸
	 *      값++, 값-- (후위 연산자) : 먼저 다른 연산 하고 나서 증감 연산 
	 * -- : 피연자의 값을 1 감소시키는 연산자
	 */
	
	public void method1() {
		int num = 10;
		
		System.out.println("========== 전위 연산자 테스트 ========");
		// 전위 연산자 테스트
		System.out.println("증감연산자 적용 전 num의 값 :" + num);  // 10
		System.out.println("1회 수행 후 값 :" + ++num);           // 11
		System.out.println("2회 수행 후 값 :" + ++num);          // 12
		System.out.println("3회 수행 우 값 :" + ++num);          // 13
		System.out.println("증감연산자 적용 후 num의 값 :" + num);  // 13

		System.out.println("================================");
		System.out.println();
		
		System.out.println("========== 후위 연산자 테스트 ========");
		// 후위 연산자 테스트
		System.out.println("증감연산자 적용 전 num의 값 :" + num);  // 13
		System.out.println("1회 수행 후 값 :" + num++);           // 13
		System.out.println("2회 수행 후 값 :" + num++);          // 14
		System.out.println("3회 수행 후 값 :" + num++);          // 15
		System.out.println("증감연산자 적용 후 num의 값 :" + num);  // 16
		
		System.out.println("================================");
	}
	
	
	public void method2() {
		int num = 20; 
		int result = num++ * 3;
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
	
		System.out.println("result : " + result); //60
		System.out.println("num : " + num);   //21
		System.out.println(num1++);              //10
		System.out.println((++num1) + (num2++));    // 12 + 20 = 32
		System.out.println((num1++) + (--num2) + (--num3)); // 12 + 20 + 29 = 61 
		System.out.println("num1 : " + num1);  // 13
		System.out.println("num2 : " + num2);  // 20
		System.out.println("num3 : " + num3);  // 29

		
		
	}

}
