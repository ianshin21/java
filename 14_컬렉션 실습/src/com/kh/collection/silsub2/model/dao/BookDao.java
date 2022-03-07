package com.kh.collection.silsub2.model.dao;

import java.util.ArrayList;

import com.kh.collection.silsub2.model.vo.Book;

public class BookDao {
	
	private ArrayList<Book> booklist= new ArrayList<>();

	public BookDao() {
		super();
	}

	public BookDao(ArrayList<Book> booklist) {
		this.booklist = booklist;
	}
	
	public int getLastBookNo() {
		return 0;
		
	}
	
	public void addBook(Book book) {
		
	}
	
	public int deleteBook(int no) {
		return no;
		
	}
	
	public int searchBook(String title) {
		return 0;
		
	}
	
	public Book selectBook(int index) {
		return null;
		
	}
	
	public ArrayList<Book> selectAll(){
		return null;
		
	}
	
	public ArrayList<Book> sortedBookList() {
		return null;
		
	}
	
	

}
