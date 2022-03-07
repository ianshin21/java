package com.kh.exception;

public class A_TryCatch {

	public void methodA() {
		try {
			System.out.println("methodB() 호출 전 ");
		
			methodB();
			
			System.out.println("methodB() 호출 후 ");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행");
		}
	}
	
	public void methodB() throws Exception {
		System.out.println("methodB() 호출 중에 예상치 못한 예외가 발생..");
		
		throw new Exception("강제로 예외를 발생시켰습니다");
	}
}

