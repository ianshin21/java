package com.kh.chapter4.constructor;

public class User {
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	
	/*
	 * 생성자 
	 *   [표현법]
	 *     [접근제한자] 클래스명([매개변수]) {
	 *           객체 생성 시 필요한 코드 작성 
	 *     }
	 * 
	 *  생성자를 작성하는 목적
	 *     - 객체 생성시 메모리 할당
	 *     - 객체를 생성해주기 위한 목적  :  = new 클래스명();
	 *     - 객체 생성시 매개변수로 전달 받은 값들을 인스턴스 변수에 바로 초기화할 목적  
	 *             미리 필드에서 초기화 하면 객체 생성할 때마다 항상 똑같이 값이 정해지므로 
	 *             객체를 생성하는 시점마다 원하는 값으로 다르게 초기화 가능 
	 *             
	 *  생성자 작성시 주의 사항 
	 *     - 클래스명과 동일해야 함. 대소문자 모두 동일 
	 *     - 반환형이 없다. (메소드와 유사하기 때문에 주의)
	 *     - 매개변수 있는 생성자를 작성하게되면 기본생성자를 jvm이 자동으로 만들어 주지 않는다.
	 *     - 기본 생성자는 항상 기본으로 작성하는 습관을 기르자 
	 *     - 생성자는 여러개 만들 수 있다. : 생성자 오버로딩 (자료형, 매개변수 개수, 순서)
	 */         

	// 생성자를 private로 선언하면 외부에서 절대로 객체 생성할 수 없다.    
	//	private User() {   이래선 안됨
	
	public User() {
		// 기본 생성자 : 매개변수 없는 생성자 : 객체 생성만을 목적으로 만들어줌 
		// 기본 생성자 생략할 경우 jvm이 알아서 만들어주기 때문에 항상 객체 생성이 가능하다. 
		System.out.println(" User () : 기본 생성자 호출");
		// 생성자이므로 위 내용은 객체 생성하면 자동 실행, 콘솔 출력된다. 
	}
	 
	// 매개 변수 있는 생성자 : 객체 생성시   = new User("ismoon", "1234", insumoon")  이렇게 만들어 줌 
	// 객체 생성과 동시에 전달된 값들을 매개변수로 받아서 해당 필드에 초기화하는 목적 
	// 나머지 인스턴스변수 는 jvm이 알아서 초기값을 준다. 
	// this를 안 쓰면 여기 {} 블럭 내의 요소만 가리킨다. this는 필드의 변수를 가리킨다.
	public User(String id, String pwd, String name) {   
		this.id = id;									
		this.pwd = pwd;
		this.name = name;
	}
	
	// 매개 변수 있는 생성자 : 아이디, 패스워드, 이름, 나이, 성별 : 매소드 오버로딩
	public User(String id, String pwd, String name, int age, char gender) {
//		this.id = id;									
//		this.pwd = pwd;
//		this.name = name;
		
		// 아래와 같이, 같은 클래스 내에서 (중복되는 동일한 내용의) 같은 문자열 매개변수(여기서는 3개)를 
		// 			가지는 생성자가 이미 존재하는 경우, this() 생성자를 통해서 호출이 가능하다. 
		// 생성자는 객체 생성될 때 단 한번만 호출되기 때문에
		// (외부에서 객체 생성의 용도가 아닌 경우 생성자는 호출이 불가능) 생성자 내에서는 
		// (this() 생성자를 통해서 위에 만들어 둔) 다른 생성자 호출이 가능
		 
		this(id, pwd, name);
		
		this.age = age;
	 	this.gender = gender;

	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	
	public String information() {
		return "아이디 : " + this.id + 
				", 비밀번호 : " + this.pwd + 
				", 이름  : " + this.name + 
				", " + "나이 : " + this.age + 
				", 성별 : " + this.gender;
	}
	
}
