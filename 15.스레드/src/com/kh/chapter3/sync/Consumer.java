package com.kh.chapter3.sync;

public class Consumer implements Runnable {

	private Buffer buffer;

	public Consumer() {
	}

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {

			try {
				buffer.getData();

				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
