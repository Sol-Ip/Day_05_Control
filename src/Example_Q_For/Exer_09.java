package Example_Q_For;

import java.util.Scanner;

public class Exer_09 {
	public static void main(String []args) {
		// 1���� ����ڿ��� �Է� ���� ������ �߿���
		// 2�� 3�� ����� ��� ����ϰ�
		// 2�� 3�� ������� ������ ����ϼ���
		
		Scanner sc = new Scanner (System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int count = 0;
		for( int i=1; i<=num; i++) {
			if ( i%2 == 0 || i%3 == 0 ) { // 2 �Ǵ� 3 ���� ������ �������� ���
				System.out.print(i + " ");
			}
			if (i%2 == 0 && i%3 == 0) { // 2�� 3���� ������ �������� ���
				count++; 
			}
		}
		System.out.println();
		System.out.println("count : "+ count);
	}
}
