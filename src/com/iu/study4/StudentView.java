package com.iu.study4;

public class StudentView {
	
	//Student 정보를 출력
	//view
	public void view(Student s) {		//view(데이터타입 변수명)
		System.out.println(s.name);
		System.out.println(s.gender);
	}
	
	public void viewAll(Student [] ss) {   //Main에서 만든 students[] 배열을 매개변수로 받고
		for(int i=0;i<ss.length;i++) {	//System.out.println(ss[0].name);System.out.println(ss[0].name);... 
		System.out.println(ss[i].name);	//써줘도 되지만 반복문으로 i라는 변수를 만들어 출력되게 만듦
		System.out.println(ss[i].gender);
		}
	}
	//viewAll
	//모든 student 정보를 출력
	//단, viewAll 매개변수는 딱 한개만 선언

}
