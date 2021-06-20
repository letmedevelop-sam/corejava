package p03controlFlowStatements;

public class GreatestNumber {
    public static void main(String[] args) {
		/* Input:
	Enter first number: 4
	Enter second number: 8
	Enter third number: 1
		• Output:
	The greatest number is: 8*/

        int a = 40;
        int b = 8;
        int c = 10;

        if ( (a>b) && (a>c) ) {
            System.out.println("The gratest number is a :  " + a);
        }

        if ( (b>a) && (b>c) ){
            System.out.println("The gratest number is  b :  " + b);
        }

        if ( (c>a) && (c>b)) {
            System.out.println("The gratest number is  c :  " + c);
        }


        /*• Declare 3 numbers
         * • Program should display which one is largest  */

        int x =13, y =14, z= 15;
        if ((x>y) && (x>z)) {
            System.out.println("x : " + x + " is bigger than " + y + " and " + z );
        }else if ((y>x) && (y>z)) {

            System.out.println("y : " + y + " is bigger than " + x + " and " + z );
        }else {

            System.out.println("z : " + z + " is bigger than " + x + " and " + y );
        }
    }
}
