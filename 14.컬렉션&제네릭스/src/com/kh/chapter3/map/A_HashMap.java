package com.kh.chapter3.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chapter3.map.model.vo.Snack;

public class A_HashMap {

	public void method1() {
		
		Map<String, Snack> map = new HashMap<>();     // 다형성 Map이 HashMap의 부모
		
		// 저장 순서 유지 되지 않음
		// 키 값 중복 허용하지 않음 , 중복된 키값으로 저장하면 기존에 있던 값을 덮어쓴다. 
		// value 값은 중복되어도 잘 저장된다.
		map.put("다이제", new Snack("초코맛", 1150));  // 이렇게 한 세트로 엔트리 라는 객체로 묶인다. 
		map.put("칸초", new Snack("바나나맛", 260));
		map.put("프링글스", new Snack("어니언맛", 500));
		map.put("프링글스", new Snack("짠맛", 500));
		map.put("나쵸", new Snack("짠맛", 500));
		
		System.out.println(map);
		
		// Map 컬렉션에서 키값에 해당하는 value를 가져오는 메소드
		Snack snack = map.get("다이제");		
		System.out.println(snack);
		
		
		// Map 컬렉션에 담겨있는 객체의 개수를 가져오는 메소드
		System.out.println("개수 : " + map.size());
		
		map.remove("나쵸");
		
		System.out.println(map);
		System.out.println(map.isEmpty());
		
		map.clear();
		
		System.out.println(map);
		System.out.println(map.isEmpty());		
		
		System.out.println("=================================");
		System.out.println();
		
	}
	
	public void method2() {
		
	Map<String, Snack> map = new HashMap<>();     // 다형성 Map이 HashMap의 부모
		
		map.put("다이제", new Snack("초코맛", 1150));  // 이렇게 한 세트로 엔트리 라는 객체로 묶인다. 
		map.put("칸초", new Snack("바나나맛", 260));
		map.put("프링글스", new Snack("어니언맛", 500));
		map.put("나쵸", new Snack("짠맛", 500));
		map.put("포테이토칩", new Snack("겁나 짠맛", 200));
		map.put("허니버터", new Snack("꿀버터맛", 600));
		
		// Map도 인덱스의 개념이 없어서 반복문을 for문,  향상된 for문 사용할 수 없다. 
//		for (Entry<String, Snack> i : map) {			
//		}
		
		// List랑 Map 구조(계열) 달라서 ArrayList에 담아서 출력하는 것도 사용할 수 없다. 
//		List<Entry<String, Snack>> list = new ArrayList<>(map); 
	
		// 1. keySet() 이용하는 방법
		// 	- keySet() 메소드는 Map 컬렉션에 있는 키값들만 Set 컬렉션에 담아서 반환한다. 
		//  - 반환된 Set 컬렉션에서 반복자 받아오기 
		//  - 반복문을 통해서 요소별로 처리해야할 코드 작성 
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			
			System.out.println("Key : " + key);
			System.out.println("Value : " + map.get(key));			
		}
		
		
		// Set으로 변경하게 되면 반복자를 사용하지 않고 아래와 같이 향상된 for문을 통해서도 출력이 가능하다. 
//		for (String key : keySet) {
//			System.out.println("Key : " + key);
//			System.out.println("Value : " + map.get(key));			
//		}
		
		System.out.println("===========================================");

		// 2. entrySet() 이용하는 방법
		// 		- entrySet()은 Map 컬렉션에 있는 Entry 객체 (key, value의 쌍으로 이루어진)를 Set 컬렉션에 담아서 반환한다. 
		//   	- 반환된 Set 컬렉션에서 반복자 얻어오기
		//		- 반복문을 통해서 요소별로 처리해야할 코드 작성 
		
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println("key ; "+ key);
			System.out.println("value : " + value);
						
		}
		
		// Set으로 변경하게 되면 반복자를 사용하지 않고 아래와 같이 향상된 for문을 통해서도 출력이 가능하다. 
//		for (Entry<String, Snack> entry : entrySet) {
//			System.out.println("Key : " + entry.getKey());
//			System.out.println("Value : " + entry.getValue());			
		
		System.out.println("===========================");
		System.out.println();
	
	}
}



























