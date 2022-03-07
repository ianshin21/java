package com.kh.chapter1.client.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// 클라이언트용 TCP 소켓 프로그래밍 순서




public class Client {
	
	public void clientStart() {
		// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		int port = 30027;
		String str = null;
		String serverIP = null;
		Socket socket = null;
		
		
		try {
			serverIP =InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIP);
//			serverIP = "192.168.20.2";
			// 서버와 연결이 실패한다면 null을 반환한다. 
			socket = new Socket(serverIP, port);
			
			if(socket != null) {
				// 2. 서버와의 입출력 스트림 오픈
				InputStream is = socket.getInputStream(); // 서버로부터 값을 입력받을 스트림
				OutputStream os = socket.getOutputStream(); // 서버로 값을 출력하는 스트림
				
				// 3. 보조 스트림을 통해 성능 개선
				BufferedReader br = new BufferedReader(new InputStreamReader(is)); // 서버로부터 값을 입력받을 스트림
				PrintWriter pw = new PrintWriter(os, true);				// 서버로 값을 출력하는 스트림

				// 4. 스트림을 통해 읽고 쓰기
				Scanner scanner = new Scanner(System.in);
				
				do {
					System.out.println("서버에 보낼 내용");
					str = scanner.nextLine();
					
					pw.println(str);    
	//				pw.flush();			// PrintWriter pw = new PrintWriter(os);	
					
					if(null == str || "exit".equals(str)) {
						System.out.println("여기는 client 접속 종료");
						
						break;
					}
					
					String message = br.readLine();
					System.out.println("받은 메세지 : " + message);
				} while (true);
					
				// 5. 통신 종료
				pw.close();
				br.close();
				socket.close();
				
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
