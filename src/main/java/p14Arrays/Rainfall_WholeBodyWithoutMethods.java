package p14Arrays;

import java.util.Scanner;

import java.util.Arrays;

public class Rainfall_WholeBodyWithoutMethods {

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
		
		printAll();
				
	}
	
	public static void printAll () {
		
		for(double value : rainQuantity  ()){
			//System.out.print(value + " ");
		}
		
		rainSumOfYear(null);
		monthlyAverage(0.0);
		maxRain (null);
		minRain (null);	
	}
		
	public static double [] rainQuantity  (){ 
		//name of the method is ==rainQuantity== and it will return the array ==double rainValues[]==
	
	//First I created the names of the months in an array => String [] monthNames
		
		String [] monthNames = {"January   ", "February  ", "March     ", "April     ", "May       ", "June      ", 
				  "July      ", "August    ", "September ", "October   ", "November  ", "December  "};
		
		double[]  rainValues = new double[12];	
	
	
	Scanner input = new Scanner (System.in); //This Scanner will collect the rain values from the user... 
		System.out.println("Please enter in the following rainfall for the months ahead : \n");
	
	System.out.println("Months 		Rainfall (in inches) ");
	
	System.out.println("======         =====================");
						
			for( int i = 0; i<12; i++) {   //This for loop will place the values given by the user into the array ==double rainValues[]==
				
				lessThanZero:
					
					if((rainValues [i] )>=0) {
						System.out.print(monthNames[i] + " : \t\t"); //   it will align the user input when printing
						rainValues [i] = input.nextDouble();
					}
					else if((rainValues [i]) < 0) {
					System.out.println("Value can not be less than 0. Enter a positive value :");
					
					break lessThanZero;
				}
			}
					
			return  rainValues;
		
	}//end of the method ==rainQuantity==
	
		
	public static void rainSumOfYear( double[] rainValues) { // this method will calculate the sum of total rain for the year
		
		double rainSum=0; // this will sum up the monthly values when the loop starts iterating.
		
		for( int i = 0; i<12; i++) {
			
			rainSum = rainSum + rainValues [i]; // this sum will be used as total rain for the year
		}
		
		System.out.println("\nThe sum of all the rain is : " + rainSum + " inches");
				
	}//end of the method ==rainSumOfYear==
	
	
	public static void monthlyAverage(double rainSum) {// this method will calculate the monthly average of the rain
				
		double averageOfYear=rainSum/12;
		
		System.out.println("\nThe average of the rain is : " + averageOfYear + " inches");
				
	}//end of the method ==monthlyAverage==
	
	
	public static void minRain (double[] rainValues) { //this method will find the the minimum rain
		
		Arrays. sort(rainValues);
		
		double minRain = rainValues[rainValues. length-1];
				
		System.out.println("\nThe  min  rain   is : " + minRain + " inches");
		
	}//end of the method ==minRain==
	
	
	public static void maxRain (double[] rainValues) { //this method will find the maximum rain
		
		Arrays. sort(rainValues);
		
		double maxRain = rainValues[0];
				
		System.out.println("\nThe  max  rain   is : " + maxRain + " inches");
		
	}//end of the method ==maxRain==
}
