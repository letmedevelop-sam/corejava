package p14Arrays;

import java.util.Scanner;

public class Task86_ArrayMonths {

	public static void main(String[] args) {
		/*Create an array that holds 12 months names
		User should be able to enter month index and output should be:
			�The month name is <MonthName>�
			*/

		
		Scanner input = new Scanner (System.in);
		
				
		String[] monthsArray = new String[12];
		
		monthsArray[0] = "Jan";
		monthsArray[1] = "Feb";
		monthsArray[2] = "Mar";
		monthsArray[3] = "Apr";
		monthsArray[4] = "May";
		monthsArray[5] = "Jun";
		monthsArray[6] = "Jul";
		monthsArray[7] = "Aug";
		monthsArray[8] = "Sep";
		monthsArray[9] = "Oct";
		monthsArray[10] = "Nov";
		monthsArray[11] = "Dec";
		
		
		System.out.println("Enter an index number for monts :");
		int month = input.nextInt();
		
		System.out.println("The month is : " + monthsArray[month]);
		
		System.out.println(monthsArray); //[Ljava.lang.String;@34a245ab
	}

}
