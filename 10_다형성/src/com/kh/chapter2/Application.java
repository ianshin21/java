package com.kh.chapter2;

import com.kh.chapter2._abstract.BasketBall;
import com.kh.chapter2._abstract.FootBall;
import com.kh.chapter2._abstract.Sports;
import com.kh.chapter2._interface.Baby;
import com.kh.chapter2._interface.Basic;
import com.kh.chapter2._interface.Mother;

public class Application {

	public static void main(String[] args) {
		/*
		 * 추상클래스 
		 * 	[표현법]
		 * 		[접근제한자] abstract class 클래스명 {}
		 * 
		 * 	- 미완성 클래스로 추상메소드를 포함한 클래스이다.
		 * 	- 일반적인 멤버(변수, 메소드)도 포함이 가능하다. (변수 + 메소드 + [추상메소드])
		 *  - 미완성 클래스이기 때문에 new 연산자를 통해서 객체를 생성할 수 없다. 
		 *  		Sports sports = new Sports(); 이렇게 하면 안되고
		 *  - 단, 레퍼런스(참조형 변수 타입)로는 사용 가능		 
		 *  - 상속 관계로 구현되어 있으면 다형성 적용이 가능하다.(부모레퍼런스로 자식 객체를 참조할 수 있다)
		 *  		Sports sports = new FootBall(); 이렇게는 되고
		 *  
		 *  추상메소드
		 *   [표현법]
		 *   	[접근제한자] abstract 반환형 메소드명([매개변수]);    {} 없고 ;로 마무리
		 *   
		 *   - 미완성 메소드로 몸통부가 구현되어 있지 않는 메소드이다. 
		 *   - 추상클래스를 상속받는 자식 클래스에서 반드히 오버라이딩(재정의)해야 한다. 
		 *   - 오버라이딩 해주지 않으면 에러발생.
		 *   - 자식클래스에 강제성 부여할 수 있는 방법이다. (추상메소드 -> 강제 오버라이딩)		 
		 */

		System.out.println("==============추상클래스========");
		// 미완성 클래스이기 때문에 객체 생성 불가!!
		// 추상클래스를 상속받는 자식클래스를 만들어서 추상메소드들을 완성시켜줘야 한다.  
		
		// 추상클래스는 객체 생성이 안 될 뿐이지 참조변수로 사용 가능 
		//			: 안 되고 Sports sports = new Sports();
		//			: 아래는 되고 : 다형성이 적용되어 자식 객체를 생성해서 가리킬 수 있다. 부모가 자식을 담을 수 있다
		//      Sports sports = new FootBall(); 
		
		// 객체 배열의 다형성을 이용해서 FootBall과 BasketBall 객체의 선수 수와 룰을 출력
		Sports[] arr = new Sports[2];
		
		arr[0] = new FootBall(11);
		arr[1] = new BasketBall(6);
		
		for(Sports a : arr) {
			// 동적 바인딩을 통해 강제로 오버라이딩 된 각각의 메소드를 찾아 실행한다. 
			a.rule(); 
		}
		
		
		/*
		 * 인터페이스 
		 * 	[표현법]
		 * 		[접근제한자] interface 인터페이스명 {}
		 * 
		 * 	- 상수 필드와 추상메소드로만 이루어진 추상클래스의 변형체 
		 *  - 인터페이스에서 필드는 무조건 상수필드이다. 
		 * 	- 인터페이스에서 메소드는 무조건 추상메소드이다. 
		 * 	- 무조건적으로 구현해야 하는 것(기능, 메소드)이 있을 때 인터페이스를 만들어서 상속하게 된다. 
		 * 	- 인터페이스를 상속하려면 implements 키워드를 사용하여 상속(구현)해야 한다. 
		 * 	- 인터페이스는 다중상속을 허욯한다. (이 기능, 특징이 인터페이스의 모든 것이 아니다.)
		 * 		추상메소드만 가질 수 있기 때문에 메소드 이름에 헷갈릴 필요가 없어서(?)
		 * 		자바에서 다중상속이 안되는 이유? 다중 상속을 하면 상속시 다른 각각의 super클래스에 같은 이름의 변수나 메소드가 있어 같이 상속받을 겨웅  
		 * 		인터페이스는 인스턴스변수, 인스턴스 메소드를 가질 수 없고 상수필드와 추상메소드만 가질 수 있다. 
		 * 		메소드에 대한 정의만 하고 있기 때문에 메소드가 겹치더라도 최종 구현부분은 구현 객체에서 이루어 질 것이기 때문에 
		 * 	- 추상클래스와는 다르게 좀 더 강한 규칙성, 강제성을 가지는게 인터페이스이다.
		 * 
		 * 	추상틀래스와 인터페이스
		 * 		1.공통점
		 * 			- 객체 생성 안 되나 참조변수로서 사용 가능 ( 즉, 다형성을 적용할 수 있다.)
		 * 			- 상속(구현)하는 클래스들에게 추상메소드를 구현하도록 강제한다.
		 * 
		 * 		2. 차이점
		 * 			- 추상클래스는 클래스 내에 인스턴스변수, 메소드 생성이 가능하고 추상메소드가 포함되어 있거나 abstract 키워드로 클래스가 정의되어 있고 
		 * 			  인터페이스는 인스턴스변수, 메소드 생성이 불가능하고 모든 변수는 상수필드, 모든 메소드가 추상메스드로 정의되어 있다.
		 * 			- 존재하는 목적이 다르다.
		 * 				추상클래스는 추상클래스를 상속받아 기능을 이용하고, 클래스를 확장하는데 목적이 있다. 
		 * 				인터페이스는 클래스의 기능(함수) 구현을 강제하기 위해서 사용. 즉, 구현을 강제함으로써 구현 객체의 같은 동작을 보장할 수 있다. 
		 * 
		 * 
		 * 	extends와 implements
		 * 		- 클래스간에 상속 관계일 때는 : 클래스 extends 부모클래스명
		 * 		- 클래스와 인터페이스간 구현 관계일 때 : 클래스명 implements 인터페이스명
		 * 		- 인터페이스간에 상속 관계일 때 : 인터페이스명 extends 인터페이스명, 인터페이스명  (다중상속)
		 * 
		 */
		
		System.out.println("========인터페이스============");
		// 인터페이스는 미완성 클ㄹ래스이기 때문에 객체 생성 불가
		// 인터페이스 구현하는 자식클래스를 만들어서 추상메소드들을 완성시켜줘야 핟.
//		Basic basic = new Basic();
		
		// 인터페이스는 객체 생성이 안될 뿐 참조변수로 사용 가능
		// 다형성이 적용되어 자식 객체를 생성 가리킬 수 있다
		
		System.out.println();
		Basic baby = new Baby("아기", 3.2, 50);
		Basic mother = new Mother("엄마", 50, 70);
		
		System.out.println("eat(), sleep() 호출전");
		System.out.println(baby);		//.toString() 생략 가능
		System.out.println(mother);
		
		baby.eat();
		baby.sleep();
		
		mother.eat();
		mother.sleep();
		
		System.out.println("eat(), sleep() 호출후");
		System.out.println(baby);		//.toString() 생략 가능
		System.out.println(mother);

		
	}

}



