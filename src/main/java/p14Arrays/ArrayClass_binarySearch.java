package p14Arrays;

import java.util.Arrays;

public class ArrayClass_binarySearch {

	public static void main(String[] args) {
				
		
		// binarySearch() Searches the specified array of ints for the specified value using thebinary search algorithm. 
		
		int [] numX = {4,5,6,10,100};
		System.out.println(Arrays.binarySearch(numX, 6));
	
		System.out.println(Arrays.binarySearch(numX, 55));
		System.out.println(Arrays.binarySearch(numX, 5));
		System.out.println(Arrays.binarySearch(numX, 15));
		System.out.println(Arrays.binarySearch(numX, 10));
		
		int [] numX2 = {40,6,101,100,72};
		System.out.println(Arrays.binarySearch(numX2, 83));
		
		
	}

}
