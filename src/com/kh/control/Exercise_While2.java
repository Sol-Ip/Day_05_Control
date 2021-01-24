package com.kh.control;

import java.util.Scanner;

public class Exercise_While2 {
	// (While문 이용) 정수를 하나 입력받아 그 수가 1~9 사이의 수일 때만
	// 그 수의 구구단을 출력하시오
	// 단, 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다."
	// 를 출력하시오.
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("1~9사이의 정수를 입력하세요 : ");
		int dan = sc.nextInt();
		if (dan >= 1 && dan <= 9) {
			int i = 1;
			while (i<10) {
//				 System.out.println(dan + " x " + i + " = " + (dan*i));

				System.out.printf("%d * %d = %2d \n", dan, i, dan*i); 
			i++;
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
			
		}
	}
}
