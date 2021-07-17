package p09ClassObject;

public class ContactTest {

	public static void main(String[] args) {


		Contact contact1 = new Contact();
		contact1.name = "Sami";
		contact1.phoneNumber = "545 473 8877";
		contact1.email = "sami@gmail.com";
		
		Contact contact2 = new Contact();
		contact2.name = "Ali";
		contact2.phoneNumber = "555 456 8975";
		contact2.email = "Ali@yahoo.com";
		
		Contact contact3 = new Contact();
		contact3.name = "Mehmet";
		contact3.phoneNumber = "532 658 5558";
		contact3.email = "Mehmet@mynet.com";
		
		System.out.println("\n*****Contact Information ******");
		
		contact1.contactCard();
		contact2.contactCard();
		contact3.contactCard();
	
/*
		System.out.println("Name		Phone Number		Email");
		System.out.println("----		---------			-------");
		
*/
	}

}
