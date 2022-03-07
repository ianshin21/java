package com.kh.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 1 ~ 16까지 값을 차례대로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.

		int[][] iArray = new int[4][4];

		int value = 1;

		for (int i = 0; i < iArray.length; i++) {
			for (int j = 0; j < iArray[i].length; j++) {
				iArray[i][j] = value++;
			}
		}

		for (int i = 0; i < iArray.length; i++) {
			for (int j = 0; j < iArray[i].length; j++) {
				System.out.print(iArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice2() {

		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.

		int[][] iArrayR = new int[4][4];

		int value = 16;

		for (int i = 0; i < iArrayR.length; i++) {
			for (int j = 0; j < iArrayR[i].length; j++) {
				iArrayR[i][j] = value--;
			}
		}

		for (int i = 0; i < iArrayR.length; i++) {
			for (int j = 0; j < iArrayR[i].length; j++) {
				System.out.print(iArrayR[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {

		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.

//		String[][] iArrayR = { { "(0, 0)", "(0, 1)", "(0, 2)" }, { "(1, 0)", "(1, 1)", "(1, 2)" },
//				{ "(2, 0)", "(2, 1)", "(2, 2)" } };
//
//		for (int i = 0; i < iArrayR.length; i++) {
//			for (int j = 0; j < iArrayR[i].length; j++) {
//				System.out.print(iArrayR[i][j] + " ");
//			}
//			System.out.println();
//		}

		String[][] strArray = new String[3][3];
		
		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strArray[i].length; j++) {
				strArray[i][j] = "(" + i + "," + j + ")";  //숫자를 문자열과 ‘+’ 연산을 하면 숫자가 자동으로 문자열로 변경이 됩니다.

				System.out.print(strArray[i][j] + " ");  
			}
			System.out.println();
			
		}
		
	}

	public void practice4() {

		/*
		 * 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후 아래의 내용처럼 처리하세요. 
		 * ex.
		 * 4 7 3 14 
		 * 4 2 10 16 
		 * 7 10 5 22 
		 * 15 19 18 52
		 */

		int[] arr = null;
		int[][] arr2 = null;
		int index = 0;

		arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}

		/*
		 * for(int i = 0; i < arr.length; i++) { System.out.print(arr[i] + " "); }
		 * System.out.println();
		 */
		arr2 = new int[4][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr2[i][j] = arr[index++];
			}
		}
		/*
		 * for(int i = 0; i < 3; i++){ for(int j = 0; j < 3; j++) {
		 * System.out.print(arr2[i][j] + " "); } System.out.println(); }
		 * System.out.println("==========================");
		 */

//		for (int j = 0; j < 3; j++) {
//			arr2[0][3] += arr2[0][j];
//		}
//
//		for (int j = 0; j < 3; j++) {
//			arr2[1][3] += arr2[1][j];
//		}
//
//		for (int j = 0; j < 3; j++) {
//			arr2[2][3] += arr2[2][j];
//		}
//
//		for (int i = 0; i < 3; i++) {
//			arr2[3][0] += arr2[i][0];
//		}
//
//		for (int i = 0; i < 3; i++) {
//			arr2[3][1] += arr2[i][1];
//		}
//
//		for (int i = 0; i < 3; i++) {
//			arr2[3][2] += arr2[i][2];
//		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr2[i][3] += arr2[i][j];
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr2[3][j] += arr2[i][j];
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr2[3][3] += arr2[i][j];
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		// *** 선생님 ~~~  for문을 줄일 수 있는 방법이 있을까요?

	}
	
	public void practice4_2(){
		
		int[][] arr2 = new int[4][4];
		
		for (int i = 0; i < arr2.length-1; i++) {
			for (int j = 0; j < arr2[i].length-1; j++) {
				arr2[i][j] = (int) (Math.random() * 10 + 1);
				
				arr2[i][3] += arr2[i][j];
				arr2[3][j] += arr2[i][j];
				arr2[3][3] += arr2[i][j];				
			}		
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + " ");
				System.out.printf("%3d ", arr2[i][j]);
			}
			System.out.println();
		}

	}

	public void practice5() {

		/*
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.”
		 * 출력 후 다시 정수를 받게 하세요. 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요. (char형은
		 * 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타내고 90은 Z를 나타냄) ex. 행 크기 : 5 열 크기 : 4 T P M B U
		 * I H S Q M B H H B I X G F X I
		 */
		int row = 0;
		int column = 0;
		int random = 0;

		int[][] array;

		Scanner scanner = new Scanner(System.in);
		System.out.println("1~10 사이의 정수를 입력하여 2차원 배열을 만들고 알파벳 대문자로 채우시오.");

		while (true) {

			System.out.println("2차원 배열의 행");
			row = scanner.nextInt();

			System.out.println("2차원 배열의 열");
			column = scanner.nextInt();

			if ((row >= 1 && row <= 10) && (column >= 1 && column <= 10)) {

				array = new int[row][column];

				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						random = (int) (Math.random() * 100 + 1);

						if (random >= 65 && random <= 90) {
							array[i][j] = random;
						} else {
							j--;
						}

					}
				}

			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print((char) array[i][j] + " ");
				}
				System.out.println();
			}
			break;
		}
	}

	public void practice6() {

		// String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지",
		// "습", "으", "냅"}, {"원",
		// "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!!
		// "}};
		// 위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로 출력하세요.
		// 단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "!", "더", "!!" } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=======================================");

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}

	}

	public void practice7() {

		/*
		 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아 문자형 가변 배열을 선언 및 할당하세요. 그리고 각
		 * 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요. 
		 * ex. 
		 * 행의 크기 : 4
		 *  0행의 크기 : 2 
		 *  1행의 크기 : 6
		 *  2행의 크기 : 3 
		 *  3행의 크기 : 5 
		 *  a b 
		 *  c d e f g h 
		 *  i j k 
		 *  l m n o p
		 */
		int row = 0;
		int column = 0;
		char index = 'a';
		char[][] cArray;

		Scanner scanner = new Scanner(System.in);

		System.out.print("행의 크기 : \n");

		row = scanner.nextInt();

		cArray = new char[row][];

		for (int i = 0; i < row; i++) {
			System.out.print(i + "행의 크기 : \n");

			column = scanner.nextInt();

			cArray[i] = new char[column];
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cArray[i].length; j++) {
				cArray[i][j] = index++;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cArray[i].length; j++) {
				System.out.print(cArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice8() {

		/*
		 * 1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고 3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장. 1분단 왼쪽부터
		 * 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요. <출석부> 1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		 * 7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		 * 
		 * ex. == 1분단 == 강건강 남나나 도대담 류라라 문미미 박보배 == 2분단 == 송성실 윤예의 진재주 차천축 피풍표 홍하하
		 */
		int index = 0;

		String[] sArray = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] sArray2_1 = new String[3][2];
		String[][] sArray2_2 = new String[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				sArray2_1[i][j] = sArray[index++];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				sArray2_2[i][j] = sArray[index++];
			}
		}

		System.out.println("===1분단===");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(sArray2_1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("===2분단===");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(sArray2_2[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice9() {

		/*
		 * 위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여 해당 학생이 어느 자리에 앉았는지 출력하세요. 검색할 학생 이름을
		 * 입력하세요 : 차천축 검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다.
		 */
		int index = 0;

		String[] sArray = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] sArray2_1 = new String[3][2];
		String[][] sArray2_2 = new String[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				sArray2_1[i][j] = sArray[index++];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				sArray2_2[i][j] = sArray[index++];
			}
		}

		System.out.println("===1분단===");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(sArray2_1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("===2분단===");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(sArray2_2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=====여기서부터 9번 문제======");

		String sName = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("검색할 학생 이름을 입력하세요.");
		sName = scanner.nextLine();

		for (int i = 0; i < 3; i++) {

			if (sName.equals(sArray2_1[i][0])) {
				System.out.println("검색한 " + sName + "학생은 1분단 " + (i+1) + "번째 줄 왼쪽에 있습니다.");

			} else if (sName.equals(sArray2_2[i][0])) {
				System.out.println("검색한 " + sName + "학생은 2분단 " + (i+1) + "번째 줄 왼쪽에 있습니다.");

			} else if (sName.equals(sArray2_1[i][1])) {
				System.out.println("검색한 " + sName + "학생은 1분단 " + (i+1) + "번째 줄 오른쪽에 있습니다.");

			} else if  (sName.equals(sArray2_2[i][1])) {
				System.out.println("검색한 " + sName + "학생은 2분단 " + (i+1) + "번째 줄 오른쪽에 있습니다.");

			}

		}

	}

}
