package com.kh.stream;

import com.kh.stream.basic.A_Create;
import com.kh.stream.intermediate_operations.A_Filtering;
import com.kh.stream.intermediate_operations.B_Mapping;
import com.kh.stream.intermediate_operations.C_Sorted;
import com.kh.stream.intermediate_operations.D_Looping;
import com.kh.stream.terminal_operations.A_Match;
import com.kh.stream.terminal_operations.B_Aggregate;
import com.kh.stream.terminal_operations.C_Collect;

public class Application {

	/*
	 * Stream
	 * 	- 스트림은 자바 8부터 추가된 기능으로 컬렉션(배열 포함)의 저장 요소를 하나씩 참조해서 
	 * 		람다식으로 처리할 수 있도록 해주는 반복자이다. 
	 * 	- 스트림은 Iterator와 비슷한 역할을 하지만 람다식으로 요소 처리 코드를 제공할 수 있고,
	 * 		내부반복자를 사용해서 병렬처리와 중간처리, 최종처리 작업을 수행할 수 있다는 점에서 차이가 있다. 
	 *	- 스트림은 컬렉션의 요소에 대해서 중간처리와 최종처리를 할 수 있다. 
	 *		- 중간처리에서는 필터링, 매핑, 정렬, 반복 등을 수행한다. 
	 *		- 최종처리에서는
	 * 			 매칭 : 최종처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 기능
	 *			 기본 집계 : 요소들을 처리해서 카운팅, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 것을 말한다. 
	 *  		 수집 : 요소들을 필터링 또는 매핑한 후 collect() 메소드를 사용하여 필요한 요소만 새로운 컬렉션으로 담아서 리턴.
	 *		- 중간처리 메소드와 최종처리 메소드를 쉽게 구분하는 방법은 리턴타입을 보면 된다. 
	 *			- 리턴 타입이 Stream이라면 중간처리 메소드
	 *			- 리턴 타입이 기본타입이거나, OptionalXXX이라면 최종처리 메소드이다. 
	 */
	
	public static void main(String[] args) {
		
//		System.out.println("================================");
//		
//		new A_Create().method1();
//		new A_Create().method2();
//		new A_Create().method3();
//		
//		System.out.println("================================");
//		
//		new A_Filtering().method1();
//		new A_Filtering().method2();
//		
//		System.out.println("=================================");
		
//		new B_Mapping().method1();
//		new B_Mapping().method2();
//		new B_Mapping().method3();
		
//		System.out.println("==================================");
//		new C_Sorted().method1();
//		new C_Sorted().method2();
//		
//		System.out.println("===============================");
//		new D_Looping().method1();
//		
//		System.out.println("=====================================");
//		new A_Match().method1();
//		new A_Match().method2();
//		
//		System.out.println("=====================================");
//		new B_Aggregate().method1();
//		new B_Aggregate().method2();
//		new B_Aggregate().method3();
		
		System.out.println("========================================");
		new C_Collect().method1();
	}

}
