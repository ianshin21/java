package com.kh.chapter1.thread;

//스레드 생성방법 
// 메인 스레드 외에 작업스레드 만들어서 병렬 코드 실행
// 1. Thread 클래스를 상속 받는 방법
// 		- Thread 클래스 상속 후 run() 메소드 오버라이딩
// 		- Thread1 객체를 생성 후 start() 메소드를 호출
public class Thread1 extends Thread{

	
	@Override
	public void run() {
		// 작업하고자 하는 코드 작성 
		
		for (int i = 0; i <= 100; i++) {
			
			System.out.println(getName() + "[" + i + "]");
		}
	}
	
}
