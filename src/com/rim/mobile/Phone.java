package com.rim.mobile;

public class Phone {

	String brand;
	int price;
	String color;
	int size;
	
	public Phone() {
		//디폴트 생성자(기본생성자/빈 생성자)
		//클래스 내에 생성자가 하나도 없으면 
		//컴파일러가 디폴트 생성자를 자동생성
		this.brand="LG";
		this.price=200;
		this.size=15;
		this.color="RED";
		this.info();
	}
	
	public void info() {
		System.out.println("~~~~phone~~~~");
	}
	
}
