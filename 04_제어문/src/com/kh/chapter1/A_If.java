package com.kh.chapter1;

import java.util.Scanner;

public class A_If {
	
	public void method1() {
		
		
/*	
 * 	 입력 받은 값이 홀수인지 짝수인지 판별
 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		
		int num = scanner.nextInt();

		System.out.println(num + "은" + ((num % 2 == 0) ? "짝수이다" : "홀수이다"));
*/
		
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");

		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d는 짝수이다. \n", num);
		}
		
		if (num % 2 != 0) {
			System.out.printf("%d는 홀수이다. \n", num);
		}
		
	}
	
	
	public void method2() {
		
		// 사용자 이름을 받아서 본인 이름이 맞는지 확인하기 
		
		String name = "";
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름을 입력하세요. : ");
		
		name = scanner.nextLine();
		
//		System.out.println(("김희득" == "김희득"));	 	// 같은 주소값을 가진다는 것을 보여주기 위함. 참이 반환된다.
//		System.out.println(("김희득" == new String ("김희득"))); //힙 영역에 새로 저장됨. 거짓이 반환된다.

		if (name.equals("김희득")) {
			// (name == "김희득") 로 하면 heap에 저장된 주소값이 달라 찾아서 같은지 확인 불가
			System.out.println("본인이 맞습니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
		
	}	

	// if else if else ... : 같은 비교 대상으로 여러개의 조건을 제시할 경우 
	
	public void method3() {
		
/*
 * 		// 사용자가 입력한 영문자가 대문자인지 소문자인지 판별
		
		
		Scanner scanner = new Scanner(System.in);

		char ch = '\u0000';
		
		System.out.println("영문자 입력");
		
		ch = scanner.nextLine().charAt(0);
		

		String result = (ch >= 'A' && ch <= 'Z') ? "대문자이다" : "소문자이다";
		
		System.out.println(ch + "는 " + result);
		
 */
		
		Scanner scanner = new Scanner(System.in);

		char ch = '\u0000';
		
		System.out.println("영문자 입력");
		
		ch = scanner.nextLine().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.printf("%c는 대문자이다", ch);
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.printf("%c 소문자이다", ch);
		} else {
			// 마지막 else는 필수 아님 없어도 됨
			System.out.printf("%c는 영문자가 아니다", ch);
		}
		
		
	}
	
	public void method4() {
		
		// keyBoardInput 예제 활용 
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		float height = 0;
		char ch = '\u0000';		
		String gender = "";
		
		System.out.println("당신의 이름은 무엇입니까?");
		name = sc.nextLine();
		
		System.out.println("당신의 키는 얼마입니까?(소수점 첫째까지 입력)");

		height = sc.nextFloat();
		
		System.out.println("당신의 나이는 얼마?");
		
		age = sc.nextInt();

		System.out.println("당신의 성별은 무엇? (M/F) ");
		sc.nextLine();			
		
		String line = sc.nextLine();  	
		ch = line.charAt(0);			
		
		// ch = sc.nextLine().charAt(0);
		
		if (ch == 'M' || ch == 'm') {
			gender = "남자";
		} else if (ch == 'F' || ch == 'f') {
			gender = "여자";
		} else {
			gender = "중성";
			System.out.println("성별을 잘못입력하셧네요");
			
//			return; // 여기서 stop, 더 이상 실행되는 것이 없음
		}
		
		System.out.printf("%s님 키는 %.1fcm이고 나이는 %d세이고 성별은 %s 입니다.\n", name, height, age, gender);
		
	}
			
	public void method5() {
		
		
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
				(op == '+') ? (num1 + num2) + "" :  
					(op == '-') ? String.valueOf(num1 - num2) : "잘못 입력했습니다";
	
		if (op == '+') {
			System.out.printf("%d %c %d =%s", num1, op, num2, result);

		} else if (op == '-') {
			System.out.printf("%d %c %d =%s", num1, op, num2, result);

		} else {
			System.out.printf("덧셈, 뺄셈 모름");

		}
//	    System.out.println();
//		System.out.printf("%d %c %d =%s", num1, op, num2, result);

		
	}
	
}
