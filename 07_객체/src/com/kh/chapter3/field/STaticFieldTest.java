package com.kh.chapter3.field;

// 클래스변수 static변수에 대해 알아보기 
public class STaticFieldTest {

/*	- 클래스변수 (static 변수) : 
 *          static이라는 예약어가 붙은 변수/ 객체 생성하지 않고 클래스명으로 바로 사용
*  			생성시점 : 프로그램 실행될 떄 JVM에 의해 해당 클래스가 로드될 때 static 메모리 영역에 할당
*  			소멸시점 : 프로그램이 종료될 때 소멸 
*  			클래스 변수는 프로그램 실행과 동시에 메모리에 올려 놓고 공유하며 사용할 목적으로 선언.   
*  				*** STaticFieldTest 클래스에 의해 생성된 모든 객체가 이 클래스 변수값을 공유한다. 
*  			이 해당 클래스를 객체로 생성하지 않아도 사용할 수 있다. 
*/
	
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	// 접근제한자가 public 인 것은 어디서든 바로 접근 가능, 
	// private 해당 클래스에서만 접근 가능하기 때문에 외부에서 접근하기 위해서는 getter/setter 메소드가 필요하다. 
	// static 변수에 대한 getter/setter 메소드 또한 static 키워드를 붙여서 만들어 주어야 한다.
	public static String getPriSta() {
		return priSta;
	}
	public static void setPriSta(String priSta) {
		STaticFieldTest.priSta = priSta;
	}
	// static으로 변수나 메소드를 선언하면 프로그램 실행과 동시에 static 영역에 할당된다.
	// this는 클래스로 객체를 생성했을 때 heap 영역의 시작주소를 가리킴.
	// 객체를 생성하지 않고 클래스에서 바로 접근하기 때문에 this 가 없다. 사용할 수 없다. this.priSta = priSta 이런게 없다. 
}
