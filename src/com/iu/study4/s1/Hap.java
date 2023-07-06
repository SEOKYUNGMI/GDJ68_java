package com.iu.study4.s1;

public class Hap {
//		리턴타입 void는 리턴하지 않을때 사용(어떤 데이터 타입도 상관없음)
	public int h1(int num1, int num2) {    //받아온 두개의 정수를 합함
		int sum = num1+num2;
		System.out.println(sum);
		return sum;
	}
	
	public boolean h2(int num) {
		//num이 홀수면 true, 짝수면 false 리턴
		boolean result=false;
		if(num%2 !=0) {
			result= !result; // result=true;와 같음
		}
		
		return result;
	}

	public int [] h3(int count) {
		//count 수만큼 정수를 담을 배열을 만들어서 리턴
//		int [] ar = new int[count];
//		return ar;                 로 쓸 수 있음
		return new int[count];
	}
}
