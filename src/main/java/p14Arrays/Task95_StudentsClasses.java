package p14Arrays;

public class Task95_StudentsClasses {

	public static void main(String[] args) {
		
		int [][] scores = {
				{68, 75, 54, 80},
				{100, 64, 20 ,50},
				{10, 35, 40, 90}
				};
		
		int sum = 0;
		
		for ( int column = 0; column<scores[0].length;column++ ) {
			
				sum = sum + scores[0][column];
		}
		System.out.println("The avegare of student1 is : " + sum/scores[0].length);
		
		int sum2 = 0;
		for (int row = 0; row<scores.length; row++) {
			sum2 = sum2 + scores[row][0];
		}
		System.out.println("Sum of Math is : " + sum2);
		System.out.println("average of Math is : " + sum2/3);
	}

}
