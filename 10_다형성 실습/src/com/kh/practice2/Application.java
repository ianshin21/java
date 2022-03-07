package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

	public static void main(String[] args) {

		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("진도", "진돗개", 35);
		arr[1] = new Dog("풍산", "풍산개", 40);
		arr[2] = new Dog("삽살", "삽살개", 25);
		arr[3] = new Cat("미니", "페르시아산", "동네놀이터", "빨강");
		arr[4] = new Cat("모모", "걸리버산", "마을회관", "초록");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].speak();
		}
	}

}
