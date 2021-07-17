package p12StringExamples;

public class SubstringTask2 {

	public static void main(String[] args) {
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		String result = chars.substring(0, 2) + word + chars.substring(2) ;
		
		System.out.println(result);
	}

}
