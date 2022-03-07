package com.kh.stream.terminal_operations;

import java.util.Arrays;
import java.util.List;

import com.kh.stream.vo.Student;

public class A_Match {
	/*
	 * 매칭
	 * 	- 최종처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 기능
	 * 	- allMatch()
	 * 		- 모든 요소들이 매개 값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
	 * 	- anyMatch()
	 * 		- 최소한 한 개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다. 
	 * 	- noneMatch()
	 * 		- 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사한다. 
	 * 
	 */
	
	public void method1() {
		int[] array = {2, 4, 6};
		
		boolean result = Arrays.stream(array).allMatch(i -> i % 2 == 0);
		System.out.println(result);
		
		result = Arrays.stream(array).anyMatch(i -> i % 3 == 0);		
		System.out.println(result);
		
		result = Arrays.stream(array).noneMatch(i -> i % 5 == 0);
		System.out.println(result);
		
		System.out.println();
		
	}
	
	public void method2() {
		List<Student> list = Arrays.asList(
				new Student("문인수", 28, "M", 80, 70),
				new Student("이몽룡", 23, "M", 70, 60),
				new Student("성춘향", 17, "F", 100, 100)
		);
		
		boolean result = list.stream()
				.filter(s -> s.getAge() > 20)
//				.filter(s -> { return s.getAge() > 20;})
//				.allMatch(s -> s.getGender() == "M"); (X)
				.allMatch(s -> s.getGender().equals("M"));
		
		System.out.println("20살 이상인 학생들은 모두 남자입니까? : " + result);
		
		result = list.stream()
					.filter(s -> s.getGender().equals("M"))		// 남학생
					.anyMatch(s -> ((s.getMath() + s.getEnglish()) / 2) >= 70);		//평균 70점 이상 한 명 이상 

		System.out.println("남학생들 중에 평균이 70점 이상인 학생이 한 명이라도 있나요? : " + result);
		
		System.out.println();
	}
	
	
}
