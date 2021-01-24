package Example_Q_For;

import java.util.Scanner;

public class Exer_16 {
	// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고
	// 소수의 개수를 출력하세요.
	// 단, 입력한 수가 2보다 작은 경우
	// “잘못 입력하셨습니다.”를 출력하세요.

	public static void main(String[] args) {
		System.out.print("숫자 : ");
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
				// 소수가 아닐 때 flag는 true가 되면서 두 번째 for문을 빠져나옴
				// 두 번째 for문을 빠져나와 if문을 지나고 다시 첫 번째 for문을 돈다고 할 때
				// 소수를 만났다고 해도 flag는 여전히 true가 되어 있는 상태라
				// if문에 걸려 print되지 않는다, 다시 말해 소수를 거르는 boolean값을
				// 원래대로 초기화 시켜주는 작업

			}
			System.out.println();
			System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
