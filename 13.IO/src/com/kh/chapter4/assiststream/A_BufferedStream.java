package com.kh.chapter4.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_BufferedStream {
	/*
	 *  보조스트림
	 *   - 단독으로 외부매체(파일, 네트워크, 키보드, 모니터 등)와 데이터를 주고 받을 수 없다.
	 *   - 기반스트림(Input/OuputStream, Reader/Writer)을 먼저 생성하고 보조스트림을 연결해줘야한다.
	 *   
	 *   성능 향상 보조스트림
	 *    - 기반스트림의 속도를 향상 시켜주는 기능을 한다.
	 *    - 기반스트림에 대한 레퍼런스가 필요하다.
	 *    - 버퍼라는 공간을 사용해서 속도 향상에 도움을 준다. (버퍼라는 공간에 데이터를 쌓아 놨다가 한번에 입/출력 시킨다.)
	 *    -  기반 스트림에서 제공하지 않는 메소드 : .newLine(), readLine()
	 *    - 기반 스트림  FileWriter, FileReader 를 사용할 때와 별 차이가 없어 보임
	 *    	사용 방법 완전히 동일 버퍼더 메소드 추가 된 것 외에
	 */
	
	 public void fileSave() {
		 System.out.println("fileSave() 호출");
		 
		 // try ~ with ~ resource를 통해서 자동으로 flush() close()가 호출된다.
		 try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt", true))) {// 기반스트림 생성
			 
//			 FileWriter fw = new FileWriter("c_buffer.txt", true);
//			 (BufferedWriter bw = new BufferedWriter(fw);
			 
			 bw.write("안녕하세요. \n");
			 bw.write("난 이제 지쳤어요 땡벌떙벌 \n");
			 bw.newLine();  // 기반 스트림에서 제공하지 않는 메소드, 개행할 때 사용한다.  =>  \n 역활을 한다.
			 bw.write("겜 하고 싶어");
			 bw.newLine();
			 bw.write("공부해야지");
			 
		 } catch (IOException e) {
			 e.printStackTrace();
		 } finally {
			 System.out.println("fileSave() 실행 완료!");
		 }
		 
		
	 }
	 
	 public void fileRead() {
		 System.out.println("fileRead() 호출~!");
		 
		 try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			 
//			 FileReader br = new FileReader("c_buffer.txt"); 
			 
			 String value = null;				// 문자를 리턴한다
			 
			 // 기반 스트림에서 제공하지 않는 메소드, 파일에서 한 줄을 읽어올 때 사용한다. 
			 while((value= br.readLine()) != null) {  // 읽을 값이 있을때까지를 표현
				 System.out.println(value);  // ln 삭제....  문자열이라 형변환 필요 없다.
			 }
		 } catch (FileNotFoundException e) {
			 e.printStackTrace();
		 } catch (IOException e) {
			 e.printStackTrace();
		 } finally {
			 System.out.println("fileRead() 실행 완료!");
		 }
	 }
}
