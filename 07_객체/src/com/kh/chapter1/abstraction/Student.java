package com.kh.chapter1.abstraction;


/*
 * 클래스의 구조
 * 
 *  [접근 제한자] class 클래스명 {				* [] : 반드시 필요한 것은 아니라는 표시.
 *		// 필드부 (객체의 속성을 정의)
 *
 *  	// 생성자부 (
 *  
 *  	// 메소드부 (객체의 기능을 정의)
 *  }
 *  
 */

// 학생을 추상화 해서 클래스를 만들어보자. 
public class Student {
	// 필드부 
	// [접근 제한자] [예약어 :static, final 등] 자료형 필드명; 
	
	// *접근 제한자 : 클래스, 필드, 메소드 등을 선언한 곳에 접근할 수 있는 범위를 제한
	// 		(public > protected > default: 없으면 디폴트, 동일한 패키지 내에서만 접근  > private:클래스 내부에서만 접근 가능)

	public int sNum;
	public String name;
	public int age; 
	public double height;
	public String gender;
	public int mathscore;
	
	
}
