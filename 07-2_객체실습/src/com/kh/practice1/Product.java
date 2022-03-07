package com.kh.practice1;

public class Product {

	private String id;
	
	private String name; 
	
	private String productSite;
	
	private int price;
	
	private double tax;

	public Product() {
	}
	
	public Product(String id, String name, String productSite, int price, double tax) {

		this.id = id;
		this.name = name;
		this.productSite = productSite;
		this.price = price;
		this.tax = tax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductSite() {
		return productSite;
	}

	public void setProductSite(String productSite) {
		this.productSite = productSite;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}


	public String information() {
		return this.id + " " + this.name + " " + this.productSite + " " + this.price + " " + this.tax;
	}
}
