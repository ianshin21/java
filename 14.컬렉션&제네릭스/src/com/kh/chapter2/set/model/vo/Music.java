package com.kh.chapter2.set.model.vo;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ranking;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)		// 주소가 같을 경우 비교할 가치도 없이 그냥 true
			return true;
		if (obj == null)		// 비교할 객체가 null(없다)이면 비교할 가치도 없이 그냥 false
			return false;
		if (getClass() != obj.getClass())		// 클래스 타입이 다르면 비교할 가치도 없이 그냥 false
			return false;
		Music other = (Music) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (ranking != other.ranking)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Music o) {
		return this.ranking > o.ranking ? 1 : this.ranking == o.ranking ? 0 : -1;
	}

	
		
	
	
	
}
