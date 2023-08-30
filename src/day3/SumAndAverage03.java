package day3;

public class SumAndAverage03 {

	public static void main(String[] args) {
		int oddsum = 0;
		int count =0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==1) {
			oddsum=oddsum+i;
			count++;
			System.out.println("the i is: "+ i);
		    }
	}
	System.out.println("the sum is: "+ oddsum);
	System.out.println("the count is: "+ count);
	
	float average;
	average = (float)oddsum/(float)count;
	System.out.println("the average is: "+ Math.round(average*100.0)/100.0);
	}
}
