package com.kh.control;

import java.util.Scanner;

public class Exercise_While2 {
	// (While�� �̿�) ������ �ϳ� �Է¹޾� �� ���� 1~9 ������ ���� ����
	// �� ���� �������� ����Ͻÿ�
	// ��, ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�."
	// �� ����Ͻÿ�.
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("1~9������ ������ �Է��ϼ��� : ");
		int dan = sc.nextInt();
		if (dan >= 1 && dan <= 9) {
			int i = 1;
			while (i<10) {
//				 System.out.println(dan + " x " + i + " = " + (dan*i));

				System.out.printf("%d * %d = %2d \n", dan, i, dan*i); 
			i++;
			}
		} else {
			System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
			
		}
	}
}
