package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	// 논리 연산자 : 두 개의 논리값을 연산하는 연산자 : && ||
	
	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("임의의 정수를 입력하시오");
		
		num = scanner.nextInt();
		
		boolean result = (num >= 1) && (num <= 100);  // 1<= num <= 100
		
//		System.out.println(result);
		
		System.out.println("사용자가 입력한 값이 1이상 100 이하인가요? \n" + result);
		
	}

	public void method2() {
		// 사용자가 입력한 값이 y 또는 Y 인지 확인 
		
		Scanner scanner = new Scanner(System.in);
		
		boolean result = false;   // 관례로 초기화
		char ch = '\u0000';   // 혹은 'y'로 초기화 하면?
				
		System.out.println("계속 진행하시려면 y 혹은 Y를 입력하시오.");
		
		String line = scanner.nextLine();  // scanner.nextLine() 까지만 입력하고
											// alt+shift + L 에서 변수명 지정

		ch = line.charAt(0);  // ch = scanner.nextLine().charAt(0);
		
		result = (ch == 'y') || (ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y인가요? : " + result);
		
		
	}
	
	public void method3() {
		//short cut 연산
		
		int num = 10;
		boolean result = false;
		
		System.out.println("&& 연산 전의 num의 값 : " + num);
		
		result = (num < 5) && (++num > 0);
		
		System.out.println(result);
		System.out.println("&& 연산 후의 num의 값 : " + num);  //++num 수행하지 않는다.
		
		 
		System.out.println("=====================================");
		
		result = (num < 20) || (++num > 0);
		
		System.out.println(result);
		System.out.println("|| 연산 후의 num의 값 : " + num);   //++num 수행하지 않는다.
		
		
		
		
	
		
		
	}
}
