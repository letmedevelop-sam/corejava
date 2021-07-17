package p13RandomClass;

import java.util.Random;

public class HeadsOrTails {

	public static void main(String[] args) {
		/*
		 * Write a program to simulate ten coin tosses,
		 * Each time the program simulates a coin toss,
		 * it should randomly display either Heads or Tails
		 */

		Random rn = new Random();
		
		for (int i =1; i<=10; i++) {

			boolean b = rn.nextBoolean();
			
			if (b) {
				System.out.println(i + " - Heads");
			}
			else {
				System.out.println(i + " - Tails");
			}
		}
	}
}
