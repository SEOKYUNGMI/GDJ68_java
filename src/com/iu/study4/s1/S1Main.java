package com.iu.study4.s1;

public class S1Main {

	public static void main(String[] args) {
// 불러올클래스명 변수명 = new 불러올클래스명();
		Hap hap = new Hap();
		
		int sum = hap.h1(10, 20);//Hap에서 만든 h1에(int num1=10, int num2=20);과 같음.
		
		//h2 결과 출력
		boolean check = hap.h2(20);
		System.out.println(check);
		
		//h3 length 출력
		int [] ar = hap.h3(7);
		System.out.println(ar.length);
		
		//*2
		System.out.println(sum*2);

	}

}
