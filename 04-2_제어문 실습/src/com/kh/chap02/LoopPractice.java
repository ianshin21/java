
package com.kh.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	
	public void practice1() {
		
/*		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요		
*/
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 이상의 수를 입력하세요.");
		num = scanner.nextInt();

		System.out.println();
		
		if (num < 1) {
			System.out.println("잘못 입력했습니다.");
//			return;
		}
		
		for (int i = 1; i <= num; i++) {
			
			System.out.print(i + " ");
			
		}
	}
	
	
	public void practice2() {
		
//		practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 이상의 수를 입력하세요.");

		while (true) {
			
			num = scanner.nextInt();

			System.out.println();

			if (num < 1) {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				continue;
			}
			
			for (int i = 1; i <= num; i++) {				
				System.out.print(i + " ");				
			}
			return;
		}
	}
	
	
	public void practice3() {
		
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.   (for문 이용)
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 이상의 수를 입력하세요.");
		num = scanner.nextInt();

		System.out.println();
		
		if (num < 1) {
			System.out.println("잘못 입력했습니다.");
//			return;
		}
		
/*		for (int i = num; i > 0; i--) {		
			System.out.print(i + " ");
		}
*/			
		for (int i = 0; i < num; i++) {
			System.out.print(num - i + " ");
		}
		
/*
 * 		if (number >= 1) {
			for (int i = number; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

 */
		
	}
	
	
	public void practice4() {
		
//		practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 이상의 수를 입력하세요.");

		while (true) {
			
			num = scanner.nextInt();
			
			System.out.println();

			if (num < 1) {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				continue;
			}
			
			for (int i = 0; i < num; i++) {				
				System.out.print(num - i + " ");				
			}
			return;
		}
		
	}
	
	
	public void practice5() {
		
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요
		
		int num = 0; 
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 입력 : 합을 구하겠습니다.");
		
		num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {			
			sum += i;
		}
		System.out.println("합계는 " + sum + "입니다.");
	}	
	
	
	public void practice6() {
		
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하시오.");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자만 입력해주세요.");
			return;
		}
		
		if (num1 < num2) {			

			for (int i = num1 ; i <= num2; i++) {
				System.out.print(i + " ");
			}

		} else if (num1 > num2) {			

			for (int i = num2 ; i <= num1; i++) {
				System.out.print(i + " ");
			}

		}
	}
	
	
	public void practice6_2(){
		
		int min = 0;
		int max = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("put the first num");
		num1 = scanner.nextInt();
		
		System.out.println("put the second num");
		num2 = scanner.nextInt();
				
		if (num1 >= 1 && num2 >= 1) {
			min = Math.min(num1, num2);
			max = Math.max(num1, num2);
			
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			} 
			
		} else {
			System.out.println("1 이상의 숫자만 입력해주세요");
		}
	}
	

	public void practice7() {
		
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하시오.");

		while (true) {

			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자만 입력해주세요.");
				continue;
			}
			
			if (num1 < num2) {
				
				for (int i = num1 ; i <= num2; i++) {
					System.out.print(i + " ");
				}

			} else if (num1 > num2) {
				
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}

			}
			return;
		}
	}
	
	
	public void practice7_2() {
		
		int min = 0;
		int max = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
	
		while (true) {
			System.out.println("the first num");
			num1 = scanner.nextInt();
			
			System.out.println("the second num");
			num2 = scanner.nextInt();
					
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자만 입력해주세요.");
				continue;
			}
	
			if (num1 >= 1 && num2 >= 1) {
				min = Math.min(num1, num2);
				max = Math.max(num1, num2);
				
				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");
				} 
				
			} 
			return;
		}
	}
	
	
	
	public void practice7_3(){
		
		int min = 0;
		int max = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {

			System.out.println("put the first num");
			num1 = scanner.nextInt();
			
			System.out.println("put the second num");
			num2 = scanner.nextInt();
					
			if (num1 >= 1 && num2 >= 1) {
				min = Math.min(num1, num2);
				max = Math.max(num1, num2);
				
				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");
				} 
				return;
				
			} else {
				System.out.println("1 이상의 숫자만 입력해주세요");
			}
			
		}
	}
	
	
	public void practice8() {
		
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.

		int dan = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구구단을 외자! 단을 입력하시오.");
		dan = scanner.nextInt();
		
		System.out.println("==========" + dan + "단=======");

		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + " x " + i +" = " + (dan * i));
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		}
	}
	
	
	public void practice9() {
		
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요
		
		int dan = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("구구단을 외자! 단을 입력하시오.");
		dan = scanner.nextInt();
		
		if (dan < 2 || dan > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			return;
		}
		
		for (int i = dan; i <= 9; i++) {
			System.out.println("==========" + i + "단=======");

			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, (i * j));
			}
			System.out.println();

		}

	}
	
	
	public void practice10() {
		
//		Practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
//		“2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		int dan = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("구구단을 외자~ 단을 입력하시라");
		
		while (true) {
			
			dan = scanner.nextInt();
			
			if (dan < 2 || dan > 9) {
				System.out.println("2~9 사이의 숫자를 입력해주세요");
				continue;
			}
			
			for (int i = dan; i <= 9; i++) {
				System.out.println("==========" + i + "단=======");

				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d\n", i, j, (i * j));					
				}
				System.out.println();
			}
			return;

		}
	}
	
	
	public void practice11() {
		
		int a = 0;
		int d = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("등차수열 연습? 첫째항을 입력하시오.");
		a = scanner.nextInt();
		
		System.out.println("공차를 입력하시오.");
		d = scanner.nextInt();		
		
/*		for (int i = 1; i <= 10; i++) {			
			System.out.print((a + (i - 1) * d) + " ");
		}
*/				
		for (int i = 0; i < 10; i++) {
			System.out.print((a + i * d) + " ");
		}
		
	}
	
	
	public void practice12() {
		
/*		정수 두 개와 연산자(문자열로) 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
				단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
				exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
				또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
				“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
				없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
				두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
*/
		int num1 = 0;
		int num2 = 0;
		String op = "";
		Scanner scanner = new Scanner(System.in);

		
		while (true) {
						
			System.out.println("첫번째 정수 입력");
			num1 = scanner.nextInt();
			
			System.out.println("두번째 정수 입력");
			num2 = scanner.nextInt();

			scanner.nextLine();			// 까먹지 말자
			
			System.out.println("연산자 입력 : + - * / % 중 선택하시오.");
			op = scanner.nextLine();

			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}  
					
			if ( !(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%"))) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			} 
			
			if (op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println();
			
		
			switch (op) {
			
				case "+":
					System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
					break;
				case "-":
					System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
					break;
				case "*":
					System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
					break;
				case "/":
					System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
					break;
				case "%":
					System.out.printf("%d 나누기 %d의 나머지 = %d", num1, num2, (num1 % num2));
					break;
			}
			System.out.println();
			System.out.println("=========================================");
			System.out.println();
				
		}
	}
	
	
	public void practice12_2() {
	
	// 정답
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		String op = "";
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("첫번째 정수 입력");
			num1 = scanner.nextInt();
			
			System.out.println("두번째 정수 입력");
			num2 = scanner.nextInt();

			scanner.nextLine();			// 까먹지 말자
	
			System.out.println("연산자 입력 : + - * / % 중 선택하시오.");			
			op = scanner.nextLine();

			if (op.equals("exit")) {
				System.out.println("프로그램을 종요합니다.");
				return;
			}  
			
			if (op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println();
	
			switch (op) {
			
				case "+": result = num1 + num2; break;
				case "-": result = num1 - num2; break;
				case "*": result = num1 * num2; break;
				case "/": result = num1 / num2; break;
				case "%": result = num1 % num2; break;
				default: System.out.println("없는 연산자입니다. 다시 입력해주세요."); continue;
			}
	
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			
			System.out.println("=====================================");
			System.out.println();

			
		}
	}
	
	
	public void practice12_3() {
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		String op = "";
		Scanner scanner = new Scanner(System.in);

		
		while (true) {
						
			System.out.println("첫번째 정수 입력");
			num1 = scanner.nextInt();
			
			System.out.println("두번째 정수 입력");
			num2 = scanner.nextInt();

			scanner.nextLine();			// 까먹지 말자
			
			System.out.println("연산자 입력 : + - * / % 중 선택하시오.");
			op = scanner.nextLine();

			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}  
					
			if (op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println();
			
		
			switch (op) {
			
				case "+": result = num1 + num2;	break;
				case "-": result = num1 - num2;	break;
				case "*": result = num1 * num2;	break;
				case "/": result = num1 / num2;	break;
				case "%": result = num1 % num2;	break;
				default: System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
				
			}
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);

			System.out.println();
			System.out.println("=========================================");
			System.out.println();
				
		}
	}
}





















