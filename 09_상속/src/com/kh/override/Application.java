package com.kh.override;

import com.kh.override.model.vo.Book;

public class Application {

	// 모든 클래스는 Object의 후손이다. 
	// Object에 있는 메소드를 다 사용할 수 있다.
	public static void main(String[] args) {
		Book book1 = new Book("자바 머무 어려워 ", "공원상", 4000);
		Book book2 = new Book("수학의 정석 ", "홍성대", 4000);
		Book book3 = new Book("수학의 정석 ", "홍성대", 4000);

		// print 메소드의 경우 기본적으로 객체의 참조값을 넘겨주면 참조값.toString() 메소드를 호출해준다. 
		System.out.println(book1);
		System.out.println(book2);
		
		System.out.println("book2와 book3이 같은 책 입니까? " + (book2 == book3));
		System.out.println("book2와 book3이 같은 책 입니까? " + book2.equals(book3));
		
		System.out.println("=================hashCode() 테스트===============");
		System.out.println("book1의 해쉬코드 : " + book1.hashCode());
		System.out.println("book2의 해쉬코드 : " + book2.hashCode());
		System.out.println("book3의 해쉬코드 : " + book3.hashCode());

	}

}
