package com.kh.chapter3.field;

// 상수필드 (public static final)에 대해 알아보기
public class StaticFinalFieldTest {
	
	/*
	 * 상수필드 
	 * 
	 * public 접근제한자에 static과 final 예약어를 함께 사용하는 것을 상수필드라고 한다. 
	 * static final 순서 상관 없음
	 * 
	 * static : 공유의 개념
	 * final : 한 번 지정된 값은 변경이 안됨
	 * 
	 * static final 프로그램 실행과 동시에 값이 올라가며 이후로 바꿀 수 없다.
	 *				 왜냐하면 static 키워드가 붙은 변수는 전부 static 영역에 저장되기 때문 
	 *				 선언과 동시에 반드시 초기화 해야 한다. 
	 */
	
	public static final int MAX_LEVEL = 30;

}
