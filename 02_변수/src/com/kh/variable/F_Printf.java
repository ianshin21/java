package com.kh.variable;

public class F_Printf {
	
	// 출력하고자 하는 값들이 제시된 포멧에 맞춰서 출력을 진행한다. -> 줄바꿈이 안된다.
	
	public void printMethod() {
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 서식지정자 %d : 정수, %c:문자, %s:문자열, %f:실수, %b:논리형, %o:8진수, %x;16진수
		
		System.out.printf("%d\n", iNum1);
		System.out.printf("%d\n", iNum1, iNum2);
//		System.out.printf("%d %d \n", iNum1); 에러발생, 서식지정자에 해당하는 모든 값이 있어야 함
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, (iNum1 + iNum2));
		System.out.printf("%5d\n", iNum1);
		System.out.printf("%-5d\n", iNum1);
		
		System.out.println("===========================");
		
		float fNum = 3.14159272f; // %f는 소숫점 6자리까지 출력 가능, 값 없으면 0으로 채움
		double dNum = 4.53; 
		
		System.out.printf("%f\t%f\n", fNum, dNum);
		System.out.printf("%.3f\t%.3f\n", fNum, dNum);	// 소숫점 3자리까지만 출력
		
		char ch = 'a';
		String str = " \"\'Hello\'\"";
		
		System.out.printf("%s %s\n", ch, str); // %s로 char도 출력 가능
		System.out.printf("%C %S\n", ch, str); // 대문자로 출력
		
		
		System.out.println("===========================");
		
		
	}

}
