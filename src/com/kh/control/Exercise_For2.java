package com.kh.control;

import java.util.Scanner;

public class Exercise_For2 {
	// (for문 이용) 정수를 하나 입력받아 그 수가 1~9 사이의 수일 때만
	// 그 수의 구구단을 출력하시오
	// 단, 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다."
	// 를 출력하시오.
	// 2 * 1 = 2 , 2 * 2 = 4 ~~ 2 * 9 = 18
	public static void main(String []arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9사이의 정수를 입력하세요 : ");
		int dan = sc.nextInt();
		// 1<=dan<=9
		if ( dan >= 1 && dan <= 9) {
			for (int i = 1; i<10; i++) {
				System.out.println(dan + "*" + i + "="+(dan*i));
				
//				//정렬을 할 때 printf ~~ %2d 를 사용 
//				System.out.printf("%d * %d = %2d \n", dan, i, dan*i);
		    	}
		} else {
			System.out.print("1~9사이의 양수를 입력하여야 합니다.");
		}
		
}
		
//		for(int i = 2; i<=9; i++) {
//			
//			for(int n =1; n<10; n++) {
//			System.out.println(i + "x" + n + "=" + (i*n));
//	    	}
//			
//		}
	}
