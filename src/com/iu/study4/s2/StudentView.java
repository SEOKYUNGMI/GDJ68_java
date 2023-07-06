package com.iu.study4.s2;

public class StudentView {
	
	//학생정보 검색
	public void view(Student student) {
		System.out.println(student.getName());
		System.out.println(student.getNum());			
		System.out.println(student.getTotal());
		System.out.println(student.getAvg());
	}
	
	public void view(Student [] students) {
		
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
			this.view(student);					//메서드 안에서 같은것을 출력할때 this.메서드명
//			System.out.println(student.name);
//			System.out.println(student.num);			
//			System.out.println(students[i].total);
//			System.out.println(students[i].avg);
			System.out.println("=====================");
		}
		
	}

}
