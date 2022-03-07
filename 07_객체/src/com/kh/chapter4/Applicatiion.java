package com.kh.chapter4;

import com.kh.chapter4.constructor.User;

public class Applicatiion {

	public static void main(String[] args) {

		// 1. 기본 생성자로 객체 생성
		User user = new User();

		// " User () : 기본 생성자 호출" 자동 출력

		System.out.println(user.information());
		// jvm에 의해 설정된 초기화값(null) 출력됨.

//		user.setName(name); 
//		user.setAge(age);		
//		이렇게 setter로 일일이 값 입력하려면 번거롭다. => 매개변수 있는 생성자 만든다.

		// 2. 매개변수 3개짜리 생성자로 객체 생성
		// 아래와 같이 아이디, 비밀번호, 이름을 객체 생성과 동시에 초기화 할 수 있다.
		User user2 = new User("ismoon", "123", "insumoon");

		System.out.println(user2.information());

		// 3.매개변수 5개 짜리 생성자로 객체 생성
		User user3 = new User("Kong", "4675", "공원상", 19, '남');

		System.out.println(user3.information());

		// 생성자도 기본 생성자 말고 다양한 생성자를 만들 수 있다.
		// 생성자 오브로딩을 통해 ~~~

	}

}
