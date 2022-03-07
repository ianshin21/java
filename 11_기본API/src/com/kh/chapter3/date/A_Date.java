package com.kh.chapter3.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class A_Date {
	
	public void method1() {
		
		// java.util.Date;
		// Date 클래스로 날짜, 시간을 어떻게 처리하는지 
		
		// default constructor는 현재 시간에 대한 정보를 가지고 객체를 생성한다.
		Date today = new Date();
		
		System.out.println(today);
		
		// 1970년 1월 1일 00시를 기준으로 밀리세컨드 단위로 표기된다. 
		// 한국시간 (KST)로 출력될 때는 GMT 보다 + 9시간
		Date when = new Date(1);			

//		Date when = new Date(1000L);			// 1000 밀리세컨드 = 1 세컨드
		
		System.out.println(when);
		
		// Deprecated 된 constructor를 사용한 Date 객체 생성
		Date when2 = new Date((2020 - 1900), (10 - 1) , 20);		// 이런 게 있었는데 이젠 안 쓴다. 
		
		System.out.println(when2);
		
		System.out.println(today.getTime()); 
		System.out.println(today.getYear() + 1900);
		System.out.println(today.getMonth() + 1);
		System.out.println(today.getDate());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());
		
		//SimpleDateFormat 클래스 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");   
									// yyyy년 MM월 dd일 hh시간 mm분 ss초   형식은 좋을대로
		String formatDate = sdf.format(today);	
		
		System.out.println(formatDate);
		System.out.println(sdf.format(today));
		
		System.out.println("=====================================");
		System.out.println();
		
	}
	
	
	public void method2() {
		/*
		 * Date는 대부분의 메소드가 Deprecated 되었다. 단순히 특정 시점의 날짜 정보를 저장하는 역할만 한다.
		 * 날짜와 시간을 조작하거나 비교하는 기능이 불충분하다. 
		 * 자바 8부터는 날짜와 시간을 나타내는 java.time 패키지를 제공한다. 
		 * b_backend\02_JSP\header.jsp 에서 java.time 패키지 사용
		 * b_backend\05_EL_JSTL\fmt.jsp 에서 java.util.Date 객체 사용
		 * Spring homeController 에서는 java.text.DateFormat/java.util.Date/java.util.Locale;
		 * javaScript 내장객체 Date 객체		
	    */
		
		LocalDateTime today = LocalDateTime.now();		// 아무대서나 객체 못 만들게 
		LocalDateTime when = LocalDateTime.of(2020,  5, 25, 22, 28, 38, 25);
		LocalDate date = LocalDate.now();
//		LocalTime time = LocalTime.now();
		
		
		System.out.println(today);
		System.out.println(when);
		
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getHour());
		System.out.println(today.getMinute());
		System.out.println(today.getSecond());
		
		LocalDateTime plusDays = today.plusDays(1);
		LocalDateTime minusDays = today.minusDays(1);
		
		System.out.println(today);
		System.out.println(plusDays);
		System.out.println(minusDays);
		
		System.out.println("today.isAfter(plusDays) ? " + today.isAfter(plusDays));
		System.out.println("today.isAfter(minusDays) ? " + today.isAfter(minusDays));

		System.out.println("today.isBefore(plusDays) ? " + today.isBefore(plusDays));
		System.out.println("today.isBefore(minusDays) ? " + today.isBefore(minusDays));

//		LocalDate localDate = today.toLocalDate();
//		System.out.println(localDate);
		
		System.out.println(today.toLocalDate());
		System.out.println(today.toLocalTime());
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(today.format(ofPattern));
	}
	

}
