package com.kh.practice2;

import java.util.Scanner;


public class CastingPractice {
	
	Scanner sc = new Scanner(System.in);

	public void method1() {
		
		// 키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 유니코드 값을 출력하세요.

		char ch = '\u0000';
				
		System.out.println("문자 하나를 입력하세용.");
		
		ch = sc.nextLine().charAt(0);
		
		System.out.println("입력하신 문자는 " + ch + "이고");
		System.out.println("입력하신 문자의 유니코드 값은 " + (int)ch + "입니다.");

	}
	
	
	public void method2() {
		
		// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		// 이 때 총점과 평균은 정수형으로 처리하세요.
		
		double kor = 0;
		double eng = 0;
		double math =0;
		int total = 0; 
		int average = 0;          
	
		System.out.println("국어, 영어, 수학 세 과목의 점수를 각각 입력하세요.");
		
		kor = sc.nextDouble();
		eng = sc.nextDouble();
		math = sc.nextDouble();
		
		total = (int) (kor + eng + math);
		average = (int) (total / 3);
		
		System.out.println("세 과목을 더한 총점은 " + total + "이며");
		System.out.println("세 과목의 평균은 " + average + "입니다.");
		
//		System.out.printf("세 과목을 더한 총점은 %d이며, ", (int)(kor + eng + math));
//		System.out.printf("세 과목의 평균은 %d입니다.", (int)((kor + eng + math) / 3));
//		* 이런 식으로 할 경우 변수 total, average는 필요 없음.
	}
	
	
	public void method3() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		
		System.out.println( iNum1 % iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println((double)iNum1 / iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( (int)(iNum1 / fNum)); // 3
		System.out.println( iNum1 / fNum );// 3.3333333
		System.out.println( (double)iNum1 / fNum); // 3.333333333333335
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'

	}

}
















