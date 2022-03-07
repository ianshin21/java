package com.kh.operator;

import java.util.Scanner;

public class D_Comparision {
	
	// 비교연산자(관계 연산자) : 조건을 만족하면 참, or 거짓
	
	public void method1() {
		
		Scanner scanner = new Scanner(System.in);    // 'system.in' 은 키보드를 의미함
		
		int num1 = 10, num2 = 25;  // 변수를 이렇게 나열해서 초기화 하는 것은 관례상 잘 사용하지 않음 
		int num3 = 0;
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		
		boolean result = (num1 != num2);
		
		System.out.println("result : " + result);
		
		// 산술연산 + 비교연산
		// 짝수/홀수
		
		System.out.println("임의의 정수를 입력해 주세요");
//		num3 = new Scanner(System.in).nextInt();  // *alt+shift L 변수명 입력창 / Scanner 생성 바로 사용
		num3 = scanner.nextInt();
		
		System.out.println("num3은 짝수인가? : " + (num3 % 2 == 0));
		System.out.println("num3은 홀수인가? : " + (num3 % 2 == 1));
		System.out.println("num3은 5의 배수인가? : " + (num3 % 5 == 0));
		

		
		
		//*alt+shift L 변수명 입력창 연습
		System.out.println("정수 입력");
		
		String inum = scanner.nextLine();
		
//		@SuppressWarnings("resource")
		int num = new Scanner(System.in).nextInt();

		System.out.println(num);

	}

}
