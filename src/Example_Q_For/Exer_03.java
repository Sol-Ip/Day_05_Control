package Example_Q_For;

import java.util.Scanner;


public class Exer_03 {
	public static void main(String []args) {
		 // 1부터 입력 받은 수 까지 정수들의 합을 출력(for문 이용)
		 // 정수를 하나 입력하세요 : 8
		 // 1+2+3+4+5+6+7+8=36
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i<=num; i++) {
			sum +=i; //sum = sum + i;
			if (i <num) {
				System.out.print( i + " + ");
			} else { // i == num
				System.out.print( i + " = ");
			}
		}
		System.out.print(sum);
	}
}