package com.kh.stream.intermediate_operations;

import java.util.Arrays;

public class D_Looping {

	/*
	 * 루핑
	 * 	- 요소 전체를 반복하는 것을 말한다. 
	 * 	- peek() 
	 * 		- 중간처리 메소드 : 중간처리 단계에서 전체 요소를 루핑하면서 추가적인 작업을 하기 위해 사용한다. 
	 * 		- 최종처리 메소드가 실행되지 않으면 실행되지 않기 때문에 반드시 최종처리 메소드가 호출되어야 동작한다. 
	 * 	- forEach) 
	 * 		- 최종처리 단계에서 전체 요소를 루핑하면서 추가적인 작업을 하기 위해 사용한다. 
	 * 		- 최종처리 메소드이기 때문에 이후에 sum()과 같은 다른 최종처리 메소드를 호출 할 수 없다. 
	 * 
	 */
	
	public void method1() {
		int[] array = {1, 2, 3, 4, 5};
		
		// 최종처리 메소드가 실행되지 않으면 실행되지 않기 때문에 반드시 최종처리 메소드가 호출되어야 동작한다. 
//		Arrays.stream(array)
//				.filter(i -> i % 2 == 0)
//				.peek(i -> System.out.println(i));
		
		int sum = Arrays.stream(array)
						.filter(i -> i % 2 == 0)
						.peek(i -> System.out.println(i))
						.sum();
		
		System.out.println("sum : " + sum);
		
		Arrays.stream(array)
					.filter(i -> i % 2 != 0)
					.forEach(i -> System.out.println(i));
//					.sum();   (X)
	}
}
