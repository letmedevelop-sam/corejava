package p11StringManipulation;

public class StringSubstring {

	public static void main(String[] args) {
		
		String sentence = "Java String Manipulation is fun";
		System.out.println("Normal form of given sentence : " + sentence);

		//Example 1
		System.out.print("Print starting from  index  2 :   ");
		System.out.println(sentence.substring(2));		//will print starting from index 2

		//Example 2
		System.out.print("Print between indexes 5 to 11 :      ");
		System.out.println(sentence.substring(5, 11));	//will print starting from index 5 including 11
	}
}
