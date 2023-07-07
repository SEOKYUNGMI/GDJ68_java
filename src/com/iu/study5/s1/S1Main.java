package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Worrier worrier = new Worrier();
		worrier.getItem();
		Magician magician = new Magician();
		magician.getItem();
		
//		worrier.axe.name	//전사가 가지고있는 도끼의 이름 이란 뜻
		Character character = magician;	//형변환 magician이 Character타입이다
		
		magician.setMp(20);
		
		
		character = worrier;
		
		Character [] w = new Character[2];	//worrier와 magician을 한곳에 담기위한 배열
		w[0]=worrier;
		w[1]=magician;
		
		magician = (Magician)w[1];	//magician에 mp를 쓰려고 할 때 w는 character타입이기 때문에 형변환을 해줘야함
		magician.setMp(20);
		
		
		worrier = (Worrier)w[0];	//worrier는 character 타입이기 때문에 worrier 인덱스에 넣고싶으면 Worrier로 형변환을 해줘야함
		magician = (Magician)w[1];	//magician는 character 타입이기 때문에 magician 인덱스에 넣고싶으면 Magician로 형변환을 해줘야함
//		Animal animal = new Animal();	// Animal 클래스에서 객체생성이 되지 못하게 막아서 에러
	}

}
