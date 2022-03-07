package com.kh.practice;

public class Rectangle extends Point {

	private double width;
	
	private double height;
	
	public Rectangle() {
	}

	public Rectangle(int x, int y, double width, double height) {

		super(x, y);
		this.width = width;
		this.height = height;		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		
//		System.out.printf("(x, y) : (%d, %d)\n", super.getX(), super.getY());
		super.draw();
		System.out.println();
		
		int area;
		int perimeter;
		
		area = (int)(width * height);
		perimeter =(int)( 2 * (width + height));
		
		System.out.printf("면적 : %d\n", area);
		System.out.printf("둘레 : %d\n", perimeter);
	}

}
