package Example_Q_For;

import java.util.Scanner;

public class Exer_09 {
	public static void main(String []args) {
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 2와 3의 배수를 모두 출력하고
		// 2와 3의 공배수의 개수를 출력하세요
		
		Scanner sc = new Scanner (System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		for( int i=1; i<=num; i++) {
			if ( i%2 == 0 || i%3 == 0 ) { // 2 또는 3 으로 나누어 떨어지는 경우
				System.out.print(i + " ");
			}
			if (i%2 == 0 && i%3 == 0) { // 2와 3으로 나누어 떨어지는 경우
				count++; 
			}
		}
		System.out.println();
		System.out.println("count : "+ count);
	}
}
