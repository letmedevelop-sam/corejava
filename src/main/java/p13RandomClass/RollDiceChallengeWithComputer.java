package p13RandomClass;

import java.util.*;

public class RollDiceChallengeWithComputer {

	public static void main(String[] args) {
		/*
		 * Write a program that plays a simple dice game between the computer and the user. 
		 * When the program runs, a loop should repeat 3 times.
		 * Each iteration of the loop should do the following:
		
		-	Generate a random integer in the range of 1 thru 6. This is the value of the computer's dice.
		-	Generate another random integer in the range of 1 thru 6. This is the value of the user's dice.
		-	The dice with the highest value wins. (In case of a tie, there is no winner)

		* As the loop iterates, the program should keep count of the number of times the
		computer wins, and the number of times that the user wins.
		* After the loop performs all of its iterations, the program should display who was the grand winner, the computer or the user.
		*/

		Random rn = new Random();
		Scanner input = new Scanner (System.in);

		int dice1, dice2, dice3, dice4; 
		int scoreComp = 0, scorePlayer = 0;
		
		for (int i = 1; i<=4; i++) {
			System.out.println("Computers turn...");
	 		dice1 = rn.nextInt(6) + 1;
			dice2 = rn.nextInt(6) + 1;
			System.out.println("Computer rolled the dice: " + dice1 + " & " + dice2);

			System.out.println("Press enter to roll dice : ");
			String turn = input.nextLine();

			if (turn.equalsIgnoreCase("")) {
				dice3 = rn.nextInt(6)+1;
				dice4 = rn.nextInt(6)+1;
				System.out.println("You rolled the dice: " + dice3 + " & "+ dice4 + "\n");

				if( (dice1 + dice2) > (dice3 + dice4) ){
					scoreComp++;
					System.out.println("Computer : " + scoreComp);
					System.out.println("Player   : " + scorePlayer +"\n");
				}
				else if( (dice1 + dice2) < (dice3+dice4) ){
					scorePlayer++;
					System.out.println("Computer : " + scoreComp);
					System.out.println("Player   : " + scorePlayer +"\n");
				}
				else if( (dice1 + dice2) == (dice3+dice4) ){
					System.out.println("No points at this turn...\n");
				}
			}
		}

		if(scoreComp > scorePlayer) {
			System.out.println("Computer Won...");
		}
		else if(scoreComp < scorePlayer) {
			System.out.println("Congrats... You Won...");
		}
		else if(scoreComp == scorePlayer) {
			System.out.println("Tie...");
		}
	}
}
