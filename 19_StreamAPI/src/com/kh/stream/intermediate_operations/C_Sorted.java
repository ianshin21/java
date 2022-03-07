package com.kh.stream.intermediate_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import com.kh.stream.vo.Member;

public class C_Sorted {
	/*
	 * 정열
	 * 	- 스트림은 요소가 최종처리 되기 전에 중간 단계에서 요소를 정렬해서 최종처리 순서를 변경할 수 있다. 
	 * 	- Stream<T>은 요소 객체가 Comparable을 구현하지 않을 경우 예외가 발생한다. 
	 * 	- IntStream, DoubleStream, LongStream은 요소를 오름차순으로 정렬한다. 
	 */

	
	//요소가 객체일 때
	public void method1() {
		List<Member> list = Arrays.asList(
				new Member("문인수", 20, "M"),
				new Member("이몽룡", 23, "M"),
				new Member("성춘향", 18, "F")
		);
		
		// Comparable 구현 내용에(오름차순) 따라 정렬
		list.stream()
//				.sorted()
//				.sorted((m1, m2) -> m1.compareTo(m2))
				.sorted(Comparator.naturalOrder())
				.forEach(member -> System.out.println(member));
		
		System.out.println();

		// Comparable 구현 내용과 반대로(내림차순) 정렬
		list.stream()
//				.sorted((m1, m2) -> m2.compareTo(m1)
				.sorted(Comparator.reverseOrder())
				.forEach(member -> System.out.println(member));
		
		System.out.println();
				
	}
	
	
	// 요소가 기본 자료형일 때
	public void method2() {
		IntStream stream = Arrays.stream(new int[] {5, 2, 4, 3, 1});
		
		stream.sorted().forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		
		// 내림차순으로 정렬하는 방법
		Arrays.stream(new int[] {5, 2, 4, 3,1})
					.boxed()
					.sorted(Comparator.reverseOrder())
//					.mapToInt(integer -> integer.intValue())
					.forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		
	}
}
