package com.kh.control;

import java.util.Scanner;

public class Exam_For1 {
	public static void main(String [] args) {
		
	
//		Scanner sc = new Scanner(System.in);
//		for (; ;) {
//			//���� �ݺ�
//			System.out.print("���� �ϳ� �Է����ּ��� : ");
//			sc.nextInt();
//		}
//	}
		// i�� 0���� 9���� �����ڵ带 �ݺ��� -> �� 10�� �ݺ���
		for (int i = 0; i < 10 ; i++) {
			System.out.println("��µ� i�� �� : " + i);
		  }
		System.out.println();
		//i�� 9���� 0���� �����ϸ鼭 �����ڵ� �ݺ� -> �� 10�� �ݺ���
		for(int i = 9; i>=0; i--) {
			System.out.println("��µ� i�� �� : " + i);
		}
		// i�� 0���� 2�� �����ϸ鼭 9���� �����ڵ带 �ݺ��� 
		// 0 -> 2 -> 4-> 6-> 8
		  for(int i = 0; i<10; i+=2) {
			  System.out.println("��µ� i�� �� : " + i);
		  }
		}
   }
