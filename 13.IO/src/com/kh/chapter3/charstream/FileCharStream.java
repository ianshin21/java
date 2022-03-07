package com.kh.chapter3.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream {

	public void fileSave() {
		System.out.println("fileSave() 호출 !");

		// try ~ with ~ resource : finally에서 작성했던 close 처리를 try문에서 자동 close 처리
		// FileByteStream의 문법과 비교
		try (FileWriter fw = new FileWriter("b_char.txt", true)) {

			fw.write("원상님 IO 재있으신가요?");
			fw.write("토나오신다구요...");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');

			char[] arr = { 'a', 'p', 'p', 'l', 'e' };

			fw.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("실행완료~!");
		}
	}

	public void fileRead() {
		System.out.println("fileRead() 호출~!");

		try (FileReader fr = new FileReader("b_char.txt")) {
			int value = 0;

			while ((value = fr.read()) != -1) {
				System.out.print((char) value);
			}
			
//			while (fr.read() != -1) {
//			System.out.print((char) fr.read());
//			
//		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("fileRead() 실행완료~!");
		}

	}

}

	
