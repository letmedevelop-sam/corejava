package p04ForLoop;

public class SumOfOddsEvens {

    public static void main(String[] args) {
		/* Write a program that displays sum of even and odd numbers between 1 and 100
excluding 100*/

        int sumOdd=0, sumEven = 0;

        for (int i = 1; i < 100;  i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }
            else
            {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("The sum of even numbers is = " + sumEven);
        System.out.println("The sum of  odd numbers is = " + sumOdd);
    }

}
