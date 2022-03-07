package com.kh.chapter2._abstract;

public class FootBall extends Sports {
	
	public FootBall() {	
	}

	public FootBall(int numberOfPlalyers) {
		super(numberOfPlalyers);
	}

	@Override
	public void rule() {
		System.out.println("FootBall의 선수 수는 " + super.getNumberOfPlayers() + "명이고 손이 아닌 발로 공을 차야한다.");
		
	}

	// 이 자식 클래서에서 rule 메소드를 반드시 구현해줘야 한다 
	// 만약 하기 싫으면 이 클래스도 추상클래스로 만들고 다시 여기서 상속 받는 자식클래스에서 구현하도록
}
