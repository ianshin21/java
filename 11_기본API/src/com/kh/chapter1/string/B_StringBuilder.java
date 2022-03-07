package com.kh.chapter1.string;

public class B_StringBuilder {

	public void method1() {
		
		// StringBuilder 생성자에 정수값을 전달해주면 해당 크기만큼의 수용량(버퍼)이 저장된다
		// StringBuilder의 기본생성자를 통해서 객체를 생성하면 16개의 문자를 저장할 수 있는 버퍼가 생성된다.
		// StringBuilder 생성자에 문자열을 전달해 주면 문자열의 크기 + 16의 수용량이 지정된다. 
		StringBuilder sb = new StringBuilder(30);
		StringBuilder sb2 = new StringBuilder("Hello");

		System.out.println("sb의 문자열의 길이 : " + sb.length());
		System.out.println("sb의 수용량 : " + sb.capacity());
		
		System.out.println("sb의 문자열의 길이 : " + sb2.length());
		System.out.println("sb2의 수용량 : " + sb2.capacity());

	}
	
	public void method2() {
		// 실제로 StringBuilder를 이용해서 문자열의 변경 진행
		String str = "안녕하세요. ";
		
		StringBuilder sb = new StringBuilder("안녕하세요. ");
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(sb));
		
		str += "저는 신이안입니다.";
		// 1. append(String str) : Stringbuiler => 기존 문자열 뒤에 입력된 문자열 추가하기
		sb.append("저는 신이안입니다.");
		
		System.out.println("sb : " + sb);		// sb.toString()
		System.out.println("str : " + str);
		
		System.out.println(System.identityHashCode(str));   // 이전 문자열은 가비지 컬렉터의 대상 
		System.out.println(System.identityHashCode(sb));	// 주소값의 변동이 없다. 같은 위치에서 원본을 바꾸어 썼다
		System.out.println("sb의 문자열의 길이 : " + sb.length());
		System.out.println("sb의 수용량 : " + sb.capacity());
		
		System.out.println("안녕하세요.".length());
		System.out.println("sb".length());
		
		sb.append("모두들 조금만 힘내세요!!");
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열의 길이 : " + sb.length());
		System.out.println("sb의 수용량 : " + sb.capacity());

		// 2. delete(int start, int end) : StringBuilder => start에서 end 앞까지 인덱스에 해당하는 문자열을 삭제.
		sb.delete(2, 5);
		
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열의 길이 : " + sb.length());
		System.out.println("sb의 수용량 : " + sb.capacity());
		
		// 3. insert(int offset, String str) : StringBuilder => 문자열의 offset 위치부터 전달받은 문자열을 추가.
		sb.insert(1, "h h h");
		
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열의 길이 : " + sb.length());
		System.out.println("sb의 수용량 : " + sb.capacity());

		// 4. reverse() : StringBuilder => 문자열의 순서를 역순으로 바꾼다.
		sb.reverse();
		
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열의 길이 : " + sb.length());
		System.out.println("sb의 수용량 : " + sb.capacity());
		System.out.println(System.identityHashCode(sb));	// 주소값의 변동이 없다. 같은 위치에서 원본을 바꾸어 썼다

		
		// 5. 메소드 체이닝 
		
		StringBuilder sb2 = new StringBuilder("Java Program");
		
		// 아래와 같이 메소드를 이어서 쓸 수 있다. 
		// 왜냐하면 우리가 사용했던 아래의 메소드들은 반환형이 StringBuilder이고 
		// 실제 반환되는 결과값이 해당 객체의 주소값이기 때문이다 
		// 이렇게 메소드를 이어서 사용할 수 있는 것을 '메소드 체이닝'이라고 한다.
		sb2.append("API").delete(4, 11).reverse();		 
		System.out.println(sb2);

	}
}
