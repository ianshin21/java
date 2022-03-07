package com.kh.chapter3;

public class B_Continue {
	
	/*
	 * break 문 : 가장 가까운 반복문을 빠져나가는 구문
	 * continue : 반복문 안에서만 사용 가능하며 continue를 만나게 되면 
	 *   그 다음 구문들은 실행되지 않고 생략, 가장 가까운 조건식/증감식으로 이동. 
	 */
	
	public void method1() {
		
		// 1부터 100까지 정수들의 합 출력
		// 단 5의 배수는 빼고 
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 5 == 0) {
				continue;
			}
			
			sum += i;
					
		}
		
		System.out.println("합계 :" + sum);
	}
	
	
	public void method2() {
		
		// 2~ 9 단 중 짝수단 빼고 
		
		
		for (int dan = 2; dan <= 9; dan++) {
			
			if(dan % 2 == 0) {
				continue;
				
			}
			
			for (int su = 1; su <=9; su++) {
				
				if (su % 3 == 0) {
					continue;
				}
				
				System.out.println(dan + "x" + su + "=" + (dan * su));
			}
			System.out.println();
		}
		
	}

}
















