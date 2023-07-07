package com.iu.study5.s1;

public class Archer extends Character{	//extends Character(부모테이블)상속받을때
	
	@Override
	public void hit() {
		System.out.println("활쏘기");	
	}

}
