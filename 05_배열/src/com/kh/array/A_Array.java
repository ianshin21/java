package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 *      저장된 값마다 인덱스가 지정되어 있어서 인덱스로 접근 (0부터 시작)
	 *       
	 * 할당 :		자료형[] 배열명 = new 자료형 [배열크기];
	 * 			자료형 배열명[] = new 자료형 [배열크기];
	 */   		
	
	public void method1() {
		// 배열을 사용하는 이유 :
		
		// 다량의 데이터를 기록해두고자 할 때.	모두 동일한 자료형	
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);

		int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;
		
		//배열 사용
		
		int arr[] = new int[7]; //크기가 7인 int형 배열의 선언 : 정수형 숫자 7개를 담을 수 있다.
		
		/*
		// 값의 초기화 :   arr[0] ~ arr[6] :  배열명[인덱스] = 값;
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		*/
		
		System.out.println();
		
		// 배열명.length를 통해 배열의 길이를 알 수 있다.
		
		//배열의 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 2);
		}						
		
		//배열의 출력
		for(int i =0; i < arr.length; i++) {
		
		System.out.println(arr[i]);
		}							
	}	
	
	
	public void method2() {
		
		// 배열의 선언
		
		//변수 선언 
		int num; 	//메모리(Stack)에 자료형 만큼의 크기로 값을 담을 수 있는 공간이 할당.
		
		//배열 선언
		//메모리(Stack)에 (heap에 생성될, '--형' 배열의 메모리 공간에 대한)주소값을 보관할 공간을 할당.
		// 	: 참조변수 ; 크기는 시스템마다 다름 ; 주소값을 가지고(참조하여) 실제 배열을 찾음 
		int[] iArray1;   //정수형 배열의 주소값 저장
		int[] iArray2;
		double[] dArray1; //실수형 배열의 주소값 저장
		double[] dArray2; 
		
		
		//배열 할당
		iArray1 = new int[5];   //반드시 크기 지정 ; heap 영역에 메모리 공간 할당
		iArray2 = new int[10];
		dArray1 = new double[5];
		dArray2 = new double[10];
		
		System.out.println("iArray1" + iArray1);	//주소값 출력
		System.out.println("iArray2" + iArray2);
		System.out.println("dArray1" + dArray1);
		System.out.println("dArray2" + dArray2);

		
		// 초기화 값 출력
		for(int i =0; i < iArray1.length; i++) {
			System.out.printf("iArray1[%d] : %d\n", i, iArray1[i]);
		}
		
		for(int i =0; i < dArray1.length; i++) {
			System.out.printf("dArray1[%d] : %f\n", i, dArray1[i]);
		}
			//초기화 하지 않으면 jvm이 알아서 초기화 한다. heap영역에는 값이 없으면 안되기 때문
			// int형은 0, 실수형은 0.0, 논리형은 자동으로 false. string은 null. 문자는 '\u0000'
		
		"안녕하세요.".length();
			// iArray1.length와 str1.length()의 차이점 
			//배열의 길이는 final (field)변수 ---.length로 확인 (값을 변경할 수 없다)
		 	//String의 길이는  ---.length() 매서드로 확인
		
		// 값의 초기화를 진행하는 for문
		for (int i = 0; i < iArray2.length; i++) {
			iArray2[i] = i + 2;
		}
		
		//값을 출력하는 for문
		for (int i = 0; i < iArray2.length; i++) {
			System.out.println("iArray2[" + i + "] : " + iArray2[i]);
		}
	}
	
	
	public void method3() {
		
		//사용자가 입력하는 정수값으로 배열의 길이를 지정하여 배열을 생성하고 
		// 그 배열에 반복문을 사용하여 랜덤값을 (1~100) 배열에 저장하고 출력한다. 

		int[] arr;   
//		int arraysize = 0;			
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값 입력하여 배열의 길이를 정함");
		
//		arraysize = scanner.nextInt();
		
//		arr = new int[arraysize];
		arr = new int[scanner.nextInt()];

		// 값의 초기화를 진행하는 for문
		for (int i =0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		// i = 10; 이렇게 배열의 길이 변경 불가 
		
		//값을 출력하는 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
//			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void method4() {
		int[] iArray = new int [5];
		
		iArray [0] = 2;
		iArray [1] = 4;
		iArray [2] = 6;
		iArray [3] = 8;
		iArray [4] = 10;
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}
		
		System.out.println();
		System.out.println(iArray);					// 16진수 주소값
		System.out.println(iArray.length);
		System.out.println(iArray.hashCode());   // 16진수 주소값을 10진수로 바꾸어서 어떤 객체에서 그 객체가 동일한지 사용 
		System.out.println(iArray.toString());		// 주소값을 문자열로 찍음

		
												// 배열에서 한 번 지정한 크기는 변경 불가. 배열 크기를 지정 새로 생성해줘야 한다. 
		iArray = new int[6];					// 배열이 바뀌면 주소값도 바뀜 // 참조변수가 새로운 배열 참조
												// 이전의 배열은 쓰레기가 되고 나중에 garbage-collector가 처리한다 : 자동 메모리관리
		
//		iArray = null;				// 참조를 끊는다. 이전 배열은 가비지컬렉터의 대상이 됨. 이하는 에러 남.
									// 당장 할당된 배열을 지우고(사용하지 않고) 싶을 때
		
		System.out.println();
		System.out.println(iArray);					
		System.out.println(iArray.length);
		System.out.println(iArray.hashCode());    
		System.out.println(iArray.toString());		
		
		
		System.out.println();
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}					// 이전의 배열의 값은 찾을 수 없다. 

	}
	
	
	public void method5() {
		
		// 배열 선언, 할당, 초기화 동시에 진행하기
		int[] iArray1 = new int[] {1, 2, 3, 4, 5} ;		//값의 개수만큼 자동으로 크기가 할당된다. 
		int[] iArray2 = {1, 2, 3, 4, 5, 6, 7, 8} ;				// new 연산자 생략
		
		System.out.println("iArray1 : " + iArray1.length);
		System.out.println("iArray2 : " + iArray2.length);
	
		Scanner scanner = new Scanner(System.in);

		String[] fruitArray = new String[5];			
		//stack의 주소값으로 다시 heap 안에 참조변수가 발생하고 heap의 다른 공간에 저장되는 문자열의 주소값을 가진다.
		// jvm이 초기값으로는 비어있다는 뜻으로 null을 넣어준다. 문자를 입력하면 그 문자가 있는 heap메모리 공간의 주소값이 null 대신 들어간다. 	
		
		for (int i = 0; i < fruitArray.length; i++) {
			System.out.println("fruitArray[" + i + "] : " + fruitArray[i]);
		}
		
		System.out.println("과일 이름 입력");
		
		for (int i = 0; i < fruitArray.length; i++) {
//			System.out.print("과일 이름 입력 : ");
			fruitArray[i] = scanner.nextLine();
//			System.out.println("fruitArray[" + i + "] : " + fruitArray[i]);
		}
		
		System.out.println();
		System.out.println("과일 이름 출력");

		for (int i = 0; i < fruitArray.length; i++) {
			System.out.println(fruitArray[i]);
		}


	}	
}






















