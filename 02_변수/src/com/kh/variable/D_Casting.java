package com.kh.variable;

public class D_Casting {
	// 형변환 (boolean은 제외)
	// 컴퓨터에서 값처리 규칙
	// 1. 대입연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 된다. 
	//    자료형 변수명 = 값; 값은 자료형과 같아야 한다. 
	//    아니면 자료형 변수명 = (자료형)값으로 형변환 casting 해 줘야 한다. 
	// 2. 같은 자료형끼리만 계산이 가능 --> 계산 결과도 같은 자료형으로 나옴
	
	// 1. 자동(묵시적)형변환
	
	public void casting1() {
		
		short s = 12;
		int i = s;	//short -> int로 자동형변환 됨, 에러가 안 남
		long l = i;  // int -> long으로 자동형변환
		double d = l; // int -> double도 되고, long -> double도 됨
		double result = 12 + 3.3;   // 12.0 + 3.3 = 15.3 int -> double 로 형변환 후 계산됨
		long result2 = 30 + 30; // 30 + 30 = 60 계산한 다음 60을 long으로 캐스팅하여 60L로 저장
		long result3 = 30 + 30L;  // 30을 30L로 바꿔서 60L 계산
		
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("d : " + d);
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		float f = 1.0f;
		d = f; 
				
		System.out.println("f : " + f);
		System.out.println("d : " + d);

		
		l = 10000000000L;
		f = l;  // float가 long보다 표현 가능한 수의 범위가 더 크기 때문에 자동형변환이 가능 
		
		
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		
		int num = '문';   // 유니코드에 '문'에 해당하는 코드값 출력
		char ch = 65;    // 에러가 없다는 것은 캐스팅이 자동 발생했다는 것. 코드값 65에 해당하는 문자 'A' 출력
						// 유니코드에서는 '-' 값이 없어서 '-65' 이러면 에러 남 
		
		
		System.out.println("num : " +num);
		System.out.println("ch : " + ch);
		
		//byte와 short는 무조건 int로 형변환된다.
		
		byte b1 = 1;
		byte b2 = 10;
//		byte result4 = b1 + b2;     // byte나 short는 연산시 무조건 int로 형변환해서 계산하니까 그 결과가 byte형 변수에 안 들어가서 에러남 
		byte result4 = (byte) (b1 + b2); // 강제 형변환 

		
		
		
		
	}

	public void casting2() {
		double d = 4.0;
//		float f = d; // 에러 발생 
		float f = (float) d;  // 캐스팅 연산자 사용
		int iNum = (int)d;  // 데이터 손실 생김
		
		System.out.println("iNum : " + iNum);
		
		iNum = 10;
		double dNum = 5.76;
		
		int iSum = (int) (iNum + dNum); // 10.0 + 5.76 = 15.76 => 15 
//		int iSum = iNum + (int)dNum); // 10 + 5 = 15 => 15 
		
		double dSum = iNum + dNum; 
		
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("iNum : " + iNum);
		System.out.println("iSum : " + iSum);
		System.out.println("dSum : " + dSum);
		
		// byte, short 연산
		byte bNum = 1;
		short sNum = 2;
		
		byte bSum = (byte) (bNum + sNum); // int로 강제 형변환후 계산 => 다시 byte로 형변환 
		short sSum = (short) (bNum + sNum); // int로 강제 형변환후 계산 => 다시 short으로 형변환 
		
		System.out.println("bSum : " + bSum);
		System.out.println("sSum : " + sSum);
		
		
		// 데이터 손실 테스트
		iNum = 290; 
		System.out.println();  // 빈줄로 사용 
		System.out.println("============================");
		System.out.println("iNum : " + iNum);
		
		bNum = (byte) iNum; 
		System.out.println();
		System.out.println("iNum :" + bNum); // 데이터 손실 일어남 290 => 34
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
