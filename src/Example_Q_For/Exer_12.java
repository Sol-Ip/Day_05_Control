package Example_Q_For;

import java.util.Scanner;
//* ������ ���� ���� ������ �����ϼ���.
// 
// ex. ���� �Է� : 4
//    *     =>
//   ***
//  *****
// *******

public class Exer_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();

			/*
			 * for (int i = num, j = 1; i > 0; i--, j += 2) { for (int k = 0; k < i; k++) {
			 * System.out.print(" "); }
			 * 
			 * for (int k = 0; k < j; k++) { System.out.print("*"); }
			 * 
			 * System.out.println(); }
			 */
		}
		System.out.println("====���� �Ƕ�̵�====");

		for (int i = num; i > 0; i--) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = (2 * i) - 1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
