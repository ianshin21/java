package com.kh.chapter1.server.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.chapter1.server.thread.Receiver;

public class Server {
	
	public void serverStart() {
		// 1. 포트 번호 지정
		// 	- 0 ~ 1023 시스템에서 사용하는 포트 번호
		//	- 1024 ~ 65535 사이의 포트 번호를 사용하는 것을 추천
		int port = 30027;
		int clientCnt = 0;
		
		// 2. 서버용 소켓 객체 생성
		ServerSocket server = null;

		try {
			
			server = new ServerSocket(port);
			
		// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림	
			System.out.println("서버 시작 ....");
			
			while(true) {
				
				// 4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
				System.out.println("클라이언트 대기 중");
				Socket client = server.accept();
				System.out.println(++clientCnt + "번째 클라이언트 연결됨...");
				
				Thread receiver = new Thread(new Receiver(client));
				
				receiver.start();
				
				
//				//5. 연결된 클라이언트와 입출력 스트림 생성
//				InputStream is = client.getInputStream(); // 클라이언트로부터 값을 입력받을 스트림
//				OutputStream os = client.getOutputStream(); // 클라이언트로부터 ㄱㅄ을 출력하는 스트림 
//				
//				//6. 보조 스트림을 통해 성능 개선
//				BufferedReader br = new BufferedReader(new InputStreamReader(is)); 
//				PrintWriter pw = new PrintWriter(os, true);
//				
//				//7. 스트림을 통해 읽고 쓰기
//				while(true) {
//					String message = br.readLine(); //클라이언터로부터 입력이 있을 때까지 블로킹된다. 멈춰있다.
//					
//					if(message == null || "exit".equals(message)) {
//						System.out.println("접속 종료!!");
//						
//						break;
//					} else {
//						System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메시지 : " + message);
//						pw.println("메세지 받기 성공");
////						pw.flush();
//					}
//				}
//				//8. 통신 종료
//				br.close();
//				pw.close();
//				client.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}






