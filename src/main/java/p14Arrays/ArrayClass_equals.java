package p14Arrays;

import java.util.Arrays;

public class ArrayClass_equals {

	public static void main(String[] args) {
		
		
		// equals : Returns true if the two specified arrays of ints are equal to one another. 
		
		int [] nums1 = {4,5,6,10,100};
		int [] nums2 = {4,5,6,10,100};

		System.out.println(Arrays.equals(nums1, nums2));
		
		
		//String:   ==   and    .equals
		//Array :   reference equality  (referring to the same object)    and copyOf()   => creating a new object
		
		
		
		
	}

}
