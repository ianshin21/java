package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/* 삼항 연산자 : 피연산자가 3개인 연산자 
	 * 조건식 ? 식1(조건식이 참일 경우 수행) : 식2 (조건식이 거짓일 경우 수행)
	 * 조건식은 주로 비교, 논리 연산자 사용, 반드시 참, 거짓이 나와야 함 
	 */
	
	public void method() {
		
		//입력 받은 정수가 양수인지 아닌지 판별 
		// int num = 0; 없어도 밑에서 만들어졌음 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		int num = scanner.nextInt();
	
		String result = (num > 0) ? "양수이다." : "양수가 아니다";
		
		System.out.println(num + "은(는) " + result);
		
//		System.out.println(num + "은" + ((num > 0) ? "양수이다" : "양수가 아니다"));
		System.out.println(num + "은(는) " + ((num == 0) ? "0 입니다" : (num > 0) ? "양수이다" : "음수이다"));
	}
	
	public void method2() {
		
		// 입력 받은 값이 홀수인지 짝수인지 판별
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		
		int num = scanner.nextInt();

	
		System.out.println(num + "은" + ((num % 2 == 0) ? "짝수이다" : "홀수이다"));

	}
	
	public void method3() {
		
		// 사용자가 입력한 영문자가 대문자인지 소문자인지 판별
		
		
		Scanner scanner = new Scanner(System.in);

		char ch = '\u0000';
		
		System.out.println("영문자 입력");
		
		ch = scanner.nextLine().charAt(0);
		
		// 		String line = scanner.nextLine();  
		// 		ch = line.charAt(0);  // ch = scanner.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z') ? "대문자이다" : "소문자이다";
		
		// 문자를 비료할 때는 코드값으로 비교한다. 
		
		System.out.println(ch + "는 " + result);
		
		
	}
	
	public void method4() {
		
		// 두 정수를 입력받고 + 또는 -를 입력받아 알맞는 계산을 출력하라.
		// +, - 외의 다른 문자를 입력하는 경우 "잘못 입력했습니다" 출력
		int num1;
		int num2;
		char op = '\u0000';

		
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("첫번째 수를 입력하시오");
		
		num1 = scanner.nextInt();

		System.out.println("두번째 수를 입력하시오");

		num2 = scanner.nextInt();
 		scanner.nextLine();
		
		System.out.println("연산자를 입력하시오 (+ or -)");
		
		op = scanner.nextLine().charAt(0);

		String result =
				(op == '+') ? (num1 + num2) + "" :  //  (num1 + num2)의 결과 값을 문자형으로 바꿀려고 "" 사용, 자료형이 string
					(op == '-') ? String.valueOf(num1 - num2) : "잘못 입력했습니다";
		// String.valueOf(	) 기본 자료형 값들을 문자로 바꾸어 주는 메서드 
//					System.out.println(String.valueOf(false)); 연습
					
		System.out.printf("%d %c %d = %s", num1, op, num2, result);
		
		
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		
		System.out.println(String.valueOf(B_InDecrease.class)); //연습
		System.out.println(String.valueOf(int.class)); //연습
		System.out.println(String.valueOf(Integer.class)); //연습
		System.out.println(String.valueOf(Integer.TYPE)); //연습
		System.out.println(String.valueOf(false)); //연습
		
		
		/*
		 * In Java, "X.class" is the syntax for class literals. When X is the name of a
		 * class or interface, the expression X.class evaluates to the Class object
		 * representing that class or interface type (which are reference types).
		 * 
		 * Since there are also Class objects for primitive types (used in reflection),
		 * for consistency, they extended the syntax so that for a primitive type X, the
		 * expression X.class also evaluates to the Class object representing that
		 * primitive type. Note that for all primitive types, this value is also
		 * available as the static field "TYPE" of the corresponding wrapper class. So
		 * int.class is equivalent to Integer.TYPE.
		 * 
		 * int.class and Integer.class are completely different things. They evaluate to
		 * two different Class objects, representing two very different types. However,
		 * confusingly, (for obscure reasons) in Generics, both expressions are
		 * specified by the language to have the same compile-time type, Class<Integer>.
		 */
		
		
	}

}












