package Example_Q_For;

import java.util.Scanner;

// 사용자로부터 입력 받은 하나의 값이 
// 소수인지 판별하는 프로그램을 구현하세요.
// 단, 입력한 수가 2보다 작은 경우 
// “잘못 입력하셨습니다.”를 출력하세요.

public class Exer_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		boolean flag = false; // 논리형 변수 

		if (num >= 2) { // 입력 수가  2보다 클 경우
			for (int i = 2; i < num; i++) { //2보다 큰 숫자로 변수 활용
				if (num % i == 0) { // 소수인지 판별
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("소수가 아닙니다.");
			} else {
				System.out.println("소수 입니다.");
			}
		} else { // 입력 수가 2보다 작을 경우 
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
