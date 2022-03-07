package com.kh.arry;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

//		길이가 10인 정수형 배열을 만들고 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
//		ex :	1 2 3 4 5 6 7 8 9 10

		int[] iArray;

		iArray = new int[10];

		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = i + 1;
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}
	}

	public void practice2() {

//		길이가 10인 정수형 배열을 만들고 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
//		ex : 10 9 8 7 6 5 4 3 2 1

		int[] iArray = new int[10];

		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = 10 - i;
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}
	}

	public void practice3() {

//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//		ex.		양의 정수 : 5		1 2 3 4 5

		int arraysize = 0;
		int[] iArray;
		Scanner scanner = new Scanner(System.in);

		System.out.println("배열 길이 정수 입력");
		arraysize = scanner.nextInt();

		iArray = new int[arraysize];

		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = i + 1;
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

	}

	public void practice4() {

//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.		ex.		귤

		String[] fruitArray;

		fruitArray = new String[] { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println("배열 두번째 항목 출력 : " + fruitArray[1]);

	}

	public void practice5() {

//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		ex.		문자열: application		문자: i
//				application에 i가 존재하는 위치(인덱스) : 4 8		i 개수 : 2

		int count = 0;
		char letter = '\u0000';
		String line = "";
		char[] cArray;
		Scanner scanner = new Scanner(System.in);

		System.out.println("문자열 입력");
		line = scanner.nextLine();

		cArray = new char[line.length()];

		for (int i = 0; i < line.length(); i++) {
			cArray[i] = line.charAt(i);
		}

		for (int i = 0; i < cArray.length; i++) {
			System.out.print(cArray[i] + " ");
		}

		System.out.println();
		System.out.println("검색할 문자 입력");
		letter = scanner.nextLine().charAt(0);

		System.out.print(line + "에 " + letter + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < cArray.length; i++) {
			if (cArray[i] == letter) {
				System.out.print(i + ", ");
				count++;
			}
		}
		System.out.println();
		System.out.println("입력한 문자가 문자열에 포함된 개수 : " + count);
	}

	public void practice6() {

//		“월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다.“를 출력하세요.
//		ex.		0 ~ 6 사이 숫자 입력 : 4 금요일 / 	0 ~ 6 사이 숫자 입력 : 7 잘못 입력하셨습니다.

		int num = 0;
		Scanner scanner = new Scanner(System.in);

		String[] weekday = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.println("0~6 사이의 정수를 입력하시오.");
		num = scanner.nextInt();

		if (num < 0 || num > 6) {
			System.out.println("잘못 입력했습니다.");
		} else {
			System.out.println(weekday[num] + "요일");
		}

	}

	public void practice7() {

//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장 된 값들의 합을 출력하세요.

		int sum = 0;
		int arraysize = 0;
		int[] iArray;
		Scanner scanner = new Scanner(System.in);

		System.out.println("배열의 길이 입력");
		arraysize = scanner.nextInt();

		iArray = new int[arraysize];

		System.out.println("배열에 값을 입력하여 초기화 하시오.");

		for (int i = 0; i < iArray.length; i++) {
			System.out.print("배열 " + i + "번째 넣을 값 : ");
			int value = scanner.nextInt();
			
			iArray[i] = value;
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

		for (int i = 0; i < iArray.length; i++) {
			sum += iArray[i];
		}

		System.out.println();
		System.out.println("배열값의 총합은 : " + sum + "입니다.");

	}

	public void practice8() {

//		3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요.”를 출력하고
//		다시 정수를 받도록 하세요.
		int count = 1;
//		int j1 = 0;
//		int j2 = 0;
		int oddNum = 0;
		int[] oddArray;
		Scanner scanner = new Scanner(System.in);

		System.out.println("3 이상의 홀수 정수를 입력하여 배열의 길이를 정하시오.");

		while (true) {

			oddNum = scanner.nextInt();

			if (oddNum % 2 == 0 || oddNum < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			}

			oddArray = new int[oddNum];

			/*
			 * j1 = oddNum / 2; for (int i = 0; i <= j1; i++) { oddArray[i] = i + 1; }
			 * 
			 * j2 = oddNum / 2 + 1; for (int i = j2; i < oddArray.length; i++) { oddArray[i]
			 * = --j2; }
			 */
			for (int i = 0; i < oddArray.length; i++) {
				oddArray[i] = count;

				if (i < oddArray.length / 2) {
					count++;
				} else {
					count--;
				}
			}

			for (int i = 0; i < oddArray.length; i++) {
				System.out.print(oddArray[i] + " ");
			}
			return;
		}

	}

	public void practice9() {

//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.

		int[] iArray = new int[10];

		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}
	}

	public void practice10() {

//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

		int max = 0;
		int min = 10;

		int[] iArray = new int[10];

		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = (int) (Math.random() * 10 + 1);
		}

		System.out.println("배열의 전체 값은 : ");
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

		System.out.println();

/*		for (int i = 0; i < iArray.length; i++) {

			if (max < iArray[i]) {
				max = iArray[i];
			}
		}
		System.out.println("최대값 : " + max);

		for (int i = 0; i < iArray.length; i++) {

			if (min > iArray[i]) {
				min = iArray[i];
			}
		}
		System.out.println("최소값 : " + min);
*/
		for (int i = 0; i < iArray.length; i++) {

			if (max < iArray[i]) {
				max = iArray[i];
			}
	
			if (min > iArray[i]) {
				min = iArray[i];
			}	
		}
		System.out.println("최대값은 : " + max + "이며 최소값은 : " + min + "입니다.");

		
		
	}

	public void practice11() {

//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.

		int[] iArray = new int[10];

		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (iArray[i] == iArray[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

	}

	public void practice12() {

//		로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		int[] iArray = new int[6];

		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = (int) (Math.random() * 100 + 1);

			if ( iArray[i] > 45) {
				i--;
				continue;
			} else {
				for (int j = 0; j < i; j++) {
					if (iArray[i] == iArray[j]) {
						i--;
					}
				}
			}
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

		Arrays.sort(iArray);
		System.out.println();

		for (int i : iArray) {
			System.out.print(i + " ");
		}

	}

	public void practice13() {

//		주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를
//		char[]에 옮겨 담기(단, 성별 자리 이후부터는 *로 담기)
//		ex.		주민등록번호(-포함) : 123456-1234567		123456-1****** 

		String pNum = "";
		char[] pNumArr;
		Scanner scanner = new Scanner(System.in);

		System.out.println("주민번호를 입력하시오. '-' 포함 14자리");
		pNum = scanner.nextLine();

		pNumArr = new char[pNum.length()];

/*		for (int i = 0; i < 8; i++) {
			pNumArr[i] = pNum.charAt(i);
		}

		for (int i = 8; i < 14; i++) {
			pNumArr[i] = '*';
		}
*/
		for (int i =0; i < pNumArr.length; i++) {
			
			if (i < 8) {
				pNumArr[i] = pNum.charAt(i);
			} else {
				pNumArr[i] = '*';
			}
		}
		
		
		for (int i = 0; i < pNumArr.length; i++) {
			System.out.print(pNumArr[i] + " ");
		}

	}

}
