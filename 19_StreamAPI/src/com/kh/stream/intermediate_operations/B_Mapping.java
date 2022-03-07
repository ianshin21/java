package com.kh.stream.intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import com.kh.stream.vo.Student;

public class B_Mapping {
	/*
	 * 매핑
	 * 	- 중간처리 기능으로 스트림의 요소를 다른 요소롤 대체하는 작업을 말한다 
	 * 	- flatMapXXX()
	 * 		- 하나의 요소를 복수 개의 요소들로 구성된 새로운 스크림으로 생성한다. 
	 * 			(스트림에 A, B라는 요소가 존재하고 flatMap을 통해서
	 * 			 A라는 요소가 a1, a2라는 복수 개의 요소로 대체되고, B라는 요소는 b1, b2라는 복수 개의 요소로 대체되면
	 *    		 A, B 라는 요소는 a1, a2, b1, b2 요소를 가지는 새로운 스트림을 생성한다. )
	 * 	- mapXXX()
	 * 		- 요소를 대체하는 요소로 구성된 새로운 스트림을 생성한다. 
	 * 	- asDoubleStream()
	 * 		- IntStream, LongStream -> DoubleStream으로 변환해서 리턴한다. 
	 * 	- asLongStream()
	 * 		- IntStream, DoubleStream -> LongStream으로 변환해서 리턴한다. 
	 * 	- boxed()
	 * 		- int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 스트림을 생성한다. 
	 */

	
	//flatMapXXX()
	public void method1() {
		List<String> list = Arrays.asList("Java8 Lamda", "StreamAPI Filtering Mapping");
		
		list.stream().forEach(str -> System.out.println(str));
		
		System.out.println();
		
		list.stream()
				.flatMap(str -> Arrays.stream(str.split(" ")))
				.forEach(str -> System.out.println(str));
		
		System.out.println();
		
	}
	
	
	//mapXXX()
	public void method2() {
		List<Student> list = Arrays.asList(
				new Student("문인수", 20, "M", 80, 50),
				new Student("이몽룡", 21, "M", 70, 60),
				new Student("성춘향", 22, "F", 100, 100)
		);
		
//		list.stream()
//				.map(Student::getName())			//'메소드 참조' 라는 것이다. 더 공부하도록
//				.forEach(System.out::println);
		
		list.stream()
				.map(student -> student.getName())
				.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		double avg = list.stream()
				.mapToInt(student -> student.getMath())
				.average()
				.getAsDouble();
		
		System.out.println("수학점수의 평균 : " + avg);
		System.out.println();
	}
	
	
	//asDoubleStream(),  asLongStream(), boxed()
	public void method3() {
		int[] array = {1, 2, 3, 4, 5};
		
		Arrays.stream(array)
				.asDoubleStream()
				.forEach(value -> System.out.println(value));
		
		System.out.println();
		
		Arrays.stream(array)
				.boxed()
				.forEach(value -> System.out.println(value.intValue()));
	}
	
}
