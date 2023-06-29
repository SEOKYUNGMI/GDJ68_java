package com.iu.study3;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5};
		System.out.println("지우려고하는 idx번호를 입력하세요");
		int idx = sc.nextInt();
		
		int [] nums1 = new int [nums.length-1];

		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(idx==i) {
				continue;
			}
			nums1[index]=nums[i];		
			index++;             //continue를 만나서 다시 올라가기 때문에 +1 식을 한번 더 써줌.			
		
		}
	
		nums=nums1;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	
	}

}
