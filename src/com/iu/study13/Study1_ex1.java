package com.iu.study13;

public class Study1_ex1 {

	public static void main(String [] args) {
		System.out.println("프로그램 시작");
		
		//자기정보를 변수에 담아서 출력
		//이름, 나이, 키, 전화번호, 혈액형, 졸업학점
		
		String name = "서경미";
		int age = 33;
		int height = 165;
		String phone = "010-4811-3687";
		String blood = "AB";
		double jumsu = 4.12;		
		
		System.out.println("당신의 이름은 "+name);
		System.out.println("당신의 나이는 "+age+"세 입니다");
		System.out.println(height);
		System.out.println(phone);
		System.out.println(blood);
		System.out.println(jumsu);
		System.out.println("프로그램 종료");
	}

}
