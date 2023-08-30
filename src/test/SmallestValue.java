package test;

import java.util.Scanner;

public class SmallestValue {
	public static void main(String[] args) {
		int min = findMin();
		System.out.println("min= " + min);
		
	}

	private static int findMin() {
		//khai bao min = so lon nhat
		// lap
		// - nhap so n
		// - -1 thoat
		// - so sanh so n voi min
		//   - n < min-> min = n;
		//return min

		
		
		 int min = Integer.MAX_VALUE;
		do {
			int n=0 ;
			System.out.println("Enter a positive integer or -1 to exit: ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			if (n==-1) {
				break;
			}
			if (n<min) {
               min = n;
			}
		} while (true);
		return min;
	}
}
