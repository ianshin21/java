package com.kh.practice.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	public SmartPhone() {
		super();
	}
	
	
	public abstract void printMaker();


	@Override
	public void touch() {
		
	}

	@Override
	public void charge() {
		
	}

	@Override
	public void picture() {
		CellPhone.super.picture();
	}

	@Override
	public void makeCall() {
		CellPhone.super.makeCall();
	}

	@Override
	public void takeCall() {
		CellPhone.super.takeCall();
	}

	// 위 5개의 오버라이딩 불필요
	
	

}
