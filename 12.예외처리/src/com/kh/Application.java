package com.kh;

import java.io.IOException;

import com.kh.exception.A_TryCatch;
import com.kh.exception.B_Throws;
import com.kh.exception.D_UnCheckedException;
import com.kh.exception.E_CheckedException;

public class Application {

	public static void main(String[] args) throws IOException, Exception {
		
//		new A_TryCatch().methodA();
//		new B_Throws().methodA();
//		new D_UnCheckedException().method1();
//		new D_UnCheckedException().method2();
		new E_CheckedException().method1();
	}

}
