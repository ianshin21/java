package com.kh.inherit.before;

public class Tv {

	private String brand;
	
	private String pCode;
	
	private String name;
	
	private int price;
	
	private int inch;
	
	public Tv() {		
	}

	public Tv(String brand, String pCode, String name, int price, int inch) {
		
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
		this.inch = inch;
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

	
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String information() {
		return "brand : " + this.brand + ", pCode : " + this.pCode + ", price ; " + this.price + 
				", name : " + this.name + ", inch : " + this.inch;
	}
	
}

