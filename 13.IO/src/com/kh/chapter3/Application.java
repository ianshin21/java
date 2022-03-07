package com.kh.chapter3;

import com.kh.chapter3.charstream.FileCharStream;

public class Application {

	public static void main(String[] args) {
		
		new FileCharStream().fileSave();
		new FileCharStream().fileRead();
	}

}
