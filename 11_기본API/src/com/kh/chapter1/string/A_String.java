package com.kh.chapter1.string;

public class A_String {

	public void method1() {
		// 문자열 리터럴과 new 문으로 생성된 문자열 비교 
		
		// str1, str2와 같이 리터럴로 값을 초기화 하게 되면 StringPool 영역에 값이 올라간다. 
		// StringPool 영역에는 중복되는 값이 존재할 수 없다. 
		// 기존에 존재하는 값이 있을 경우 존재하는 값의 주소값을 전달해준다. 

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println("str1 == str2 ? : " + (str1 == str2));
		System.out.println("str1 == str3 ? : " + (str1 == str3));
		System.out.println("str3 == str4 ? : " + (str3 == str4));
		System.out.println();
		
		// toString() => String 클래스에서 이미 오버라이딩 되어있다.
		System.out.println("str1 : " + str1.toString());		// toString 이 호출되는데 생략해도 됨
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println();
		
		//equals() => String 클래스에서 이미 오버라이딩 되어 있다. 
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println("str2.equals(str3) ? " + str1.equals(str3));
		System.out.println("str3.equals(str4) ? " + str1.equals(str4));
		System.out.println();
		
		//hashCode() => String 클래스에서 이미 오버라이딩 되어 있다.
		System.out.println("str1.hashCode() : " + str1.hashCode());
		System.out.println("str2.hashCode() : " + str2.hashCode());
		System.out.println("str3.hashCode() : " + str3.hashCode());
		System.out.println("str4.hashCode() : " + str4.hashCode());
		System.out.println();
				
		//진짜 주소값
		System.out.println("System.identityHashCode(str1) ? " + System.identityHashCode(str1));
		System.out.println("System.identityHashCode(str2) ? " + System.identityHashCode(str2));
		System.out.println("System.identityHashCode(str3) ? " + System.identityHashCode(str3));
		System.out.println("System.identityHashCode(str4) ? " + System.identityHashCode(str4));

		
			// 상속 override-Book에서 확인 : 문자열이 동일하면 해쉬코드는 동일하다.
			//		해쉬코드가 동일하면 그 다음 equals로 동등비교한다. 
			// 오브젝트에 있는 해쉬코드를 스트링 클래스에서 오버라이딩 한 것이다.  
			// 해쉬코드는 주소값이 아니라 객체를 구별할 수 있게 하는 ......
	}
	
	
	public void method2() {
		
		
		/*
		 *String 클래스에서 제공하는 함수들 사용
		 * JavaScript 배열 Array 객체 메소드, String 내장객체 메소드, Java의 String 객체 메소드 거의 대부분 일치 
		 * Oracle의 함수 > 문자처리함수, 위 메소드들과 일부 일치  
		 */
		String str = "Hello World";
		
		// 자동완성에서 메소드 보는 법
		// 메소드명([매개변수]) : 반환형
		
		// 1. charAt(int index) : char => 전달받은 index 위치의 하나의 문자만 추출해서 리턴
		char ch = str.charAt(3);
		
		System.out.println("ch : " + ch);
		
		// 2. concat(String str) : String => 전달받은 str과 원본 문자열을 하나로 합쳐 새로운 문자열을 생성 리턴
		String str2 = str.concat("!!!!!");
		String str3 = str + "!!!!!!!!!!!";		//concat 메소드와 동일한 결과 
		
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str : " + str);			// 원본 불변

		// 3. subString
		// str.substring(int beginIndex) : String 
		//			=> 문자열의 beginIndex 위치에서부터 끝까지 문자열을 새로 생성, 리턴
		// str.subSequence(int beginIndex, int endIndex) : String  
		//			=> 문자열의 beginIndex 위치에서부터 endIndex-1 까지의 문자열을 새로 생성, 리턴

		String str4 = str.substring(6);
		String str5 = str.substring(2, 6);
		
		System.out.println("str4 : " + str4);
		System.out.println("str5 : " + str5);
		System.out.println("str : " + str);
		
		// 4. replace(char oldChar, char newChar) : String 
		//		=> 문자열에서 old 문자를 new 문자로 변경된 문자열을 새로ㅅ 생성, 반환
		String str6 = str.replace('l', 'c');
		
		System.out.println("str6 : " + str6);
		System.out.println("str : " + str);
		
		// 5. toUpperCase() / toLowerCase() : String
		//		=> 문자열을 모두 대/소문자로 변경한 새로운 문자열을 생성, 리턴
		String str7 = str.toUpperCase();
//		String str8 = str.toLowerCase();
		
		System.out.println("str7 : " + str7);
//		System.out.println("str8 : " + str8);
		System.out.println("str8 : " + str.toLowerCase());
		System.out.println("str : " + str);
		System.out.println();
		
		// 6. trim() : String => 문자열의 앞 뒤 공백을 제거한 새로운 문자열 생성, 리턴
		str = " JAVA "; 		// 기존 str은 활동 중지, 나중에 GC가 수거
		
		System.out.println(str.trim());
		System.out.println(str);
		
		// 7. toCharArray() : char[] => 문자열의 문자들을 문자배열에 담아서 해당 배열의 주소값을 리턴
		
		str = "Hello";
		char[] arr = str.toCharArray(); 
		
		System.out.println(arr[0]);  // H 출력
		
		// 8. static valueOf([기본자료형, 문자배열, 객체]) : String => 입력받는 값들을 문자열로 변경해서 생성, 리턴
		
		String str8 = String.valueOf(true);				// 위의 str8과 중복 주의
		String str9 = String.valueOf(arr);
		String str10 = String.valueOf(3.1415f);
		
		System.out.println("str8 : " + str8);	
		System.out.println("str9 : " + str9);
		System.out.println("str10 : " + str10);
		
		
		// 9. 구분자를 이용하여 문자열을 분리
		// 	 	String 클래스의 split 메소드를 이용하는 방법
		// 		split(string regex) : String[] => 입력받은 구분자로 문자열을 분리 문자열 배열로 담아 리턴

		String str11 = "Java, Oracle, JDBM, HTML, CSS, Spring";
						
		String[] arr2 = str11.split(",");
		
		System.out.println("분리 후 문자열의 개수 : " + arr2.length);
		
		for (String a : arr2) {
			System.out.println(a);
		}

		
		
		
	}
}


