package com.kh.chapter2;

import com.kh.chapter2.scheduling.Car;
import com.kh.chapter2.scheduling.Plane;
import com.kh.chapter2.scheduling.Tank;

public class Application {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Car());
		Thread t2 = new Thread(new Plane());
		Thread t3 = new Thread(new Tank());
		
		//스레드는 기본적으로 1~10의 우선순위 중 5의 우선순위를 가지고 있다. 
		System.out.println(Thread.currentThread().getName() + " : " +Thread.currentThread().getPriority());
		System.out.println(t1.getName() + " : " + t1.getPriority());
		System.out.println(t2.getName() + " : " + t2.getPriority());
		System.out.println(t3.getName() + " : " + t3.getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(Thread.currentThread().getName() + " : " +Thread.currentThread().getPriority());
		System.out.println(t1.getName() + " : " + t1.getPriority());
		System.out.println(t2.getName() + " : " + t2.getPriority());
		System.out.println(t3.getName() + " : " + t3.getPriority());


		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("메인 스레드 종료!");
		
	}

}
