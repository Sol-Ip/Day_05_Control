package com.kh.control;

import java.util.Scanner;

public class Exercise_Control1 {
	// 키보드로 정수 두개를 받아 작은 수부터 큰 수까지의 
	// 모든 정수의 합을 구하여 출력하시오
	// 2 5
	// 2+3+4+5=14
	
	// 첫번째 수 : 2 
	// 두번째 수 : 5
	// 2에서 5까지의 합 : 14
	
	// 첫번째 수 : 5
	// 두번째 수 : 2
	// 2에서 5까지의 합 : 14
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("첫번째 수 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 수 : ");
		int b = sc.nextInt();
		
		
		
		// for문을 이용하여
		// 첫번재 정수부터 두번째 정수까지의 합 구하기
		// 1씩 증가, + 반복
		int sum = 0;
		int max = 0;
		int min = 0;
		
		
		if ( a > b ) {
			min = b;
			max = a;
		} else {
			min = a;
			max = b;
		}
		  for (int i = min; i <= max; i++) {
			sum += i;
		}
//		
//		int sum = 0;
//		if ( a > b ) {
//			for (int i = b; i <= a ; i++) {
//				sum += i ;
//			}
//		} else if (a < b ) {
//			for (int i = a; i <=b ; i++) {
//				sum += i ;
//			}
//		}
//		
//		for (int i = a ; i <=b ; i++) {
//			sum = sum + i;
//		}
		System.out.printf("%d 에서 %d까지의 합 : %d", a, b, sum);
	}
}
