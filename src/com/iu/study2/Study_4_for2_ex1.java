package com.iu.study2;

import java.util.Scanner;

public class Study_4_for2_ex1 {
	
	public static void main(String[] args) {
		
		//FPS
		//30발, 3탄창
		//M16, 2가지: 단발, 3점사

		//1. 단발, 2. 점사
		//탕,     타타탕
		
		Scanner sc = new Scanner(System.in);
		
		for(int tan=0;tan<3;tan++) {
			System.out.println("1.단발 2.점사");
			int select=sc.nextInt();
			int count=10;
			String sound="타타탕";
			if(select==1) {
				count=30;
				sound="탕";
			}
//			else {
//				count=10;
//				sound="타타탕";
//				}
			for(int cc=1;cc<count;cc++) {
				System.out.println(sound);
				
			}
		}
//		for(int tan=0;tan<3;tan++) {
//			System.out.println("1.단발 2.점사");
//			int select=sc.nextInt();
//			if(select==1) {
//				for(int c=1;c<30;c++) {
//					System.out.println("탕");
//				}
//				
//			}else {
//				for(int cc=1;cc<10;cc=cc++) {
//					System.out.println("타타탕");
//				}
//				
//			}
//		}
				
	}

}


