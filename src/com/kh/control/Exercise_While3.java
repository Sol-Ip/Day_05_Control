package com.kh.control;

import java.util.Scanner;

public class Exercise_While3 {
	// While문을 이용하여
	// -1이 입력될 때 까지 입력한 정수의 합을 출력하시오.
	
	// 정수 하나 입력 : 3
	// 정수 하나 입력 : 4
	// 정수 하나 입력 : 5
	// 정수 하나 입력 : 7
	// 정수 하나 입력 : -1
	// 입력하신 수의 합은 : 19
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		//int num= 0 ; 도 사용가능, 조건을 만족하기 때문.
		int sum = 0;
		// -1이 입력될 때 까지 반복!
		while ( num != -1 ) {
//			
//			입력한 정수 누적합 
//			
		 sum = sum + num ;
		System.out.print("정수 하나 입력 : ");
		num = sc.nextInt();
		
	  }
		System.out.println("입력하신 수의 합은 : "+ sum);

	}
	
	
		
}
