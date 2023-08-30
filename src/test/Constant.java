package test;

import java.util.Scanner;

public class Constant {
	// khai báo hằng số sau class
	// cấu trúc :static final datatype identifier_name=value;
//	public static final int HANG_SO = 4;
//	public static final float SO_PI = 3.14f;
//	public static final String TRUNG_TAM_JAVA = "Trung tam java";
//
//	public static void main(String[] args) {
//		System.out.println("Xin chao " + TRUNG_TAM_JAVA);
//		float chuVi = SO_PI * 2;
//		System.out.println("Chu vi hinh tron " + chuVi);
//
//	}
//}

	public static void main(String[] args) {
		System.out.println("vui long nhap x ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1: {
			System.out.println("x = 1");
			break; 
		}
		case 2:{
			System.out.println("x = 2");
			break;
		}
		case 3:{
			System.out.println("x = 3");
			break;
		}
		default:
			System.out.println("x la default");
		}
	}
}