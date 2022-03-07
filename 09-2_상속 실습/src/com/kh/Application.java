package com.kh;

import com.kh.practice.Circle;
import com.kh.practice.Point;
import com.kh.practice.Rectangle;

public class Application {

	public static void main(String[] args) {
		
		Point test = new Point(3, 5);		
		test.draw();
		
		System.out.println();
		System.out.println("==== circle====");
		
		Circle[] cArray = new Circle[2];
		
		cArray[0] = new Circle(1, 2, 3);
		cArray[1] = new Circle(3, 3, 4);

		for(Circle a : cArray) {

			a.draw(); 
		}
	

		System.out.println("==== rectangle====");
		
		Rectangle[] rArray = new Rectangle[2];
		
		rArray[0] = new Rectangle(-1, -2, 5, 2);
		rArray[1] = new Rectangle(-2, 5, 2, 8);

		for(Rectangle b : rArray) {

			b.draw(); 
		}

	}

}
