package com.practice1;

import java.util.Scanner;

import com.practice1.model.dao.FileDao;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		FileDao fd = new FileDao();
		
		while(true) {
			
			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println("번호를 입력하세요.");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: fd.fileSave(); break;
			case 2: fd.fileOpen(); break;
			case 3: fd.fileEdit(); break;
			case 4: System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("다시 입력해 주세요."); break;			
			}			
		}
	}
}
