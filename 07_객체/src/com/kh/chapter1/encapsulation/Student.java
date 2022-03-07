package com.kh.chapter1.encapsulation;


/*
 * 클래스의 구조
 * 
 *  [접근 제한자] class 클래스명 {				* [] : 반드시 필요한 것은 아니라는 표시.
 *		// 필드부 (객체의 속성을 정의)
 *
 *  	// 생성자부 (
 *  
 *  	// 메소드부 (객체의 기능을 정의)
 *  }
 *  
 */


public class Student {

	// 필드부 (멤버 변수. 인스턴스변수, 필드)
	// 접근제한자를 private로 하는 것이 객체지향설계원칙 중 하나인 캡슐화에 해당한다.

	private int sNum;
	private String name;
	private int age; 
	private double height;
	private String gender;
	private int mathscore;
	
	// 생성자부 : 객체를 생성할 때 실행되는 메소드
	
	// 메소드부 
	// [접근 제한자] [예약어 : static, final 등] 반환형 메소드명 ([매개 변수]); {
	// 			기능 구현 
//	   }
		
	// 1. getter와 setter (외부에서 접근할 수 있게 해줘야 하므로 public으로 접근제한자 사용)
	//  getter : 하나의 필드의 값을 반환해주는 기능을 하는 메소드 (getter 메소드)
	//           getter의 메소드명은 getXXX와 같이 붙여준다.(낙타표기법)
	//           해당 필드에 담겨있는 값을 반환만 시켜주기 때문에 전달되는 매개값이 없다.
	//           단, 반환을 해줘야 하기 때문에 반환하고자 하는 값의 자료형을 반환형에 써줘야 한다. 
	//  setter : 하나의 필드의 값을 수정하는 기능을 하는 메소드 (setter 메소드)
	//           메소드명 setXXX (낙타표기법) XXX에는 필드명을 사용
	//           setter 메소드는 해당 필드의 값을 수정하기 때문에 전달되는 매개값이 필요하다.
	//           필드에 대해 수정을 하는 메소드이므로 반환값이 없다. 
	//           데이터베이스에서는 setter가 반드시 있어야 하므로 필요하다. 
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
		// 필드에 name이 있어도 메소드 안의 name이 우선이 된다. 
		// this : 필드부에서 만든 객체의 주소값을 가지고 있다. 객체 자신을 가리킨다.
		// 			필드부 name에 직접 접근하도록 한다. 
	}
	
	
	// ctrl + 3  alt +shift + s / 오른쪽 마우스 -> source
	
	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMathscore() {
		return mathscore;
	}

	public void setMathscore(int mathscore) {
		this.mathscore = mathscore;
	}
		
	@Override
	public String toString() {
		return "Student [sNum=" + sNum + ", name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender
				+ ", mathscore=" + mathscore + "]";
	}

	// 모든 필드값을 다 합친 문자열을 반환하는 메소드
	public String information() {
//		String info = null;		
//		info = "학번 : " + sNum + ", 이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 수학점수 : " + mathscore;
//		return info;
		
		return "학번 : " + this.sNum + ", 이름 : " + this.name + ", 나이 : " + 
						this.age + ", 키 : " + this.height + ", 수학점수 : " + this.mathscore;		
		
//		return "학번 : " + sNum + ", 이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 수학점수 : " + mathscore;
	}
	
	public void method() {
		
		sNum = 3504;
		name = "ian";
		age = 28; 
		height = 3.5;
		gender = "male";
		mathscore = 45;
		
		System.out.println("학번 : " + this.sNum + ", 이름 : " + this.name + ", 나이 : " + 
						this.age + ", 키 : " + this.height + ", 수학점수 : " +this.mathscore		);

	}
}









