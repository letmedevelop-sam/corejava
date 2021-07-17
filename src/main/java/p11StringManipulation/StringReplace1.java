package p11StringManipulation;

public class StringReplace1 {

	public static void main(String[] args) {
		
		String str = "Moscow is the capital of Russia";
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbeycan");
		
		System.out.println(str);
		
		String email = "firstName_LastName@gmail.com";
		System.out.println(email);

		String company = "Capitalone";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);

	}

}
