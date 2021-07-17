package p10UserInput;

import java.util.Scanner;



public class EnterNumbers {

	public static void main(String[] args) {
		//when you use Scanner you need to import java.util.Scanner otherwise it will not run.
		//to import it you can hover over on it and click import

		Scanner sc = new Scanner (System.in);      // you can write any word instead of "sc" It is just a name
		
		System.out.print("Enter first number : "); 
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();  // if you are using after a primitive you have to enter this code
		
		System.out.println("Total of two numbers : " + num1 + " + " + num2 + " = " + (num1 + num2));

		/*When you run the code it will ask you to write a number.
		 * First click on the console,
		 * then write a number
		 * then hit enter
		 * then write second one*/

	}
}
