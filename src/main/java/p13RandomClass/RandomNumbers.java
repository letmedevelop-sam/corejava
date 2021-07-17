package p13RandomClass;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		Random rn = new Random();

			System.out.println("a random integer value : " +  rn.nextInt());
			
			System.out.println("a random double  value : " +  rn.nextDouble());
			
			System.out.println("a random float  value  : " +  rn.nextFloat());
			
			System.out.println("a random boolean value : " +  rn.nextBoolean());
			
	System.out.println("a random integer number between 0 - 49 : " +  rn.nextInt(50));		 // will print a number between 0 - 49
	
	System.out.println("a random integer number between 5 - 14 : " + rn.nextInt(10) + 5);   // will print a number between 5 - 14
	}
}
