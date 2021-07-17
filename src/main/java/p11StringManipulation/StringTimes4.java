package p11StringManipulation;

public class StringTimes4 {

	public static void main(String[] args) {
		/*  Write a program to create a new String word with writing all characters in given word 4 times
			String word = "ABCD"
			String word2 = "AAAABBBBCCCCDDDD"
		 */

		String word = "ABCD";
		String word2="";
		
		for (int i = 0;    i <= word.length()-1;   i++) {
			for(int j = 0;    j < 4;               j++) {
				word2 = word2 + word.substring (i, i+1);
			}
		}
		System.out.println(word2);
	}
}
