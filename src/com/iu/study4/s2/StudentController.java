package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {

	
	public void start() {
		//1. 학생정보 생성 -- makeStudents 호출
		//2. 학생정보 출력 -- StudentView 에서 출력
		//3. 프로그램 종료
		//StudentControler에서 입력
		Scanner sc = new Scanner(System.in);
		int select = 0;
		StudentService studentService = new StudentService();	//객체 선언
		StudentView studentView = new StudentView();			//객체 선언
		Student [] students = null;								// 데이터타입 Student [] 의 변수명 students를 null로 기본값을 지정해줌
		
		while(true){
		
			System.out.println("1. 학생정보생성");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 프로그램종료");
			select = sc.nextInt();
			
			if(select==1) {	
				students = studentService.makeStudents();	 //1번을 눌렀을때 studentService의 makeStudents 정보를 불러들이기 위함
			}else if(select==2){
				studentView.view(students);					//2번을 눌렀을때 studentView의 view를 불러들이기 위함
			}else if(select==3){
				//1. findBynum 호출
				Student student = studentService.findBynum(students);	//3번을 눌렀을때 Class studentService의 findBynum(students:변수명)을 데이터타입 Student에 변수명 student에 대입
				//2. viewOne으로 보내줌
				studentView.view(student);
			}else {	
				System.out.println("종료 합니다");				//4번을 눌렀을때 braek;를 만나 프로그램 종료가 됨.
				break;
			}
		}
	}
}
