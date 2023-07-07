package com.iu.study5.s1;

public class Character {		//abstract가 class앞에 붙으면 직접 사용하지 않고 상속해서 사용하라는 뜻
	private int hp;
	private int damage;
	private int level;
	
	
	
	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	public final void getItem() {
		System.out.println("아이템 줍기");
	}
	
//	public abstract void hit();		//상속받은 자식 테이블에서 완성시키라는 뜻

	public void hit() {}
}
