package com.kh.hr.controller;

import com.kh.hr.model.vo.Person;

// controller : view(화면)에서 사용자가 요청한 것들을 처리해주는 기능용 클래스
public class PersonController {
	
	private Person[] people = new Person[3]; // 우선 세명의 회원 정보를 관리하기 위한 객체 배열 세팅 
	
	private int count = 0; // 현재 추가된 사람 수를 나타내는 변수
	
	// 전달받은 회원의 이름, 나이, 재산을 가지고 Person 객체 생성 후 해당 배열에 초기화 시켜주는 메소드
	public void insertPerson(String name, int age, int wealth) {
		
		people[count++] = new Person(name, age, wealth);

		if(count < people.length) { 
			System.out.println("추가 가능");
		}else { 
			System.out.println("추가 안 됨.");
		}
		
//		count++;
	}
	
	// 현재 회원들의 정보가 담겨있는 배열 반환해주는 메소드 
	public Person[] getPeople() {
		return people;
	}
	
	
	// 현재 회원이 몇명 존재하는지 반환해주는 메소드
	public int getCount() {
		return count;
	}
	
	// 전달받은 검색어로 검색된 회원 객체를 반환해주는 메소드 (단, 검색된 회원이 없을 경우 null을 반환함)
	public Person searchPerson(String search) {
		for(int i=0; i<count; i++) {
			if(people[i].getName().equals(search)) {
				// 동일한 이름의 회원 객체 return
				return people[i];
			}
		}
		
		return null;
		
	}

}
