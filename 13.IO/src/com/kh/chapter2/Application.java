package com.kh.chapter2;

import com.kh.chapter2.bytestream.FileByteStream;

public class Application {

	public static void main(String[] args) {
		
		new FileByteStream().fileSave();
		new FileByteStream().fileRead();

	}

}
