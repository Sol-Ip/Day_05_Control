package com.kh.control;

import java.util.Scanner;

public class Exercise_While4 {
	// While���� �̿��Ͽ� -1�� �� �� ���� 
	// �Է��� ������ ���� ����Ͻÿ�
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		int input = 0;
		int total = 0;
		while(check) {
			System.out.print("�Է� : ");
			input = sc.nextInt();
//			
//			-1�� �Է� �Ǿ��� �� check���� false�� ����
//			while���� ���̻� �ݺ��� �� ��
//			
			if(input == -1) {
				check = false;
			} else {
				total = total + input ;
			}
		}
		System.out.println("�Է��� ������ �� : " + total);
	}
}
