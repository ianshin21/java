package com.kh.chapter1.thread;

//스레드 생성방법 
//메인 스레드 외에 작업스레드 
//	2. Runnable 인터페이스를 구현하는 방법
//		- Runnable 인터페이스의 run() 메소드 오버라이딩
//		- Thread 객체 생성 시 생성자에 Runnable 인터페이스를 구현한 객체를 매개값으로 전달 후 start() 메소드를 호출
public class Thread2 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "[" + i + "]");
		}
	}

}
