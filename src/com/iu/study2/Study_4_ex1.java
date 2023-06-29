package com.iu.study2;

public class Study_4_ex1 {

	public static void main(String[] args) {
		// 0-10미만의 숫자 중 짝수 만 출력
		for (int n=0;n<10;n++) {
			if(n%2==0) {
			System.out.println(n);
			}
		}
		
		//0-10미만의 숫자 중 짝수만 출력
		//단, if문 사용 X

		for (int n=0;n<10;n=n+2) {
			System.out.println(n);
			//n++;
		}
		
		//a-z 출력
		for (int e='a';e<='z';e++){//(int e=97;e<=122;e++) {
			System.out.println((char)e);
		}
	}

}
