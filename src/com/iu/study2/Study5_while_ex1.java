package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  //Scanner ctrl+space 누르고 enter로 헤야함. 
		int id=1234;
		int pw=5678;
		
		
		//while
		//1. 로그인 시도 2. 프로그램 종료 
		//
		boolean check=true;
		while(check) {
			System.out.println("1.로그인 시도 2.프로그램 종료");
			int i=sc.nextInt();
			
			if(i==1){
				System.out.println("ID를 입력하세요");
				int Id=sc.nextInt();
				System.out.println("PW를 입력하세요");
				int Pw=sc.nextInt();
				if(Id==id && Pw==pw) {
					System.out.println("로그인 성공");				
					break;
				}else {
					System.out.println("로그인 실패");
			}
			}else {	
				check=!check;    //check=false;
				break;	
			}
		}//while 끝
		
		if(check) {
		//예제
		//로그인 성공 했을 때만 진행
		//MMORPG
		//시작레벨:1
		//모든 몬스터의 경험치는 동일
		//최대레벨:15
		//GOLD : 0
		//5레벨 달성시 : 1000GOLD지급
		//10레벨 달성시 : 2000GOLD 지급
		//15레벨 달성시 : 3000GOLD 지급
		//1 -> 2 : 3 ("사냥성공") 세번출력 ("레벨업")
		//2 -> 3 : 6 
		//3 -> 4 : 9
		//4 -> 5 : 12
		//...
		//14 -> 15 : 42
		//렙업시 게임을 계속할지 종료할지 선택
		int level=1; //for 안에 넣으면 지역변수라 실행 후 삭제되어서 밖에 선언
		int gold=0;
		
		for(level=1;level<15;level++) {
			
			if(level%5==0)  {
				System.out.println(level +"렙 달성 축하합니다");
				gold = gold + level/5*1000;
			}
//			if(level==10) {
//				System.out.println("10렙 달성 축하합니다");
//				gold = gold + 2000;				
//			}
			
			//렙업시 게임을 계속할지 종료할지 선택
			System.out.println("1.실행 2.종료");
			int select=sc.nextInt();
			if(select !=1) {	
				break;
			}
			
			for(int monster=0;monster<level*3;monster++) {
				System.out.println(monster+1+" 마리 사냥 성공");
			}
			
			System.out.println(level+1+ " 로 렙업 했습니다.");
		}
		if(level==15) {
			gold=gold+3000;
		}
		
		//현재레벨, GOLD 가 출력
		System.out.println("현재레벨 " + level);
		System.out.println("현재GOLD " + gold);
		}
		System.out.println("프로그램 종료");
//		int level=1;
//		int gold=0;
//		int g=0;
//		
//		
//		
//		for(level=1;level<16;level++) {
//			System.out.println("1.실행 2.종료");
//			int start=sc.nextInt();
//			if(start==1) {
//				for(int i=1;i<=level*3;i++) {
//					System.out.println("사냥성공");
//				}if(level==5) {
//					System.out.println("1000GOLD 지급");					
//					gold += 1000;
//				}else if(level==10) {
//					System.out.println("2000GOLD 지급");
//					gold += 2000;
//				}else if(level==15) {
//					System.out.println("3000GOLD 지급");
//					gold += 3000;
//					break;
//				}
//
//			}
//			else {
//				break;
//			}
//			System.out.println("현재레벨 : "+level+"  GOLD : "+gold);
//		}  
//		    System.out.println("현재레벨 : "+level+"  GOLD : "+gold);
//			System.out.println("프로그램 종료");

	}
	
}
			
//		int gold = 0;
//		int level = 1;
//		
//		for(level=1; level<15; level++) {
//			System.out.println("현재 레벨 : "+level+" / 현재 Gold : " + gold);
//			System.out.println("사냥을 시작하시겠습니까? 1. 시작 , 2. 종료");
//			int fight = sc.nextInt();
//			if(fight==1) {
//				for(int i=1; i<=level*3; i++) {
//					System.out.println("몬스터 사냥 성공");
//					if(level==i*5-1) {
//						gold = gold + (level+1)*200;
//					}
//				}
//			}else if(fight==2){
//				break;
//			}else {
//				level=level-1;
//			}
//			System.out.println("(경)   레 벨 업   (축)");
//		}
//		System.out.println("최종레벨 : " + level + " / 최종 GOLD : " + gold);
//		System.out.println("-------------------만렙엔딩-------------------");
//		System.out.println("프로그램종료");
//		
		//현재레벨, GOLD 가 출력

		
