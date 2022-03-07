package com.kh.chapter2._interface;

public class Baby extends Person {

	public Baby() {
	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}	

	@Override
	public void eat() {
		// 먹을 때 몸무게 3 증가, 건강도 1 증가
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
	}

	@Override
	public void sleep() {
		// 잘 때는 건강도가 3 증가
		super.setHealth(super.getHealth() + 3);

	}

	@Override
	public String toString() {
		return "Baby [" + super.toString() + "]";
	}


	

}
