package Example_Q_For;

import java.util.Scanner;

public class Exer_01 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		// �� ���� ���� �Է� �޾� 1���� �� ���� ������ 
		// ���ڵ��� ��� ����ϱ�
		// ��, �Է��� �� > = 1
		// 1 �̸��� ���ڰ� �Էµ� ��,
		// "1 �̻��� ���ڸ� �Է����ּ���" �� ����ϱ� 
		System.out.print("1 �̻��� ���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
	    
		if (num >= 1) {
			int i = 1;
	    while (i <= num) {
					System.out.printf("%d ", i);
				i++;
				} 
			} else {
					System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				}
			}
	}


