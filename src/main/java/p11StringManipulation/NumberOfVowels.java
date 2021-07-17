package p11StringManipulation;

public class NumberOfVowels {

	public static void main(String[] args) {
		/*
		 * Write a program to print only vowel (a,e,o,i,u) in given string
String word = "CybertekSchool";
Output: e,e,o,o
		 */

		
		String word = "CybertekSchool";
		int j = 0;
		System.out.print("Vowels in this word  : ");
		for(int i =0 ;    i< word.length();    i++) {
			
			char vowel = word.charAt(i);

			if (vowel=='a' || vowel=='e' || vowel=='o' || vowel=='i' || vowel=='u'){
				j++;
				if (j==1) {
				System.out.print(word.charAt(i) );
				}
				else {
					System.out.print(", " + word.charAt(i));
				}
			}
		}
		System.out.println();
		System.out.println("The number of vowels : " + j);
	}
}
