package com.kh.chapter3;

import java.util.Scanner;

import com.kh.chapter3.field.FieldTest;
import com.kh.chapter3.field.FieldTest2;
import com.kh.chapter3.field.STaticFieldTest;
import com.kh.chapter3.field.StaticFinalFieldTest;

public class Application {

	public static void main(String[] args) {
		
		// ===================== 1. 변수 구분 테스트==========================
		// FieldTest 클래스를 가지고 new 연산자를 통해서 실제 메모리 공간에 생성 (인스턴스 생성)
		FieldTest fieldTest = new FieldTest(); 
		
		// 우리가 생성한 test메소드를 호출한다. 
		// 매개값으로 정수형 하나를 받기 때문에 호출할 때 반드시 값을 입력해야 한다. 없으면 에러
		fieldTest.test(10); // 여기서 10을 입력하면 원 메소드 매개변수 (int num)에 입력된다. 

//		Scanner scanner = new Scanner(System.in);
//		fieldTest.test(scanner.nextInt()); //이런 것도 가능

		
		//====================== 2. 접근제한자 테스트======================
		
		FieldTest2 test2 = new FieldTest2();
		
		//public 인스턴스변수에 직접 접근
		System.out.println(test2.pub);
		
		//protected 
//		System.out.println(test2.pro);  // 다른 패키지이면서 상속 구조도 아니여서 접근 불가, 에러 표시 남
		
		//default 
//		System.out.println(test2.def);  // 다른 패키지이기 때문에 실행 안됨 
		
		//private
//		System.out.println(test2.pri);  // 같은 클래스 내에서만 접근 가능
		
		
		// ====================== 3. 클래스 변수 테스트 ==============================
		
		// public static pubSta 변수 출력
		// new문으로 객체 생성 없이 바로 클래스명으로 접근 가능 
		System.out.println(STaticFieldTest.pubSta);
		System.out.println(STaticFieldTest.getPriSta());
		
		
		// ======================= 4. 상수 필드 테스트 ===========================
		// static 키워드로 생성된 변수이므로 객체생성 필요 없음 
		// final 키워드이므로 차후 값의 변경 불가
		System.out.println(StaticFinalFieldTest.MAX_LEVEL);
	}

}








