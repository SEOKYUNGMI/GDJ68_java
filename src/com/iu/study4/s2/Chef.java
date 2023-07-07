package com.iu.study4.s2;

public class Chef {

	String name;
	//라면을 하나 만들때
	public void makeRamyun2(Ramyun [] ramyuns) {
		for(int i=0;i<ramyuns.length;i++) {
			Ramyun ramyun = new Ramyun();
			ramyuns[i]=ramyun;
			ramyuns[i].title = "진라면";
			ramyuns[i].price = 3000;
		}
	}
	//라면을 count 수 대로 만들때
	public Ramyun [] makeRamyun(int count) {			//()인원수
		
//		Ramyun ramyun = new Ramyun();		// 객체 생성
//		Ramyun ramyun2 = new Ramyun();		// 객체 생성
//		ramyun2 = new Ramyun();				// 기존 변수명 = 새로운 객체 생성	(앞에 만들어진 객체는 삭제됨)
//		ramyun2 = ramyun;
		Ramyun [] ramyuns = new Ramyun[count];	//라면들을 담을 배열 생성
		for(int i=0;i<count;i++) {
			Ramyun ramyun = new Ramyun();	//새로운 라면을 만들어야 하기때문에 for문안에 넣어야함
			ramyuns[i] = ramyun;			//라면을 라면들을 담을 배열에 대입
			
			ramyuns[i].title = "진라면";
			ramyuns[i].price = 3000;
			System.out.println(ramyuns[i]);
			System.out.println(ramyun);
		}
		

		return ramyuns;
	}
	
	public void makeKimbap() {
		
	}
	
}
