package com.kh.inherit.before;

public class Desktop {

	private String brand;
	
	private String pCode;
	
	private String name;
	
	private int price;
	
	private boolean allInone;
	
	public Desktop() {		
	}

	public Desktop(String brand, String pCode, String name, int price, boolean allInone) {
		
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
		this.allInone = allInone;
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

	public boolean getAllInone() {
		return allInone;
	}

	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
	public String information() {
		return "brand : " + this.brand + ", pCode : " + this.pCode + ", price ; " + this.price + 
				", name : " + this.name + ", allInone : " + this.allInone;
	}

	
}

