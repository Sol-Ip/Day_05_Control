package com.kh.control;

import java.util.Scanner;

public class Exercise_Control1 {
	// Ű����� ���� �ΰ��� �޾� ���� ������ ū �������� 
	// ��� ������ ���� ���Ͽ� ����Ͻÿ�
	// 2 5
	// 2+3+4+5=14
	
	// ù��° �� : 2 
	// �ι�° �� : 5
	// 2���� 5������ �� : 14
	
	// ù��° �� : 5
	// �ι�° �� : 2
	// 2���� 5������ �� : 14
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("ù��° �� : ");
		int a = sc.nextInt();
		
		System.out.print("�ι�° �� : ");
		int b = sc.nextInt();
		
		
		
		// for���� �̿��Ͽ�
		// ù���� �������� �ι�° ���������� �� ���ϱ�
		// 1�� ����, + �ݺ�
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
		System.out.printf("%d ���� %d������ �� : %d", a, b, sum);
	}
}
