package Example_Q_For;
/*
 * ������ ���� ���� ������ �����ϼ���.

 * ex) ���� �Է� : 3
// *
// **
// ***
// **
// * 
*/

import java.util.Scanner;

public class Exer_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 1 + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = num - 1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
