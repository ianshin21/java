package com.kh.chapter2._abstract;

public abstract class Sports {
	
	private int numberOfPlayers;
	
	public Sports() {
		
	}
	
	public Sports(int numberOfPlayers){
		this.numberOfPlayers = numberOfPlayers;		
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	// 추상메소드 
	// 	- {} 몸통부가 구현되지 않은 상태
	// 	- 미완성된 추상메소드가 하나라도 있다는 것은 이 클래스 또한 미완성 상태이다. : 추상클래스
	// 	- 즉, 해당 클래스로 객체 생성할 수 없다.
	// 	- 자식 클래스에서 무조건 재정의 해줘야 한다. or error 발생 
	public abstract void rule(); 			
	
	

}
