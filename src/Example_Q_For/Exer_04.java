package Example_Q_For;

import java.util.Scanner;

public class Exer_04 {
	//두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하시오.
	// 만일 1 미만의 숫자가 입력 됐다면 "1 이상의 숫자를 입력해주세요" 를 출력하시오.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int one = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
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
				System.out.print("1이상의 숫자를 입력해주세요.");
			}
		}
	
	}



