package com.kh.chapter2.scheduling;

public class Tank implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " : " +Thread.currentThread().getPriority());

		for(int i = 0; i < 1000; i++) {
			
			try {
				System.out.println("Tank shooting ...");

				Thread.sleep(1000);			//스레드를 매개변수에 지정된 시간만큼 지연시키는 메소드
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}    
		}
	}

}
