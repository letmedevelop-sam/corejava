package p14Arrays;

import java.util.Random;

public class Task91_tenElements {

	public static void main(String[] args) {
		/*
		 * Create an array with 10 elements
		 * Initialize each array element with random values between 0 and 100 but less than 100
		 * Print each array element
		 */

		Random rn = new Random();
		
		int[] tenElements =new  int [10];
		
		for(int i=0; i<10; i++) {
			
			tenElements[i] = rn.nextInt(100);
		
			System.out.print(i+1 + ") " + tenElements[i] + "   ");
		}
		
		
		
	}

}
