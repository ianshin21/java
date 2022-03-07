package com.kh.exception;

import java.io.IOException;

public class B_Throws {
	
	public void methodA() throws IOException, Exception {
		System.out.println("methodA() 호출");
		
		methodB();
		
		System.out.println("methodA() 종료");
	}
	
	public void methodB() throws IOException, Exception {
		System.out.println("methodB() 호출");
		
		methodC();
		
		System.out.println("methodB() 종료");
	}
	
	public void methodC() throws IOException, Exception {
		System.out.println("methodC() 시작");
		
		int random = (int) (Math.random() * 3 + 1);
		
		if(random == 1) {
			throw new Exception();
		}else if (random == 2){
			throw new IOException();
		}
		
		System.out.println("methodC() 종료");
	}

}
