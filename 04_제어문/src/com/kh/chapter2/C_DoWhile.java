package com.kh.chapter2;

public class C_DoWhile {
	
	/*
	 * do-while
	 * 
	 *  [초기식]
	 *  
	 *  do {
	 *  	반복적으로 실행할 코드;
	 *  	[증감식, 분기문]
	 *  } while(조건식);
	 *  
	 *  첫 실행은 조건식에 관계 없이 무조건 수행 
	 */
	
	
	public void method1() {
		
		// 조건이 맞지 않아도 한 번 출력 되는지 확인
		
		int num = 1;
		
		while(num == 0) {
			System.out.println("while문 수행");
		}
		
		do {
			System.out.println("do-while문 수행");
		} while(num == 0);
	}
	
	
	public void method2() {
		
		//1부터 10까지 중의 랜덤값까지 합계
		int sum = 0;
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("랜덤값 : " + random);
		
		int i = 1;
		
		do {
			sum += i;
			
			i++;
			
		} while(i <= random);
		
		System.out.println("1부터" + random + "까지의 합 :" + sum );
				
	}

}






















