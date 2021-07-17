package p11StringManipulation;

public class StringEquals1 {

	public static void main(String[] args) {

	String str1 = "Apple";
	String str2 = "Apple";

	System.out.print("str1 == str2      : ");
	System.out.println(str1==str2);
	System.out.println("str1.equals(str2) : " + str1.equals(str2));

	System.out.println("*****");
	String str3 = "Apple";
	String str4 = new String ("Apple");

	System.out.print("str3 == str4      : ");
	System.out.println(str3==str4);
	System.out.println("str3.equals(str4) : " + str3.equals(str4));

	}
}
