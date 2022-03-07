package com.kh.chapter2;

import java.util.Scanner;

public class A_For {
	
	//for문
	// 반복 횟수가 정해짐 : 
	// 초기식(한번만 수행:변수선언 및 초기화)-> 조건식 -> 수행 -> 증감식 -> 조건식 -> 수행 ->
	// 증감식 -> 조건식 -> 수행 -> 증감식 -> 조건식(여기서 조건 안 맞으면 아웃)
    // 증감식 : 반복문을 제어하는 변수값 증감. 없으면 무한 반복(조건식?) 
	// 초기식, 조건식, 증감식 생략 가능 : 생략하더라도 ;은 반드시 필요
	
	public void method1() {
				
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		
		System.out.println();
		System.out.println("i-- 로 반복");
		
		for(int i = 20; i > 15; i--) {
			System.out.println("안녕하세요");
		}
		
		System.out.println();
		System.out.println("1부터 10까지 숫자 중 짝수인 경우만 출력");
		
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
	}
	
	
	public void method2() {
		
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++ ) {
			sum += i;
//			System.out.println(sum);
		}
		
		System.out.println("합계 : " + sum);   
				// i는 for문(if문) 안에서만 사용 가능. for문 끝나면 사라짐.
	}
	
	
	public void method3() {
		
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력 하시요");
		str = scanner.nextLine();
		
//		str.length(); // 문자열의 길이를 출력하는 메소드
		
		System.out.println("문자열의 길이 : " + str.length());
		
		for(int i = 0; i < str.length() ; i++) {
			System.out.println(str.charAt(i));
		}
			
	}
	
	
	public void method4() {
		
		for(int dan = 2; dan <= 9; dan++) {
			
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%d x %d  = %d\n", dan, su, (dan * su));
			}
			System.out.println();
		}
		
	}
	
	public void method5() {
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 4; j++) {

				if(i == j) {
					System.out.print(i);  //out 대신에 err 써보기
				} else {
					System.out.print("*");
				}
				
			}

			System.out.println();
		}
		
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		for( ; ;) {
			System.out.println("========");
			System.out.println(" Q : 종료");
			System.out.println("========");

			ch = scanner.nextLine().charAt(0);
			
			if(ch == 'Q' || ch == 'q') {
				System.out.println("종료되었습니다");
				
				break;  

			}
		}
	}
}





























