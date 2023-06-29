package com.iu.study3;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 갯수를 입력하세요");
		int count=sc.nextInt();
		
		int [] nums = new int[count];
		for(int i=0;i<count;i++) {
			System.out.println(i+1+" 번째 숫자 입력"); //i의값이 0으로 선언되어 있어서 +1을 해줘야 1부터 나옴.
			nums[i]=sc.nextInt();	
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(nums[i]);
		}
//		int [] nums = new int[3];
//		
//		nums[0]=3;
//		nums[1]=2;
//		nums[2]=1;
//
//		System.out.println(nums[0]);	
//		System.out.println(nums[1]);	
//		System.out.println(nums[2]);	
//		System.out.println(nums[3]);	//선언할때 nums int[]에 3을 넣었기 때문에 0~2까지 생성되어서 에러가뜸.
	}

}
