package Example_Q_For;

import java.util.Scanner;

public class Exer_05 {
	// ����ڷκ��� �Է� ���� ������ ���� ����Ͻÿ�.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int i = sc.nextInt();
		
		System.out.println();
		System.out.println("===== " + i + " ��=====");
		
		for (int j = 1; j<10; j++) {
			System.out.println(i + " * " + j + " = " + (i*j));
		}
		
	}
}
