package p09ClassObject;

public class CellPhone {
	
	String  brand;
	double screenSize;
	String color;
	double price;
	
	public  void call() {
		System.out.println("Calling...");
	}

	public  void message() {
		System.out.println("Sending text message...");
	}
	public  void takePhoto() {
		System.out.println("Taking Photo...");
	}
}