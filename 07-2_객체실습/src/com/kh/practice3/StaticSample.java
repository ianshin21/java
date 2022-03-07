package com.kh.practice3;

public class StaticSample {
	
	private static String value;

	
	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}

	public static void toUpper() {
		
//		char[] upValue = new char[4];
//		
//		for (int i = 0; i < upValue.length; i++) {
//			upValue[i] = (char) (value.charAt(i) - 34);
//		}
//		for (char i : upValue) {
//			System.out.print(i);
//		}
		
		String value = StaticSample.value.toUpperCase();
		
		System.out.println("대문자로 : " + value);
				
		// 문제에서 주문한 대로 메소드에서 출력문을 만들지 않는 방법을 잘 모르겠습니다.
		// 또 char 배열을 사용하는 방법 또한 어렵습니다. 
	}
	
	public static void setChar(int index, char c) {
		
//		value.setChar(0, C);		

		// setChar 메소드를 사용하는 방법을 모르겠습니다.
	}
	
	public static int valueLength() {
		
		int length = StaticSample.value.length();
		return length;
	}
	
	public static String valueConcat(String str) {
		
		String newValue = value.concat(str);
		return newValue;
	}
	

}
