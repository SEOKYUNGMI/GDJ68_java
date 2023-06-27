package com.iu.study13;

public class Study13 {
	
	public static void main(String [] args) {
		System.out.println("Program Start");
		
		//변하는 Data => 변수
		//변하지 않는 Data => 상수		
		//변수 선언 규칙
		// 데이터타입명 변수명;
		byte num1;
		short num2;
		int num3;
		long num4;
		
		
		//변수에 Data를 대입
		num1 = 3;
		num2 = 130;
		num3 = 2000000000;
		num4 = 300000000000L;
		
		//초기화
		//변수를 선언하고 최초로 값을 대입하는것
		int num5=20;
		
		int num6;		
		
		//변수는 초기화 하지 않고 사용이 불가
		//System.out.println(num6); // ()에 있는 변수값을 프린트
		
		float f1 = 3.2f;
		double d1 = 3.2;
		
		//문자는 한글자만 가능
		char ch = 'a';
		
		//논리
		boolean check=true;//or false
		
		//문자열
		String name="winter";
		
		System.out.println("Program Finish");
	}

}
