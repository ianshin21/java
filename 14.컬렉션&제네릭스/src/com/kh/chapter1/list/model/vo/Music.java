package com.kh.chapter1.list.model.vo;

public class Music implements Comparable<Music> {
														// type parameter에 Music
	private String title;
	
	private String artist;

	private int ranking;
	
	public Music() {		
	}

	public Music(String title, String artist, int ranking) {	
		this.title = title;
		this.artist = artist;
		this.ranking = ranking;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}


	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + ", ranking=" + ranking + "]";
	}

	@Override
	// compareTo는 정수값을 반환한다.
	// 	- 자신과 인자로 전달된 같은 타입의 객체를 비교
	//	- 같은면 0을 반환, 자신이 크다면 양의 정수 반환, 자신이 작다면 음의 정수 반환
	public int compareTo(Music music) {
		// 아티스트 이름 순서대로 정렬하는 코드
		
		System.out.println("this.artist : " + this.artist + ", music.artist : " + music.artist);
		System.out.println("CompareTo : " + ((this.ranking > music.ranking) ? 1 : (this.ranking == music.ranking) ? 0 : -1) );
		
		// 랭킹 순서대로 정렬하는 코드 : 오름차순 > 비교해서 this.ranking이 작으면 -1 -> 왼쪽으로 정렬됨
		//  wrapper 클래스에서 확인
		// int 에서 제공하는 compareTo 사용해도 됨(?)
//		return (this.ranking > music.ranking) ? 1 : (this.ranking == music.ranking) ? 0 : -1; 
		
				// 내림차순 방법 1.   1 과 -1 을 바꾸면 역순으로 정렬 가능 
		
		return this.artist.compareTo(music.artist);			// return이 syso보다 앞에 있으면 syso는 에러
		
	}
	
	
}

