package p11StringManipulation;

public class CheckedString {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts 2 strings(str1,str2) 
		 * and prints the position index of the str2 if str2 is existing in str1.
		 * If it doesn't exist, print "not found"

		checkedString("Your order confirmation number is XYZ", "confirmation") ;
		 */
		
		checkedString("Your order confirmation number is XYZ","confirmation");
		
	}
	public static void checkedString(String sentence, String word) {
			
		int c = sentence.indexOf(word);
			
		if (c != -1) {
			System.out.println("The position of the word \"" + word + "\" is at index : " + c);
		}
		else {
			System.out.println("The word \"" + word + "\" is not found.");
		}
	}
}
