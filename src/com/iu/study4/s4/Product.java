package com.iu.study4.s4;

public class Product {
	
	private String name;
	private int price;
	
	public void setPrice(int price) {			//집어넣는 메서드 set~
		if(price<1) {
			this.price=1000;
		}
		this.price=price;
	}
	
	public int getPrice() {						//꺼내는 메서드 get~
		if(price<1) {
			this.price=1000;
		}
		return this.price;
	}
	
	public void info() {
		System.out.println(this.name);
	}

}
