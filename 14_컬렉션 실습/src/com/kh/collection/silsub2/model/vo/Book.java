package com.kh.collection.silsub2.model.vo;

public class Book {

	private int bNO;
	private int category;
	private String title;
	private String author;

	public Book() {
	}

	public Book(int category, String title, String author) {

		this.category = category;
		this.title = title;
		this.author = author;
	}

	public int getbNO() {
		return bNO;
	}

	public void setbNO(int bNO) {
		this.bNO = bNO;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
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

	@Override
	public String toString() {
		return "Book [bNO=" + bNO + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}


	
	
	
	
}
