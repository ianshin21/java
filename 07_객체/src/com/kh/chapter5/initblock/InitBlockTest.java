package com.kh.chapter5.initblock;

public class InitBlockTest {

	// 1. JVM에서 초기화 
	// 		- 인스턴스 변수에 아무런 초기값 없이 생성했을 경우 jvm이 정한 기본 값으로 설정
	
	private String name; 
	private static int age;
	
	// 2. 명시적 초기화 
	private String phoneName = "아이폰"; 
	private int price = 0;
	private static String brand = "애플";
	
	// 3. 인스턴스 블록  
	// 		- 인스턴스 변수를 초기화시키는 블럭
	// 		- 객체 생성시 마다 실행 돼서 초기화 한다. 
	{
		phoneName = "아이폰12";
		price = 500000;
		
		brand = "삼성";   
			// 클래스 변수도 인스턴스 블럭에서 (다시) 초기화 가능
			// 클래스변수는 프로그램 시작시에 초기화(명시적, static블럭)되기 때문에
			// 객체 생성 이후 값을 초기화하는 인스턴스 초기화 블럭의 값으로 덮어쓰게 된다. 
	}
	
	// 4. static 블럭
	//		- 클래스 변수를 초기화시키는 블럭
	// 		- 프로그램 시작 시 단 한번만 호출
	// 		- static 블럭에서는 인스턴스 변수(객체 생성이후 초기화 되는 것들)들을 초기화 할 수 없다
	//				name = "공원상"; (x)	
	static {
		age = 20;
		brand = "애플";
	}
	
	public InitBlockTest() {
		// 기본 생성자 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		InitBlockTest.age = age;			
		// 객체의 인스턴스변수에 접근하는 것이 아닌 정적메모리의 age에 접근해야 되기 때문에 this 사용 불가
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		InitBlockTest.brand = brand;
	}
	
	
	
}
