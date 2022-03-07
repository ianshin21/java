package com.kh.chapter1.list.compare;

import java.util.Comparator;

import com.kh.chapter1.list.model.vo.Music;

public class TitleAscending implements Comparator<Music> {
													// type parameter에 Music
	@Override
	//  정수값을 반환한다.
	// 	- 두 개의 인자를 받아서 비교 후 정수값 반환
	//	- 비교해서 같은면 0을 반환, 첫번째 인자가 크다면 양의 정수 반환, 두번째 인자가 크다면  음의 정수 반환

	public int compare(Music o1, Music o2) {
		System.out.println("this.title : " + o1.getTitle() + ", music.title : " + o2.getTitle());
		System.out.println("CompareTo : " + o1.getTitle().compareTo(o2.getTitle()) );

		// 문자열에서 구현되어 있는 compareTo() 메소드 사용한다. 
		return o1.getTitle().compareTo(o2.getTitle());
//		return -(o1.getTitle().compareTo(o2.getTitle()));  
			// 내림 차순 방법 2. 이렇게 해도 내림차순이 됨    내림차순 방법 3. sort() 한 다음  reverser() 해도 된 

//		if( (o1.getTitle().compareTo(o2.getTitle())) == 0) {
//			return (o1.getRanking() > o2.getRanking()) ? 1 : (o1.getRanking() == o2.getRanking()) ? 0 : -1;
//		} else {
//			
//		}

	}

}
