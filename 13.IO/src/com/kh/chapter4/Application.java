package com.kh.chapter4;

import com.kh.chapter4.assiststream.A_BufferedStream;
import com.kh.chapter4.assiststream.B_ByteToSteam;
import com.kh.chapter4.assiststream.C_DataStream;
import com.kh.chapter4.assiststream.D_ObjectStream;

public class Application {

	public static void main(String[] args) {
//		new A_BufferedStream().fileSave();
//		new A_BufferedStream().fileRead();
		

//		new B_ByteToSteam().input();
//		new B_ByteToSteam().output();
		
//		new C_DataStream().flieSaveAndRead();
		
		new D_ObjectStream().fileSave(); 
		new D_ObjectStream().fileRead();
		new D_ObjectStream().obejectsSave();
		new D_ObjectStream().obejectsRead();
	}

}
