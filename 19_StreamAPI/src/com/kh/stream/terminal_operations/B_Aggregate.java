package com.kh.stream.terminal_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class B_Aggregate {

	/*
	 * 기본 집계
	 * 	- 최종처리 기능으로 요소들을 처리해서 카운팅, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 것을 말한다. 
	 * 	- count() : 요소들의 개수 리턴
	 * 	- findFirst() : 첫번째 요소 리턴
	 * 	- max() : 최대 요소 리턴
	 * 	- min() : 최소 요소 리턴
	 * 	- average() : 요소들의 평균 리턴 
	 * 	- sum() : 요소들의 총합 리턴
	 * 
	 * 커스텀 집계
	 * 	- 스트림에서 기본 집계 메소드를 제공하지만 다양한 집계 결과물을 만들 수 있도록 reduce() 메소드를 제공한다. 
	 * 		(매개 타입으로 XXXOperator, 리턴 타입으로 OptionalXXX)
	 * 
	 */
	
	public void method1() {
		int[] array = {1, 2, 3, 4, 5, 6};
		
		long count = Arrays.stream(array)
								.filter(i -> i % 2 == 0)
								.count();
		
		System.out.println("2의 배수의 개수 : " + count);

		
		int sum = Arrays.stream(array).filter(i -> i % 2 ==0).sum();		
		System.out.println("2의 배수의 합 : " + sum);

		OptionalDouble average = Arrays.stream(array).filter(i -> i % 2 ==0).average();
		System.out.println("2의 배수의 평균 : " + average.getAsDouble());

		OptionalInt max = Arrays.stream(array).filter(i -> i % 2 ==0).max();
		System.out.println("2의 배수 중 최댓값 : " + max.getAsInt());
		
		OptionalInt min = Arrays.stream(array).filter(i -> i % 2 == 0).min();
		System.out.println("2의 배수 중 최솟값 : " + min.getAsInt());

		OptionalInt findFirst = Arrays.stream(array).filter(i -> i % 2 == 0).findFirst();
		System.out.println("2의 배수 중 첫번째 요소 : " + findFirst.getAsInt());
		
		System.out.println();
	}
	
	
	public void method2() {
		/*
		 * Optional 클래스
		 * 	- 스트림의 최종 결과 값을 저장하는 객체이다. 
		 *  - 단순히 값만 저장하는 것이 아니라, 값의 존재 여부를 확인하고 값이 존재하지 않을 경우 디폴트 값을 설정할 수 있는 객체이다.  
		 *  - get() ; 저장되어있는 값을 얻기 위해 사용한다. 
		 *  - isPresent() : 값이 저장되어 있는지 여부를 검사한다.
		 *  - orElse() : get()과 동일하게 저장되어있는 값을 얻어오는 메소드로 값이 저장되어있지 않을 경우 디폴트 값을 지정한다. 
		 *  - ifPresent(Consumer) : 값이 저장되어 있을 경우 Consumer에서 값을 처리한다. 
		 *  		없으면 그냥 에러도 없이 ... 아래 list.add...에서 처럼 값이 있으면 출력 
		 */
		
		List<Integer> list = new ArrayList<>();
		
//		list.add(1);
//		list.add(2);
//		list.add(3);
		// 만약 여기서 값이 입력된다면 그 값들은 Integer의 객체 값이다 그러므로 mapToInt(i -> i.intValue())로 unboxing 해야한다. 
		
		/*
		double avg = list.stream()
				.mapToInt(i -> i.intValue())
				.average()
				.getAsDouble();
		*/
		
		// 빈값 처리 방법 1	: 값의 존재여부 확인 
		OptionalDouble optional = list.stream().mapToInt(i -> i.intValue()).average();
		
		if(optional.isPresent()) {
			System.out.println("평균 : " + optional.getAsDouble());
		}else {
			System.out.println("데이터가 없음");
		}
		
		// 빈값 처리 방법 2 : 값이 존재하지 않을 경우 디폴트 값을 설정
//		optional = list.stream().mapToInt(i -> i.intValue()).average();		
//		double avg = optional.orElse(0.0);
		double avg = list.stream()
							.mapToInt(i -> i.intValue())
							.average()
							.orElse(0.0);		
		
		System.out.println("평균은 : " + avg);
		
		// 빈값 처리 방법 3 : 집계 값을 처리하는 Consumer 등록
		list.stream()
				.mapToInt(i -> i.intValue())
				.average()
				.ifPresent(d -> System.out.println("평균 : " + d));
	}
	
	
	public void method3() {
//		int[] array = {};    // 값이 없으면 아무 것도 안 찍힘
		int[] array = {1, 2, 3, 4, 5, 6};
		
//		OptionalInt result = Arrays.stream(array).reduce((i1, i2) -> { return i1 * i2; });
		Arrays.stream(array)
					.reduce((i1, i2) -> i1 * i2)
					.ifPresent(i -> System.out.println("요소들의 곱은 얼마입니까? : " + i));
		
		int result = Arrays.stream(array)
					.reduce(10, (i1, i2) -> i1 * i2);
		
		System.out.println(result);
					
	}
}




















