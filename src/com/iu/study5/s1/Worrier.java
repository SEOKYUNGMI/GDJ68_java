package com.iu.study5.s1;

public class Worrier extends Character{	//extends Character(부모테이블)상속받을때 {
	
	Axe axe;	//가지고있다
	
	@Override
	public void hit() {
		System.out.println("칼로 공격");
	}


}
