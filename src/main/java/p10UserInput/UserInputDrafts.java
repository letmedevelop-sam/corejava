package p10UserInput;

import java.util.Scanner;

//import java.util.*;

public class UserInputDrafts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a byte value : ");
		byte b1 = sc.nextByte();
		System.out.println("Byte value is : " + b1);

		System.out.print("Enter a  short : ");
		short s1 = sc.nextShort();
		System.out.println("Short value is : " + s1);

		System.out.print("Enter a int  : ");
		int i1 = sc.nextInt();
		System.out.println("int value is : " + i1);

		System.out.print("Enter a long int : ");
		long l1 = sc.nextLong();
		System.out.println("long value is : " + l1);

		System.out.print("Enter a double int : ");
		double d1 = sc.nextDouble();
		System.out.println("double value is : " + d1);

		System.out.print("Enter a boolean int : ");
		boolean bool1 = sc.nextBoolean();
		System.out.println("boolean value is : " + bool1);

		System.out.print("Enter a boolean String : ");
		String String1 = sc.nextLine();
		System.out.println("String value is : " + String1);
	}
}
