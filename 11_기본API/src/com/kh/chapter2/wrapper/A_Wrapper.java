package com.kh.chapter2.wrapper;

public class A_Wrapper {
	/*
	 * wrapper 클래스
	 * 	- 기본자료형을 (객체로 사용하고 싶을 때) 객체로 포장해주는 클래스이다. 
	 * 	- 기본자료형으로 사용해도 되지만 프로그램에 따라서 해당 기본 타입을 객체로 취급해서 처리해야 하는 경우
	 * 		매소드의 매개변수로 객체 타입만 요구될 때
	 * 		다형성을 적용하고 싶을 때
	 * 		Object에 있는 메소드를 사용하고 싶을 때
	 * 	- 기본자료형을 Wrapper 클래스로 포장해 주는 것을 Boxing이라고 한다. 
	 * 	- Wrapper 클래스 -> 기본자료형으로 변경해 주는 것을 UnBoxing이라 한다. 
	 */
	
	public void method1() {
		// Boxing : 기본자료형 -> Wrapper 클래스로 변경
		int iNum = 10;
		double dNum = 3.14;
		
		// 1. 객체 생성을 통한 방법
		Integer i = new Integer(iNum);
		Double d1 = new Double(dNum);
		Double d2 = new Double("3.14");
		
		System.out.println(i);
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println(d1 == d2);
		
		//클래스에서 제공하는 메소드를 사용할 수 있다.
		System.out.println(d1.equals(d2));
		System.out.println(d1.compareTo(d2));  // 두 값을 비교, 앞쪽이 작으면(뒤쪽이 크면) -1, 앞쪽이 크면(뒤가 작으면) 1 반환,  반환, 같으면 0을 반환
				// str1.compareTo(str2)  str1이    사전순으로    앞이면(작으면) 음수          뒤면(크면) 양수 
		
		// 2. 객체를 생성하지 않고 바로 사용하는 방법
		Integer i2 = iNum;		// 같은 타입만 가능. AutoBoxing 
		Integer i3 = new Integer("4");   // 문자열을 숫자화 시켜준다. 같은 자료형이 아니기 때문에 오토박싱 안됨.  
										// 단. 문자열에 정수가 아닌 값이 있으면 오류~~ "4.5" 이렇게 넣으면 안됨 
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i2 + i3);	//AutoUnBoxing	
		
		
		// UnBoxing : Wrapper 클래스 -> 기본자료형으로 변경 
		int iNum2 = i2.intValue();
		int iNum3 = i3.intValue();
		
		System.out.println(iNum2 + iNum3);
		
		int iNum4 = /*(int)*/ i3; // AutoUnBoxing
		
		System.out.println(iNum4);
		
		System.out.println(i2 + i3);  //AutoUnBoxing
		
		//자바 1.9 버전 이후 부터는 Boxing, UnBoxing 기능을 안쓰도록 Deprecated 되어있다.
				
	}
	
	
	public void method2() {
		// String과 Wrapper 클래스간의 변경 
		String str1 = "10";
		String str2 = "3.14";
		
		System.out.println(str1 + str2); 
		
		// 1.문자열을 기본자료형으로 변경 :  Wrapper 클래스에서 제공하는 parseXXX() 이용
		int num = Integer.parseInt(str1);			// 같은 타입만 가능
//		int num = Integer.parseInt(str2);			// 애러남. 같은 타입만 가능
		double dNum = Double.parseDouble(str2);
		
		System.out.println(num + dNum);
		
		// 2. 기본자료형 -> String (문자열) 으로 변경 
		
		// String의 valueOf() 메소드 사용하는 방법
		String str3 = String.valueOf(num);
		String str4 = String.valueOf(dNum);
		
		System.out.println(str3 + str4); 
		
		//Wrapper 클래스에서 제공하는 valueOf().toString 메소드 사용하는 방법
		String str5 = Integer.valueOf(num).toString();
		String str6 = Double.valueOf(dNum).toString();
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}

	/*
	 *  given List<Integer> intList, the code to add an Integer might be as follows:

​			intList.add(new Integer(347));

		This can be replaced with:

​			intList.add(347);

		Autoboxing should not be used in places where it might affect overload resolution. 
		For example, there are two overloads of the List.remove method:

​			List.remove(int i) // removes the element at index i
			List.remove(Object obj) // removes an element equal to obj

		The code to remove the Integer value 347 might be as follows:

			intList.remove(new Integer(347));

		If this code is changed in an attempt to use autoboxing:

​			intList.remove(347);

		This will not remove the Integer value 347, but instead it will resolve to the other overloaded method, 
		and it will attempt to remove the element at index 347.

		Autoboxing cannot be used in such cases. 
		Instead, code should be changed to use the valueOf static factory method:

​			intList.remove(Integer.valueOf(347));

		Autoboxing is preferable from a readability standpoint, 
		but a safer transformation is to replace calls to the box constructors with calls to the valueOf static factory method.
		Using autoboxing or the valueOf method reduces memory footprint compared to the constructors, 
		as the integral box types will generally cache and reuse instances corresponding to small values. 
		The special case of Boolean has static fields for the two cached instances, namely Boolean.FALSE and Boolean.TRUE.

​		With the exception of Character, the box classes also have constructors that take a String argument. 
		These parse and convert the string value and return a new instance of the box class. 
		A valueOf overload taking a String is the equivalent static factory method for this constructor. 
		Usually it's preferable to call one of the parse methods (Integer.parseInt, Double.parseDouble, etc.)
		 which convert the string and return primitive values instead of boxed instances.
	 */
}



























