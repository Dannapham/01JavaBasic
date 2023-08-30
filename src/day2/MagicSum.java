
package day2;

import java.util.Scanner;

public class MagicSum {
	// lap
	// nhap so
	// neu -1 thi thoat
	// neu nguyen duong >0 thi tiep tuc
	// >0, chua so 8 (chuyen int sang String, check) -> thi tinh tong
	// tra ve tong
	public static void main(String[] args) {
		int sum = MagicSum.sumHasEihgt();
		System.out.println("Sum is: " + sum);
	}
	public static int sumHasEihgt() {
		int sum = 0;
		do {
			int number = 0;
			System.out.println("Enter a positive integer or -1 to exit: ");
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
			if (number == -1) {
				break;
			}
			if (number > 0) {
				String temp = Integer.toString(number);
				boolean isContain = temp.indexOf("8") >= 0;
//				boolean isContain = temp.contains("8");
				if (isContain) {
					sum += number;
				}
			}
		} while (true);
		return sum;
	}
}


