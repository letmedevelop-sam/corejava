//package p14Arrays;
//
//import java.util.Scanner;
//
//import java.util.Arrays;
//
//public class Rainfall_WholeBodyWithoutMethods {
//
//	public static void main(String[] args) {
//
//		/*
//		 * Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles.
//		 * The program should have methods that return the following:
//				- total rainfall for the year
//				- the average monthly rainfall
//				- the month with the most rain
//				- the month with the least rain
//	Input Validation: Do not accept negative numbers for the monthly rainfall figures.
//		 */
//
////		printAll();
//		rainQuantity();
//		rainSumOfYear();
//		monthlyAverage(rainSumOfYear(rainQuantity()));
//		maxRain (rainQuantity());
//		minRain (rainQuantity());
//
//	}
//
////	public static void printAll () {
////
////		rainQuantity();
////		for(double value : rainQuantity ()){
////			System.out.print(value + " ");
////		}
////
////		System.out.println("\nThe sum of all the rain is : " + rainSumOfYear(null) + " inches");
////		//rainSumOfYear(null);
////		monthlyAverage(0.0);
////		maxRain (null);
////		minRain (null);
////	}
//
//	public static double [] rainQuantity  (){
//		//name of the method is ==rainQuantity== and it will return the array ==double rainValues[]==
//
//		//First I created the names of the months in an array => String [] monthNames
//
//		String [] monthNames = {"January   ", "February  ", "March     ", "April     ", "May       ", "June      ",
//				  "July      ", "August    ", "September ", "October   ", "November  ", "December  "};
//
//		//then created another array for double rain values for each month
//		double[]  rainValues = new double[12];
//
//
//		//this scanner will ask user to add rain values for each month
//	Scanner input = new Scanner (System.in);
//		System.out.println("Please enter Rainfall quantity for the months ahead : \n");
//
//	System.out.println("Months 		Rainfall (in inches) ");
//
//	System.out.println("======         =====================");
//
//		//This for loop will place the values given by the user into the array ==double rainValues[]==
//			for( int i = 0; i<12; i++) {
//
//				lessThanZero:
//
//					if((rainValues [i]) < 0) {
//						System.out.println("Value can not be less than 0. Enter a positive value :");
//					}
//					else if ((rainValues [i] )>=0) {
//						System.out.print(monthNames[i] + " : \t\t"); //   it will align the user input when printing
//						rainValues [i] = input.nextDouble();
//					break lessThanZero;
//				}
//			}
//
//			return  rainValues;
//
//	}//end of the method ==rainQuantity==
//
//	// this method will calculate the sum of total rain for the year
//	public static double rainSumOfYear( double[] rainValues) {
//
//		double rainSum=0; // this will sum up the monthly values when the loop starts iterating.
//
//		for( int i = 0; i<12; i++) {
//
//			rainSum = rainSum + rainValues [i]; // this sum will be used as total rain for the year
//		}
//
//		return rainSum;
//	}//end of the method ==rainSumOfYear==
//
//
//	// this method will calculate the monthly average of the rain
//	public static void monthlyAverage(double rainSum) {
//
//		double averageOfYear=rainSum/12;
//
//		System.out.println("\nThe average of the rain is : " + averageOfYear + " inches");
//
//	}//end of the method ==monthlyAverage==
//
//
//
//	//this method will find the the minimum rain
//	public static void minRain (double[] rainValues) {
//
//		Arrays.sort(rainValues);
//
//		double minRain = rainValues[rainValues.length-1];
//
//		System.out.println("\nThe  min  rain   is : " + minRain + " inches");
//
//	}//end of the method ==minRain==
//
//
//	//this method will find the maximum rain
//	public static void maxRain (double[] rainValues) {
//
//		Arrays.sort(rainValues);
//
//		double maxRain = rainValues[0];
//
//		System.out.println("\nThe  max  rain   is : " + maxRain + " inches");
//
//	}//end of the method ==maxRain==
//}
