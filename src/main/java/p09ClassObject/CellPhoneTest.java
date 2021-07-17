package p09ClassObject;

public class CellPhoneTest {

	public static void main(String[] args) {

		CellPhone cell1 = new CellPhone();
		
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		
		cell1.brand = "Nokia 6300" ;
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.71;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		System.out.println(cell1.price);

		cell1.color = "Black";
		System.out.println(cell1.color);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "siemens" ;
		cell2.screenSize = 1.5;
		cell2.color = "Red";
		cell2.price = 100.41;
		
		System.out.println("*****Cell 2 Values ******");
		System.out.println(cell2.brand);
		System.out.println(cell2.screenSize);
		System.out.println(cell2.color);
		System.out.println(cell2.price);
		
		System.out.println("*****calling methods ******");
		
		cell1.call();
		cell1.message();
		cell1.takePhoto();
	}
}
