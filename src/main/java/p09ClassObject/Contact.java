package p09ClassObject;

public class Contact {

	String name;
	String phoneNumber;
	String email;
	
	public void contactCard() {
		System.out.println("-------------------------------");
		System.out.println("Name          : " + name);
		System.out.println("Phone Number  : " + phoneNumber);
		System.out.println("E-mail address : " + email);
	}
	
	public void call() {
		System.out.println("calling "+name);
	}

	public void sendMessage() {
		System.out.println("Sending message to " + phoneNumber + " | name " + name);
	}
	
	public void sendEmail() {
		System.out.println("Sending email to " + email + " | name " + name);
	}
}

