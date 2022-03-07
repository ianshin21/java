package com.kh.chapter2.set;

import java.util.Set;
import java.util.TreeSet;

import com.kh.chapter2.set.model.vo.Music;

public class B_TreeSet {
	
	public void method1() {
		// 중복 제거
		// 저장 순서 유지 안됨 -> 오름차순으로 정렬
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("하하하");
		ts.add("나나나");
		ts.add("가가가");
		ts.add("다다다");
		ts.add("하하하");
		
		System.out.println(ts);
		
		// foreach문이나 Iterator 등을 사용해서 접근 출력해 보자
		
		
		
	}
	
	
	public void method2() {
		Set<Music> set = new TreeSet<>();    // TreeSet 으로 받아도 되고 Set으로 받아도 되고
		
		// add 할 때 애초에 어떤 정렬 기준으로 정렬 시킬지 Music에 comparable 인터페이스를 구현하지 않으면 
		//		ClassCastException이 발생
		// 저장순서 유지 안되지만 우리가 재정의한 compareTo() 메소드에 의해 오름차순으로정렬된다. 
		// 중복제거 같은 경우는 hashCode(), equals() 메소드를 가지고 판단해서 중복 제거
		set.add(new Music("Dynamite", "BTS",2));
		set.add(new Music("Dynamite", "BTS",2));
		set.add(new Music("눈의 꽃", "박효신", 3));
		set.add(new Music("눈누난나", "제시", 1));
		set.add(new Music("테스형", "나훈아", 5));
		set.add(new Music("Ice Cream", "BlackPink", 4));
		set.add(new Music("Ice Cream", "BlackPink", 4));
		
		System.out.println(set);

		for (Music music : set) {
			System.out.println(music);
			
		}
			
	} 

}
