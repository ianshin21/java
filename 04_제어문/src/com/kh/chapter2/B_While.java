package com.kh.chapter2;

import java.util.Scanner;

public class B_While {

	public void method1() {

//		Math.random();  // 0~1 사이의 값이 임의로 추출

//		System.out.println(Math.random());

		int sum = 0;
		int random = (int) (Math.random() * 10 + 1);
		// 0.09873... * 10 => 0.9873.... + 1 => 1.9873... => 1만 출력
		// Math는 클래스, random은 static method, new문을 써서 클래서 생성하지 않고 그냥 사용 가능
		System.out.println("랜덤 값 : " + random);

		int i = 1;

		while (i <= random) {
			sum += i;

			i++;
		}

		System.out.println("1부터" + random + "까지의 합 : " + sum);
	}

	public void method2() {
		char menu = '\u0000';
		A_For exemple = new A_For(); // 객체 생성 : 같은 package이므로 import되지 않음
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println();
			System.out.println("========메뉴========");
			System.out.println("1 : new A_For().method1() 실행");
			System.out.println("2 : new A_For().method2() 실행");
			System.out.println("3 : new A_For().method3() 실행");
			System.out.println("4 : new A_For().method4() 실행");
			System.out.println("5 : new A_For().method5() 실행");
			System.out.println("Q(q) : 프로그램 종료"); // 반복 실행 하다가 Q누를 때까지
			System.out.println("===========================");
			System.out.println();

			menu = scanner.nextLine().charAt(0);

			switch (menu) {
			case '1':
				exemple.method1();
				break;
			case '2':
				exemple.method2();
				break;
			case '3':
				exemple.method3();
				break;
			case '4':
				exemple.method4();
				break;
			case '5':
				exemple.method5();
				break;
			case 'Q':
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				return;		// while을 빠져나가 프로그램이 종료된다.
//				break; 		// switch만 빠져나간다. while로 돌아가서 프로그램이 종료되지 않고 다시 반복된다.
			default:
				System.out.println("메뉴를 잘못 입력했습니다");
				
				// 	return; 이 있으면 while을 빠져나가 프로그램이 종료되지만 없어서 while문 반복

			}

		}
	}

	public void method3() {

		// 사용자가 입력한 구구단 출력하기

		int dan = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("2 ~ 9 사이의 정수를 입력하세요 : ");
		dan = scanner.nextInt();

		if (dan >= 2 && dan <= 9) {

			int i = 1;

			while (i <= 9) {
				System.out.println(dan + "x" + i + " = " + (dan * i));

				i++;

			}

		} else {
			System.out.println("2 ~ 9 사이의 정수를 입력하셔야 합니다.");
		}

		scanner.close(); // 노란 밑줄 제거하기 , 마지막에 넣기

	}

	public void method4() {

		String str = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("문자열을 입력");
		str = scanner.nextLine();

		int i = 0;

		while (i < str.length()) {
			System.out.println(str.charAt(i));

			i++;

		}

	}
}
