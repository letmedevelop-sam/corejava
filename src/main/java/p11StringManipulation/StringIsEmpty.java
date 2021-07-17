package p11StringManipulation;

public class StringIsEmpty {

	public static void main(String[] args) {

		String userName = "";
		String password = "";
		
		if (userName.isEmpty()) {
			System.out.println("User name can not be empty");
		}
		else {
			System.out.println("User name or password is not empty");
		}

		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("User name or password can not be empty");
		}

		else {
			System.out.println("User name or password is not empty");
		}
		
		//userName.is there can be space
	}
}
