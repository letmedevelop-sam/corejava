package p13RandomClass;

import java.util.*;

public class RollDice {

	public static void main(String[] args) {
		/*
		 * Write code to simulate the rolling dice.
		 * The program should randomly generate two numbers in the range of 1 through 6 and display them.
		 * Ask user whether keep rolling dices or not
		 */

			int dice1;
			int dice2;
			
			String repeat = "y";
			
			Scanner input = new Scanner (System.in);
			
			Random rn = new Random();
						
		while  (repeat.equalsIgnoreCase("y")) {
			
			System.out.println("Rolling dice...");
			
			dice1 = rn.nextInt(6) + 1;	//will generate a number between 1 and 6
			dice2 = rn.nextInt(6) + 1;	//will generate a number between 1 and 6
			
			System.out.println("Their values are : " + dice1 + " - "+  dice2);
			
			System.out.print("Do you want to roll again y = yes ?"); // y Y n N
			
			repeat = input.nextLine();
		}
	}
}
