package p14Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RainFallClass {
	/*
		 * Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles.
		 * The program should have methods that return the following:
				- total rainfall for the year
				- the average monthly rainfall
				- the month with the most rain
				- the month with the least rain
	Input Validation: Do not accept negative numbers for the monthly rainfall figures.
		 */

	public static void main(String[] args) {

		double [] values = rainQuantity();

		showMonthlyValues(values);

		monthlyAverage(rainSumOfYear(values));

		maxRain (values);

		minRain (values);
	}




	//METHODS

	//Method-01 : Ask user to give rain values for each month
		public static double [] rainQuantity  (){
		//name of the method is ==rainQuantity== and it will return the array ==double rainValues[]==
		//First we created the names of the months in an array => String [] monthNames

		String [] monthNames = {"January   ", "February  ", "March     ", "April     ", "May       ", "June      ",
				  "July      ", "August    ", "September ", "October   ", "November  ", "December  "};

		//then created another array for double rain values for each month which user will provide us
		double[]  rainValues = new double[12];

		//this scanner will ask user to add rain values for each month
	Scanner input = new Scanner (System.in);
	System.out.println("Please enter Rainfall quantity for the months ahead : \n");

		//this part will be the HEADER of our rain value list
	System.out.println("Months 		Rainfall (in inches) ");
	System.out.println("======         =====================");

		//This for loop will place the values given by the user into the array ==double rainValues[]==
			for( int i = 0; i<12; i++) {


				System.out.print(monthNames[i] + " : \t\t"); //   it will align the user input when printing
				double value = input.nextDouble();

				if(value  >=0) {

					rainValues [i] = value;
				}
				else if (value < 0) {
					System.out.println("Value can not be less than 0. Enter a positive value :");
				i--;	//Input Validation: Do not accept negative numbers for the monthly rainfall figures.
				//this will repeat the same iteration for minus values
				}

			}

			return  rainValues;

	}				//end of the method ==rainQuantity==

	//Method-02 : Show monthly rainfall for the year

	private static void showMonthlyValues(double[] rainQuantity) {
		System.out.println(Arrays.toString(rainQuantity));
	}
	//Method-03 : Show total rainfall for the year
	public static double rainSumOfYear( double[] rainValues) {

		double rainSum = 0; // this will sum up the monthly values when the loop starts iterating.

		for( int i = 0; i<12; i++) {

			rainSum = rainSum + rainValues [i]; // this sum will be used as total rain for the year
		}

		return rainSum;
	}//end of the method ==rainSumOfYear==

	//	System.out.println("\nThe sum of all the rain total is : " + totalRainfall(double[] rainValues)  + " inches");


	//Method-04 : Show the average monthly rainfall
	public static void monthlyAverage(double rainSum) {

		double averageOfYear=rainSum/12;

		System.out.println("\nThe average of the rain is : " + averageOfYear + " inches");

	}//end of the method ==monthlyAverage==


	//Method-05 : Show the month with the most rain
	public static void maxRain (double[] rainValues) {

		Arrays.sort(rainValues);

		double maxRain = rainValues[0];

		System.out.println("\nThe  max  rain   is : " + maxRain + " inches");

	}//end of the method ==maxRain==



	//Method-06 : Show the month with the least rain
	public static void minRain (double[] rainValues) {

		Arrays.sort(rainValues);

		double minRain = rainValues[rainValues.length-1];

		System.out.println("\nThe  min  rain   is : " + minRain + " inches");

	}//end of the method ==minRain==


}



