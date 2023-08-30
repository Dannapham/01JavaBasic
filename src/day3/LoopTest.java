package day3;

import java.util.Iterator;

public class LoopTest {
	public static void main(String[] args) {
		// hàm không có kiểu trả về nên sẽ để void
		LoopTest.loopTest();

	}

	public static void loopTest() {
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 8;
		a[4] = 9;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Phan tu "+ (i+1)+" la: "+a[i]);
		}
	}
}
