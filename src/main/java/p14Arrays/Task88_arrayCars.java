package p14Arrays;


import java.util.Random;
import java.util.Scanner;

public class Task88_arrayCars {

	public static void main(String[] args) {
		/*
		 * � Create an array that holds cars (Honda, Toyota, Nissan, BMW, Mercedes, Porsche, Ferrari)
			� Ask user to enter an index number to choose his dream car.
			� Print the price for selected car.
	Car prices :
	Honda � Toyota � Nissan (Random price between  20 000 and  40 000)
	BMW-Mercedes			(Random price between  50 000 and  80 000)
	Porsche - Ferrari		(Random price between 100 000 and 150 000)
	
	� Hint : finding a random number between 2 numbers = > ((max - min) + 1) + min
		 */

		
		String[] carsArray = new String[7];
		
		Scanner input = new Scanner (System.in);
		Random rn = new Random();
		int price = 0;
		
		carsArray[0] = "Honda";
		carsArray[1] = "Toyota";
		carsArray[2] = "Nissan";
		carsArray[3] = "BMW";
		carsArray[4] = "Mercedes";
		carsArray[5] = "Porsche";
		carsArray[6] = "Ferrari";
		
		System.out.println("Select your dream car : ");
		int indexCar = input.nextInt();
		String selectedCar = carsArray[indexCar];
		
		switch (selectedCar) {
		
		case "Honda": case "Toyota": case "Nissan":
			price = rn.nextInt((40_000-20_000)+1)+20_000;
			break;
			
		case "BMW": case "Mercedes": 
			price =rn.nextInt((80_000-50_000)+1)+50_000;
			break;
				
		case "Porche": case "Ferrari": 
			price =rn.nextInt((1500_000-100_000)+1)+100_000;
			break;
		default:
			System.out.println("Invalid car");
		
		}
		
		System.out.println("Price for selected car is " + price);
	}

}
