package com.kh.chapter1.polymorphism;

public class Product {

	String brand;
	
	private String pCode;
	
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
	
	public void print() {
		System.out.println("Procuct 클래스의 print() 호출 !!!");
	}

	
}








