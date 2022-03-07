package com.kh.collection.silsub2.view;

import java.util.Scanner;

import com.kh.collection.silsub2.controller.BookManager;
import com.kh.collection.silsub2.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();

	public BookMenu() {
	}
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("도서관리 프로그램 메뉴입니다.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("메뉴 번호를 선택하시오.");
		
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: inputBook(); break;
			case 2: bm.sortedBookList(); break;
			case 3: inputBookNo(); break;
			case 4: inputBookTitle(); break;
			case 5: bm.selectAll(); break;
			case 6: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("메뉴를 다시 선택하세요."); break;
			}		
		}
	}
	
	public Book inputBook() {
		
		System.out.println("도서 정보를 입력합니다.");
		
		System.out.println("도서 제목을 입력하시오.");
		String title = sc.nextLine();
		
		System.out.println("도서 장르를 선택하시오.");
		System.out.println("1.인문 / 2.자연과학 / 3.의료 / 4. 기타");
		int category = sc.nextInt();
		sc.nextLine();

		System.out.println("도서의 저자를 입력하시오.");
		String author = sc.nextLine();
		
		Book book = new Book(category, title, author);
		return book;		
	}
	
	public int inputBookNo() {
		 System.out.println("도서번호를 입력하시오.");
		 int bNo = sc.nextInt();
		
		 return bNo;		
	}
	
	public String inputBookTitle() {
		System.out.println("도서 제목을 입력하시오.");
		String title = sc.nextLine();

		return title;		
	}
}
