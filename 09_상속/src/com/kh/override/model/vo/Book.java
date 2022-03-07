package com.kh.override.model.vo;

public class Book /* extends Object */ {

	private String title;

	private String author;

	private int price;

	public Book() {
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/*
	 * public String information() { return "title : " + title + "price : " + price;
	 * }
	 */

	/*
	 * 오버라이딩 - 자식클래스가 상속 받은 부모 클래스의 메소드를 재정의 하는 것 - 자식 객체를 통해서 실행 시 자식 메소드가 우선권을
	 * 가진다. (부모메소드가 사라지는 게 아니다. 재정의 된 자식 객체의 메소드가 부모의 메소드 앞에 있다.
	 * 
	 * 오버라이딩 성립 조건 - 부모클래스의 메소드와 메소드명이 동일 - 매개변수 개수, 자료형, 순서 동일 - 반환형 동일 
	 * 				   - 부모메소드의 접근제한자 보다 범위가 같거나 커야한다. public > protected > default > private 
	 * 			ex) 부모메소드의 접근제한자가 protected일 경우 오버라이딩하는 메소드의 접근제한자는 protected이거나 public 이어야 한다.
	 * 
	 * @Override annotation - 명시 안 해줘도 오버라이딩하는 데는 크게 상관 없다. - 하지만 어노테이션이 없으면 오버라이딩
	 * 성립 조건을 위반해도, 자식 메소드에서 잘못 재정의해도, 에러표시가 되지 않는다. 오버로딩으로 본다. - 해당 메소드가 오버라이딩 된
	 * 메소드라는 것을 컴파일러에게 알려주는 역할을 한다
	 * 
	 */

	// 1.Object 클래스의 toString 메소드의 오버라이딩
	// toString은 객체의 문자 정보를 오버라이딩 한다.
	// - 기본적으로 Object에서는 풀패키지명@16진수 해시코드 리턴

	@Override
	public String toString() {

		return "title ; " + this.title + ", author : " + this.author + ", price : " + price;
	}
	
	// 2. Object 클래스의 equals 메소드 오버라이딩
	// - 주소값 비교가 아닌 실제 필드값들이 모두 같을 경우 true가 반환되고 하나라도 틀릴 경우 false가 반환되게 재정의 하자.
	// - equals 메소드에 매개변수로 전달되는 Object obj 는 비교할 대상 객체이다.
	@Override
	public boolean equals(Object obj) {

		Book target = (Book) obj;
		/*
		 * if(this.title.equals(target.getTitle()) &&
		 * this.author.equals(target.getAuthor()) && this.price == target.getPrice()) {
		 */
		// private은 해당 클래스에서 직접 접근이 가능하기 때문에 아래와 같은 코드도 가능
		if (this.title.equals(target.title) && this.author.equals(target.author) && this.price == target.price) {
			return true;
		} else {
			return false;
		}
	}

	// 3. Object 클래스의 hashCode 메소드 오버라이딩
	// - 해시코드란 객체를 식별할 하나의 정수값을 의미한다.
	// - 기본으로 Object의 hashCode는 객체의 메모리 번지를 이용해서 만줄어 주기 때문에 객체마다 다른 값을 가지고 있다.
	// - 컬렉션들은 hashCode를 가지고 두 객체가 동등한 지 비교한다. 해시토드값이 같으면 equals 메소드로 다시 비교한다.
	// - 해시 값이 true가 나와도 equals 리턴 값이 false 이면 다른 객체로 판단한다.
	@Override
	public int hashCode() {
		// 해당 객체의 필드 값들을 하나의 문자열로 합쳐서 해당 문자열의 해쉬코드를 리턴해주자
		// title + author + price ----> 문자열이 된다.
		// 즉, 같은 문자열일 경우 해당 문자열의 hashCode는 같도록 String 클래스에서는 이미 재정의 되어있기 때문에
		// 문자열의 hashCode() 메소드를 사용
		return (this.title + this.author + this.price).hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
