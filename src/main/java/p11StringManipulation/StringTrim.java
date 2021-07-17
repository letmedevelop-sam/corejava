package p11StringManipulation;

public class StringTrim {

	public static void main(String[] args) {

		String sentence = "       Java String Manipulation is fun";
		System.out.println("Not trimmed : " + sentence);
		System.out.println("Not trimmed Length: " + sentence.length());
		System.out.println("Trimmed        : " + sentence.trim());
		System.out.println("Trimmed Length : " + sentence.trim().length());

		String sentence2 = "Java String Manipulation is fun              ";
		System.out.println(sentence2.trim());
	}
}
