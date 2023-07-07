package com.iu.study3;

public class Array_3 {

	public static void main(String[] args) {
		//nums : 4칸 만들기
		int [] nums = {1,2,3,4};
		System.out.println(nums.length);       //배열의 길이를 알 수 없을때 .length를 씀.  출력문 nums.length = 4

		//nums : 5칸 만들기

		int [] copyNums = new int [nums.length+1];  //.length+1 ->기존의 배열길이에 하나를 추가 하고싶을때 사용.
													//기존의 배열길이는 변경되지 않기때문에 새로 추가를 해줘야함.
		for(int i=0;i<nums.length;i++) {
			copyNums[i]=nums[i];
		}

		copyNums[nums.length]=5;    //배열을 하나 추가했기 때문에 값을 줌.
		
		nums=copyNums;
		
		//nums : 다시 4칸 만들기
		
		copyNums = new int [nums.length-1]; //4
		
		for(int i=0;i<copyNums.length;i++) {
			copyNums[i]=nums[i];
		}
				
		nums=copyNums;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("추가할 번호를 입력하세요");
	}

}
