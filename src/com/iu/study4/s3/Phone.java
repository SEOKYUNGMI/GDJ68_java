package com.iu.study4.s3;

public class Phone {

	String company="APPLE";		//변수선언 동시에 넣은값이 최초실행
	String brand="IPHONE15";
	
	{
		//{}사이에 Instance 초기화 블럭		//Instance 초기화 블럭이 다음번에 실행
		this.company="LG";
		this.brand="가로본능";
	}
	
	public Phone() {			//생성자가 마지막에 실행됨
		this.company="SAMSUNG";
		this.brand="S20";		
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
	}
	
}
