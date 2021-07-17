package p11StringManipulation;

public class StringIndexOf1 {

	public static void main(String[] args) {

	String words= "html-selenium-angular-jenkins-grid";
	System.out.println("words = " + words);

	int firstDash = words.indexOf("-");	//it will give us the index number of first -
	System.out.println("Index number of First Dash  : " + firstDash);
//Once we learn the index number of first - we are searching for the next starting from next index number

	int secondDash = words.indexOf("-", 5);
	System.out.println("Index number of Second Dash : " + secondDash);

	int thirdDash = words.indexOf("-", secondDash+1);
	System.out.println("Index number of Third Dash  : " + thirdDash);

	int lastDash = words.lastIndexOf("-");
	System.out.println("Index number of Last Dash   : " + lastDash);
	
	int x = words.lastIndexOf("-", 28);

	System.out.println(words.charAt(x));

	System.out.println(words.charAt(x+1));
	}
}


