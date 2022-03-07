package com.kh.chapter2.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStream {

	public void fileSave() {
		// FileOutStream을 사용, 파일 생성하고 데이터를 저장

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("a_byte.dat", true); // true 가 있으면 계속 이어 쓰고 없으면 덮어쓰기

			fos.write(97); // a 저장
			fos.write('b'); // b
			fos.write(10); // 줄바꿈 문자
			fos.write('한'); // 2바이트짜리 이므로 깨져서 저장되고 정상 출력 안됨

			byte[] arr = { 99, 100, 101 }; // c d e

			fos.write(arr);
			fos.write(arr, 1, 2); // d e
			fos.write(10); // 줄바꿈 문자
			
			System.out.println();
			fos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				// 스트링을 다 이용했으니 닫아주기! 반드시
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileRead() {

		// FileInputStream을 사용해서 파일에서 데이터 읽어오기

		FileInputStream fis = null;

		try {

			fis = new FileInputStream("a_byte.dat");

			/*
			 * // 파일로 부터 데이터를 읽어 올 때는 read() 메소드를 사용하면 된다. 실제로 파일에는 얼마만큼의 데이터가 있는지 알 수가 없다.
			 * 그런데 read 메소드는 파일의 끝을 만나는 순간 -1 이라는 값을 리턴한다. => 반복문을 통해서 read 메소드에서 -1이 반환되기
			 * 전까지 데이터를 읽어오면 되겠다.
			 */
//			byte[] arr = new byte[100];
//			System.out.println(fis.read());
//			System.out.println(fis.read(arr));
//			System.out.println(fis.read());

			// read가 두 번 실행되기 때문에 정상적으로 값을 출력할 수 없다
			
			
//			while(fis.read() != -1) {
//				System.out.println(fis.read());
//			}

			int value = 0;

			while ((value = fis.read()) != -1) {
				System.out.print((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				// 스트링을 다 이용했으니 닫아주기! 반드시
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
