package com.kh.array;

import java.util.Arrays;
import java.util.Collections;

public class C_ArraySort {
	
	// 배열의 정열
	
	public void method1() {
		
		int[] arr = {2, 5, 7, 1, 3};
		
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//오름차순으로 정열
		Arrays.sort(arr);
		System.out.println();
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
				// 향상된 for문. for each문 : 배열이나 리스트 등에서 사용 / 배열의 인덱스 값 순서대로 출력.
		
//		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println();
		System.out.println(Arrays.toString(arr));

		
		// 내림차순으로 정열. 사실은 그런 메소드는 없다.
		//  1. for문을 사용해서 원본 배열의 값을 반대로 새로운 배열에 대입하는 방법
		//  2. 아래와 같이 작성하는 방법. 
		Integer integer[] = {2, 5, 7, 1, 3};

		Arrays.sort(integer, Collections.reverseOrder());
		
		System.out.println();
		System.out.println(Arrays.toString(integer));
		
	}
	
	
	public void method2() {
		
		String strArray[] = {"apple", "orange", "banana", "메론", "레몬"};
		
		// 오름차순으로 정렬
		Arrays.sort(strArray);		
		System.out.println(Arrays.toString(strArray));	
				// 각 (여기서는 5개의) 문자열을 다시 사전순서대로 정리해서 하나의 문자열로 만들어 줌
		
		// 내림차순으로 정렬
		Arrays.sort(strArray, Collections.reverseOrder());
		
		System.out.println();
		System.out.println(Arrays.toString(strArray));
		
	}
	
	// method3() ~ method7() 정렬 알고리즘 정리 : 삽입, 선택, 버블, 퀵, 병합, 힙 / 시간 복잡도 

	
	public void method3() {											// 삽입정렬 insertion-Sort
			
		int[] array = {7, 5, 3, 8, 2, 9, 1};						// 배열 선언, 할당, 초기화 
						
		for (int i = 0; i < array.length; i++) {					// 초기값 출력
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println("======오름차순으로 삽입정렬 후======");
		
		int[] sortedArray = insertionSort(array);					// 정적메소드 insertionSort 호출 : 배열 array를 보내 처리한 후 가져옴 
																	// sortedArray로 이름 바꾸고 출력.
		for (int i = 0; i < sortedArray.length; i++) {				// 여기서 배열의 원 이름 array로 그대로 두고 해도 출력이 되는데, 왠지는 모름???
			System.out.print(sortedArray[i] + " ");
		}
	}	
			
	public static int[] insertionSort(int[] array) {				// 내림차순으로 삽입정렬을 위한 정적 메소드 / 같은 클래스 내부여서인지 static 아니어도 돌아감???

		for (int i = 0; i < array.length; i++) {					// 외부 for문 : 인덱스번호 i를 증가시켜 비교대상1을 오른쪽으로 이동
			
			int temp = array[i];									// 비교대상1을 잠시 외부공간(temp)에 카피해서 보관한다.
			int j = i - 1;											// 비교대상1(인덱스번호 i의 값)을 비교대상2(비교대상1 왼쪽에 있는 값)과 비교할 준비.
						
			for ( ; j >= 0 && array[j] > temp; j--) {				// 비교대상1(현재 temp에 있음)과 비교대상2(비교대상1 왼쪽에 있는 값)과 비교.
				array[j + 1] = array[j];							// 비교대상1(temp의 값)이 크면, 비교대상2를 비교대상1이 있던 오른쪽으로 이동
			}														// j값이 -1 되어 비교대상1은 하나 더 왼쪽의 인덱스값을 비교대상2로 두고 다시 비교 
			array[j + 1] = temp; 									// 비교대상1이 비교대상2 보다 크지 않다면 (j가 -1 에 이어 +1 된) 원래 비교대상2가 있던 자리에 들어가 stay.
																	// 외부 for문으로 돌아가 i 인덱스번호를 증가시켜 반복 수행
//			while (j >= 0 && array[j] < temp) {						// while문에 의해 구현될 경우
//			array[j + 1] = array[j];
//			j--;													// 오름차순 정렬을 원하면 'array[j] < temp' 이 부분 '<'를 '>'로 바꾸면 됨.
//			}
//			array[j + 1] = temp;

		}
		return array;												// 새로 정렬된 배열을 반환 => method3 insertionSort 매소드 호출행으로 		
	}

	
}








/*		< 연습 문제 >
 *  
 *         수업 중 학습한 (프로젝트) 배열 => package com.kh.array; => class A_Array =>  method3 
 *         				 (프로젝트) 2차원 배열 => package com.kh.dimension; => class DimensionalArray =>  method3 
 *         등을 참조하여 
 *  
 *         배열 길이 10의 1차원 배열을 구성하고 
 *         Math.random() 매소드를 사용 임의의 값으로 초기화 한 이후 
 *         그 값들 중 중복값을 제거하고  
 *         
 *         학습한 <삽입 정렬 알고리즘>을 통해 내림차순 정렬을 완성해 보자. 
 *         
 *    
 *    
 *    
 */





















