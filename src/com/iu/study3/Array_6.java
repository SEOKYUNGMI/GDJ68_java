package com.iu.study3;

public class Array_6 {

	public static void main(String[] args) {
		double [] ar = new double [3];
		ar[0]=1.2;
		ar[1]=3;  //double로 자동 형변환됨
		
		int [] nums1 = new int[3];		
		int [] nums2 = new int[3];		
		System.out.println(nums1 == nums2);
		nums1 = nums2;
		System.out.println(nums1 == nums2);
		//데이터타입 [] 변수명
		//int [][] ars = new int [2][2]; //int[]을[]에 담은것.
		
		int [][] ars= {{1,2},{3,4}}; //배열안에 배열
		
		ars = new int[2][];//가변배열
		ars[0]= new int[3];
		ars[1]= new int[6];
		//{{0,0,0},{0,0,0,0,0,0}};
		// -0,1,2   0,1,2,3,4,5를 뜻함
		for(int i=0;i<ars.length;i++) {
			for(int j=0;j<ars[i].length;j++) {
				System.out.println(ars[i][j]);
			}
		}
		int a = 0;
//		a = a+1; System.out.println(a); a에 값을 넣거나 출력을 해줘야함.
		
		

	}

}
