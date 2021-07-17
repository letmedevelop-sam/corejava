package p13RandomClass;

import java.util.*;

public class MathTutor {

	public static void main(String[] args) {

		int number1;
		int number2;
		int sum;
		int userAnswer;
		
		Scanner input = new Scanner (System.in);
		Random rn = new Random();
		
		number1 = rn.nextInt(100);
		number2 = rn.nextInt(100);
		
		System.out.println("What is the answer to the following problem? : ");
		System.out.print(number1 + " + " + number2 + " = ");
		
		userAnswer = input.nextInt();
		
		sum = number1 + number2;
		
		if (userAnswer== sum) {
			System.out.println("Correct! You got it! ");
		}
		else {
			System.out.println("Sorry, wrong answer. The correct answer is  : " + sum);
		}
	}
}
