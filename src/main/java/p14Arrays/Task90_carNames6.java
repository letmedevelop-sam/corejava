package p14Arrays;

public class Task90_carNames6 {

	public static void main(String[] args) {
		/*
		 * Create a car array that holds 6 car names inside
		 * Check if your array has the car name �Honda�
		 * If it is , print � I found your car Honda in this array�
		 * If it is not, print � I could not find your car Honda in this array�
		 */

		String [] carNames = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes","VW"};
		
		for (int i = 0; i <= carNames.length-1;i++) {
			if(carNames.equals("Honda")) {
				System.out.println("Found it");
				break;
				
			}else {
				System.out.println("Not found it");
			}
		}
	}

}
