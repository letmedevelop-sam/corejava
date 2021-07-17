package p14Arrays;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
		
		String str = "1 2 3 4 5 6 7 8 9 10";
		String[] arr = str.split(" ");
		
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[2]);
		System.out.println(arr[4]);
	}

}
