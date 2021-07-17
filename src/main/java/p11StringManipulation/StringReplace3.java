package p11StringManipulation;

public class StringReplace3 {

	public static void main(String[] args) {

		//Example 1:
		String mixed = "%&/jF+%^+aGHYvJGTa";
		mixed  = mixed
					.replace("%&/", "")
					.replace("F+%^+", "")
					.replace("GHY", "")
					.replace("JGT", "");
		
		System.out.println(mixed);	//will print "java"

		//Example 2:
		String result = " About 8,936,256,000 results 5465 seconds";
		result = result
					.replace(" About ", "")
					.replace(" results 5465 seconds", "");

		System.out.println(result);	//will print "8,936,256,000"
	}
}
