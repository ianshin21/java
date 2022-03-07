package com.kh.variable;

public class E_Overflow {
	
	public void printVariableSize() {
		System.out.println("byte의 크기 : " + Byte.MAX_VALUE);
		System.out.println("short의 크기 : " + Short.MAX_VALUE);
		System.out.println("int의 크기 : " + Integer.MAX_VALUE);
		System.out.println("long의 크기 : " + Long.MAX_VALUE);
		System.out.println("float의 크기 : " + Float.MAX_VALUE);
		System.out.println("double의 크기 : " + Double.MAX_VALUE);	
		System.out.println("char의 크기 : " + (int)Character.MAX_VALUE);
		System.out.println("char의 크기 : " + Character.MAX_VALUE);
	}
	
	public void overflow( ) {
		byte bNum = 127;
		byte result = (byte) (bNum + 1);  
			// 그냥 하면 bNum에 자동형변환일어난다. 
		
		System.out.println();
		System.out.println("bNum : " + bNum);
		System.out.println("=======================");
		System.out.println("result : " + result);
		
		System.out.println("=======================");
		int num1 = 1000000; 
		int num2 = 700000;
		int result2 = num1 * num2;
		
		System.out.println(result2);
	}

}
