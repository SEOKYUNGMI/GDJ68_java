package com.iu.study13;

public class Study2 {
	
	public static void main(String [] args) {
		System.out.println("시작");
		int num1=20;
		int num2=50;
		int num3=num1 % num2;
		
		String name="1";
		String result= name+true;
		
		int count=78;
		
		count=count+1;
		
		//후행(++을 뒤에 붙임)
		count++;//count=count+1;과 같은값이 나옴
		//선행(++을 앞에 붙임)
		++count;//count=count+1;과 같은값이 나옴
		
		count--;//count=count-1;과 같은값이 나옴
		--count;//count=count-1;과 같은값이 나옴
		
		int r=count++;//++를 뒤에 붙이면 ++연산자보다 =(대입)연산자가 우선순위가 됨.
		int d=++count;
		
		count=count+1;
		count+=1;
		count=count*5;
		count*=5;
		count=count%3;
		count%=3;
		
		System.out.println("Count : " +count);
		System.out.println("R : "+r);
		System.out.println("D : "+d);
		System.out.println(result);
		
		System.out.println("종료");
	}

}
