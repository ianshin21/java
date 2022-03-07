package com.kh.inherit.after;

/*
 * 상속
 *  [표현법]
 *  	[접근제한자] class 클래스명 extends 부모클래스명 {}
 * 	super()와 super.
 * 		- 해당 객체의 부모의 주소를 담고 있다. 
 * 
 * 	상속의 장점
 * 	- 적은 양의 코드로 새로운 클래스를 작성 가능
 * 	- 코드를 공통적으로 관리, 코드의 추가 변경에 용이
 * 	- 코드의 중복 제거, 프로그램의 생산성과 유지 보수에 유리
 * 
 *  상속의 특징
 *   - 클래스 간의 상속은 단일 상속만 가능
 *   - 명시되어있지 않아도 모든 틀래스는 Object 클래스를 상속한다. 
 *   		-> Object 클래스에서 제공하는 메소드들을 오버라이딩 하여 재정의 가능
 *   - 부모클래스의 생성자, 초기화 블럭은 상속되지 않는다. (자식클래스 생성시에 부모클래스 생성자가 먼저 실행된다)
 *   - 부모의 private 멤버는 상속이 되지만 직접 접근은 불가
 *     -> getter / setter 사용해서 간접적으로 접근
 */
public class Desktop extends Product {

	
	private boolean allInone; // 일체 여부
	
	public Desktop() {		
	}

	
	public Desktop(String brand, String pCode, String name, int price, boolean allInone) {
		
		/* 
		 * 부모 인스턴스 변수를 초기화 할 수 있는 방법
		 * 
		 * 1. super. 를 통해서 부모의 인스턴스 변수에 직접 접근
		 * 	- 부모의 인스턴스 변수가 private이면 직접 접근할 수 없다 
		 * 	- 부모의 인스턴스 변수가 default 이면 직접 접근 가능 : 같은 페키지 일 때
		 * 	- protected 도 직접 접근 가능 : 상속관계
		 * 	- public은 어디서든 접근 가능
		 * 
		 * 2. 부모의 setter 메소드를 통해서 초기화
		 * 	- 부모에서 setter 메소드를 제공하면 setter 메소드를 통해서 초기화 가능
		 * 	- public 접근제한자를 가지기 때문
		 * 
		 * 3. 부모 생성자 호출해서 초기화하기 
		 * 	- super()를 통해서 부모의 생성자를 호출할 수 있다.
		 * 	- 일반 메소드에서는 호출할 수 없고 자식의 생성자에서만 호출 가능 
		 */
		
//		super.brand =brand;    	//brand 변수는 default이기 때문에 이런 식으로 접근 가능 /부모의 인스턴스 변수가 private이면 직접 접근할 수 없다 
//		super.setBrand(brand);	// 
//		super.setName(name);    // 부모에서 setter 메소드를 제공하면 setter 메소드를 통해서 초기화 가능
//		super.setpCode(pCode);
//		super.setPrice(price);
		
		super(brand, pCode, name, price);
		
		this.allInone = allInone;
	}

	
	public boolean isAllInone() {
		return allInone;
	}

	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}


	@Override
	public String information() {
		
		return super.information() + ", allInone : " + this.allInone;
	}



	
}

