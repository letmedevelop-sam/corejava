package p04ForLoop;

public class OddNumbers {

    public static void main(String[] args) {
		/* Write a program that displays all odd numbers
		between 5-140 in same line*/

        for (int num1 = 5; num1 <= 140; num1++) {
            if (num1 % 2 == 1) {
                System.out.print(num1 + " ");
                if (num1 == 79) {
                    System.out.println("\n");
                }

            }
        }
    }
}
