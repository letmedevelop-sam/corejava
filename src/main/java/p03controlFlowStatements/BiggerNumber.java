package p03controlFlowStatements;

public class BiggerNumber {
    public static void main(String[] args) {
        /*Declare and initialize 2 variable numbers
         * Program should tell which number is bigger
         * ex: “Number1 number is greater than Number2 number” */

        int a =15, b =10;

        if (a>b) {

            System.out.println("Number1 : " + a + " is greater than Number2  : " + b);
        }
        if (a==b){
            System.out.println("Number1 : " + a + " is equal to Number2  : " + b);
        }
        else {
            System.out.println("Number2 : " + b + " is greater than Number1  : " + a);
        }

    }

}
