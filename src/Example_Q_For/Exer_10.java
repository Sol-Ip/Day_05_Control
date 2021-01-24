package Example_Q_For;

import java.util.Scanner;

public class Exer_10 {
	// 정수를 입력하면 오른쪽부터 별찍기 
	// ex) 정수 입력 : 4
				//    *
				//   **
				//  ***
				// ****
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			for(int j=0; j<num-i-1; j++) { // 또는 j<num-(i+1);
				System.out.print(" ");
			}
			for (int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
