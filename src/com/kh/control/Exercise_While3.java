package com.kh.control;

import java.util.Scanner;

public class Exercise_While3 {
	// While���� �̿��Ͽ�
	// -1�� �Էµ� �� ���� �Է��� ������ ���� ����Ͻÿ�.
	
	// ���� �ϳ� �Է� : 3
	// ���� �ϳ� �Է� : 4
	// ���� �ϳ� �Է� : 5
	// ���� �ϳ� �Է� : 7
	// ���� �ϳ� �Է� : -1
	// �Է��Ͻ� ���� ���� : 19
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		//int num= 0 ; �� ��밡��, ������ �����ϱ� ����.
		int sum = 0;
		// -1�� �Էµ� �� ���� �ݺ�!
		while ( num != -1 ) {
//			
//			�Է��� ���� ������ 
//			
		 sum = sum + num ;
		System.out.print("���� �ϳ� �Է� : ");
		num = sc.nextInt();
		
	  }
		System.out.println("�Է��Ͻ� ���� ���� : "+ sum);

	}
	
	
		
}
