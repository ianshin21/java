package com.kh.chapter1;

import com.kh.chapter1.polymorphism.Desktop;
import com.kh.chapter1.polymorphism.Product;
import com.kh.chapter1.polymorphism.SmartPhone;
import com.kh.chapter1.polymorphism.Tv;

public class Application {

	public static void main(String[] args) {
		// 대입연산자 '=' 사용할 때 양 옆의 자료형(타입)은 같아야한다. 상속 관계에서는 자료형이 달라도 가능
		
		// 1. 부모타입의 레퍼런스로 부모 객체를 다루는 경우 
		
		Product product = new Product();
		
		System.out.println("1. 부모타입의 레퍼런스로 부모 객체를 다루는 경우");
	
		product.print();		// product 레퍼런스로 Product에만 접근 가능

		
		// 2. 자식타입의 레퍼런스로 자식 객체를 다루는 경우
		
		Desktop desktop = new Desktop();
		
		System.out.println("2. 자식타입의 레퍼런스로 자식 객체를 다루는 경우");
		System.out.println("allInone : " + desktop.isAllInone());   // 자식에 정의된 메소드
		desktop.print();		// 부모에 정의된 메소드에도 접근 가능 단 private이면 접근 불가
								// desktop 레퍼런스로 Product, Desktop 둘다 접근 가능
								// Desktop 클래스에 print()메소드가 오버라이딩 되어있지 않다면 Product의 print()메소드를 호출할 것이다. 
								// 현재는 Desktop 클래스에 print()메소드가 오버라이딩 되어있기 때문에 Desktop 클래스의 print()메소드를 호출한다.
		
		// 3. 부모타입의 레퍼런스로 자식 객체를 다루는 경우 
		System.out.println("2. 부모타입의 레퍼런스로 자식 객체를 다루는 경우");
		
		//대입연산자 기준으로 왼쪽 오른쪽 타입이 다름?? --> '자동 형변환'이 되었다. up casting
		// 상속구조에서는 클래스 형변환이 가능 'Product'가 숨어있음
		Product product2 = /*(Product)*/ new Desktop();	
		product2.print();	// 이 경우  부모타입의 레퍼런스 product2는 동적바인딩으로 자식 객체 Desktop 클래스에서 print()메소드를 호출
		
		
		
		// 	<Desktop 자식 객체가 형변환하여 product2 레퍼런스로 Product에만 접근 가능하게 한 다음 
		//		 product2 레퍼런스를 다운캐스팅하여 Desktop에 접근하게 하는 방법에 대하여> 
		// 자동형변환이 일어났기 때문에 product2 레퍼런스로 Product에만 접근 가능 
		//			-- 오버라이딩된 메소드에는 접근 가능, 오버라이딩된 자식객체의 메소드가 먼저 실행 
		//  Desktop 접근 불가능,  product2.isAllInone(); 에러남. 
		// 가리키는 레퍼런스는 Desktop이지만 product2 레퍼런스로는 Product에만 접근 가능하기 때문에 
		// Desktop 에 접근하고 싶으면 다시 형변환 해줘야 한다. : 강제 형변환 명시적 형변환. 
		((Desktop)product2).isAllInone();		
		System.out.println("allInone : " + ((Desktop)product2).isAllInone());   // 자식에 정의된 메소드

/*		
 * 		1. System.out.println("allInone : " + ((Desktop)product.isAllInone());   이런 건 없다. 
 * 																up casting 이후 다시 다운캐스팅해야함 

		2. Desktop desktop2 = (Desktop) new Product();	// 부모클래스로 자동형변환이 일어나서 자식메소드 접근 불가
		   desktop2.isAllInone();
		   System.out.println("allInone : " + desktop2.isAllInone());   
												
		// 위 1, 2 모두 런타임 에러 : 문법상 문제는 없으나 프로그램 실행시 발생하는 오류
*/
		
		
		/*
		 * 상속구조의 클래스들 간에는 형변환이 가능하다. 
		 * 
		 * 1. UpCasting
		 * 		- 자식타입 => 부모타입으로 형변환 
		 * 		- 형변환 연산자 생략 가능 (자동형변환)
		 * 		- 형변환이 일어났기 때문에 이제부터 자식 타입의 멤버(변수, 메소드)에는 접근할 수 없다. 
		 * 
		 * 2. DownCasting 
		 * 		- 부모 타입 => 자식 타입으로 형변환 
		 * 		- 형변환 연산자 생략 불가 (명시적 형변환 해줘야한다.)
		 * 		- ((자식클래스)부모클래스).자식메소드();
		 * 
		 * 		// 컴파일에러 : 소스상의 문법 오류 : 명시적 다운 케스팅이 필요하겠지.. 그러나 다음과 연계해서
		 * 		Desktop desktop = new Product();
		 * 
		 * 		// 런타임 에러 : 프로그램 실행시 발생하는 오류 : 이렇게 할 이유가 없지 않은가?
		 * 		Desktop desktop = (Desktop)new Product();	// 부모클래스로 자동형변환이 일어나서 자식메소드 접근 불가
				desktop.isAllInone();
				
				
				
			3. 다형성 : *** 그러므로 중요한 것은 이것이다. ****
				- 부모타입으로부터 파생된 여러가지 자식 객체를 부모클래스의 레퍼런스로 다룰 수 있는 기술이다.
				- 즉. 부모타입클래스의 레퍼런스는 다양한 형태(자식 객체를 가져와서)를 가질 수 있다. 
				  : 다음 두 가지 경우에서만 사용가능
		*/		
//				Product product2 = /*(Product)*/ new Desktop();	
		//					product2.print();	
		// 						이 경우  부모타입의 레퍼런스 product2는 동적바인딩으로 자식 객체 Desktop 클래스에서 print()메소드를 호출
		//		System.out.println("allInone : " + ((Desktop)product2).isAllInone());   // 오버라이딩 되지 않은 자식에 정의된 메소드 호출시

		 
		
		System.out.println("====================================");
		
		System.out.println("1");
		Desktop[] arr1 = new Desktop[2];
		arr1[0] = new Desktop();
		arr1[1] = new Desktop();
		
		System.out.println("2");
		SmartPhone[] arr2 = new SmartPhone[2];
		arr2[0] = new SmartPhone();
		arr2[1] = new SmartPhone();
	
		System.out.println("3");
		// 다형성을 적용하면 부모클래스의 레퍼런스로 다양한 자식 객체를 가르킬수 있다. 
		// 하나의 부모타입으로 다양한 자식객체를 다룰 수 있다.
		// 코드 길이 감소, 유연한 코딩 가능
		Product[] arr3 = new Product[4];		// 부모 타입의 객체 (배열) 생성
		arr3[0] = new Desktop();
		arr3[1] = new Desktop();
		arr3[2] = new SmartPhone();
		arr3[3] = new SmartPhone();
		
		((Desktop)arr3[0]).isAllInone();
		((Desktop)arr3[1]).isAllInone();
		((SmartPhone)arr3[2]).getMobileAgency();
		((SmartPhone)arr3[3]).getMobileAgency();
		
		//위 처럼 일일이 출력 해도 되지만 객체배열을 사용하는 경우 반복문 통해서 출력이 가능
		for(int i = 0; i < arr3.length; i++) {
			
			/* 
			 * instanceof 연산자
			 *  	- 현재 레퍼런스가 실제로 어떤 클래스형의 객체 주소를 참조하고 있는지 확인할 때 사용
			 */
			if(arr3[i] instanceof Desktop) {
				System.out.println("isAllInone : " + ((Desktop)arr3[i]).isAllInone());
			} else if(arr3[i] instanceof SmartPhone)  {
				System.out.println("mobileAgency : " + ((SmartPhone)arr3[i]).getMobileAgency());
			}
			
			System.out.println(arr3[i].information());
			
		}
		
		System.out.println("===========================================");
		System.out.println("동적 바인딩");
		Product product3 = new Desktop("삼성", "D-01", "매직스테이션", 1300000, true);
		Product product4 = new SmartPhone("삼성", "S-01", "노트 20", 200000, "KT");
		Product product5 = new Tv("삼성", "T-01", "스마타TV", 500000, 60);

		// 오버라이딩 개념을 접목하게 되면 자동으로 내가 실제 참조하고 있는 클래스의 메소드를 찾아서 샐행한다. 
		// 동적 바인딩 : 프로그램이 실행되기 전에 컴파일이 되면서 모든 메소드는 정적 바인딩이 되는데 
		//			컴파일시 정적바인딩된 메소드를 실행할 당시의 객체 타입을 기준으로 바인딩 되는 것
		//			상속관계로 이루어져 다형성이 적용된 경우, 메소드 오버라이딩이 되어 있으면 
		// 			정적 바인딩 된 메소드 코드보다 오버라이딩 된 메소드를 우선적으로 실행한다. 
		System.out.println(product3.information());
		System.out.println(product4.information());
		System.out.println(product5.information());

		// 오버라이딩 한 것은 다운캐스팅 안해도 출력 됨  자식의 인스턴스 변수까지 출력
		// 동적바인딩 부모의 레퍼런스 참조변수로 오버라이딩된 자식의 ....
		
	}

}











