package com.kh.operator;

public class C_Arithmetic {
	
	// 산술 연산자 : + - * / % 
	
	public void method1() {
		int num1 = 10; 
		int num2 = 3; 
		
		double dNum1 = 350; // 자동으로 350.0
		double dNum2 = 100; // 100.0
		
		System.out.println("======= 정수형의 사칙연산 =============");
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + ((float)num1 / num2));  //실수 출력 원하면 캐스팅, 정수형은 (num1 / num2)
		System.out.println("num1 % num2 = " + (num1 % num2));

		System.out.println("======= 실수형의 사칙연산 =============");

		System.out.println("dNum1 + dNum2 = " + (dNum1 + dNum2));
		System.out.println("dNum1 - dNum2 = " + (dNum1 - dNum2));
		System.out.println("dNum1 * dNum2 = " + (dNum1 * dNum2));
		System.out.println("dNum1 / dNum2 = " + (dNum1 / dNum2));
		System.out.println("dNum1 % dNum2 = " + (dNum1 % dNum2));
		System.out.println("dNum1 + dNum2 = " + dNum1 + dNum2);			// 아래식과 같은 결과
		System.out.println("dNum1 + dNum2 = " + dNum1 + "  " + dNum2);
		System.out.println(dNum1 + dNum2);

		System.out.println("======= 실수형의 사칙연산 =============");
		System.out.println(dNum1 * dNum2 % 27);
		System.out.println((int)'a');
		System.out.println((int)'b');
		System.out.println('a' / 'b');
		System.out.println('b' / 'a');
		System.out.println(dNum1 + dNum1 * dNum2 % 27 - 'a' / 'b');

	}

}
