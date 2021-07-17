package p11StringManipulation;

public class StringContains {
	
	public static void main(String[] args) {

	String word= "Java is a good program";
		System.out.println("word = " + word);
		System.out.println( "word.contains(\"is\") : "+ word.contains("is"));
		
		
		String email = "test@gmail.com";
		System.out.println("email = " + email);
		System.out.println("email.contains(\"@\") = " + email.contains("@"));


		String listing =	"potato, tomato, egg, milk, cereal, apple";

		if (listing.contains("apple")) {
			System.out.println("apple is in your list.");
		}
		else {System.out.println("apple is not in your list.");
		
		}
	
		boolean hasEggs = listing.contains("egg");
		System.out.println("Contains egg : " + hasEggs);
	
	
		boolean hasCucumbers = listing.contains("cucumber");
		System.out.println("Contains cucumber : " + hasCucumbers);
	
	
		email = "name@yahoo.com";
	
			if(email.contains("@yahoo") ) {
				System.out.println("Yahoo account");
		
			}else if(email.contains("@gmail") ) {
				System.out.println("gmail account");
			
			}else if(email.contains("@hotmail") ) {
				System.out.println("hotmail account");
			}
	
			
			String etsyTitle = "Car | Etsy";
				if (etsyTitle.contains(" | ") ) {
					System.out.println("Pipe is there as expected");
		
				}else {
					System.out.println(" Pipe is not detected");
				}
	
			}
	}

