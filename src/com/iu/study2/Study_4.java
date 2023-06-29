package com.iu.study2;

import java.util.Scanner;

public class Study_4 {

	public static void main(String[] args) {
			
		for(int i=0;i<5;i++) {  //i=0의 값을 주고 5보다작은 조건식이 맞으면 hello가 출력되고 다시 i를 ++로 증감(i가 5가 되면 출력이 끝남)
			System.out.println("hello");
		}
		int j=567;
		for(j=0;j<3;j--) {  //j=j-1과 j--가 같음
		}	
		
		//--------
		Scanner sc = new Scanner(System.in);
		
		//hello 출력
		//키보드로부터 출력 횟수를 입력받음
		
		System.out.println("횟수를 입력");
		int count=sc.nextInt();
		
		for(int k=0;k<=count;k++) {     //(int k=count;c>0;c--)
			System.out.println("hello");
		}
	  	

	}
}