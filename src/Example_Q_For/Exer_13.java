package Example_Q_For;

import java.util.Scanner;

public class Exer_13 {

	/*
	 * * ������ ���� ���� ������ �����ϼ���.
	 * 
	 * ex. ���� �Է� : 5 ***** * * * * * * *****
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				// ù ��° �ٰ� ������ ���� ��� "*" ���
				if (i == 0 || i == num - 1) {
					System.out.print("*");
					// ���� �κ� ��� �����
				} else {
					if (j == 0 || j == num - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
