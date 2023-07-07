package com.iu.study4.s5;

public final class FinalTest {	//상속불가
	
	public static final int SIZE=50;	//static은 객체 만들지 않고 사용가능
	

	public final int MAX_NUM;	//int 앞에 final(그외지정자)가 붙으면 상수-한번 입력한 값은 변경이 불가
	
//	{
//		this.num=20;		//값을 변경하고 싶으면 instance블럭을 사용할 수 있음
//	}
	
	public FinalTest() {
		this.MAX_NUM=20;		
	}
	
	public final void finalMethod() {	//오버라이딩 불가
			final int a=10;	//int 앞에 final(그외지정자)가 붙으면 상수-한번 입력한 값은 변경이 불가
			
	}
}
