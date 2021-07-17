package p12StringExamples;

public class SubstringTask {

	public static void main(String[] args) {


		String s1 = "Programming is fun";
		System.out.println(s1.substring(1,4));	//will print     rog

		
		System.out.println(s1.substring(2,3));  //will print    o
		
		System.out.println(s1.substring(12,s1.length()-4));  //will print    is
		
		System.out.println(s1.substring(4,4));  //will print  empty space
		
		System.out.println(s1.length());  //will print  18
	}
}
