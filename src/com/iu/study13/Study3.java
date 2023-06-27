package com.iu.study13;

public class Study3 {
	
	public static void main(String [] args) {
		
		//국어점수를 담을 변수
		//영어점수를 담을 변수
		//수학점수를 담을 변수
    System.out.println("start");
    
    	int kor=0;
    	int eng=0;
    	int math=0;
    	
    	//총점을 담을 변수
    	
    	double avr=0;
    	
    	kor=37;
    	eng=30;
    	math=30;

    	int total=kor+eng+math;
        avr = total/3;
        
    System.out.println("총점 :" +total);	
    System.out.println("평균 :" +avr);
    
    //자동형변환
    avr = (double)kor;  //int타입을 double타입으로 형변환 
    avr = kor;          //int타입을 double타입으로 형변환 (bit로 따졌을때 표현할 수 있는 경우의수가 더 높은타입이라 가능)
    
    //강제형변환
    eng = (int)avr;     //double타입을 int타입으로 형변환
    //String name = (String)avr; 같은 타입끼리만 가능함 
    
    long n1 =0L;
    float f1 =0.0F;
    
    //n1 = f1;

    System.out.println("finish");
}

}