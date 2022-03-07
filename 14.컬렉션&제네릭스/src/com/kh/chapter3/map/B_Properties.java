package com.kh.chapter3.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class B_Properties {
	
	public void method1() {
		/*
		 *  Properties 
		 *  	- Map 계열이다. Key, Value 세트로 저장된다. 
		 *  	- Key, Value가 String으로 제한되어 있다.
		 */
		
		Properties prop = new Properties();
		
		//  키, 벨류 쌍으로 저장할 때
		// 순서 유지 안되고 키값은 중복이 안 됨
		// put이 아니라 setProperty로 저장
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		// Value 읽어오기 
		System.out.println(prop.getProperty("Set"));
		
		try {
			prop.store(new FileOutputStream("test1.properties"), "properties1"); 
			prop.store(new FileWriter("test2.properties"), "properties2"); 
			prop.storeToXML(new FileOutputStream("test.xml"), "xml");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void method2() {
		// "test1.properties", "test.xml" 읽어서 "properties"에 담아 출력해보자
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("test1.properties"));
//			prop.load(new FileReader("test2.properties"));
//			prop.loadFromXML(new FileInputStream("test.xml"));
			
			System.out.println(prop);
			System.out.println(prop.getProperty("List"));
			System.out.println(prop.getProperty("Set"));
			System.out.println(prop.getProperty("Map"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}


























