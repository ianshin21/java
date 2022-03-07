package com.kh.chapter1;

import com.kh.chapter1.thread.Thread1;
import com.kh.chapter1.thread.Thread2;

public class Application {

	public static void main(String[] args) {

		Thread1 th1 = new Thread1();
		
		th1.setName("th1");
		th1.start();				//th1.run()은 싱글스레드 처럼 순차적으로, start는 병렬적으로 작업 수행
//		th1.run();				//th1.run()은 싱글스레드 처럼 순차적으로, start는 병렬적으로 작업 수행
		
		Thread th2 = new Thread(new Thread2());
		
//		th2.setName("th2");
		th2.start();
//		th2.run();
		
		System.out.println("메인스레드 종료!!");
	}

}
