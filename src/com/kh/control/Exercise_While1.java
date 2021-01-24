package com.kh.control;

public class Exercise_While1 {

	// While문을 이용하여 1~10 사이의 홀수를 출력하시오
	public static void main(String []args) {
		int i = 1;
		while ( i < 10 ) {
			System.out.println("i의 값 : " + i);
			i += 2;
		}
	}
}
