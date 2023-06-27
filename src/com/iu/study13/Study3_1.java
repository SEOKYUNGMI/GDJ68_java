package com.iu.study13;

public class Study3_1 {
				
	public static void main(String[] args) {
		int num1=17;
		double avg = (double)num1/(double)2; //2앞의 (double)은 자동형변환 되어서 생략가능함.
		
		avg = num1/(double)2;
		
		avg = num1/2.0; //2.0이 소수점타입(double)이기 때문에 num1도 double로 자동형변환 됨.
		
		char ch='a';
		
		num1 = ch;
		
		num1 = 115;
		
		ch = (char)num1;
		
		ch = '1';
		num1 = ch;
		
		num1 = ch+1; //문자열 ch가 숫자형변환 되어 출력이됨.
		
		System.out.println(avg);
		System.out.println(num1);
		System.out.println(ch);
		
		System.out.println(1+"1");
		
	}
	
}
