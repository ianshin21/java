package com.kh.chapter1.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.chapter1.list.compare.TitleAscending;
import com.kh.chapter1.list.model.vo.Music;

public class A_ArrayList {

	public void method1() {
		//ArrayList에 기본자료형, 문자열, 저장 출력 테스트
		
		// ArrayList
		// 	- ArrayList를 생성하면 내부적으로 10칸짜리 객체를 저장할 수 있는 공간이 생성된다. 
		//	- 저장순서가 유지된다. 인덱스를 통해서 관리한다.
		// 	- 객체만 저장할 수 있고 null도 저장이 가능하다. 
		//	- 중복 저장도 허용한다. 
		
		List list = new ArrayList();
		
		
		list.add("안녕하세요");
		list.add(3.14);  // 오토박싱이 적용됨
		list.add(LocalDateTime.now());
		
		System.out.println("list : " + list);
		System.out.println("list : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			// 인덱스에 해당하는 값을 가져올 때는 get() 메소드를 사용한다.
			System.out.println("인덱스" + i + "번째 : " + list.get(i));
		}
		
		// list에서 값을 꺼내서 대입하기 위해서는 해당 자료형에 맞게 형변환을 해 주어야 한다.
		String str = (String) list.get(0);
		double d = (double) list.get(1);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		// 객체의 중복 저장을 허용한다. 
		list.add("안녕하세요");		
		System.out.println("list : " + list);
		
		// 원하는 인덱스 위치에 객체를 추가할 수 있다.
		list.add(2, 125000);		
		System.out.println("list : " + list);
				
		// 원하는 인덱스 위치에 객체를 변경할 수 있다.
		list.set(2, false);
		System.out.println("list : " + list);
		
		// 저장된 객체를 삭제할 때 remove() 메소드를 사용한다.
		list.remove(2);
		list.remove("안녕하세요");
		list.remove(3.14);
//		list.remove(new Double(3.14));   //내부적으로 equals 메소드 사용해서 위와 똑같이 실행된다.
//		list.remove("안녕하세요");
		System.out.println("list : " + list);
		System.out.println("list.isEmpty() ? : " + list.isEmpty());
		
		// 저장된 객체를 모두 삭제할 때 clear() 메소드를 사용한다.
		list.clear();
		System.out.println("list : " + list);     // 결과 값에 []는 null이 아니다. 
		System.out.println("list.isEmpty() ? : " + list.isEmpty());

	}
	
	public void method2() {
		
		// 리스트에 객체들을 정렬하는 것
		// 기본자료형, 문자열의 경우엔 Comparable 인터페이스가 내부적으로 구현되어있어 Collection.sort() 를 통해서 정렬이 가능
		// 사용자가 작성하는 클래스의 객체도 Collection.sort()  정렬이 가능하게 하고 싶으면 Comparable 인터페이스 구현해주면 된다.
		//      ㅡmethod3() 의 내용이다
		
		//제네릭스, <>  (type parameter)를 사용하는 이유
		// - 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용
		// - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환을 해 주지 않아도 된다.
		List<String> list = new ArrayList<String>();   
		List<Integer> list2 = new ArrayList<>();			// 타입 추론
		
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("mango");
		list.add("grape");
		
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);

		// 오름차순으로 리스트를 정렬하는 메소드이다. 
		// 1. 하나의 매개변수를 받는 sort() 메소드로 comparable 인터페이스를 구현하고 있는 요소를 가지고 있는 리스트를 인자로 줘야하다. 
		Collections.sort(list);
		System.out.println(list);

		// 내림차순으로 정려하기 위해서는 sort() 메소드를 통해 오름차순으로 정렬 후에 reverse() 메소드를 호출, 내림차순으로 정렬 가능. 
		Collections.reverse(list);		
		System.out.println(list);
		
		list2.add(7);
		list2.add(1);
		list2.add(8);
		list2.add(10);
		list2.add(3);
		list2.add(2);
		
		System.out.println(list2);
		
		Collections.sort(list2);		
		System.out.println(list2);

		Collections.reverse(list2);		
		System.out.println(list2);
	}
	
	public void method3() {
		//Music 객체를 list에 담아서 출력해보고 정렬해보자.
		// 우리가 만든 클래스의 객체를 순서대로 정렬해보자. 
		List<Music> list = new ArrayList<>();			// type parameter에 Music
		
		Music music1 = new Music("Dynamite", "BTS",2);
//		Music music1 = new Music();
//		music1 = new Music("Dynamite", "BTS",2);
		
		list.add(music1);
		list.add(new Music("Dynamite", "BTS",2));
		list.add(new Music("눈의 꽃", "박효신", 3));
		list.add(new Music("눈누난나", "제시", 1));
		list.add(new Music("테스형", "나훈아", 5));
		list.add(new Music("Ice Cream", "BlackPink", 4));
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println("======================");
		
		System.out.println(list);
		
		System.out.println("======================");

		Collections.sort(list);   // 이대로는 무엇을 어떻게 sort  하라는 것인지 알수 없기 ㄸ문에 Music  Comparable 인터페이스 구현
									// Music compareTo 메소드에서 가져옴		
		System.out.println(list);

		System.out.println("======================");
		
		// 오름차순으로 리스트를 정렬하는 메소드이다. 
		// 2. 두개의 매개변수를 받는 sort() 메소드로 첫번째 인자는 리스트 객체, 두 번째 인자는 리스트 내의 각 요소를 비교하는데 사용하게 될 
		//    Comparator 인터페이스를 구현할 객체를 넘겨준다. 
		//      Music에서 comparable 인터페이스 와는 상관이 없다. 
		Collections.sort(list, new TitleAscending());
		
		System.out.println(list);

		
		
		
	}
}

