package com.kh.stream.terminal_operations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.kh.stream.vo.Member;

public class C_Collect {

	/*
	 * 수집
	 * 	- 스트림 요소들은 필터링 또는 매핑한 후 요소들을 수집하는 최종처리 메소드인 collect()를 제공한다. 
	 *  - collect() 메소드를 사용하면 필요한 요소만 새로운 컬렉션으로 담아서 리턴 받을 수 있다.
	 * 
	 */
	
	public void method1() {
		List<Member> list = Arrays.asList(
				new Member("문인수", 20, "M"),
				new Member("이몽룡", 23, "M"),
				new Member("성춘향", 19, "F"),
				new Member("홍길동", 24, "M"),
				new Member("심청이", 17, "F")
		);
		
		list.stream()
				.filter(member -> member.getGender().equals("M"))
				.forEach(System.out::println);
		
//		List<Member> maleList = list.stream()
//						.filter(member -> member.getGender().equals("M"))
//						.collect(Collectors.toList());
//		
//		maleList.stream().forEach(member -> System.out.println(member));
		
//		List<Member> maleList = list.stream()
		list.stream()
				.filter(member -> member.getGender().equals("M"))
				.collect(Collectors.toList())
				.forEach(member -> System.out.println(member));		
		
		
//		list = new list()
//		
//		for() {
//			if(gender.eq("M")) {
//				list.add(0, element);
//			}
//		for() {
//
//		}    // 기존 방식으로 하면 이렇게 굉장히 복잡해진다. .....
		
		System.out.println();
		
		System.out.println("-----------------------------------------------");
		
//		HashSet<Member> femaleList = list.stream()
		Set<Member> femaleList = list.stream()
				.filter(member -> member.getGender().equals("F"))
				.collect(Collectors.toSet());
//				.collect(Collectors.toCollection(() -> new HashSet<>()));
//				.collect(Collectors.toCollection(HashSet::new));
		
		femaleList.stream().forEach(member -> System.out.println(member));
		
		System.out.println();
		System.out.println(femaleList);
		
		
		System.out.println("-----------------------------------------------");
	
		Map<String, String> map = list.stream()
				.collect(Collectors.toMap(member -> member.getName(), member -> member.getGender()));   
														// (키값=getName(), value=getGender())
		// Member에 int idx; 키값을 추가하고 이걸 키값으로 사용하면 됨 (키값=getIdx(), value=getName())
		
		System.out.println(map);
		
	
		Map<String, Member> memberMap = list.stream()
				.collect(Collectors.toMap(member -> member.getName(), member -> member));   
//				.collect(Collectors.toMap(member -> member.getName(), Function.identity()));   
		
		System.out.println(memberMap);
		
		
		System.out.println("-----------------------------------------------");

		
		Map<String, List<Member>> collect = list.stream()
				.collect(Collectors.groupingBy(member -> member.getGender()));
		
		System.out.println(collect);
		System.out.println(collect.get("F").get(0));
		System.out.println(collect.get("F"));
		System.out.println(collect.get("M"));
		
	}
}
