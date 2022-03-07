package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice {

	// 키 180.5인 20살 남자 아무개님 반갑습니다^^
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		String gender = "";
		int age = 0;
		float height = 0;
		char ch = '\u0000';
		
		System.out.println("이름이 어떻게 되세요?");
		name = sc.nextLine();
		
		System.out.println("실례지만 키가 얼마나 되세요? 소숫점 한 자리까지만 말씀해주세요.");
		height = sc.nextFloat();
		
		System.out.println("나이를 여쭤봐도 될까요.");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("남자분이세요, 여자분이세요? m/f로 대답해주세요.");
//		ch = sc.nextLine().charAt(0);
		String line = sc.nextLine();  	
		ch = line.charAt(0);		
		
		if (ch == 'M' || ch == 'm') {
			gender = "남자";
		} else if (ch == 'F' || ch == 'f') {
			gender = "여자";						
		} else {
			System.out.println("잘못 입력하셨습니다.");
			
			return;            // return이 있으면 잘못 입력했을 때 여기서 빠져나가고 다음 문장 실행하지 않는다.
		}
		
		System.out.printf("키 %.1fcm인 %d살 %s %s님 반갑습니다.", height, age, gender, name);
		
	}
	
	
	public void method2() {
		
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		
		System.out.println("정수 두 개를 입력하시기 바랍니다.");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("num1 + num2 :" + (num1 + num2));
		System.out.println("num1 - num2 :" + (num1 - num2));
		System.out.println("num1 * num2 :" + (num1 * num2));
		System.out.println("num1 / num2 :" + (num1 / num2));
			
	}
	
	
	public void method3() {
		
		// 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);

		double vert = 0;
		double horiz = 0;
		
		System.out.println("실수 두 개를 입력하시기 바랍니다.");
		
		vert = sc.nextDouble();
		horiz = sc.nextDouble();
		
		System.out.println();
		System.out.println("사각형의 면적은 " + (vert * horiz) + "입니다. \n");
		
		System.out.println("사각형의 둘레는 " + ((vert + horiz) * 2) + "입니다. \n");

	}
	
	
	public void method4() {
		
		// 영어 문자열 값을 키보드로 입력 받아 앞의 문자 세 개를 출력하세요.
		
		Scanner sc = new Scanner(System.in);

		String word = "";
		
		
		System.out.println("떠오르는 영어 단어 하나를 입력하시오.");
		
		word = sc.nextLine();
		
		System.out.println("첫번째 문자는 " + word.charAt(0) + "입니다.");
		System.out.println("두번째 문자는 " + word.charAt(1) + "입니다.");
		System.out.println("세번째 문자는 " + word.charAt(2) + "입니다.");

	}
}


































