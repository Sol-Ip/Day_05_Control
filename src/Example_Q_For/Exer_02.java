package Example_Q_For;

import java.util.Scanner;

public class Exer_02 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		// �� ���� ���� �Է� �޾� 1���� �� ���� ������ 
		// ���ڵ��� ��� "�Ųٷ�" ����ϱ�
		// ��, �Է��� �� > = 1
		// 1 �̸��� ���ڰ� �Էµ� ��,
		// "1 �̻��� ���ڸ� �Է����ּ���" �� ����ϱ� 
		System.out.print("1 �̻��� ���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			int i = 1;
		while (i <= num && i>0 ) {
			System.out.printf("%d ", num);
			num--;
		 }
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
	    	}
		}
	}
