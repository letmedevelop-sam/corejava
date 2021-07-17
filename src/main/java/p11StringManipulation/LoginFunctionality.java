package p11StringManipulation;

import java.util.Scanner;

public class LoginFunctionality {

	public static void main(String[] args) {
		/*
			� --> Program will ask to enter username and password
			� --> If both username and password are blank
				"UserName and Password Fields cannot be empty"
			� --> If userName is blank and password is not blank
				"UserName cannot be empty"
			� --> If userName is not blank and password is blank
				"Password cannot be empty"
			� --> If the username or password is not valid
				"UserName or password is not valid. Please verify"
			� --> If the username and password are both valid
				"User Logged in successfully"
		 */

		LoginFunc();
	}

	public static void LoginFunc() {
		String userName = "sami";
		String password = "123";
		
		Scanner sc = new Scanner (System.in);
		System.out.print("User Name : ");
		String scannedUserName = sc.nextLine();
		
		System.out.print("Password  : ");
		String scannedPassword = sc.nextLine();
		
			if (scannedUserName.equals("") && scannedPassword.equals("")) {
					System.out.println("UserName and Password Fields cannot be empty!");
			
			}else if (scannedUserName.equals("") && !scannedPassword.equals(""))  {
				System.out.println("UserName Field cannot be empty!");
				
			}else if (!scannedUserName.equals("") && scannedPassword.equals(""))  {
				System.out.println("Password Field cannot be empty!");
				
				
			}else if (!scannedUserName.equals(userName) || (!scannedPassword.equals(password))) {
				System.out.println("UserName and/or password is not valid. Please verify!");
				
			}else if (scannedUserName.equals(userName) && (scannedPassword.equals(password))) {
				System.out.println("User Logged in successfully!");
			}
			
			/*}else if ((scannedUserName.equals(userName)) && (scannedPassword.equals(password))) {
				System.out.println("User Logged in successfully!");
			}	*/		
		}
}


