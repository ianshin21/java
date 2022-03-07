package com.kh.chapter2._class;

//클래스에서 사용 가능한 접근제한자
//1. public
//2. default : 동일 패키지 내에서만 접근 가능하다. chapter2패키지에 있는 Application에서는 class패키지 내부의
// 			Person class 밑에 있는 Phone 클래스를 읽을 수 없다.  Person는 같은 패키지에 있다.
//          이 클래스에 가서  private String phone; => private Phone phone = new Phone(); 으로 객체 생성해서
//             Person이 Phone에 접근해서 Phone을 '가지고 다니게' 한다. 

class Phone {

	private String name;
	private String color;
	private String brand;
	private int price;
	private double inch;
	
	public Phone() {
		// 생성자 : 반환형 없고, 이름은 클래스명과 동일. 없어도 jvm이 자동 생성한다. 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getInch() {
		return inch;
	}
	public void setInch(double inch) {
		this.inch = inch;
	}
	
	public String information() {
		return "이 핸드폰은 " + brand + 
				"의 휴대폰으로 " + inch + 
				"의 " + color + 
				"색상의 " + name + "입니다.";
	}
	
	
}
