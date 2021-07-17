package p14Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		/*
		 * This program stores in an array the hours worked for by  employees 
		 * who all make the same hourly wage
		 * display their gross pay
		 */
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter the hourly wage : ");
			double wage =input.nextDouble();
			
		double[] workedHours = new double[5];
		
		for (int i=0; i<5;  i++) {
			
			System.out.println("Enter the working hours of the " + (i+1) + ". worker : ");
			double hours = input.nextDouble();
			workedHours[i] = hours * wage;
			System.out.println("The wage worker " + (i+1) + " will get is : " + workedHours[i]);
		}
		System.out.println("workedHours[] = " + Arrays.toString(workedHours));
		
	}
}
