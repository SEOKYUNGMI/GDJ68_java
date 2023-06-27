package com.iu.study13;

import java.util.Scanner;

public class Study2_ex2 {
	
	public static void main(String [] args) {
		/*
		  여러줄 주석
		  여기도 주석
		 */
		
		/**
		 * 문서작성시 주석
		 */
		
		
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		
		//입력   출력		
		//0    0      0
		//1    01     0
		//2    02     0
		//3    03     0
		//4    10     6
		//5    11     6
		//6    12     6
		//7    13     6
		//8    20    12
		//9    21    12
		//10   22    12
		//11   23    12
		//12   30    18
		//13   31    18
		//14   32    18
		//15   33    18
		//16   40    24
		//17   41    24
		//18   42    24
		//19   43    24
        //20   50    30
		//400  1000  600 
		System.out.println("입력하세요 ");
		int input=sc.nextInt();
		
		int output=input/4*10 + input%4;  //입력한 값을 4로 나눈다음 10을 곱하고 입력한값에서 4로나눈 나머지 값을 구한다음 더해줌.
		
		
		
		System.out.println("Input :"+input+" Output :"+output);
		System.out.println("finish");		
	}

}
