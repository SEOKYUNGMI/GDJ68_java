package com.iu.study4;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
//		Card card = new Card();   //Card라는 데이터타입을 만듦.
//		card.cardNumber=3.1;		//.은 ~의 라는 뜻
		
		
//		Card card2 = new Card();
//		
//		
//		System.out.println(card.cvc);
//		System.out.println(card.name);
//
		
		Student s1 = new Student();
		s1.name="winter";
		s1.gender='W';
		
		Student s2 = new Student();
		s2.name="iu";
		s2.gender='F';
		
		//2. 멤버메서드 변수명.멤버메서드명()
		StudentView studentView=new StudentView(); // StudentView에서 보여질
		studentView.view(s1);	
		
		Student [] students=new Student [2];	//2개의 인덱스를 만들고 0,1에 들어갈 변수명을 대입		
		students[0]=s1;
		students[1]=s2;
		
		studentView.viewAll(students);		//변수명은 재사용 가능.


//		
//		Student s2 = new Student();
//		s2.name="kim";
//		
//		Student [] students = new Student[3];	// s1,s2를 모으려고 할때.
//		students[0]=s1;			
//		students[1]=s2;
//		System.out.println(students[2].name);   //[2].name에는 값을 주지 않았기 때문에 error가 남.
//		
//		for(int i=0;i<students.length;i++) {
//			System.out.println(students[i].name);  //students[i(0,1)] = 학생의 주소 .name = 의 이름.
//			System.out.println(students[i].id);
//		}
//		
//		s2=s1;		//s1의 주소가 s2로 대입.	
//		
//		System.out.println(s2.name);	//"seokyungmi"가 나옴.
		
		System.out.println("프로그램 종료");

	}

}
