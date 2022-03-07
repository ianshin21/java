package com.kh.chapter3.field;

// 인스턴스변수의 접근제한자를 테스트하기 위한 클래스
public class FieldTest2 {
	
	/*
	 * 인스턴스변수에서 사용 가능한 접근제한자
	 * 1. public	: 어디서든 (같은 페키지, 다른 페키지 모두) 접근 가능
	 * 2. protected	: 같은 페키지에서 접근 가능 + 만약 다른 패키지라면 상속구조(부모 자식간의 관계)에서 접근 가능
	 * 3. default	: 같은 패키지에서만 접근 가능
	 * 4. private	: 무조건 해당 클래스에서만 접근 가능
	 * 
	 * 위에서부터 아래로 내려 갈 수록 접근할 수 있는 범위가 좁아진다.
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";				//default는 default라고 써주면 에러남
	private String pri = "private";
	

}
