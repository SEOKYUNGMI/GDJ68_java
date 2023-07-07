package com.iu.study3;

import java.util.Random;

public class Array_5 {

	public static void main(String[] args) {
		int [] nums = new int [6];
		Random random = new Random();
		
		for(int i=0;i<nums.length;i++) {  //중복이 되지않게 5번을 반복해야함.
			nums[i]=random.nextInt(45)+1;
			
			for(int j=0;j<i;j++) {
				//중복 확인 코드
				//i가 0이면 X
				//i가 1이면 0비교
				//i가 2이면 0,1비교
				//i가 3이면 0,1,2비교
				//...
				if(nums[i]==nums[j]) {
					i--;
				}
			
			}
			//0 : 12345
			//1 : 2345
			//2 : 345
			//...
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<6;j++) {		//i=0이기 때문에 i+1로 한번 더 돌았을때 1이되게 함
				if(nums[i]>nums[j]) {
					int tmp=nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
			
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
//		random.nextInt(10)+1;      //0~9까지 나오기 때문에 +1해줘야 1~10까지 나옴
		

	}

}
