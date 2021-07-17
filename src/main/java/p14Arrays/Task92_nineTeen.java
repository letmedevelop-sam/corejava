package p14Arrays;

import java.util.Arrays;

public class Task92_nineTeen {

	public static void main(String[] args) {
		/*
		 * Write a Java program to store numbers 1 to 10 in an array using data instantiation. 
		 * Then write a for loop to multiply each member of above array by 19, 
		 * this way you will get table of 19 stored in the above array.
		 * Finally write another for loop to print all the array elements.
	�You should get the following output:
	19
	38
	57
	76
	95
	114
	133
	152
	171
	190
		 */

		int[] nineTeen= new int [10];
		int j=1;
		
		for (int i=0; i<10; i++) {
			
			nineTeen[i] = j * 19;
			System.out.println(nineTeen[i]);
			j++;
			
			
			
			
			
		}
		System.out.println("*************");
		System.out.println(Arrays.toString(nineTeen));
	}

}
