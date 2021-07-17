package p09ClassObject;

public class BMW {
	
	String make = "BMW";
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
			case "330i":
				price = 45000;
				break;
			case "740i":
				price = 85000;
				break;
			case "M3":
				price=65000;
				break;
			default:
				System.out.println(model + " is not available");
				price = 0.0;
		}
		System.out.println("Price : " + price);
	}
}
