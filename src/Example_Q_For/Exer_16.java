package Example_Q_For;

import java.util.Scanner;

public class Exer_16 {
	// 2���� ����ڰ� �Է��� �������� �Ҽ��� ��� ����ϰ�
	// �Ҽ��� ������ ����ϼ���.
	// ��, �Է��� ���� 2���� ���� ���
	// ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.

	public static void main(String[] args) {
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;

		boolean flag = false;
		if (num >= 2) {
			for (int i = 2; i <= num; i++) {
				 for (int j = 2; j < i; j++) {
					if (i % j == 0) {
					flag = true;
					break;
					}
				}

				if (!flag) {
					System.out.print(i + " ");
					count++;
				}

				flag = false;
				// �Ҽ��� �ƴ� �� flag�� true�� �Ǹ鼭 �� ��° for���� ��������
				// �� ��° for���� �������� if���� ������ �ٽ� ù ��° for���� ���ٰ� �� ��
				// �Ҽ��� �����ٰ� �ص� flag�� ������ true�� �Ǿ� �ִ� ���¶�
				// if���� �ɷ� print���� �ʴ´�, �ٽ� ���� �Ҽ��� �Ÿ��� boolean����
				// ������� �ʱ�ȭ �����ִ� �۾�

			}
			System.out.println();
			System.out.println("2���� " + num + "���� �Ҽ��� ������ " + count + "���Դϴ�.");

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
