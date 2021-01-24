package Example_Q_For;

import java.util.Scanner;

public class Exer_05 {
	// 사용자로부터 입력 받은 숫자의 단을 출력하시오.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int i = sc.nextInt();
		
		System.out.println();
		System.out.println("===== " + i + " 단=====");
		
		for (int j = 1; j<10; j++) {
			System.out.println(i + " * " + j + " = " + (i*j));
		}
		
	}
}
