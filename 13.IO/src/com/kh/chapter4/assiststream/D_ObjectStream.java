package com.kh.chapter4.assiststream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chapter4.assiststream.model.vo.Member;

public class D_ObjectStream {

	public void fileSave() { // 직렬화를 해줘야 오류가 안난다.

		Member member = new Member("ismoon", "1234", "문인수", "ismoon@iei.co.kr", 20, 'M', 1250000);

		// 객체를 파일에 출력할 때 사용되는 스트림
		// FileOutputStream : 파일 출력에 사용되는 기본 바이트스트림 클래스
		// ObjectOutputStream : 객체 단위로 출력시 사용되는 보조 바이트스트림 클래스

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_object.dat"))) {
			System.out.println("객체 입력 전");
			oos.writeObject(member);		// FileOutputStream 에서는 write에 Object 항묵이 없다. 객체를 입력할 수 없다. 
			System.out.println("객체 입력 후");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {

		// 객체를 파일에서 읽어올 때 사용되는 스트림
		// FileInputStream : 파일롤부터 데이터를 읽어 들이기 위해 사용되는 기본 바이트스트림 클래스
		// ObjectInputStream : 스트림으로부터 객체 단위로 읽기 위해 사용되는 보조 바이트스트림 클래스

		try {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_object.dat"));

			System.out.println("객체 읽기 전");
			Member member = (Member) ois.readObject();

			System.out.println(member);
			System.out.println("객체 읽은 후");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public void obejectsSave() {
		
		// Member 객체를 배열에 담아 반복문을 통해서 파일에 저장
		Member[] members = {
				new Member("ismoon", "1234", "문인수", "ismoon@iei.co.kr", 20, 'M', 1250000),
				new Member("kim", "5678", "김철수", "kim@naver.com", 18, 'M', 1000),
				new Member("hong", "98765", "홍길동", "hong@naver.com", 21, 'F', 12000)
		};
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f_object.dat"))) {
			System.out.println("객체 저장 전");
			
			for (Member member : members) {
				oos.writeObject(member);
				System.out.println(member.getName() + "객체 저장 완료");
				
			}
			System.out.println("객체 배열 저장 후");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void obejectsRead() {
		
		// 파일에 저장된 Member 객체를 읽어서 배열에 담아 각 객체의 toString 메소드 출력
		Member[] members = new Member[3];
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f_object.dat"))) {
			System.out.println("객체 배열 읽기 전");
			
			members[0] = (Member) ois.readObject();
			members[1] = (Member) ois.readObject();
			members[2] = (Member) ois.readObject();
			
			for(Member member : members) {
				
				System.out.println(member);
			}

			System.out.println("객체 배열 읽기 후");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}



























