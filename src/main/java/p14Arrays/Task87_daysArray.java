package p14Arrays;

import java.util.Scanner;

public class Task87_daysArray {

	public static void main(String[] args) {
		/*
		 * Create an array that holds the days
User should be able to enter the day index and output should be:
�Today is Monday�
		 */

		Scanner input = new Scanner (System.in);
		
		
		String[] daysArray = new String[7];
		
		daysArray[0] = "Monday";
		daysArray[1] = "Tuesday";
		daysArray[2] = "Wednesday";
		daysArray[3] = "Thursday";
		daysArray[4] = "Friday";
		daysArray[5] = "Saturday";
		daysArray[6] = "Sunday";
		
		
		System.out.println("Enter an index number for a day :");
		int day = input.nextInt();
		
		System.out.println("Today is : " + daysArray[day]);
		
		//System.out.println(daysArray); // [Ljava.lang.String;@34a245ab
	}

}
