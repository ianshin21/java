package com.kh.inherit.after;

public class Product {

	String brand;
	
	private String pCode;			// 부모의 인스턴스 변수가 private이면 super. 를 통해서 부모의 인스턴스 변수에 직접 접근할 수 없다. super();로 접근
	  	
	private String name;
	
	private int price;

	public Product() {
		super();
	}

	public Product(String brand, String pCode, String name, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String information() {
		return "brand : " + this.brand + ", pCode : " + this.pCode + ", price ; " + this.price + 
				", name : " + this.name;
	}

}
