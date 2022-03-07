package com.kh.stream.intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A_Filtering {
	/*
	 * 필터링
	 * 	- 필터링은 중간처리 기능으로 요소를 걸러내는 역할을 한다. 
	 * 	- distinct() : 중복을 제거하는 메소드, Stream의 경우는 Object.equals()가 true를 리턴하면 동일한 객체로 판단.
	 * 	- filter(Predicate) : 매개값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다. 
	 * 	- int sum = Arrays.stream(array)
						.filter(i -> i % 2 == 0)
						.peek(i -> System.out.println(i))
						.sum();
	 */
	
	// 중복제거
	public void method1() {
		List<String> names= Arrays.asList("문인수", "이몽룡", "성춘향", "문인수", "성춘향");
		
		Stream<String> stream = names.stream();
		
		stream.forEach(str -> System.out.println(str));
		
//		이미 최종처리 메소드까지 호출된 스트림은 다시 사용할 수 없다. (컬렉션(배열)로부터 다시 스트림을 얻어와야 한다. )
//		stream.distinct().forEach(str -> System.out.println(str));  // 이거 안됨.
		
		System.out.println();
		
		names.stream().distinct().forEach(str -> System.out.println(str)); // 18행처럼 변수에 담지 않아도 된다. names.stream(); 얘가 중요
		
		System.out.println();
		
	}

	// 필터링
	public void method2() {
		List<String> names= Arrays.asList("문인수", "이몽룡", "성춘향", "문인수", "성춘향", "이순신", "이몽룡");
		
		names.stream().filter(name -> name.startsWith("이")).forEach(name -> System.out.println(name));
		
		System.out.println();
		
		names.stream()
					.distinct()										// 중간처리 : 중간처리는 순서 상관없고
					.filter(name -> name.startsWith("이"))			// 중간처리 : 얼마든지 사용 가능(스트림 파이프라인) 
					.forEach(name -> System.out.println(name));		// 최종처리
		
		System.out.println();
		
	}
}
