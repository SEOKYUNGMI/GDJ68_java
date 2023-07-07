package com.iu.study5.s2;

public class Customer {
	
	private int money;
	private int point;
	
	public Customer() {
		this.money=10000000;
		this.point=50;
	}
	
	public void buy(Product p) {			//Product 클래스에서 get,set으로 받아왔기 때문에 Product 메서드를 불러옴
		this.money = this.money-p.getPrice();
		this.point = this.point+p.getPoint();
		System.out.println(this.money);
		System.out.println(this.point);
			
	}
	//제품 두개를 샀을때 남은돈 남은 포인트 출력
	public void buy(Product [] product) {
		for(int i=0;i<product.length;i++) {
			this.buy(product[i]);	   		//이미 위에서 만든 메서드 buy가 있기 때문에 재사용 가능
		}
	}
	
	

}
