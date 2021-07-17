package p10UserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
	/*
		Enter a whole number 1-99, and I will find a combination of coins that equals that amount of change
		
		quarter : 25
		dimes : 10
		Nickels : 5
		pennies : 1
*/
		
		Scanner enter = new Scanner (System.in);
		System.out.print("Enter a whole number 1-99 : ");
		int amount = enter.nextInt();
		
		int amountAtTheBegining = amount;
		
		int quarters = amount / 25;
		amount = amount % 25;       //remainder of quarters
		
		int dimes = amount / 10;
		amount = amount % 10;       //remainder of dimes
		
		int nickles = amount / 5;
		amount = amount % 5;       //remainder of nickles
		
		int pennies = amount;       //remainder
		
		System.out.println(amountAtTheBegining + " cents is :\n " + quarters + " quarters,\n "+ dimes + " dimes,\n " + nickles + " nickles,\n " + pennies + " pennies.");
		
		
		
	}

}
