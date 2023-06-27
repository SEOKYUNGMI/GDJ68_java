package com.iu.study2;

public class Condition1 {

	public static void main(String[] args) {
		//if (조건식) {조건식이 true일때만 실행}
		
		//단일 if를 사용
		//국어 영어, 수학 입력
		//총점과 평균을 계산
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//평균이 60점 이상이면 D를 출력
		//그외는 F를 출력
		
		int kor=80;
		int eng=90;
		int math=78;
		int total=kor+eng+math;
		double avg=total/3;
		System.out.println("총점은 "+total);
		System.out.println("평균은 "+avg);
		String to=" "; //String to="F"로 지정해주면 if(avg<60){}이 생략가능.
		if(avg>=90) {
			to="A";
			}
		if(avg>=80 && avg<90) {
			to="B";
			}
		if(avg>=70 && avg<80) {
			to="C";
			}
		if(avg>=60 && avg<70) {
			to="D";
			}
		if(avg<60) {
			to="F";
			}
		System.out.println("학점은 "+to);

   }
}