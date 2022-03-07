package com.kh;

import java.util.Scanner;

import com.kh.practice.Student;

public class Application {

	public static void main(String[] args) {

//		int grade = 0;
//		int classroom = 0;
//		int num = 0;
//		String name = null;
		Scanner scanner = new Scanner(System.in);

		Student[] arr = new Student[3];

		arr[0] = new Student (3, 1, 1, "홍길동");
		arr[1] = new Student (4, 3, 2, "유관순");
		arr[2] = new Student (2, 7, 5, "윤봉길");

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i + "번째 학생의 학년을 입력해 주세요. : ");
//			grade = scanner.nextInt();
//			System.out.println(i + "번째 학생의 반을 입력해 주세요. : ");
//			classroom = scanner.nextInt();
//			System.out.println(i + "번째 학생의 번호를 입력해 주세요. : ");
//			num = scanner.nextInt();
//			System.out.println(i + "번째 학생의 이름을 입력해 주세요. : ");
//			scanner.nextLine();
//			name = scanner.nextLine();
//
//			arr[i] = new Student(grade, classroom, num, name);
//		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}

		scanner.close();

	}

}
