package com.kh.operator;

public class F_Compound {
	
	public void method() {
		int num = 12;
		String str = "Hello";
		
		str += "\sWorld !!";   // 공백은 \s 혹은 그냥 띄어쓰기 해주면 됨 (공백 만들어 주면 됨)
				
		System.out.println("str : " + str);
		
		num += 3;   // num = num + 3 보다 연산이 더 빠르다고 함 
		num -= 5; 
		num *= 6; 
		num /= 3; 
		num %= 4; 

		System.out.println("num : " + num);
		
	}

}
