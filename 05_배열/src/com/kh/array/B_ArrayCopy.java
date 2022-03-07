package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	public void method1() {
		
		// 얕은 복사 : 주소값만 복사 
		
		int[] origin = {1, 2, 3, 4, 5};  // = new int [] {1, 2, 3, 4, 5}; 와 동일
		int[] copy = origin;
		
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[3] = 77; 
		
		System.out.println("\n===========복사본 배열 값 변경 후========");
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}		// 원본도 수정됨
		
		System.out.println("\n복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소 값" + origin.hashCode());
		System.out.println("copy의 주소 값" + copy.hashCode());
				// 동일한 주소값 출력
	}
	
	
	public void method2() {
		
		// 1. for문을 이용한 깊은 복사 
		
		int[] origin = {1, 2, 3, 4, 5};  
		int[] copy = new int[5];
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

		copy[3] = 77; 
		
		System.out.println("\n===========복사본 배열 값 변경 후========");
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}		// 원본 수정 안됨
		
		System.out.println("\n복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소 값" + origin.hashCode());
		System.out.println("copy의 주소 값" + copy.hashCode());
				// 다른 주소값 출력	
	}
	
	
	public void method3() {
		
		// 2. System 클래스에서 제공하는 arraycopy() 메서드를 사용한 깊은 복사
		// 복사되는 배열을 미리 생성해서 전달 해줘야한다.
		
		int[] origin = {1, 2, 3, 4, 5};  
		int[] copy = new int[10];

// 			원본배열명. 복사시작 인덱스, 복사본 배열명, 복사본 배열의 복사 시작 위치, 복사할 인덱스의 길이		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		
//		System.arraycopy(origin, 0, copy, 2, origin.length);
		System.arraycopy(origin, 0, copy, 1, 3);

		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("\norigin의 길이" + origin.length);
		System.out.println("copy의 길이" + copy.length);

		System.out.println("\norigin의 주소 값" + origin.hashCode());
		System.out.println("copy의 주소 값" + copy.hashCode());

	}
	
	
	public void method4() {
		
		// 3.Arrays 클래스에서 제공하는 copyof() 메서드를 이용한 깊은 복사
		// 복사하고자 하는 배열의 크기를 다시 지정해서 복사하고 싶을 때. 
		// 복사하는 배열을 미리 생성하지 않고. 메소드에 배열의 크기를 전달해서 생성한다.
		
		int[] origin = {1, 2, 3, 4, 5};  
//		int[] copy = Arrays.copyOf(origin, origin.length); 
								//원본 배열명, 복사할 길이
							//new문을 사용하지 않는다.? 새로운 객체 생성하지 않고 바로 메서드 사용
							//		Arrays. => 클래스의 메서드 종류 확인
		
//		int[] copy = Arrays.copyOf(origin, 4); 
		int[] copy = Arrays.copyOf(origin, 10); 

		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("\norigin의 길이" + origin.length);
		System.out.println("copy의 길이" + copy.length);

		System.out.println("\norigin의 주소 값" + origin.hashCode());
		System.out.println("copy의 주소 값" + copy.hashCode());

	}
	
	
	public void method5() {
		
		// 4. clone() 메소드를 이용한 복사
		// 원본 배열을 통채로 복사해서 새로운 배열 생성. 시작인덱스, 복사본 배열의 크기 등 지정 할 수 없음.
		int[] origin = {1, 2, 3, 4, 5};  
		int[] copy = origin.clone();
		
		
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("\norigin의 길이" + origin.length);
		System.out.println("copy의 길이" + copy.length);

		System.out.println("\norigin의 주소 값" + origin.hashCode());
		System.out.println("copy의 주소 값" + copy.hashCode());


	}
}















