package com.kh.chapter4.assiststream.model.vo;

import java.io.Serializable;

// MVC 패턴 (Model view Controller)

// vo (Value Object) : 여러 타입의 비슷한 속성을 하나로 묶어놓은 클래스들을 지칭한다.
//					   주로 데이터를 묶어서 전송하기 위해 사용한다.( == dto)
// implements Serializable 추가함...전부 자동완성으로!!!

public class Member implements Serializable {  

	private static final long serialVersionUID = 1848713202598214482L;
											// Serializable 붙으면 private 필드도 직렬화 하는 것을 허용하겠다는 뜻
	private String id;   
	
	private String pwd;
	
	private String name;
	
	private String email;
	
	private int age;
	
	private char gender;
	
	private transient double point;		// transient 키워드를 사용한 필드는 직렬화에서 제외한다
	
	public Member() {
	}
	
	// C어쩌구 using Fields...
	public Member(String id, String pwd, String name, String email, int age, char gender, double point) {
			super();
			this.id = id;
			this.pwd = pwd;
			this.name = name;
			this.email = email;
			this.age = age;
			this.gender = gender;
			this.point = point;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	public double getPoint() {
		return point;
	}
	
	public void setPoint(double point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + ", point=" + point + "]";
	}
	
	

	
	
	
}
