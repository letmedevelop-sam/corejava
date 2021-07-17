package p11StringManipulation;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		String word = "Java";
		System.out.println(word.concat(" + Selenium"));	// prints Java + Selenium
		System.out.println(word.concat(" in eclipse")); // prints Java in eclipse

		System.out.println(word); // prints Java

		word = word.concat(" eclipse in computer");
		System.out.println(word); // prints "java eclipse in computer"

		//	word = word.concat(123);
		//	System.out.println(word); // will not work ... only with String

		//	word = word + true;
		//	System.out.println(word); // will not work ... only with String

		String word2 = "Hi ";
		word2 = word2.concat("- hey ").concat("- how are you? ").concat("- good");
		System.out.println(word2);	//prints Hi - hey - how are you? - good
	}
}
