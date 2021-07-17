package p14Arrays;

import java.util.Random;
import java.util.Scanner;

public class Array2D_inputsWithScannerAndForLoop {

	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);
		System.out.print("Enter the  number  of  rows : ");
		int row = input.nextInt();	//indicate number of rows
	
		System.out.print("Enter the number of columns : ");
		int column = input.nextInt();	//indicate number of columns
		System.out.println("\nThis is a "+ row + " by " + column + " matrix.\n");
		
		int[][] scores = new int [row][column];  // create a 2 D  array
		
		Random rn = new Random();	//import Random
		
		for (int i=0; i<row; i++) {			//	create rows
			
			for (int j =0; j<column; j++) {			//create columns
				
				scores [i][j]  = rn.nextInt((50-10)+1)+10;		//randomly indicate a number between 10-50 
				
				if (j!=(column-1)) {
					System.out.print  (scores[i][j] + "   ");  		//print the numbers side by side
				
				}else {
					System.out.println(scores[i][j] + "   \n");		// at the end of column goto nextline
				
				}
			}
			
		}
		System.out.println("(The numbers are ramdomly created between 10 and 50)\n");
	}

}
