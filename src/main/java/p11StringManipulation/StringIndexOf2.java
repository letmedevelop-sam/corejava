package p11StringManipulation;

public class StringIndexOf2 {

	public static void main(String[] args) {

	String word1 = "github";
	System.out.println(word1.indexOf("g"));
	System.out.println(word1.indexOf("t"));
	System.out.println(word1.indexOf("ub"));

	System.out.println(word1.indexOf("java"));

	String url = "www.okta.com";

	System.out.println(url.indexOf("."));

	int i = url.indexOf(".");

	System.out.println(url.charAt(i+1));


	//find position of "_" and check if space is on right and left side

	String title = "Java _ Google Search";

	int dash = title.indexOf('_');
	System.out.println(title.charAt(dash-1));
	System.out.println(title.charAt(dash+1));
	System.out.println("apple");

	String country = "United States of America";
	int states = country.indexOf("States");
	System.out.println("Position of States is : " + states);

	String word2 = "java, c++, python, tomcat, eclipse";
	//check if c++ is in the word2


	//1-contains...
		if(word2.contains("c++")) {
			System.out.println("c++ is in the sentence word2");
		}else {
			System.out.println("c++ is not in the sentence word2");
		}

	
	//2-indexOf...
		if ( word2.indexOf("c++") != -1){
			System.out.println("c++ is in the sentence word2");
		}else {
			System.out.println("c++ is not in the sentence word2");
		}
	}
}


