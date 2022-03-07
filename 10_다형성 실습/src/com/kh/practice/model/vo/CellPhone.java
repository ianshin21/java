package com.kh.practice.model.vo;

public interface CellPhone extends Phone, Camera {
	
		public void charge();

		@Override
		default void picture() {
			
		}

		@Override
		default void makeCall() {
			
		}

		@Override
		default void takeCall() {
			
		}
		
		// 위 세 개의 오버라이딩 필요없음

}
