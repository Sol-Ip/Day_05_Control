package Example_Q_For;

import java.util.Scanner;

public class Exer_04 {
	//�� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����Ͻÿ�.
	// ���� 1 �̸��� ���ڰ� �Է� �ƴٸ� "1 �̻��� ���ڸ� �Է����ּ���" �� ����Ͻÿ�.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int one = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int two = sc.nextInt();
		
		if(one >= two && two > 0 ) {
			for(int i = two; i <= one; i++) {
			System.out.print(i+" ");
			 }
		} else if ( one <= two && one > 0 ) {
				for(int i = one; i <= two; i++) {
				System.out.print(i+" ");
					}
			} else {
				System.out.print("1�̻��� ���ڸ� �Է����ּ���.");
			}
		}
	
	}



