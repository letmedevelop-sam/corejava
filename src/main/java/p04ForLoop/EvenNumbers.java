package p04ForLoop;

public class EvenNumbers {

    public static void main(String[] args) {
        /* Write a program that displays all even numbers
         * between 1-100 in same line*/


        for (int num1 = 2; num1<101; num1+=2)
            System.out.print(num1 + " " );


        System.out.println( " \n ");



        for (int num2 = 1; num2 < 101; num2 += 1)

            if (num2 % 2 == 0) {
                System.out.print(num2 + " ");
            }
    }
}
