package p14Arrays;

public class ArrayAverage {

	public static void main(String[] args) {

		int[] scores = {80,90,72,85,95,75,84,80,90,72,85,95,75,84,80,90,72,85,95,75,84,80,90,72,85,95,75,84,26,50};

		int n = scores.length;
		int sum =0;
		
		for (int i=0; i<=n-1; i++) {
			sum = sum + scores[i];
		}
		double average = sum/n;
		System.out.println("The number  of elements is : " + n);
		System.out.println("The sum of all elements is : " + sum);
		System.out.println("Average of all elements is : " + average);
	}
}
