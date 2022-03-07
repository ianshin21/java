package com.kh.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.kh.stream.vo.Student;

public class A_Create {
	/*
	 * 스트림의 종류
	 * 	- java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 
	 * 		자식 인터페이스들이 상속 관계를 이루고 있다. : Stream, IntStream, DoubleStream, LongStream
	 * 	- 스트림 생성 
	 * 		- 컬렉션으로 부터 스트림을 얻기
	 * 			- 컬렉션의 stream() 메소드로 부터 얻어올 수 있다. (java.util.Collecton.stream()) 
	 * 		- 배열로부터 스트림 얻기
	 * 			- Array.stream(배열) 메소드를 통해서 얻어오거나 각 스트림의(Stream, IntStream, ...) of() 메소드를 통해서 얻어올 수 있다. 
	 * 		- 숫자 범위로부터 스트림 얻기
	 * 			- IntStream의 range(), rangeClosed() 메소드를 이용해서 
	 * 				첫번째 매개값부터 두번째 매개값까지 혹은 이전까지 제공하는 스트림을 얻어올 수있다. 
	 */
	
	// 컬렉션으로 부터 스트림을 얻기
	public void method1() {
		List<Student> list = Arrays.asList(
				new Student("문인수", 20, "M", 80, 50),
				new Student("이몽룡", 20, "M", 70, 60),
				new Student("성춘향", 20, "F", 100, 100)
		);
		
		// for문 사용
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println();
		
		// Stream 사용
//		Stream<Student> listStream = list.stream();
////		listStream.forEach(s -> System.out.println(s));
//		listStream.forEach(System.out::println);				//'메소드 참조' 라는 것이다. 더 공부하도록
		
		list.stream().forEach(s -> System.out.println(s));
		
		System.out.println();
		
	}
	
	// 배열로부터 스트림 얻기
	public void method2() {
		String[] names = {"문인수", "이몽룡", "성춘향"};
		
		Stream<String> stream = Arrays.stream(names);		
		stream.forEach(str -> System.out.println(str));
		
		Arrays.stream(names).forEach(str -> System.out.println(str));
//		names.stream().forEach(str -> System.out.println(str));    //Cannot invoke stream() on the array type String[]
		
		Arrays.stream(names).forEach(System.out::println);			//'메소드 참조' 
		
		System.out.println();
	}
	
	//숫자 범위로부터 스트림 얻기
	public void method3() {
		IntStream stream = IntStream.range(1, 10);  // 첫번째 매개값부터 두번째 매개값 이전까지의 값을 요소로 갖는 스트림을 생성한다. 		
		stream.peek(i -> System.out.print(i + " "));  // ???? 출력이 없음 왜????
		
		/*
		 * - peek() 
		 * - 중간처리 메소드 : 중간처리 단계에서 전체 요소를 루핑하면서 추가적인 작업을 하기 위해 사용한다. 
		 * - 최종처리 메소드가 실행되지 않으면 실행되지 않기 때문에 반드시 최종처리 메소드가 호출되어야 동작한다.
		 */
		 
		System.out.println("-------------------");
		
		IntStream stream1 = IntStream.range(1, 10);  // 첫번째 매개값부터 두번째 매개값 이전까지의 값을 요소로 갖는 스트림을 생성한다. 
		int sum = stream1.peek(i -> System.out.print(i + ", ")).sum();
		System.out.println("\nsum : " + sum);
		
		
		stream = IntStream.rangeClosed(1, 10); // 첫번째 매개값부터 두번째 매개값까지의 값을 요소로 갖는 스트림을 생성한다. 

		sum = stream.peek(i -> System.out.print(i + " ")).sum();
		System.out.println("\nsum : " + sum);
		
		System.out.println();
	}

}













