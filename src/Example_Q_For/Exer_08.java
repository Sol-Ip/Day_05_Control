package Example_Q_For;

import java.util.Scanner;

public class Exer_08 {
	public static void main(String[] args) {
		// ������ �Է¹޾� ����� ���
		// ex) ���� �Է� : 4
		// ****
		// ***
		// **
		// *
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int i=num; i>0; i-- ) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


