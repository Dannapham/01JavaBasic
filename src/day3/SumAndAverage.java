package day3;

public class SumAndAverage {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			sum = sum+ i;
			}
		System.out.println("the sum is: "+ sum );
		
		    float average = sum/100;
			average = (float)sum/100;
			System.out.println("the average is: "+ average );
			
	}
}