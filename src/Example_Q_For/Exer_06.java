package Example_Q_For;

import java.util.Scanner;

public class Exer_06 {
	public static void main(String []args) {
		// �Է¹��� ������ ���� ���
		// �Է¹��� ������ ���� 9�ܱ��� ���
		// ��, 9�� �ʰ��ϴ� ���ڰ� ������
		// "9 ������ ���ڸ� �Է����ּ���" �� ����Ͻÿ� (��ø For��)
		
	Scanner sc = new Scanner(System.in);
	System.out.print("���� : ");
	
	int num = sc.nextInt();
	
	 if (num >= 1 && num <= 9) {
		 for (int i=num; i<10; i++) {
			System.out.println("===== "+ i +" �� ====="); {
				for(int j=1; j<10; j++) {
					System.out.printf("%d * %d = %2d \n", num ,j, num*j);
			}			
		}
	 } 
	 } else { 
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}

