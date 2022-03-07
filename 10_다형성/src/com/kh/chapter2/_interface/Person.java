package com.kh.chapter2._interface;

public abstract class Person implements Basic, Basic2 {

	private String name;
	
	private double weight;
	
	private int health;
	
	// 기능을 인터페이스에 속성은 추상클래스에서
	
	public Person() {		
	}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", health=" + health + "]";
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	
/*	@Override
	public String toString() {
		
		return "name" + this.name + ", weight" + this.weight + ", health" + this.health;
	}
*/
	
	
	
	

	
	

}
