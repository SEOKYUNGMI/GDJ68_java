package com.iu.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModelName("갤럭시북");
		computer.setCpu("i9");
		computer.setColor("BLACK");
		computer.setPrice(2000000);
		computer.setPoint(20);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("LG11");
		tv.setInch(100);
		tv.setColor("WHITE");
		tv.setPrice(3000000);
		tv.setPoint(30);
		
		Phone phone = new Phone();
		phone.setCompany("APPLE");
		phone.setModelName("SE3");
		phone.setOs("IOS");
		phone.setColor("BLACK");
		phone.setPrice(1000000);
		phone.setPoint(10);
		
		Customer winter = new Customer();
		winter.buy(computer);
		
		//제품 두개를 샀을때 남은돈 남은 포인트 출력
		Product [] product = new Product[2];
		product[0]=tv;
		product[1]=phone;
		
		winter.buy(product);


	}

}
