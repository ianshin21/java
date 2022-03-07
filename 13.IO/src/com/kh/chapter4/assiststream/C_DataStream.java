package com.kh.chapter4.assiststream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_DataStream {
	
	// 기본 타입 입출력 보조 스트림
	//  - 데이터를 읽고 쓰는데 있어서 byte단위가 아닌 기본자료형의 크기로 읽고 쓸 수 있다. 
	//  - 단, 각 기본자료형의 크기가 다르기 때문에 출력한 데이터를 다시 읽어올때는 동일한 순서로 읽어와야 한다.
	public void flieSaveAndRead() {
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt"));
				DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"))) { // 기반스트림
			
			// 파일에 출력하고
			dos.writeUTF("김예슬");
			dos.writeInt(28);
			dos.writeChar('F');
			dos.writeBoolean(true);
			dos.writeDouble(166.6);   // 입력한 순서대로 출력해줘야 한다!!!!!
			
			// 파일에서 값을 읽어온다. 데이터 크기가 얼마인지 알 수 없으니까 반복문 사용
			while (true) {
				System.out.println("이름은 " +  dis.readUTF() +   // 입력한 순서대로 첫번째가 다른거면 안된다.
									", 나이는 " + dis.readInt() + 
									", 성별은 " + dis.readChar() + 
									", 살아있나요 " + dis.readBoolean() + 
									", 키는 " + dis.readDouble());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		// IOException이 FileNotFoundException과 EOFException의 부모 클래스라서 
		//     이들을 커버 할 수는 있으나 어떤 에러가 났는지 구체적으로 알기 위해 모두 밝혀준다.
		//		최상위 예외는 항상 마지막에 위치하도록
		
	}
}
