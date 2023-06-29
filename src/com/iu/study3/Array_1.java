package com.iu.study3;

public class Array_1 {

	public static void main(String[] args) {
		//배열(array)
		int num=0;
		int num2=2;
		double d=3.12;
		
		//데이터타입 변수명
		//모으려고하는 데이터타입[] 변수명 = new 모으려고하는 데이터타입[갯수];
		int [] nums = new int [2]; 			//[]까지가 데이터타입 (int 데이터타입과 다름), Reference Type(참조타입)
											//= 4byte를[2]개 만듦
											//실행했을때 '@'다음이 메모리주소/앞의 [I <- int, [lang.String <- String 타입 이라는 뜻
		double [] avgs = new double[3];	
		char [] chs = new char[3];
		boolean [] checks = new boolean[3];
		System.out.println(num);		   
		System.out.println(nums);
		//배열 사용 : 배열의변수명[인덱스번호], index번호는 정수타입(int)
		System.out.println(nums[0]);
		System.out.println(avgs[0]);
		System.out.println(chs[0]);
		System.out.println(checks[0]);
		//문자열 3개를 모을 배열 선언
		String [] names = new String[3];
		System.out.println(names);
		System.out.println(names[0]);		//알수없는 무한대의 값은 null로 출력됨	

		int [] nums2 = {1,2,3};    //{}안에 값을 넣으면 미리 값을 지정가능.
		
		int nums3 [] = new int [3]; //변수명과 [] 순서를 바꿔도 입력은 가능하지만 구분이 불가능.
		nums = nums2;				//nums가 nums2의 url로 따라가게 됨
		
	}

}
