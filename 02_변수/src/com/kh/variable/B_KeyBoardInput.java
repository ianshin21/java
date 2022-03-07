package com.kh.variable;

import java.util.Scanner;

public class B_KeyBoardInput {
	
	public void inputScanner() {
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		float height = 0;
		char gender = 'M';		// ''로 초기화 하면 안된다. 
								//빈문자라는 표시 (하려면) : '\u0000'
		
		System.out.println("당신의 이름은 무엇입니까?");
		
		// sc.nextLine() : 키보드로 부터 입력을 기다림, 입력값을 가져옴, 공백포함
		// sc.next() : 띄어쓰기 안됨, 공백 이전까지만 읽어옴.
		// sc.nextInt() : 정수를 입력받을 때
		// sc.nextDouble(): 실수 입력 
		
		name = sc.nextLine();
		
		System.out.println("당신의 키는 얼마입니까?(소수점 첫째까지 입력)");

		height = sc.nextFloat();
		
		System.out.println("당신의 나이는 얼마?");
		
		age = sc.nextInt();    // 이때 문자 입력하면 에러남 
//		sc.nextLine();		// 여기 넣어도 됨	

		System.out.println("당신의 성별은 무엇? (M/F) ");
		sc.nextLine();			
		// ** .nextInt에서 숫자값이 넘어가고 엔터가 남아있음. 버퍼에 남아있는 엔터를 제거하기 위함			
		
		
	    // 일단 nextLine으로 문자열이 들어간다. Scanner에서는 문자만 따로 입력하는 방법이 없다. 
		// nextChar()가 없다. nextLine()에서 문자열 입력 받아서 charAt()로 순서에 준해서 문자 가져옴
		// 문자열에서 문자만 가져옴, 0번째 것. 안녕하세요 했다면 '안'만 가져옴
		// '안녕하세요' 치면 line으로 들어감, charAt(3)하면 '세'만 출력
				
		String line = sc.nextLine();  	
		gender = line.charAt(0);
		
//		gender = sc.nextLine().charAt(0);  // 이렇게 하며 간편
		char c = "안녕하세요".charAt(3); 
		
//		System.out.println(name + "님 키는" + height + "cm 나이는" + age + "세 성별은 " + gender + "입니다.");
		System.out.printf("%s님 키는 %.1fcm이고 나이는 %d세이고 성별은 %c 입니다. + %c \n", name, height, age, gender, c);
		
	}

}
