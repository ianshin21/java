package com.kh.chapter4;

import java.util.ArrayList;
import java.util.List;

import com.kh.chapter4.generics.MyGenerics;

public class Application {

	public static void main(String[] args) {

		String[] strArray = {"문인수", "공원상", "김소요", "박상철", "김희득"};
		Integer[] intArray = {11, 22, 33, 44, 55};
		Double[] doubleArray = {11.4, 22.3, 33.5, 44.5};
		
		MyGenerics<String> myGenerics = new MyGenerics<String>(strArray);
		myGenerics.print();

		MyGenerics<Double> myGenerics1 = new MyGenerics<>(doubleArray);
//		
		myGenerics1.print();
//		
		MyGenerics<Integer> myGenerics2 = new MyGenerics<Integer>(intArray);
//		
		myGenerics2.print();
		
		List<Double> list = myGenerics1.toList();	
		for (Double str : list) {
			System.out.println(str);			
		}
		
		
//		List<String> list1 = new ArrayList<>();				
//		list1 = myGenerics.toList();
		List<String> list1 = myGenerics.toList();
//		for (String str : list1) {
//			System.out.println(str);			
//		}
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}

}
