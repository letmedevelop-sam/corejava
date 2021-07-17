package p14Arrays;

public class ForEachLoop_1 {

	public static void main(String[] args) {

		int [] numbers = {3,6,9};
		for (int val : numbers) {
			System.out.println("I wil drink " + val * 3 + " glasses of water.");
		}
			System.out.println("\n*******");
			
			
			String [] products = {"Timberland", "Shirt", "Watch", "Bag", "Shoes"};
			double[] prices = {120, 19.99, 300, 25, 67.89};
			
			for(int i = 0; i<products.length; i++) {
				System.out.println(products[i]);
			}
			
			System.out.println("--------------------");
			
			for(String prod : products) {
				System.out.println(prod);
				
			}	
				System.out.println("--------------------");
				
				for(double pr : prices) {
					System.out.println(pr);
					
			}

				System.out.println("--------------------\n");
				for(int i =products.length-1; i>=0; i--) {
					System.out.print(products[i] + " ");
}
				System.out.println("\n--------------------");
				for(int i = 0; i<products.length; i++) {
					System.out.print(products[i] + " ");
				}
}
}
