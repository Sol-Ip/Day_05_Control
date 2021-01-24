package Example_Q_For;

import java.util.Scanner;

public class Exer_01 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		// 한 개의 값을 입력 받아 1부터 그 숫자 까지의 
		// 숫자들을 모두 출력하기
		// 단, 입력한 수 > = 1
		// 1 미만의 숫자가 입력될 시,
		// "1 이상의 숫자를 입력해주세요" 를 출력하기 
		System.out.print("1 이상의 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
	    
		if (num >= 1) {
			int i = 1;
	    while (i <= num) {
					System.out.printf("%d ", i);
				i++;
				} 
			} else {
					System.out.println("1 이상의 숫자를 입력해주세요.");
				}
			}
	}


