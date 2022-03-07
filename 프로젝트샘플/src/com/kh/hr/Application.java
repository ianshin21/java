package com.kh.hr;

import com.kh.hr.view.PersonMenu;

public class Application {

	public static void main(String[] args) {
		// MVC 패턴 익히기 수업! 
		// Model : 데이터를 담당하는 역할
		// View  : 사용자의 시각적인 요소를 담당하는 역할 (화면같은것)  --> 사용자에게 출력을 해준다거나, 사용자로부터 값을 입력받는 구문들을 진행할 예정
		// Controller : 사용자가 요청하는 기능을 처리해주는 역할 
		
		/*
		 *  Application	->   View  		 -> 	 Controller
		 *  첫화면 실행			출력및입력 		요청		사용자의 요청을 처리해줌
		 *  							<--
		 *  				결과출력		 요청 처리결과 반환
		 */
		
		// Application은 단지 실행만 시켜주는 스위치와 같은 역할을 함
		new PersonMenu().mainMenu();
	}

}
