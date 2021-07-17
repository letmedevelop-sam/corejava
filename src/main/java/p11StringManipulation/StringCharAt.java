package p11StringManipulation;

import java.util.Scanner;

public class StringCharAt {

	public static void main(String[] args) {
		
		String word = "Computer";
		System.out.println(word.length());

		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		System.out.println(word.charAt(8));	//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 8

		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your name : ");
		String firstName = sc.next();
		
		System.out.println("The third character in your name is : " + firstName.charAt(2));
		
		
		// Check if first character is A
		
		String word2 = "Apple";
		char c0 = word2.charAt(0);
		char c1 = 'A';
		
		if (c0 == c1) {
			
			System.out.println("A is first character");
		}else {System.out.println("A is not first character");
		
	}
		
		// check if first and last characters are same
		
		String word3 = "civic";
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
			if (first == last) {
			System.out.println("First and last match");
			
			}else {
				System.out.println("First and last does not match");
			}

		//last index not hard coded
		
		String word4 = "Java Script";
		char lastChar = word4.charAt(word4.length() - 1);
		System.out.println("Last character of " + word4 + " is : + lastChar");
	}
}

