package p14Arrays;

public class Array {

	public static void main(String[] args) {

		int [] myList = {10, 20, 30, 40};
		
		String[] myArray = {"Apple", "Orange", "Melon"};
 		
		System.out.print(myList[0] + ", ");
		System.out.print(myList[1] + ", ");
		System.out.print(myList[2] + ", ");
		System.out.println(myList[3] + " \n");
		
		System.out.println("The number of elements in  myList is : " + myList.length + " \n");
		System.out.println("The number of elements in myArray is : " + myArray.length + " \n");
		
		for (int i=0; i<=myArray.length-1;  i++) {
			System.out.println((i+1) +". element is : " + myArray[i]);
		}
	}
}
