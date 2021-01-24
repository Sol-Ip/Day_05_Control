package Example_Q_For;

import java.util.Scanner;

public class Exer_13 {

	/*
	 * * 다음과 같은 실행 예제를 구현하세요.
	 * 
	 * ex. 정수 입력 : 5 ***** * * * * * * *****
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				// 첫 번째 줄과 마지막 줄은 모두 "*" 출력
				if (i == 0 || i == num - 1) {
					System.out.print("*");
					// 공백 부분 출력 만들기
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
