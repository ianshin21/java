package com.kh.exception;

import java.io.FileNotFoundException;

public class C_Subclass extends C_SuperClass {

//	@Override
//	public void method() {
		// 오버라이딩 시 throws 작성하지 않아도 된다. 
//	}
	
//	@Override
//	public void method() throws IOException{	
//		//같은 예외를 던져주는 구문으로 작성이 가능하다. IOException 부모와 같은 레벨의 클래스
//	}
	
//	@Override
//	public void method() throws Exception{
		// Exception이 부모 보다 상위클래스라서 여기로 throw 하는 것은 불가능, 에러남  
	
	@Override
	public void method() throws FileNotFoundException{
		// 부모 클래스의 매소드보다 더 하위 타입의 exception을 throw 하는 것은 가능
	}
}
