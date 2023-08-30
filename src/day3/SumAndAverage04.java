package day3;

public class SumAndAverage04 {
	public static void main(String[] args) {
		int sum = 0;
		int count =0;
		for (int i = 1; i <=100; i++) {
			if(i%7==0) {
				sum= sum+i;
			    count++;
			    System.out.println("the i is: "+ i);
			}
		}
	System.out.println("the sum is: "+ sum);
	System.out.println("the count is: "+ count);
	
	float average;
	average = (float)sum/(float)count;
	System.out.println("the average is: "+ Math.round(average*100.0)/100.0);
	}
}
