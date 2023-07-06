package com.iu.study4.s3;

public class Car {	
	String company;		//생성자가 없기 때문에 default
	String brand;
	String color;			//앞에 public을 붙여주면 다른 패키지에서 접근가능
	int price;
	
	//생성자(Constructor/)
	//접근지정자 클래스명과 동일한 이름(메서드명) ([메게변수들 선언]){}
	public Car() {
		//기본생성자
		this("A7");				//생성자 내에서 다른 생성자를 호출 할 수 있음(생성자 첫줄에 위치해야함)
//		this.company="AUDI";
//		this.brand="A7";
//		this.color="PINK";
//		this.price=9985;
	}
	
	public Car(String b) {
		this(b, "PINK");
//		this.company="AUDI";
//		this.brand=b;
//		this.color="PINK";
//		this.price=9985;
	}
	
	public Car(String b, String color) {
		this(b, color, 9985);
//		this.company="AUDI";
//		this.brand=b;		
//		this.color=color;
//		this.price=9985;
	}
	
	public Car(String b, String color,int price) {
		this.company="AUDI";
		this.brand=b;		
		this.color=color;
		this.price=price;				
	}
	public void info() {
		System.out.println("Company : " + this.company);
		System.out.println("Brand : " + this.brand);
		System.out.println("Color : " + this.color);
		System.out.println("Price : " + this.price+"만원");
	}

}
