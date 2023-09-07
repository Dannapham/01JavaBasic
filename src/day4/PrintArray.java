package day4;


public class PrintArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		char a = 0;
		printArray(arr, a);
	}

	public static void printArray(int[] arr, char a) {
		if (arr.length > 0) {

			System.out.print("{");

			for (int i = 0; i < arr.length - 1; i++) {

				System.out.print(arr[i] + ",");
			}
			System.out.print(arr[arr.length - 1]);
			System.out.print("}");

		} else {
			System.out.println("Mang chua co phan tu nao");
		}
	}
	public static void printArray(double[] arr, char a) {
		if (arr.length > 0) {

			System.out.print("{");

			for (int i = 0; i < arr.length - 1; i++) {

				System.out.print(arr[i] + ",");
			}
			System.out.print(arr[arr.length - 1]);
			System.out.print("}");

		} else {
			System.out.println("Mang chua co phan tu nao");
		}
	}
	public static void printArray(float[] arr, char a) {
		if (arr.length > 0) {

			System.out.print("{");

			for (int i = 0; i < arr.length - 1; i++) {

				System.out.print(arr[i] + ",");
			}
			System.out.print(arr[arr.length - 1]);
			System.out.print("}");

		} else {
			System.out.println("Mang chua co phan tu nao");
		}
	}
}


