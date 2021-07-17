package p11StringManipulation;

public class StringStartsEndWith {

	public static void main(String[] args) {

		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));

		//Mr. = > man
		//Mrs.=> married lady
		//Ms. => single lady
		//Dr. => Doctor
		//No title => No information
		
		String word2 = "Mrd";
		
		if (word2.startsWith("Mr")) {
			System.out.println("Man");
		}
		else if (word2.startsWith("Mrs")){
			System.out.println("Married woman");
		}
		else if (word2.startsWith("Ms")){
			System.out.println("Some woman");
		}
		else if (word2.startsWith("Dr")){
			System.out.println("Doctor");
		}else{
			System.out.println("No title");
		}
	}
}
