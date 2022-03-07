package com.kh.practice.model.vo;

public class V40 extends SmartPhone {

	
	
	public V40() {
		super();
	}

	@Override
	public void printMaker() {
		System.out.println("V40는 LG에서 만들어졌다.");
	}

	@Override
	public void touch() {
		super.touch();
		System.out.println("정전식");
	}

	@Override
	public void charge() {
		super.charge();
		System.out.println("고속 충전");
	}

	@Override
	public void picture() {
		super.picture();
		System.out.println("1200, 1600만 트리플 카메라");
	}

	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("번호를 누르고 통화버튼을 누름");
	}

	@Override
	public void takeCall() {
		super.takeCall();
		System.out.println("전화 받기 버튼을 누름");
	}


	

}
