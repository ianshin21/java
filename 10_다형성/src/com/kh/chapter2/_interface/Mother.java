package com.kh.chapter2._interface;

public class Mother extends Person {
	
	public Mother() {
	}

	public Mother(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public void eat() {
		// 식사를 드실 때는 몸무게 10 증가 하시며 건강은 5 감소 하심
		super.setWeight(super.getWeight() + 10);;
		super.setHealth(super.getHealth() - 5);
	}

	@Override
	public void sleep() {
		// 주무실 때는 건강도 10 증가 함
		super.setHealth(super.getHealth() + 10);

	}


	@Override
	public String toString() {
		return "Mother [" + super.toString() + "]";
	}

	
}
