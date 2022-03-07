package com.kh.chap01;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
//		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
//		ex.  1. 입력  2. 수정  3. 조회  4. 삭제 9. 종료
		
		int menu = 0;		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("========== menu ===========");
		System.out.println("1 : 입력");
		System.out.println("2 : 수정");
		System.out.println("3 : 조회");
		System.out.println("4 : 삭제");
		System.out.println("5 : 종료");
		System.out.println("===========================");
		
		System.out.println("메뉴 선택 번흐를 입력하세요.");		
		menu = scanner.nextInt();
		
		switch (menu) {
		
			case 1:
				System.out.println("입력 메뉴입니다.");
				break; 
			case 2:
				System.out.println("수정 메뉴입니다.");
				break; 
			case 3:
				System.out.println("조회 메뉴입니다.");
				break; 
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break; 
			case 5:
				System.out.println("프로그램이 종료됩니다.");
			default:
				System.out.println("선택이 잘못되었습니다");

		}
		
	}
	
	
	public void practice2() {
		
//		키보드로 정수를 입력 받아 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요
		
		int num = 0;		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");		
		num = scanner.nextInt();
		
		if (num > 0) {
			
			if (num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
			
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	
	public void practice3() {
		
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		// (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		// 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		// 불합격인 경우에는 “불합격입니다.”를 출력하세요
		
		int kor = 0;
		int eng = 0;
		int math = 0;		
		int total = 0;
		double average = 0;				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 세 과목의 점수를 각각 입력하시오");		
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		
		total = kor + eng + math;
		average = total / 3.0;  
		
		if (kor >= 40 && eng >= 40 && math >= 40 && average >= 60) {

			System.out.println();
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("세 과목의 충점 :" + total);
			System.out.printf("세 과목의 평균 : %.1f\n", average);
			System.out.println();
		
			System.out.println("축하합니다. 합격입니다!");

		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	
	public void practice4() {
		
//		수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		
		int month = 0;		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 1 ~ 12까지 입력하여 월을 선택하시오.");		
		month = scanner.nextInt();
		
		switch (month) {
		
			case 1:
			case 2:
			case 12:
				System.out.println("겨울입니다.");
				break;			
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다.");
				break;
			case 9:
			case 10:		
			case 11:
				System.out.println("가을입니다.");
				break;
			default:
				System.out.println("그런 달은 없습니다.");
		}
		
	}
	
	
	public void practice5() {
		
		// 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		// 로그인 성공 시 “로그인 성공”,
		// 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		// 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

		String id1 = "";
		String pass1 = "";
		String id2 = "";
		String pass2 = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("본인의 아이디를 만둘어 주세요.");		
		id1 = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오.");		
		pass1 = scanner.nextLine();
		
		System.out.println("로그인을 위해 아이디 입력이 필요합니다.");		
		id2 = scanner.nextLine();
		
		System.out.println("로그인을 위해 비밀번호 입력이 필요합니다.");		
		pass2 = scanner.nextLine();
		
		if (id2.equals(id1) && pass2.equals(pass1)) {
			System.out.println("로그인 성공");
		} else if (id2.equals(id1)) {					// not 논리를 쓰지 않도록
			System.out.println("비밀번호가 틀렸습니다.");	     		
		} else if (pass2.equals(pass1)) {
			System.out.println("아이디가 틀렸습니다.");			
		} else {
			System.out.println("모두 틀렸습니다.");
		}
				
	}
	
	
	public void practice6() {
		
/*		사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		비회원은 게시글 조회만 가능합니다.
		(단, 잘못 입력하였을 경우 “잘못 입력했습니다.” 라는 출력문이 출력되도록)
*/
		
		String grade = "";		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("<관리자>,<회원>,<비회원> 중 사용자 등급을 입력하여 권한을 확인하시기 바랍니다.");		
		grade = scanner.nextLine();
				
		switch (grade) {
		
			case "관리자" : 
				System.out.println("귀하는 관리자이십니다. 다음의 활동이 가능합니다.");
				System.out.println("회원관리, 게시글의 관리.작성.조회, 댓글 작성");
				break;
			case "회원" :
				System.out.println("귀하는 회원이십니다. 다음의 활동이 가능합니다.");
				System.out.println("게시글의 작성.조회, 댓글 작성");
				break;
			case "비회원" :
				System.out.println("비회원이시군요. 게시글 조회만 가능하십니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");

		}
				
	}
	
	
	public void practice7() {
		
/*		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
		BMI = 몸무게 / (키(m) * 키(m))
		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		BMI가 30이상일 경우 고도 비만
*/
		
		double weight = 0;
		double height = 0;
		double bmi = 0;		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몸무게를 입력하시기 바랍니다.");		
		weight = scanner.nextDouble();
		
		System.out.println("키를 입력하세요.(meter 기준, 소수점 세자리까지 입력)");
		height = scanner.nextDouble();
		
		bmi = weight / (height * height);

		System.out.println();
		System.out.printf("귀하의 BMI지수는 %.2f입니다.\n", bmi);
		
		if (bmi < 18.5) {
			System.out.println("귀하는 저체중입니다.");
		} else if (bmi >= 18.5 && bmi < 23){
			System.out.println("귀하는 정상체중입니다.");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("귀하는 과체중입니다.");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("귀하는 현재 비만 상태입니다.");
		} else if (bmi >= 30) {
			System.out.println("귀하는 현재 고도비만 상태입니다.");
		}
		
	}
	
	
	public void practice8() {
		
/*		키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		(단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		(printf()문을 이용하여 마지막 출력문을 작성해보시오.)
*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 개의 양수를 입력하시오.");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if (num1 <= 0 || num2 <= 0) {
			System.out.println("잘못 입력했습니다. 프로그램을 종요합니다.");
			return;
		}
		
		scanner.nextLine();
		
		System.out.println("연산자를 입력하시오. + - * / % 중 택 일");
		
		char op = scanner.nextLine().charAt(0);
		
		if ( !(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')) {
			System.out.println("잘못 입력했습니다. 프로그램을 종요합니다.");
			return;
		}
		
		switch (op) {
		
		case '+':
			System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
			break;
		case '*':
			System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
			break;
		case '/':
			System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
			break;
		case '%':
			System.out.printf("%d 나누기 %d의 나머지 = %d", num1, num2, (num1 % num2));
			break;
		}
	//   8_2가 정답
	}
	
	
	
	public void practice8_2() {
		
/*		키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		(단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		(printf()문을 이용하여 마지막 출력문을 작성해보시오.)
*/
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char op = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 개의 양수를 입력하시오.");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		if (num1 <= 0 || num2 <= 0) {
			System.out.println("잘못 입력했습니다. 프로그램을 종요합니다.");
			return;
		}
		
		scanner.nextLine();
		
		System.out.println("연산자를 입력하시오. + - * / % 중 택 일");		
		op = scanner.nextLine().charAt(0);		
		
		switch (op) {
		
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("잘못 입력했습니다. 프로그램을 종요합니다.");
			return;		//break는 switch만 벗어난다. return은 코드전체 stop
		}
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
		
	}
	
	
	public void practice9() {
		
		
		// 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 총 점 100점 중 배점으로는 다음과 같다.
		// 중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)
		// 이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력
		// 총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
		// 아니면 Fail을 출력하세요.

		double exam1 = 0;
		double exam2 = 0;
		double homework = 0;
		int attend = 0;
		double totalScore = 0;				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("중간고사 점수는 얼마입니까?");		
		exam1 = scanner.nextDouble();
		
		System.out.println("기말고사 점수는 얼마입니까?");		
		exam2 = scanner.nextDouble();
		
		System.out.println("과제평가 점수는 얼마입니까?");		
		homework = scanner.nextDouble();
		
		System.out.println("출석 일수를 입력하시오.");		
		attend = scanner.nextInt();
		
		totalScore = exam1 * 0.2 + exam2 * 0.3 + homework * 0.3 + attend;
		
		System.out.println();
		if (totalScore >= 70 && attend >= 20 * 0.7) {

			System.out.println("중간고사 환산점수 : " + exam1 * 0.2);
			System.out.println("기말고사 환산점수 : " + exam2 * 0.3);
			System.out.println("과제평가 환산점수 : " + homework * 0.3);
			System.out.println("출석률 반영 점수 : " + attend);
			System.out.println("총점은 " + totalScore + "입니다.");
		
			System.out.println("당신은 pass 입니다.");

		} else if (totalScore < 70 && attend >= 20 * 0.7){

			System.out.println("당신의 총점은 " + totalScore + "입니다.");
			System.out.println("당신은 점수 미달로 fail 되시겠습니다.");

		} else if (totalScore >= 70 && attend < 20 * 0.7){

			System.out.println("당신의 총점은 " + totalScore + "입니다.");
			System.out.println("그러나 당신은 출석률 저조로 fail 되시겠습니다.");

		} else {

			System.out.println("당신의 총점은 " + totalScore + "입니다.");
			System.out.println("출석률도 저조 하군요. 당신은 fail 입니다.");
		}
				
	}
	
	
	public void practice10() {
			
		ConditionPractice example = new ConditionPractice();

		int menu = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("다음 메뉴 중 원하는 항목을 선택하여 수행하시오.");
		System.out.println();
		
		System.out.println("========= menu =============");
		System.out.println("1 : practice1 실행");
		System.out.println("2 : practice2 실행");
		System.out.println("3 : practice3 실행");
		System.out.println("4 : practice4 실행");
		System.out.println("5 : practice5 실행");
		System.out.println("6 : practice6 실행");
		System.out.println("7 : practice7 실행");
		System.out.println("8 : practice8 실행");
		System.out.println("9 : practice9 실행");
		System.out.println("=============================");
		System.out.println();
		
		System.out.println("메뉴 선택");
		menu = scanner.nextInt();
		
		System.out.println();
		System.out.println("=============================");
		
		switch (menu) {
		
			case 1:
				example.practice1();
				break;
			case 2:
				example.practice2();
				break;
			case 3:
				example.practice3();
				break;
			case 4:
				example.practice4();
				break;
			case 5:
				example.practice5();
				break;
			case 6:
				example.practice6();
				break;
			case 7:
				example.practice7();
				break;
			case 8:
				example.practice8();
				break;
			case 9:
				example.practice9();
				break;
			
		}
		
	}

}
