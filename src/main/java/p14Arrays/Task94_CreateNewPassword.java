package p14Arrays;

public class Task94_CreateNewPassword {

	public static void main(String[] args) {
		/*
		 * String info1 = "This info is used for creation password : xxxCD132Gxxx . 
		 Please do not share with anyone";
		 * String info2 = "This info is used for creation password : xxx00ABC!xxx . 
		 Please do not share with anyone";
		 * Create a password based on given info.
				Output: CD132G00ABC!
		 */

		String info1 = "This info is used for creation password : xxxCD132Gxxx . "
				+ "Please do not share with anyone";
		
		String info2 = "This info is used for creation password : xxx00ABC!xxx . "
				+ "Please do not share with anyone";
		
		String [] array1 = info1.split(" "); //As I used " " to split, I will not need to use trim to get rid of the spaces. 
		String [] array2 = info2.split(" ");
		
		System.out.println(array1 [8]);
		System.out.println(array1 [8].substring(3, array1 [8].length()-3));
		String a = array1 [8].substring(3, array1 [8].length()-3);
		
		System.out.println(array2 [8]);
		System.out.println(array2 [8].substring(3, array1 [8].length()-3));
		String b = array2 [8].substring(3, array1 [8].length()-3);
		
		System.out.println(a+b);
		
		
	}

}
