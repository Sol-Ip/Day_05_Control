package com.kh.control;

public class Exercise_For3 {

	//반복문은 반복되는 일을 해주는 코드 
	//1+2+3+4+5+6+7+8+9+10
	//반복 => 1씩 증가, +(더하기)
	public static void main(String []args) {
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			//더하기
			sum = sum + i;
			// 0 + 0 => 0
			// 0 + 1 => 1   , 0+1
			// 1 + 2 => 3   , 1+2
			// 3 + 3 => 6   , 1+2+3
			// 6  + 4 => 10 , 1+2+3+4
			// 10 + 5 => 15 , 1+2+3+4+5
			// 15 + 6 => 21 , 1+2+3+4+5+6
			// 21 + 7 => 28 , 1+2+3+4+5+6+7
			// 28 + 8 => 36 , 1+2+3+4+5+6+7+8
			// 36 + 9 => 45 , 1+2+3+4+5+6+7+8+9
			// 45 + 10 => 55, 1+2+3+4+5+6+7+8+9+10 
		}
	    System.out.println("합계 : " + sum); //합계 : 55
	    System.out.println();
	    
	    //1+2+3+4+5+6+7+8+9+10=55
	    //부터 10까지의 덧셈을 표시하고 합을 구하시오.
	    int total = 0;
	    for (int i=1; i<=10; i++) {
	    	total = total + i;
	    	System.out.print(i);
	    	if (i <=9) {
	    		System.out.print("+");
	    	} else {
	    		System.out.print("=");
	    		System.out.print(total);
	    	}
	    }
	}
}
