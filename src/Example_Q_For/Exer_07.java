package Example_Q_For;

import java.util.Scanner;

public class Exer_07 {
	public static void main(String[] args) {
		// ������ �Է¹޾� ����� ���
		// ex) ���� �Է� : 4
		// *
		// **
		// ***
		// ****
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++ ) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
