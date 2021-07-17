package p11StringManipulation;

public class StringIndexOf3withForLoop {

	public static void main(String[] args) {

		String words= "html-selenium-angular-jenkins-grid";

		System.out.print("The index numbers of '-' in words : " );

		int n = words.length()-1;
		int countOfDash = 0;
		
		String numberOfDash = "";
		
		for (int i = 0; i<=n;   i++) {
			
			if (words.charAt(i) == '-') {
				countOfDash++;
				
				if (countOfDash==1) {
					System.out.print(numberOfDash+ i);
				}else
					System.out.print(numberOfDash + ", " + i); 
			}
		}
		System.out.println("\nThere are " + countOfDash + " times \"-\" in the sentence \""+ words + "\"");
	}
}


