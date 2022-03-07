package com.kh.chapter3;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break 문 : 가장 가까운 '반복문'을 빠져나가는 구문
	 *     단, switch문 안의 break는 switch문을 빠져나가는 역할을 한다. 
	 */
	
	public void method1() {
		
		// 사용자에게 문자열을 입력받고 입력받은 문자열의 길이를 출력, 
		//단 사용자가 exit라는 문자를 입력하면 반복을 종료.
		String str = "";
		Scanner scanner =new Scanner(System.in);
		
		do {
			System.out.println("문자열 입력");
			str = scanner.nextLine();
			
			if(str.equals("exit")) {
//				System.out.println("프로그램을 종료함.");   // 이 문장은 여기 있어도 되고

				break;
			}
			
			System.out.println("입력 문자열" + str + "의 길이" + str.length() + "입니다.");
			
		} while(true);
		//exit -> break 에서 여기로 옴. do-while 빠져 나옴.
		System.out.println("프로그램을 종료함.");   
		
		scanner.close();
		
	}
	
	
	public void method2() {
		
		int sum = 0;
		int random = 0;
		
		while(true) {
			
			sum = 0;   // 이거 없으면 sum이 이전 것에서 계속 누적됨
			
			random = (int)(Math.random() * 10 + 1);
			
//		System.out.println("랜덤값 : "  + random);
		
			if (random == 5) {
				break;
			}
			
			for (int i = 1; i <= random; i++) {
				sum += i;
			}
			
			System.out.println("1부터" + random + "까지의 합 :" + sum);
		}
		System.out.println("프로그램 종료");
		
	}
	

}























