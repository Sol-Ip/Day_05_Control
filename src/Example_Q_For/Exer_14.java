package Example_Q_For;

import java.util.Scanner;

// ����ڷκ��� �Է� ���� �ϳ��� ���� 
// �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
// ��, �Է��� ���� 2���� ���� ��� 
// ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.

public class Exer_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		boolean flag = false; // ���� ���� 

		if (num >= 2) { // �Է� ����  2���� Ŭ ���
			for (int i = 2; i < num; i++) { //2���� ū ���ڷ� ���� Ȱ��
				if (num % i == 0) { // �Ҽ����� �Ǻ�
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			} else {
				System.out.println("�Ҽ� �Դϴ�.");
			}
		} else { // �Է� ���� 2���� ���� ��� 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
