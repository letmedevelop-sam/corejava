package p10UserInput;

import java.util.Scanner;

public class ItemPrice {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    
		    String item1, item2, item3, report;
		    
		    double price1, price2, price3, totalPrice;
		    
		    System.out.print("Enter Item 1 name: ");
		    item1 = scan.nextLine();
		    
		    System.out.print("Enter Item 1's price: ");
		    price1 = scan.nextDouble();
		    
		    System.out.print("Enter Item 2 name: ");
		    item2 = scan.next();
		    
		    System.out.print("Enter Item 2's price: ");
		    price2 = scan.nextDouble();
		    
		    System.out.print("Enter Item 3 name: ");
		    item3 = scan.next();
		    
		    System.out.print("Enter Item 3's price: ");
		    price3 = scan.nextDouble();
		    
		    totalPrice = price1 + price2 + price3;
		    
		    report= "\nItem1  : " + item1 +"\nPrice  : " +  price1 + "\n\nItem 2  : " + item2 + "\nPrice   : " +  price2 + "\n\nItem 3 : " + item3 +"\nPrice  : " + price3 + "\nTotal Cost : " + totalPrice;
		    		    
		    System.out.println(report);
	}
}
