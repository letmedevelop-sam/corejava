package p10UserInput;

import java.util.Scanner;

//import java.util.*;

public class RepeatString {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Provide a sentence and I will repeat it : ");
		
		// String str = sc.next();
		
		String str = sc.nextLine();
		
		System.out.println("You wrote : '" + str + "'");
	}
}
