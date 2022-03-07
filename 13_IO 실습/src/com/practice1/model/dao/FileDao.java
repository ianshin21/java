package com.practice1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);

	public FileDao() {
	}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		String str = "";
		String str2 = "";
		char ch = '\u0000';
		
		while(true) {
			
			System.out.println("파일에 저장할 내용을 입력하세요.");			
			str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("내용 입력 끝");				
				break; 
			} else {				
				sb.append(str + "\n");
			}
		}
		
		System.out.println("저장하시겠습니까?");
		
		ch = sc.nextLine().charAt(0);
		
		if(ch == 'Y' || ch == 'y') {
			
			System.out.println("저장할 파일명을 입력하세요.");
			str2 = sc.nextLine();
			
			BufferedWriter bw = null;
			
			try {
				
				bw = new BufferedWriter(new FileWriter(str2 + ".txt"));
				
				bw.write(sb.toString());
				
				bw.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println(str2 + ".txt" + "파일에 성공적으로 저장되었습니다.");
			}			
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
			System.out.println();
		}		
	}
	
	public void fileOpen() {
		String str1 = "";
		String str2 = "";
		
		System.out.println("열기할 파일명을 입력하세요.");
		str1 = sc.nextLine();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(str1 + ".txt"));
			
			while ((str2 = br.readLine()) != null) {
				System.out.println(str2);
			}				
						
		} catch (FileNotFoundException e) {
			System.out.println("존재하지 않는 파일입니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(br != null) {				
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileEdit() {
		
		StringBuilder sb = new StringBuilder();
		String str1 = "";
		String str2 = "";
		String str3 = "";
		char ch = '\u0000';
		
		System.out.println("수정할 파일명을 입력하세요.");
		str1 = sc.nextLine();
		
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader(str1 + ".txt"));
			
			while ((str2 = br.readLine()) != null) {
				System.out.println(str2);
			}				

			while(true) {
				
				System.out.println("파일에 추가할 내용을 입력하세요.");			
				str3 = sc.nextLine();
				
				if(str3.equals("exit")) {
					System.out.println("내용 입력 끝");				
					break; 
				} else {				
					sb.append(str3 + "\n");
				}
			}
			
			System.out.println("변경된 내용을 파일에 추가하시겠습니까?");
			ch = sc.nextLine().charAt(0);

			if(ch == 'Y' || ch == 'y') {
				
				bw = new BufferedWriter(new FileWriter(str1 + ".txt", true));
				
				bw.write(sb.toString());
				
				bw.flush();
	
			}		
			System.out.println(str1 + ".txt" + "파일의 내용이 변경되었습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("존재하지 않는 파일입니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(br != null) {				
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
