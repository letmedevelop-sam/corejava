package p11StringManipulation;

public class NumberOfA {

	public static void main(String[] args) {
		/*  Write a program to count the number of occurrences for specific char
			String word = "abcabqcabc"
			Number of a in this string is: 3
		 */

		String word = "abcabqcabc";
		
		int n = word.length()-1;
		int numberOfA = 0;
		
		for (int i=0;    i<=n;   i++) {
			if (word.charAt(i) == 'a') {
				numberOfA +=1;
				
			}
		}
		System.out.println("Number of 'a' in this string is : " + numberOfA);
	}
}
