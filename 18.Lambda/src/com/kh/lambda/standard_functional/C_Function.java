package com.kh.lambda.standard_functional;

import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import com.kh.lambda.standard_functional.vo.Student;

public class C_Function {

	/*
	 * Function
	 * 	- Function 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다. 
	 * 	- 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역할을 한다. 
	 */
	
	public void method1() {
		Student student = new Student ("문인수", 20, "M", 80, 70);
		
//		java.util.function.Function<Student, String> function = (student) -> {
//			return student.getName();
//		};
		
		Function<Student, String> function = s -> s.getName();
		System.out.println("이름이 뭐니? : " + function.apply(student));
		
		ToIntFunction<Student> function1 = s -> s.getMath();
		System.out.println("수학 뭐니? : " + function1.applyAsInt(student));
		
		System.out.print("[수학점수] : ");
//		printInt(s -> { return s.getMath();}, student);
		printInt(s -> s.getMath(), student);
		
		System.out.print("[영어점수] : ");
		printInt(s -> s.getEnglish(), student);
		
		System.out.println();
		
	}
	
	public void printInt(ToIntFunction<Student> function, Student student) {
		
		System.out.println(function.applyAsInt(student));
	}
}
