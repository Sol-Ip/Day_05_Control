package com.kh.control;

import java.util.Scanner;

public class Exercise_While5 {
	//	While 문을 이용하여 정수 여러개를 입력받고,
	//	평균을 출력하라. 단, -1이 입력되면 입력을 종료하시오.
	
	//	정수를 입력하고 마지막에 -1을 입력하세요
	//	10 20 3 -20 -10 -1
	//	정수의 개수는 5개이며 평균은 0.6입니다.
	
	//	정수를 입력하고 마지막에 -1을 입력하세요
	//	-1
	//	입력된 수가 없습니다.
	public static void main(String []args) {

		int sum = 0;
		int count = 0; //정수의 개수 count
		
		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int num = sc.nextInt();

			while (num!=-1) {
				sum = sum + num ;
				count++;
				num = sc.nextInt();
				}
			if (count == 0 ) {
				System.out.println("입력된 수가 없습니다.");
		    	} else {
			System.out.println("정수의 개수는 " + count + "개이며");
			System.out.println("평균은" + (double)sum/count + "입니다.");
		}
		
	}
}
