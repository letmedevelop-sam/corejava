package p14Arrays;

public class teams {

	public static void main(String[] args) {


		String [][] teams = new String [2][4];
		
		teams[0][0] = "Mike";
		teams[0][1] = "Tony";
		teams[0][2] = "Smith";
		teams[0][3] = "Evan";

		teams[1][0] = "David";
		teams[1][1] = "Emmy";
		teams[1][2] = "John";
		teams[1][3] = "Ryan";
		
		System.out.println("First player of first team is : " + teams [0][0]);
		System.out.println(teams.length); 
		
	}

}
