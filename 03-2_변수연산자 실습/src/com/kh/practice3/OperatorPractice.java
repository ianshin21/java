package com.kh.practice3;

import java.util.Scanner;


public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);

	
	public void practice1() {
		
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		
		int num = 0;
		
		System.out.println("정수 한 개를 입력하세요.");
		
		num = sc.nextInt();
		
		String result = (num > 0) ? "양수이다" : "양수가 아니다.";
			
		System.out.println(num + "은(는) " + result);
		
//		System.out.println(num + "은(는) " + ((num > 0) ? "양수이다" : "양수가 아니다."));
		
	}
	
	
	public void practice2() {
		
//   	키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
//		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요
		
		System.out.println("정수 한 개를 입력하세요.");
		
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수이다" : ((num == 0) ? "영이다." : "음수이다.");
		
		System.out.println(num + "은(는) " + result);

	}
	
	
	public void practice3() {

//		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		
		System.out.println("정수 한 개를 입력하세요.");
		
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수이다" : "홀수이다.";
		
		System.out.println(num + "은(는) " + result);
		
	}
	
	
	public void practice4() {
		
//		인원 수와 사탕 개수를 키보드로 입력 받고
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력
		
		int num1 = 0;		
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		System.out.println("준비된 사탕의 개수를 입력하세요.");	
		num1 = sc.nextInt();
		
		System.out.println("인원수를 입력하세요.");		
		num2 = sc.nextInt();
				
		num3 = num1 / num2;
		num4 = num1 % num2;
		
		System.out.printf("사탕을 일인당 %d개씩 나눠 주면 %d개 남겠에요.", num3, num4);

//		System.out.println("사탕을 일인당 " + (num1 / num2) + "개씩 나누면 " + (num1 % num2) + "개가 남아요.");
// 		* num3, num4 없이 할 때!!!!
	}
	
	
	public void practice5() {
		
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
//		성인(19세 초과)인지 출력하세요		
		
		
		System.out.println("나이를 입력하세요.");		
		int num = sc.nextInt();
		String result = "";

//		if (num <= 13) {
//			System.out.println("어린이군요.");
//		} else if ((num > 13) && (num <= 19)) {
//			System.out.println("청소년이예요.");
//		} else {
//			System.out.println("성인이십니다.");
//		}
		
		result = (num < 13) ? "어린이" : (num >= 13 && num < 19) ? "청소년" : "성인";
		
		System.out.println(result);
	}
	
	
	public void practice6() {
		
//		3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 
//		false를 출력하세요.		
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
//		boolean sameall = false;
		
		System.out.println("마음에 드는 수를 3개 입력하세요.");		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

//		sameall = (num1 == num2) && (num2 == num3);
		
//		System.out.println("세 수는 모두 같은 수인가요? : " + sameall);
		System.out.println("세 수는 모두 같은 수인가요? : " + ((num1 == num2) && (num2 == num3)));
		
	}
}



















