package com.iu.study2;

import java.util.Scanner;

public class Study_4_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check=false;
		
		for(int n=0;n<5;n=n+1) {
			System.out.println("ID를 입력하세요");
			int Id=sc.nextInt();
			System.out.println("PW를 입력하세요");
			int Pw=sc.nextInt();
			if(Id==id && Pw==pw) {
				System.out.println("로그인 성공");
				check=!check;  //check=true;와 같음
				n=4;
				break;
			}else {
				System.out.println("ID 또는 PW가 틀렸습니다");
			}			
		}
		//System.out.println(n); 반복문이 끝나면 n은 데이터가 삭제되어서 출력이 안됨
		//로그인 성공시 급여계산 출력
		if(check) {
			System.out.println("급여 계산");
		}
		
		System.out.println("프로그램 종료");
		//로그인 시도 최대 5번까지
		
	}	

}
