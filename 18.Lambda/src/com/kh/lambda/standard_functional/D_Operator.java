package com.kh.lambda.standard_functional;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

import com.kh.lambda.standard_functional.vo.Student;

public class D_Operator {

	/*
	 * Operator
	 * 	- Operator 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
	 * 	- Function 함수적 인터페이스와는 다르게 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다. 
	 */
	
	public void method1() {
		Student student1 = new Student("문인수", 20, "M", 80, 70);
		Student student2 = new Student("성춘향", 20, "F", 100, 100);
		
//		IntBinaryOperator intBinaryOperator = (a, b) -> {return a + b; };
		IntBinaryOperator intBinaryOperator = (a, b) ->  a + b; 
		
		System.out.println(intBinaryOperator.applyAsInt(10, 20));
		
//		IntUnaryOperator intUnaryOperator = (a) -> {return a * a; };
		IntUnaryOperator intUnaryOperator = a -> a * a;
		
		System.out.println(intUnaryOperator.applyAsInt(10));
		
		BinaryOperator<Student> binaryOperator = (s1, s2) -> {
			if(s1.getMath() > s2.getMath()) {
				return s1;
			}else {
				return s2;
			}
		};
		
		System.out.println(binaryOperator.apply(student1, student2));
		
		//참고 인터페이스의 static 메소드 활용 (maxBy())
		binaryOperator = BinaryOperator.maxBy((s1, s2) -> Integer.compare(s1.getMath(), s2.getMath()));
		System.out.println(binaryOperator.apply(student1, student2));
		
		System.out.println();
	}
}
