package com.kh.practice;

public class Circle extends Point {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {

//		System.out.printf("(x, y) : (%d, %d)\n", super.getX(), super.getY());
		super.draw();
		System.out.println();
		
		double pi = 3.14;
		double area;
		double perimeter;
		
		area = pi * radius * radius;
		perimeter = pi * radius * 2;
		
		System.out.printf("면적 : %.1f\n", area);
		System.out.printf("둘레 : %.1f\n", perimeter);
	}
	
	
}
