package com.kh.chapter1.server.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 클ㄹ라이언트와 통신을 위한 thread 구현
public class Receiver implements Runnable {
	
	// Thread에서 사용할 인스턴스 변수 선언 
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;
	

	public Receiver() {
	}

	public Receiver(Socket client) {
		
		try {
			this.client = client;
			this.br = new BufferedReader(new InputStreamReader(client.getInputStream()));	// 클라이언트로부터 값을 입력받을 스트림
			this.pw = new PrintWriter(client.getOutputStream(), true);						// 클라이언트로 값을 출력하는 스트림
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//스레드 처리 작업
	// 	- 초기화된 인스턴스 변수들을 사용하여 클라이언트와 통신하는 지갑을 지님
	//	- 한번만 출력 할 것이 아니기 때문에 무한 루프로 만들어준다. 

	@Override
	public void run() {
		
		try {
			while(true) {
				String message = br.readLine(); 	//클라이언터로부터 입력이 있을 때까지 블로킹된다. 멈춰있다.
				
				if(message == null || "exit".equals(message)) {
					System.out.println("여기는 receiver 접속 종료!!");
					
					break;
				} else {
					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메시지 : " + message);
					pw.println("메세지 받기 성공");
	//				pw.flush();
				}
			}
		

			br.close();
			pw.close();
			client.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
