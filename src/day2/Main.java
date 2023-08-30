package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		doExe1();

//		doExe2();

//		doExe3();
		
//		doExe4();

	}

	public static void doExe1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao x: ");
		int x = sc.nextInt();
		if (OddTest.isOdd(x) == true) {
			System.out.println("ODD");
		} else {
			System.out.println("EVEN");
		}
	}

	public static void doExe2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so can kiem tra: ");
		int x = sc.nextInt();
		if (EightTest.hasEight(x) == true) {
			System.out.println("Number has Eight");
		} else {
			System.out.println("Number has not Eight");
		}
	}

	public static void doExe3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = sc.nextByte();
		SwitchTest.dayOfWeek(n);
	}


	public static void doExe4() {
		int sum = MagicSum.sumHasEihgt();
		System.out.println("Sum is: "+ sum);
	}
}
