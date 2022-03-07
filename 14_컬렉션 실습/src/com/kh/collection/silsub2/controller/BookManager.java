package com.kh.collection.silsub2.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.collection.silsub2.model.dao.BookDao;
import com.kh.collection.silsub2.model.vo.Book;

public class BookManager {
	
	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);

	public BookManager() {		
	}
	
	public void addBook(Book book) {
		
		try {
		
			book.setbNO(bd.getLastBookNo() + 1);
		
			bd.addBook(book);
		
		}catch(NullPointerException e) {
			System.out.println("등록된 책이 없습니다.");
		}
				
	}
	
	public int deleteBook(int bNo) {
		return bNo;
		
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
	
	public Book[] sortedBookList() {
		return null;
		
	}
	
	public void printBookList(Book[] br) {
		
	}

}
