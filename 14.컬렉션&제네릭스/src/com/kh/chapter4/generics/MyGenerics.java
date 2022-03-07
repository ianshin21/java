package com.kh.chapter4.generics;

import java.util.ArrayList;
import java.util.List;

public class MyGenerics<T> {
//public class MyGenerics<T extends Number>{
												// 객체가 생성되는 시점에 (실행 시점에) 타입 파라미터 지정
												// Application에서 String, Integer 등으로   
	private T[] array;
	
	public MyGenerics() {
		// 기본 생성자 
	}
	
	public MyGenerics(T[] array) {  	//타입 지정 안된 매개변수 있는 생성자   // 매개변수 받는 쪽
		this.array = array;		
	}
	

	public void print() {    					// 매개변수 사용하는 쪽 
		for (T t : array) {
			System.out.println(t);
		}
	
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}	
	}
	

		// 위 배열을 List 형태로 바꾸어서 사용해 본다. 
	public List<T> toList() {

		List<T> list = new ArrayList<>();
		
		for (T t : array) {
			list.add(t);
		}
		
		return list;
	}



}
