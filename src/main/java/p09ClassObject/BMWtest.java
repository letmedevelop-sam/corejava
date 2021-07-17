package p09ClassObject;

public class BMWtest {

	public static void main(String[] args) {


		BMW b1 = new BMW();
		BMW b2 = new BMW();
		
		System.out.println("Make of b1 : " + b1.make + " -> coming as default.");
		System.out.println("Make of b2 : " + b2.make + " -> coming as default.");
		
		b1.make = "BMW2019";
		System.out.println("Make of b1 : " + b1.make + " -> coming from re-assign.");
		System.out.println("Make of b2 : " + b2.make + " -> coming as default.");

		System.out.println("Model of b1 : " + b1.model + " -> Not assigned as default.");
		b1.model = "M3";
		System.out.println("Model of b1 : " + b1.model + " -> Model newly assigned.");
		b1.showPrice();
		
		b2.model = "X3";
		
		b2.showPrice();
	}
}
