
package com.kh.exception;

import java.util.Scanner;

public class D_UnCheckedException {

	/* 
	 * UnCheckedException 
	 * 	- RunTimeException을 상속하고 있는 예외들을 UnCheckedException이라 한다. 
	 *  - 컴파일 시 예외 처리 코드가 있는지 검사하지않는 예외를 말한다. 
	 *  - RunTimeException 같은 경우에는 프로그램이 실행할 때 문제가 발생하므로 충분히 예측이 가능하다. 
	 *  		때문에 미리 조건문을 통해서 충분히 처리가 가능하다. 
	 *    try catch 문으로 처리해도 된다. 
	 *    
	 *    RunTimeException의 후손들
	 *    	- ArrayIndexOutOfBoundException : 배열의 접근에 잘못된 인덱스 값을 사용하는 경우 예외 발생
	 *    	- NegativeArraySizeException : 배열 크기를 음수로 지정한 경우 예외 발생 
	 *    	- ArithmeticException : 나누기 연산에서 분모가 0인 경우 발생하는 예외 
	 *    	- NullPointerException : NUll인 참조 변수로 객체 맴버 참조 시도 시 예외 발생
	 *    	- ClassCastException : 잘못된 Cast 연산자 사용 시 예외 발생 
	 */
	
	private Scanner scanner = new Scanner(System.in);
	
	public void method1() {
		//ArithmeticException 
		int num1 = 0;		
		int num2 = 0;
		int result = 0;
		
		System.out.println("정수 1 : ");
		num1 = scanner.nextInt();
		
		System.out.println("정수 2 : ");
		num2 = scanner.nextInt();
		
		
//		if(num2 == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			
//			return;			
//		}
		
//		result = num1 / num2;
//		System.out.println("result = " + result);

		try {
			result = num1 / num2;
			
			System.out.println("result = " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	
	public void method2() {
		// ArrayIndexOutOfBoundException, NegativeArraySizeException
		int size = 0;
		int[] arr = null;
		
		System.out.println("배열의 길이 : ");
		size = scanner.nextInt();

//		if(size <= 0) {
//			System.out.println("양수를 입력해 주세여");
//			
//			return;
//		}
		
//		arr = new int[size];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = size - i;
//		}
//		
//		for(int i = 0; i <= arr.length; i++) {
//			arr[i] = size - i;
//		}
//	
//		for(int i = 0; i <= arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}


		try {
			arr = new int[size];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = size - i;
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
//		}catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) { //jdk 1.7 버전부터 가능
//			System.out.println("잘못된 배열의 길이를 입력, 잘못된 인덱스");
//		}
		}catch (NegativeArraySizeException e) {
			System.out.println("양수를 입력해 주세여");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스에 접근하셨습니다.");			
		}catch (Exception e){
			System.out.println("예기치 못한 오류가 발생했습니다. 관리자에게 문의해 주세요.");
		}
	}
}
















