package com.kh.control;

import java.util.Scanner;

public class Exercise_While5 {
	//	While ���� �̿��Ͽ� ���� �������� �Է¹ް�,
	//	����� ����϶�. ��, -1�� �ԷµǸ� �Է��� �����Ͻÿ�.
	
	//	������ �Է��ϰ� �������� -1�� �Է��ϼ���
	//	10 20 3 -20 -10 -1
	//	������ ������ 5���̸� ����� 0.6�Դϴ�.
	
	//	������ �Է��ϰ� �������� -1�� �Է��ϼ���
	//	-1
	//	�Էµ� ���� �����ϴ�.
	public static void main(String []args) {

		int sum = 0;
		int count = 0; //������ ���� count
		
		Scanner sc = new Scanner (System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int num = sc.nextInt();

			while (num!=-1) {
				sum = sum + num ;
				count++;
				num = sc.nextInt();
				}
			if (count == 0 ) {
				System.out.println("�Էµ� ���� �����ϴ�.");
		    	} else {
			System.out.println("������ ������ " + count + "���̸�");
			System.out.println("�����" + (double)sum/count + "�Դϴ�.");
		}
		
	}
}
