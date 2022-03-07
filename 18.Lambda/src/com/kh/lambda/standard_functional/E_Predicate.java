package com.kh.lambda.standard_functional;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.kh.lambda.standard_functional.vo.Student;

public class E_Predicate {
	
	/*
	 * Predicate 
	 * 	- Predicate 함수적 인터페이스는 매개변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고 있다. 
	 * 	- 이 메소드들은 매개값을 조사해서 true/false를 리턴하는 역할을 한다. 
	 */

	public void method1() {
		Student student1 = new Student("이몽룡", 20, "M", 30, 40);
		Student student2 = new Student("성춘향", 20, "F", 100, 100);
		
		Predicate<Student> predicate = (student) -> {
			return student.getGender().equals("M");
		};
		
		System.out.println("이몽룡은 남자입니까? : " + predicate.test(student1));
		System.out.println("성춘향은 남자입니까? : " + predicate.test(student2));
		System.out.println("이몽룡의 평균점수는? : " + 
//					avg((s) -> s.getName().equals("이몽룡"), student1));
					avg((s) -> s.getMath() > 50 && s.getEnglish() > 50, student1));
		
		
//		IntPredicate intPredicate = (i) -> { return i > 100; };
		IntPredicate intPredicate = i -> i > 100;
		
		System.out.println(intPredicate.test(100));
		System.out.println(intPredicate.test(101));
		
	}
	
	public double avg(Predicate<Student> predicate, Student student) {
		double avg = 0;
		
		if(predicate.test(student)) {
			avg = (student.getMath() + student.getEnglish()) / 2;
		}
		
		return avg;
	}
}
