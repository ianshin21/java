package com.kh;

import com.kh.arrayPractice.Student;
import com.kh.practice1.Product;
import com.kh.practice2.NonStaticSample;
import com.kh.practice3.StaticSample;

public class Application {

	public static void main(String[] args) {

		
//		System.out.println("============객체 실습=============================");
//		  
//		Product product1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
//		Product product2 = new Product("lgxnote5", "LG스마트폰", "경기도 평택", 780000, 0.7);
//		Product product3 = new Product("ktsnote3", "KT스마트폰", "서울시 강남", 250000, 0.3);
//		 
//		System.out.println(product1.information());
//		System.out.println(product2.information());
//		System.out.println(product3.information());
//		 
//		System.out.println("================================================");
//		 
//		product1.setPrice(1200000); 
//		product2.setPrice(1200000);
//		product3.setPrice(1200000);
//		 
//		product1.setTax(0.05); 
//		product2.setTax(0.05); 
//		product3.setTax(0.05);
//		 
//		System.out.println(product1.information());
//		System.out.println(product2.information());
//		System.out.println(product3.information());
//		 
//		System.out.println("=================================================");
//		 
//		System.out.println("상품명 = " + product1.getName() + "\n부가세 포함 가격 = " +
//						(product1.getPrice() + (int)(product1.getPrice() * product1.getTax())) + "원"); 
//		System.out.println("상품명 = " + product2.getName() + "\n부가세 포함 가격 = " +
//						 (product2.getPrice() + (int)(product2.getPrice() * product2.getTax())) +"원"); 
//		System.out.println("상품명 = " + product3.getName() + "\n부가세 포함 가격 = " +
//				 		(product3.getPrice() + (int)(product3.getPrice() * product3.getTax())) + "원");
		 
//		System.out.println();
//		System.out.println("==============객체 배열 실습=========================");
//		 
//		Student[] personInfo = new Student[3];
//		 
//		personInfo[0] = new Student(3, 1, 1, "홍길동"); 
//		personInfo[1] = new Student(4, 3, 2, "유관순"); 
//		personInfo[2] = new Student(2, 7, 5, "윤봉길");
//		 
//		for (int i = 0; i < personInfo.length; i++) {
//			 System.out.println(personInfo[i].information()); 
//		}
		 
//		System.out.println();
//		System.out.println("=============메소드 실습1============================");
//
//		NonStaticSample sample = new NonStaticSample();
//
//		System.out.print("랜덤 값 : ");
//		sample.printLottoNumber();
//
//		System.out.println("\n");
//
//		sample.outputChar(10, 'p');
//
//		System.out.println("\n");
//		
//		char ch = sample.alphabette();
//		System.out.println("랜덤 영문자 출력 : " + ch);
//
//		System.out.println();
//
//		String result = sample.mySubstring("This is not a joke", 3, 15);
//		System.out.println(result);
//		
		System.out.println();
		System.out.println("=============메소드 실습2============================");
		
		 
	
		StaticSample.setValue("Java");
		
		System.out.println("value : " + StaticSample.getValue());
		
		StaticSample.toUpper();

//		StaticSample.setChar(0,J);

		System.out.println("길이 : " + StaticSample.valueLength());
		
		System.out.println("PROGRAMMING 붙여서 : " + StaticSample.valueConcat("PROGRAMMING"));



	}

}
