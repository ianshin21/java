package com.kh.dimension;

public class DimensionalArray {
	
	public void method1() {
		// 1. 이차원 배열의 선언, 
		
		int[][] iArray1;
		int iArray2[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
		int[] iArray3[];
		
		// 2. 이차원 배열의 할당 : heap 영역에 해당 크기만큼의 공간이 할당
		
		iArray1 = new int[3][5];
		
		// 행 길이 출력
		System.out.println("행의 길이 : " + iArray1.length);  // heap에서 세로로 행의 참조변수 생성됨
		
		//각 행별 열의 길이 출력
		System.out.println("0번째 행의 열의 길이 : " + iArray1[0].length);
		System.out.println("1번째 행의 열의 길이 : " + iArray1[1].length);
		System.out.println("2번째 행의 열의 길이 : " + iArray1[2].length);

		// 1  2  3  4  5
		// 6  7  8  9  10
		// 11 12 13 14 15
		
		// 바깥쪽 for문 : 행의 개수만큼 반복
		// 안쪽 for문 : 열의 개수만큼 반복
		int value = 1;
		
		// 3. 값을 초기화
		for (int i = 0; i < iArray1.length; i++) {
			for (int j = 0; j < iArray1[i].length; j++) {
				iArray1[i][j] = value++;
			}
		}
		
		// 값을 출력
		for (int i = 0; i < iArray1.length; i++) {
			for (int j = 0; j < iArray1[i].length; j++) {
				System.out.print(iArray1[i][j] + " ");
			}
			System.out.println();
		}
		
		// iArray2 값 출력
	}
	
	
	public void method2() {
		
		// 가변 배열 : 행은 정해졌으나 각 행에 대한 열의 개수가 정해지지 않은 상태.
		// 2차원 배열은 1차원 배열이 여러개 묶여 있는 것인데, 1차원 배열의 길이가 꼭 같을 필요는 없다. 
		
		int[][] arr1 = new int[3][]; //가변 배열 할당 (행의 크기는 3행)
		int arr2[][] = {{1, 2, 3}, {4}, {5, 6, 7, 8, 9}, {10}};
		
		// 각 행에 다른 배열을 참조할 수 있도록 할당
		arr1[0] = new int[2];
		arr1[1] = new int[3];
		arr1[2] = new int[5];
		
		System.out.println("=========== 가변 배열 ===========");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=========== 가변 배열 (생성과 동시에 초기화) ===========");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	
	public void method3() {
		
		//1~10사이의 랜덤값을 3행 3열에 해당하는 2차원 배열에 넣기
		
		// 1차원 배열을 이용해서 먼저 중복 제거를 진행 
		 //Math.random에 대한 클레스 불러오기는 jvm이 컴파일 할 때 자동으로 import 해 줌
		int[] arr;		// int[] arr = null; 스택영역에 들어가는 변수들은 초기화 하지 않으면 에러,자동으로 생성해주지 않는다.
		int[][] newArr;			// int[][] newArr = null;
		int index = 0;
		
		arr = new int[3 * 3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);  
//			System.out.print(arr[i] + " "); 
			//이렇게 출력해보면 중복된 수가 나온다.
			
			// 중복 제거 for문
			for(int j = 0; j < i; j++) {

				if(arr[i] == arr[j]) {
					i--;
					
					break;
				}
			}
		}
		
		// 일차원 배열의 랜덤값 정상적으로 중복이 제거되었는지 확인
		System.out.println("일차원 배열 출력");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 3행 3열의 2차원 배열에 대입하기
		newArr = new int[3][3];
		
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[index++];
			}
		}
		
		System.out.println("\n");
		
		System.out.println("2차원 배열 출력");
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			
			System.out.println();
				
		}
			
	
	}

}



















