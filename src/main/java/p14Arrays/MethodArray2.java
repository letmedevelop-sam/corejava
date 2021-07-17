package p14Arrays;

import java.util.Random;
import java.util.Scanner;

public class MethodArray2 {

	public static void main(String[] args) {


		System.out.println(findCar(3, "Honda"));

		

	}

	public static String[] createArray(int carArraySize) {
		
		Scanner input = new Scanner(System.in);
					
		String[] carArray = new String [carArraySize];
		
		for(int i=0;     i<carArray.length;    i++) {
			System.out.println("Enter your car # : " + (i+1));
			carArray[i] = input.nextLine();
		}
		
		return carArray;
		
	}
	
	public static boolean findCar(int value, String toFindCar) {
		
		for(String car : createArray(value)){
			
			if(car.equalsIgnoreCase(toFindCar)) {
				
				return true;
			}
			
					
		}
		return false;
		
			
	}
}
