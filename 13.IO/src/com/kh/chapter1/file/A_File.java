package com.kh.chapter1.file;

import java.io.File;
import java.io.IOException;

public class A_File {
	
	public void method1() {
		// File 클래스 테스트 
		
		try {
			//경로를 지정하지 않으면 현재 프로젝트 폴더에 파일이 생성된다. 
			
			File file = new File("test.txt");  //메모리상에만 존재하는 객체
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("상대경로: " + file.getPath());
			System.out.println("파일용량: " + file.length());
			System.out.println("파일 존재 여부 : " + file.exists());

									// 실제 파일이만들어지기전에도 위 정보는 있다.
			file.createNewFile();	//메소드를 실행해야만 실제 파일이 만들어진다.
			
			//존재하는 경로까지 지정해주면 해당 위치에 파일을 생성한다.
			// 만약에 없는 경로를 제시하면 IOException 발생			
			File file2 = new File("C:/Users/kim/test2.txt");
			
			file2.createNewFile();	
			
			// 폴더 만들고 파일 생성하기 
			// 아래와 같이 없는 경로에 파일을 생성할 수 없다.  / 폴더 따로, 파일 따로 만들어야 한다.
//			File file3 = new File("C:/kim/temp/test3.txt");
//			file3.createNewFile();	
//			file3.mkdir();
			
			// 폴더 만들기 
			File tempFolder = new File("C:/Users/kim/temp");
			
			tempFolder.mkdir();

			//파일 만들기
			File file3 = new File("C:/Users/kim/temp/test3.txt");

			file3.createNewFile();	
			
			System.out.println("파일 존재 여부 : " + file2.exists());
			System.out.println("파일 존재 여부 : " + file3.exists());
			System.out.println("tempFolder.isDirectory() ? " + tempFolder.isDirectory());
			System.out.println("file3.isFile() ? " + file3.isFile());
			System.out.println("file3.isFile() ? " + file3.isDirectory());


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
