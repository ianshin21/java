package com.kh.chapter2._class;

// 클래스에서 사용 가능한 접근제한자
// 1. public
// 2. default 
public class Person {	

	private String name;	
	private int age;
	private char gender; 
//	private String phone;  이것을 아래 Phone 으로 변경  / Phone 클래스를 참조할 수 있는 메모리 공간만 확보 
	private Phone phone = new Phone();      // 외부(Application에서)에서 Phone의 객체를 만들 수가 없어 여기서 객체 생성
											// Person이 Phone 주머니 가지게 됨.
//	private Phone phone;     // 에러 남 : Exception in thread "main" java.lang.NullPointerException 
	private String email;
	
	public Person() {
		// 생성자 반환형이 없다. 일단 하는 일은 없는 걸로
	}

	public String getName() {
		return this.name;  // 필드에 있는 이름이라는 의미로 이렇게 this 붙이기도 한다. 
	}

	public void setName(String name) {
		this.name = name; // 하여간에 this는 필드에 있는 name이라는 뜻
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

//	public String getPhone() {     // 여기 String을 아래 Phone으로 변경
//		return phone;
//	}
	
	public Phone getPhone() {     // 반환형은 객체
		return phone;
	}

//	public void setPhone(String phone) {     // 여기 String을 아래 Phone으로 변경했다가 다시 이름, 브랜드,인치 초기화 준비
//		this.phone = phone;
//	}

	public void setPhone(String name, String brand, double inch) {     
		phone.setName(name);
		phone.setBrand(brand);
		phone.setInch(inch);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String whoAreYou() {
		
		System.out.println();
		return "안녕하세요. 저는 " + this.name + "입니다. 제 핸드폰은 " + this.phone.getName() + " 나이는 " + this.age + "세입니다.";
				// 문자열 + 변수 = 문자열 이므로 이 문장 전체는 문자열
	}
}
