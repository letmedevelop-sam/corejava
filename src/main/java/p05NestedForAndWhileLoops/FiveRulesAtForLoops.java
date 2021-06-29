package p05NestedForAndWhileLoops;

public class FiveRulesAtForLoops {

    public static void main(String[] args) {

	/*
	1 - Create an infinite loop

	 for ( ; ; ){
	  System.out.println(	"Hello"	);
	  int i = 1;
		for (     ; i<=5;      ) {
			System.out.println(i);

		}
		for (    ;      ;  i ++) {
			System.out.println(i);
		}

		for (    ; i<=5 ;       ) {
			System.out.println(i);
		}
		*/

        /*
        2 - create multiple terms to the for statement

		int x = 0;
		for ( long y =0, z=4; x<5 && y<10 ; x++ , y++) {
			System.out.println(y + " ");
	}
		System.out.println(x);*/

        /*
        3 - Re-declaring a variable in the init block

       int x = 0;
		for (long y = 0, x = 4; x<5 && y<10; x++ , y++) {
			System.out.println("Hello");

			if you change type does not compile
		}*/

		/*
		4- using incompatible data types in the init block
		  the data types must be same in one for loop

		 for (long y = 0, int x = 4; x<5 && y<10; x++ , y++) {
			System.out.println("Hello");
		 */

        /*
        5 - Using loop variables outside the loop
         */
        for (long y = 0,  x = 4; x<5 && y<10; x++ , y++) {
            System.out.println("Hello");

        }
    }
}
