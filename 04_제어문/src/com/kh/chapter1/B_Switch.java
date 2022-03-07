package com.kh.chapter1;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 * switch 문 : 동등비교와 같다. 
	 * 
	 * swich(동등비교대상자) {       //동등비교대상자는 int값, char, string만 가능
	 * 		case 값1 :
	 * 			실행코드1;
	 * 			break;
	 * 		case 값2 :
	 * 			실행코드2;
	 * 			break;
	 * 		case 값3 :
	 * 			실행코드3;
	 * 			break;
	 *   	....
	 *   	default :
	 *    		위 조건을 만나지 못했을 때 실행
	 * }
	 * if 문과 달리 실행코드를 실행하고 자동으로 빠져나가지 못함. break 사용  
	 */
	
	public void method1() {
		
		// 사용자로부처 과일 이름 입력 받는다. 
		// 입력된 과일의 값을 지정, 출력
		// 지정한 과일이 없으면 "없다" 출력
		String fruit = "";
		int price = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("먹고 싶은 과일을 말해줘");
		fruit = scanner.nextLine();
		
		switch(fruit) {
			case "복숭아" :
				price = 20;
				break;
			case "자두" :
				price = 20000;
				break;
			case "망고" :
				price = 300;
				break;
			case "샤인 머스켓" :
				price = 1000;
				break;
			default :
				System.out.println("없다");
				
//				return;
		} 
		
		System.out.println(fruit + "의 가격은 " + price + "원입니다");
	}
	
	public void method2() {
		// 1~12월까지 입력, 해당 월의 마지막날 출력
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1월 ~ 12월 중 하나를 입력하세여 : ");
		num = scanner.nextInt();
		
		if (!(num >= 1 && num <=12)) {
			//   (num <= 1 || num >=12)
			System.out.println("1월 ~ 12월 중 하나를 입력하셔야 합니다");
			return;      //잘못 입력한 값은 찍히지 않는다. 
						// return; 명령을 만나면 함수는 실행을 즉시 종요하고 호출원으로 복귀한다. 이후 모든 문장은 실행되지 않는다. (자바스크립트 p203)
		
		}
		
		
		switch(num) {
		case 1:        // case 1, 2, 3: 이런 건 안됨  14버전 이상 가능
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("입력하신 월은 31일 까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(" 입력하신 월은 30일 까지 입니다.");
			break;
		case 2:
			System.out.println("입력하신 월은 27일 혹은 28일 까지 입니다.");
			break;     //있어도 되고 없어도 되고
		}
	}

}
