package p11StringManipulation;

import java.util.Scanner;

public class NameLength {

	public static void main(String[] args) {
		/*
		Write a program that ask user to enter his/her firstname and lastname.
		Display the total number of characters in the console .
		 */

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Please  enter  your  name : ");
		String firstName = sc.next();
		
		System.out.print("Please enter your surname : ");
		String lastName = sc.next();

		System.out.print("Total number of characters in your Full-Name : ");
		System.out.println( firstName.length() + lastName.length());
	}
}
