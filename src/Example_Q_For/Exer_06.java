package Example_Q_For;

import java.util.Scanner;

public class Exer_06 {
	public static void main(String []args) {
		// 입력받은 숫자의 단을 출력
		// 입력받은 숫자의 단을 9단까지 출력
		// 단, 9를 초과하는 숫자가 들어오면
		// "9 이하의 숫자만 입력해주세요" 를 출력하시오 (중첩 For문)
		
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자 : ");
	
	int num = sc.nextInt();
	
	 if (num >= 1 && num <= 9) {
		 for (int i=num; i<10; i++) {
			System.out.println("===== "+ i +" 단 ====="); {
				for(int j=1; j<10; j++) {
					System.out.printf("%d * %d = %2d \n", num ,j, num*j);
			}			
		}
	 } 
	 } else { 
			System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}
	}

