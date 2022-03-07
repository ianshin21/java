package com.kh.chapter2.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chapter2.set.model.vo.Music;

public class A_HashSet {
	
	public void method1() {
		Set<String> set = new HashSet<>();
		
		set.add("반갑습니다.");			// 스트링풀에 저장됨
		set.add(new String("반갑습니다."));	// 힙영역에 저장됨 : 서로 주소가 달라도 equals() 까지 비교하므로 ...
		set.add("여러분");
		set.add("안녕하세요.");
		set.add("여러분");
		
		// 저장 순서가 유지되지 않음 
		// 중복된 데이터가 제거 됨
		// 	- String 클래스에는 hashcode(), equals() 메소드가 오버라이딩 되어있다.
		//		hash 함수 : hashcode() 메소드로 확인 후 같으면 equals() 메소드로 다시 확인 
		//  - 실제 필드값이 동일한 경우 동일 객체로 인식되기 때문에 저장되지 않는다. 
		System.out.println(set);
		
		// Set에 저장된 객체에 접근하는 방법 (출력?)
		// 1. 향상된 for문 사용 (Set에는 index가 없다 그러나 이 for문은 index로 접근하는 게 아니기 때문에 가능)
		for (String str : set) {
			System.out.println(str);
		}
		
		// 2. HashSet에 저장된 객체들을 ArrayList에 담아서 출력하는 방법 
		//		잘 사용 안함 ArrayList 만들면 되지.  그냥 이런 방법도 있다
		// 다형성 적용 확인요?
		List<String> list = new ArrayList<>(set);
		
		for(int i= 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 3. iterator 반복자를 사용하는 방법 
		// 		- 가져올 객체가 있는지 확인 할 때는 hasNext() 메소드를 사용한다.
		//		- 하나의 객체를 가져올 때는 next() 메소드를 사용한다. 
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
	}
	
	public void method2() {
		
		Set<Music> set = new HashSet<Music>();
		
		set.add(new Music("Dynamite", "BTS",2));
		set.add(new Music("Dynamite", "BTS",2));
		set.add(new Music("눈의 꽃", "박효신", 3));
		set.add(new Music("눈누난나", "제시", 1));
		set.add(new Music("테스형", "나훈아", 5));
		set.add(new Music("Ice Cream", "BlackPink", 4));
		set.add(new Music("Ice Cream", "BlackPink", 4));
		
		System.out.println(set);  
				// 중복제거가 되지 않음  -> 주소값이 다르다. hashCode부터 다르다. -> 동일한 객체가 되도록 만들어 줘야. 
				// hashCode(), equals() 메소드를 오버라이딩으로 재정의 해줘야 함 번거롭지만서도 ㅉㅉㅉ
				// 기본적으로 Object 객체에 있는 hashCode(), equals() 메소드를 사용하게 된다 
				// 객체의 주소값을 가지고 비교하기 때문에 인스턴스변수의 값과 상관없이 모두 다른 객체로 인식해서 중복이 제거되지 앟ㄴ는다. 
				// Music 클래스에서 hashCode(), equals() 메소드를 재정의, 오버라이딩 해줘야 한다 
	
		Iterator<Music> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());			
		}

	}
}



























