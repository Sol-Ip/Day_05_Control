package Example_Q_For;

import java.util.Scanner;


public class Exer_03 {
	public static void main(String []args) {
		 // 1���� �Է� ���� �� ���� �������� ���� ���(for�� �̿�)
		 // ������ �ϳ� �Է��ϼ��� : 8
		 // 1+2+3+4+5+6+7+8=36
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i<=num; i++) {
			sum +=i; //sum = sum + i;
			if (i <num) {
				System.out.print( i + " + ");
			} else { // i == num
				System.out.print( i + " = ");
			}
		}
		System.out.print(sum);
	}
}