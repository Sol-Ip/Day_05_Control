package com.kh.control;

import java.util.Scanner;

public class Exercise_For2 {
	// (for�� �̿�) ������ �ϳ� �Է¹޾� �� ���� 1~9 ������ ���� ����
	// �� ���� �������� ����Ͻÿ�
	// ��, ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�."
	// �� ����Ͻÿ�.
	// 2 * 1 = 2 , 2 * 2 = 4 ~~ 2 * 9 = 18
	public static void main(String []arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9������ ������ �Է��ϼ��� : ");
		int dan = sc.nextInt();
		// 1<=dan<=9
		if ( dan >= 1 && dan <= 9) {
			for (int i = 1; i<10; i++) {
				System.out.println(dan + "*" + i + "="+(dan*i));
				
//				//������ �� �� printf ~~ %2d �� ��� 
//				System.out.printf("%d * %d = %2d \n", dan, i, dan*i);
		    	}
		} else {
			System.out.print("1~9������ ����� �Է��Ͽ��� �մϴ�.");
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
