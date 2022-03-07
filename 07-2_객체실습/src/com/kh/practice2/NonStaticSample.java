package com.kh.practice2;

import java.util.Arrays;

public class NonStaticSample {

	
	public void printLottoNumber() {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 100 + 1);

			if (lotto[i] > 45) {
				i--;
				continue;

			} else {

				for (int j = 0; j < i; j++) {

					if (lotto[i] == lotto[j]) {
						i--;
					}
				}
			}
		}

		Arrays.sort(lotto);

		for (int i : lotto) {
			System.out.print(i + " ");
		}

	}

	
	public void outputChar(int num, char c) {

		System.out.print(c + "문자 " + num +"개 출력 : ");
		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}

	}

	
	public char alphabette() {

		while(true) {
			
			char ch = (char) (Math.random() * 58 + 65);
			
			if (ch >= 91 && ch <= 96) {
				continue;
			}
			return ch;
		}
		
	}

	
	public String mySubstring(String str, int index1, int index2) {

		System.out.println("\""+ str +"\" 의 " + index1 + "번 " + index2 + "번 사이의 값 출력 : ");
		return 	str.substring(index1, index2);

	}
	
}
