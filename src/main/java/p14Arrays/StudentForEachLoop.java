package p14Arrays;

public class StudentForEachLoop {

	public static void main(String[] args) {
		
		int [][] students = { {40,50,60}, {12, 50, 70}, {23, 56, 12, 30} };
		
		for (int [] group : students) {
			
			System.out.println();
			
			for (int studentID : group) {
				
				System.out.print(studentID + "   ");
			}
		}

	}

}
