package p14Arrays;

import java.util.*;

public class RainFallClass {
	/*
	 * Write a RainFall class that stores the total rainfall for each of 12 months
	 * into an array of doubles. The program should have methods that return the
	 * following: - total rainfall for the year - the average monthly rainfall - the
	 * month with the most rain - the month with the least rain Input Validation: Do
	 * not accept negative numbers for the monthly rainfall figures.
	 */
	public static void main(String[] args) {
		// double rain[] = rainQuantity();
//		monthlyRainFall(rain);
//		System.out.println("Total Rainfall of the year is " + totalRainfall(rain));
//		System.out.println("Average Rainfall of the year is " + averageRainfall(rain));
//		System.out.println("Maximum Rainfall of the year is " + maxRainfall(rain));
//		System.out.println("Maximum Rainfall of the year is " + minRainfall(rain));
		System.out.println("=============================");
		// System.out.println(rainQuantityMap());
		Map<String,Double> rain = rainQuantityMap();
		System.out.println(getTotal(rain));
		System.out.println(getAverage(rain));
		System.out.println(getMax(rain));
		System.out.println(getMin(rain));
	}
	// METHODS
	// Method-01 : Ask user to give rain values for each month
	public static double[] rainQuantity() {
		// name of the method is ==rainQuantity== and it will return the array ==double
		// rainValues[]==
		// First we created the names of the months in an array => String [] monthNames
		String[] monthNames = allMonths();
		// then created another array for double rain values for each month which user
		// will provide us
		double[] rainValues = new double[12];
		// this scanner will ask user to add rain values for each month
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Rainfall quantity for the months ahead : \n");
		// this part will be the HEADER of our rain value list
		System.out.println("Months        Rainfall (in inches) ");
		System.out.println("======         =====================");
		// This for loop will place the values given by the user into the array ==double
		// rainValues[]==
		for (int i = 0; i < 12; i++) {
			System.out.print(monthNames[i] + " : \t\t"); // it will align the user input when printing
			double value = input.nextDouble();
			if (value >= 0) {
				rainValues[i] = value;
			} else if (value < 0) {
				System.out.println("Value can not be less than 0. Enter a positive value :");
				--i;
			}
		}
		return rainValues;
	}
	// end of the method ==rainQuantity==
	// Method-02 : Show monthly rainfall for the year
	public static void monthlyRainFall(double[] yearlyRainfall) {
		int index = 0;
		for (String month : allMonths()) {
			System.out.println("Monthly rainfall for " + month + " = " + yearlyRainfall[index]);
			index++;
		}
	}
	// Method-03 : Show total rainfall for the year
	public static double totalRainfall(double[] rainFall) {
		return Arrays.stream(rainFall).reduce((x, y) -> x + y).getAsDouble();
	}
	// System.out.println("\nThe sum of all the rain total is : " +
	// totalRainfall(double[] rainValues) + " inches");
	// Method-04 : Show the average monthly rainfall
	public static double averageRainfall(double[] rainFall) {
		return Arrays.stream(rainFall).average().getAsDouble();
	}
	// Method-05 : Show the month with the most rain
	public static double maxRainfall(double[] rainFall) {
		return Arrays.stream(rainFall).max().getAsDouble();
	}
	// Method-06 : Show the month with the least rain
	public static double minRainfall(double[] rainFall) {
		return Arrays.stream(rainFall).min().getAsDouble();
	}
	// Method-07 : Create months;
	public static String[] allMonths() {
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return monthNames;
	}
	public static Map<String, Double> rainQuantityMap() {
		Scanner input = new Scanner(System.in);
		Map<String, Double> rainsYearly = new HashMap<>();
		while (!rainsYearly.containsKey("December")) {
			for (String month : allMonths()) {
				System.out.println("What is the rainfall for " + month);
				double rain = input.nextDouble();
				while (true) {
					if (rain > 0) {
						rainsYearly.put(month, rain);
						break;
					}
					System.out.println("What is the rainfall for " + month);
					rain = input.nextDouble();
				}
			}
		}
		return rainsYearly;
	}
	public static double getTotal(Map<String, Double> rainsYearly) {
		return rainsYearly.entrySet().stream().map(rain -> rain.getValue()).reduce((x, y) -> x + y).get();
	}
	public static double getAverage(Map<String, Double> rainsYearly) {
		return rainsYearly.entrySet().stream().map(rain -> rain.getValue()).reduce((x, y) -> x + y).get()
				/ rainsYearly.size();
	}

	public static String getMin(Map<String, Double> rainsYearly) {
		double min =rainsYearly.entrySet().stream().map(rain -> rain.getValue()).min(Comparator.comparing(d -> d)).get();
		String month =rainsYearly.entrySet().stream().filter(rain-> rain.getValue()==min).map(rainKey -> rainKey.getKey()).findFirst().get();

		return "Rainfall is minimum in " + month + " with " + min;
	}

	public static String getMax(Map<String, Double> rainsYearly) {
		double max =rainsYearly.entrySet().stream().map(rain -> rain.getValue()).max(Comparator.comparing(d -> d)).get();
		String month =rainsYearly.entrySet().stream().filter(rain-> rain.getValue()==max).map(rainKey -> rainKey.getKey()).findFirst().get();

		return "Rainfall is maximum in " + month + " with " + max;
	}
}