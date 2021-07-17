package p14Arrays;

import java.util.Arrays;

public class ArrayClass_copyOf {

	public static void main(String[] args) {
		
		
		//   copyOf()    => creating a new object
		//   it Copies the specified array, truncating or padding with 
		//zeros (if necessary)so the copy has the specified length. 
		
		double [] d1 = {2.3, 4.5, 12.4};
		double [] d2 = d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0]=100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[1]=10.7;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double [] d3 = Arrays.copyOf(d2, d2.length);
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 5.2;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		//String:   ==   and    .equals
		//Array :   reference equality  (referring to the same object)    and copyOf()   => creating a new object
		
		
		
		
	}

}
