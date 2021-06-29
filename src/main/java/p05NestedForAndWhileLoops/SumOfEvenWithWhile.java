package p05NestedForAndWhileLoops;

public class SumOfEvenWithWhile {
    public static void main(String[] args) {
        /* Write a program using while loop, that calculates the sum of
         the even numbers between 0 and 100
         */

        int sumEven = 0,  i = 1;

        while (i < 100) {

            if (i % 2 == 0) {
                sumEven+=i;
            }
            i++;
        }
        System.out.println(sumEven);
    }
}
