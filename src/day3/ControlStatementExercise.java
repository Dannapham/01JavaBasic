package day3;

import java.util.Scanner;

public class ControlStatementExercise {
	/**
	 * input: int n output: -print: weird -print: not weird How: main(); if
	 * (n%2!=0)-> print weird if(n%2==0)&&(n>=2&&n<=5)-> print not weird
	 */
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		sc.skip("(2\r\n|[\n\r\u2028\u2029\u0085])");
		if (N % 2 != 0) {
			System.out.println("Weird");
		}
		if ((N % 2 == 0) && (N >= 2 && N <= 5)) {
			System.out.println("not Weird");
		}
		if ((N % 2 == 0) && (N >= 6 && N <= 20)) {
			System.out.println("Weird");
		}
		if ((N % 2 == 0) && (N > 20)) {
			System.out.println("not Weird");
		}
		sc.close();
	}
}
