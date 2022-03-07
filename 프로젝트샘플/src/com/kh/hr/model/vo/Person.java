package com.kh.hr.model.vo;


//model : 데이터 관련한 역할을 담당
//vo(valueObject) : 데이터값을 담기위한 용도의 클래스
public class Person {
	
	private String name;	// 이름
	private int age;		// 나이
	private int wealth;		// 재산
	
	public Person() {
		
	}
	
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	public String information() {
		return "name=" + name + ", age=" + age + ", wealth=" + wealth;
	}
}