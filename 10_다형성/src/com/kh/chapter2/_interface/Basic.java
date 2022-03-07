package com.kh.chapter2._interface;

public interface Basic {
	//추상클래스 -> 일반 멤버(변수, 메소드) + 추상메소드
	// 인터페이스 -> 상수 필드, 추상 메소드
	
	// 인터페이스 필드는 무조건 상수 필드이다. public static final 생략 가능
	
	/* public static final */ int NUM = 10;
	
	// 인터페이스에서 메소드는 항상 추상메소드이다. public abstract 생략해도 됨
	/*public abstract */  void eat();
	/*public abstract */  void sleep();
	// 기능을 인터페이스에 속성은 추상클래스에서

}
