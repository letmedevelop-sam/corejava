package p07Methods;

public class GreaterOf2numbers {
    public static void main(String[] args) {
		/*
		 Write a method that shows the grater number from 2 numbers
		 */

        greaterNumber();
    }

    public static void greaterNumber() {

        int a = 20, b= 20;

        if (a>b) {
            System.out.println(a + " is greater than " + b);

        }
        else if (b>a){
            System.out.println(b + " is greater than " + a);

        }
        else {
            System.out.println(a + " is equal to " + b);
        }
    }
}
