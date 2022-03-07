package com.kh.hr.view;

import java.util.Scanner;

import com.kh.hr.controller.PersonController;
import com.kh.hr.model.vo.Person;

//view : 클라이언트(사용자)의 시각적인 부분(화면)을 담당(출력, 입력)
//		    여기서 보여지는 화면(메뉴)을 통해서 요청이라는걸 하게된다.
//		    요청을 한다는 건 Controller 클래스의 메소드를 호출한다는 의미
public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	// 사용자에게 입력받기 위한 Scanner 클래스 객체 생성
	private PersonController pc = new PersonController(); 
	// 사용자의 요청을 처리할 클래스 객체 생성
	
	
	// 프로그램 실행과 동시에 보여질 메인 메뉴 (반복적으로 출력)
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체조회");
			System.out.println("3. 회원 이름 검색");
			System.out.println("4. 회원 평균 재산 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertPerson(); break;
			case 2: printPerson(); break;
			case 3: searchPerson(); break;
			//case 4: System.out.println("평균 재산 : " + pc.avgWealth()); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("다시 입력해주세요."); break;
			}
		}
	}
	
	/**
	 *  메뉴 1. 회원 정보를 입력받은 후 입력받은 정보들로 회원 추가 요청하는 화면
	 */
	public void insertPerson() {
		
		System.out.println("=== 사원 정보 입력 ===");
		
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.print("재산 : ");
		int wealth = sc.nextInt();
		sc.nextLine();
		
		pc.insertPerson(name, age, wealth); // controller에 사용자가 입력한 정보들 넘기면서 회원 추가 요청!
	}
	
	
	/**
	 *  메뉴 2. 현재 회원들을 전체 조회 요청하는 화면
	 */
	public void printPerson() {
		
		System.out.println("=== 사원 정보 조회 ===");
		
		int count = pc.getCount(); // controller에 현재 회원수 알려달라는 요청!
		
		if(count == 0) {
			System.out.println("현재 추가된 회원이 없습니다.");
			
		}else {
			
			Person[] people = pc.getPeople(); // controller에 현재 회원들 정보가 담겨있는 배열 조회 요청!
			
			for(int i=0; i<count; i++) {
				System.out.println(people[i].information());
			}
			
			// 향상된 for문
			/*for(Person p : people) { 
				System.out.println(p.information());
				// 여기서의 p는 반복문이 돌 때마다 people[0], people[1].. 이 된다.
			}*/
		}
		
	}
	
	/**
	 *  메뉴 3. 회원 이름으로 검색요청을 하는 화면
	 */
	public void searchPerson() {
		
		System.out.println("=== 사원 정보 검색 ===");

		System.out.print("검색할 이름 : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search); // controller에사용자가 입력한 검색어 넘겨 일치하는 회원 검색 요청!
	
		if(searchPerson == null) {  // 단, 검색된 회원이 없을 경우 searchPerson은 null일 것!
			System.out.println("검색된 사람이 없습니다.");
		}else {			// 검색된 회원이 있을 경우
			System.out.println(searchPerson.information());
		}
	
	
	}	
}
