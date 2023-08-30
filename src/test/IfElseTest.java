package test;

import java.util.Scanner;

public class IfElseTest {
//	private static final Scanner scanner = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		int N = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//		if (N % 2 != 0) {
//			System.out.println("Weird");
//		} else if ( N >= 2 && N <= 5) {
//			System.out.println("not Weird");
//		} else if ( N >= 6 && N <= 20) {
//			System.out.println("Weird");
//		} else if (N > 20) {
//				System.out.println("not Weird");
//		}
//		scanner.close();
//	}
//}
	public static void main(String[] args) {
		int tong = 0;
		int x = 5;
		if (x>5) {
			tong = tong+1;
		}else {
			tong = tong -1;
		}
		tong = (x>5)?(tong+1):(tong-1); 
		String s = (x<5)?"xin chao": "good bye";
		// tuong duong ifelse, toán tử ? chỉ check điều kiện và gán giá trị
		// cho biến, mà không thực hiện được khối lệnh bên trong n
		}
	}
	
	
