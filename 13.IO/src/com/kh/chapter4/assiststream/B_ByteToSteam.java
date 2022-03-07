package com.kh.chapter4.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_ByteToSteam {
	// 기반스트림이 Byte 스트림이고!! ===>>> System.in, System.out
	// 보조스트림이 Char 스트림인 경우 사용한다.
	// 여기서는 (파일 -> 입력/Reader -> 프로그램 -> 출력/Writer -> 파일) 과 동일하게  
	//		  (키보드 -> 입력/Reader -> 프로그램 -> 출력/Writer -> 모니터/콘솔)
	
	public void input() {
		// System.in을 InputStreamReader를 사용해서 문자 기반으로 변경 사용자로부터 입력을 받고 출력한다.
		// 아래와 같이 보조 스트림 여러개 사용하는 것도 가능하다.

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){   
																// 컨트롤 + 1 자동완성
			String value = null;
			
			System.out.print("문자열 입력 : ");
			
			value = br.readLine();
			
			System.out.println("value : " + value);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void output() {
// 		System.Out을 OutputStreamWriter를 사용해서 문자 기반으로 변경하고 콘솔에 출력한다.
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write("난 이제 지쳤어요 땡벌떙벌");
			bw.newLine();
			bw.write("앞으로 Oracle, JDBC, Html, css, JavaScript, .... 남았다");
			bw.newLine();
			bw.write("화이팅");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
