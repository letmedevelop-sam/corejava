package p14Arrays;

public class SameArray {

	public static void main(String[] args) {

		int [] array1 = {2,4,6,8,10};

		int [] array2 =array1;
		
		array1 [0]=200;
		
		array2 [4]=1000;
		
		System.out.println("The content of array1 is :");
		
		for (int val : array1) {
			System.out.print(val + "    ");
		}
		
		System.out.println("\n\nThe content of array2 is :");
		
		for (int val : array2) {
			System.out.print(val + "    ");
		}
		
		
	}

}
