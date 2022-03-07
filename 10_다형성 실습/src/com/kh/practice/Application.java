package com.kh.practice;

import com.kh.practice.model.vo.GalaxyNote9;
import com.kh.practice.model.vo.SmartPhone;
import com.kh.practice.model.vo.V40;

public class Application {

	public static void main(String[] args) {

		SmartPhone[] pArray = new SmartPhone[2];
		
		pArray[0] = new GalaxyNote9();
		pArray[1] = new V40();
		
		for (int i = 0; i < pArray.length; i++) {
			pArray[i].printMaker();
			pArray[i].makeCall();
			pArray[i].takeCall();
			pArray[i].touch();
			pArray[i].charge();
			pArray[i].picture();
			
			System.out.println();
		}
		
	}

}
