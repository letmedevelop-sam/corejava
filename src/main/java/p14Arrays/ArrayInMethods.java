package p14Arrays;

import java.util.Arrays;

public class ArrayInMethods {

	public static void main(String[] args) {
/*

		int [] numbers = {5, 15, 10, 20, 25, 30, 50};
		
		for(int value : numbers) {
			showValue(value);
		}

	}

	public static void showValue(int n) {
		System.out.print(n + " ");
	}
	
	*/
		int [] input  = {1, 2, 3};
		
		double [] input2  = {1.3, 2.2, 3.6};
		
		findMax(input);
		findMax(input2);
	}
		 
		  
		  public static int findMax( int arr[]){
			  int maxInt = 0;
			  for(int i = 0; i<arr.length; i++) {
				  if (arr[i] > maxInt) {
						maxInt = arr[i];
				  } 
			  }
			  return maxInt;
		  
		 }
		  
		   public static double findMax( double arr[] ){
			   double maxDouble = 0;
			   for(int i = 0; i<arr.length; i++) {
					  if (arr[i] > maxDouble) {
							maxDouble = arr[i];
			}    
					  }return maxDouble;
		  	
	

}
		   }
