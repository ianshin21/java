package com.kh.arrayPractice;

public class Student {

	private int grade;
	
	private int classroom;
	
	private int num;
	
	private String name;

	public Student() {
	}

	public Student(int grade, int classroom, int num, String name) {
		
		this.grade = grade;
		this.classroom = classroom;
		this.num = num;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String information() {
		return this.grade + "학년 " + this.classroom + "반 " + this.num + "번 " + this.name;
	}
	
	
	
}
