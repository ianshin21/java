package com.kh.stream.vo;

public class Member implements Comparable<Member> {
	private String name;
	
	private int age;
	
	private String gender;
	
	public Member() {
	}
	
	public Member(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Member member) {
	
		//this.age < member.age : 음수리턴
		//this.age = member.age : 0리턴
		//this.age > member.age : 양수리턴
		
		return Integer.compare(this.age, member.age);
	}

}
