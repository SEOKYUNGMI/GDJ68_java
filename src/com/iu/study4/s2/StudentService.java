package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student findBynum(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호를 입력하세요");
		int num = sc.nextInt();						// 번호를 받음
		
		Student student = null;						// 데이터타입 Student의 변수명 student를 null로 기본값을 지정해줌 
		
		for(int i=0;i<students.length;i++) {		// 학생의 번호를 찾아야 하기 때문에 반복문을 써줌 (학생수가 정해져 있기 때문에 for문을 씀)
			if(num==students[i].getNum()) {
				student = students[i];				
				break;
			}
		}
		
		return student;
	}	
	
	public Student makeStudentOne() {
		//학생 1명 만들어서 이름, 번호, 국어, 영어, 수학
		//총점 평균을 계산
		//학생을 리턴
		Scanner sc=new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("이름을 입력하세요");
		student.setName(sc.next());
		System.out.println("번호를 입력하세요");
		student.setNum(sc.nextInt());
		System.out.println("국어점수를 입력하세요");
		student.setKor(sc.nextInt());
		System.out.println("영어점수를 입력하세요");
		student.setEng(sc.nextInt());
		System.out.println("수학점수를 입력하세요");
		student.setMath(sc.nextInt());
//		student.total = student.kor+student.eng+student.math;
//		student.avg = student.total/3.0;
		return student;
	}

	public Student [] makeStudents() {
		//학생수 입력 scanner만들기
		//학생수 만큼 학생들이 만들어짐
		//이름, 번호, 국어, 영어, 수학 점수입력(출력문 "이름을 입력하세요" ..) 반복문으로 만들기
		//총점, 평균 계산
		//학생들을 리턴
		//1.학생 배열을 생성
		//2.학생수 만큼 반복문 실행
		//3.반복문 내에서 이름, 번호, 국어, 영어, 수학 입력 총점 평균
		//4.해당 학생을 배열에 대입
		Scanner sc=new Scanner(System.in);
		
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();

		Student [] students = new Student [count]; // 배열 선언
		for(int i=0;i<count;i++) {
			Student student = new Student(); // 객체 선언
			students[i]=student;
			System.out.println("이름을 입력하세요");
			student.setName(sc.next());
			System.out.println("번호를 입력하세요");
			student.setNum(sc.nextInt());
			System.out.println("국어점수를 입력하세요");
			student.setKor(sc.nextInt());
			System.out.println("영어점수를 입력하세요");
			student.setEng(sc.nextInt());
			System.out.println("수학점수를 입력하세요");
			student.setMath(sc.nextInt());
			student.cal();
//			student.total = student.kor+student.eng+student.math;
//			student.avg = student.total/3.0;		
		}
		return students;
	}
	
}
