package p14Arrays;

import java.util.Scanner;

public class RainFallClass {
	
	public static void main(String[] args) {

		/*
		 * Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles. 
		 * The program should have methods that return the following:
				- total rainfall for the year
				- the average monthly rainfall
				- the month with the most rain
				- the month with the least rain
	Input Validation: Do not accept negative numbers for the monthly rainfall figures.
		 */

		
		
		String [] months = {"January", "February", "March", "April", "May", "June", 
				  "July", "August", "September", "October", "November", "December"};
		
		getRainValues (months);

	
	
	
	}

	public static void getRainValues(String[] months) {
		for(String value : months) {
			System.out.print(value + " ");
		}
		
		
		public static double totalRainfall (double[ ]array) {
			double total = 0;
			for( int i = 0; i<array.length; i++) {
				 total = total + i;
			
			}
			return total;
			

			System.out.println("\nThe sum of all the rain total is : " + totalRainfall(double[] rainValues)  + " inches");
			
}
	
	

}
