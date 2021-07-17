package p11StringManipulation;

public class StringReplace2 {

	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby";
		String omitSpaces = sentence.replace("", "-");
		String omitSpaces2 = sentence.replace(" ", "");
		String omitSpaces3 = sentence.replace(" ", "-");
		String omitSpaces4 = sentence.replace("", ".");
		
		System.out.println(sentence);
		System.out.println(omitSpaces);
		System.out.println(omitSpaces2);
		System.out.println(omitSpaces3);
		System.out.println(omitSpaces4);
	}
}
