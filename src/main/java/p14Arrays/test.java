package p14Arrays;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] months = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double[] rain = new double[12];
		System.out.println("Please enter in the following rainfalls for the month ahead");
		System.out.println("Month \t\t Rainfall (in inches)");
		System.out.println("======================================");
		int i = 0;
		while(i<12) {
			System.out.print(months[i] + ":\t\t");
			double input = sc.nextDouble();
			if(input<0) {
				System.out.println("Please enter a non-negative value");
				continue;
			}else {
				rain[i] = input;
			}
			i++;
		}
			System.out.println("The sum of all rain is :" + totalRainfall(rain) + " inches");
			System.out.println("The average rainfall was : " + averageRainfall(rain) + " inches");
			System.out.println("The max rain is : " + mostRain(rain) + " inches");
			System.out.println("The min rain is : " + leastRain(rain) + " inches");
			
			
		}
		
		public static double totalRainfall(double[] array) {
			double sum = 0;
			for(int i = 0; i<12;i++) {
				sum += array[i];
			}
			//System.out.println("The sum of all the rain is : " + sum + " inches");
			return sum;
		}
		
		public static double averageRainfall(double[] array) {
			double avg = totalRainfall(array)/12;
			return avg;
		}
		
		public static double mostRain(double[] array) {
			double max = 0;
			for(int i = 0;i<12;i++) {
				if(array[i]>max) {
					max = array[i];
				}
			}
			return max;
		}
		
		public static double leastRain(double[] array) {
			double min = array[0];
			for(int i = 0;i<12;i++) {
				if(array[i]<min) {
					min = array[i];
				}
			}
			return min;
			
			
		}
	
	}


