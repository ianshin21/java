package com.kh.chapter3;

import com.kh.chapter3.sync.Buffer;
import com.kh.chapter3.sync.Consumer;
import com.kh.chapter3.sync.Producer;

public class Application {

	public static void main(String[] args) {

		Buffer buffer = new Buffer();
		Thread producer = new Producer(buffer);
		Thread consumer = new Thread(new Consumer(buffer));
		
		consumer.start();
		producer.start();
		
		try {
			//스레드의 join() 메소드를 호출한 (메인)스레드는 해당 아래의 스레드가 종료될 때까지 기다렸다가 
			// 아래 스레드가 종료되면 다시 스레드를 실행한다. 
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인스레드 종료~!");
		
		
	}

}
