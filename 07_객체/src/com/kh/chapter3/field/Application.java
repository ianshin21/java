package com.kh.chapter3.field;

import com.kh.chapter3.field.FieldTest;
import com.kh.chapter3.field.FieldTest2;

public class Application {

	public static void main(String[] args) {
		
		
		//======================접근제한자 테스트======================
		
		FieldTest2 test2 = new FieldTest2();
		
		//public 인스턴스변수에 직접 접근
		System.out.println(test2.pub);
		
		//protected 
		System.out.println(test2.pro);  // 같은 패키지이여서 가능 
		
		//default 
		System.out.println(test2.def);  // 같은 패키지이기 때문에 실행  
		
		//private
//		System.out.println(test2.pri);  // 같은 클래스 내에서만 접근 가능
		
	}

}
