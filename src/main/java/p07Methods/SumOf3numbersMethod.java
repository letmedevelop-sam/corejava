package p07Methods;

public class SumOf3numbersMethod {
    public static void main(String[] args) {
		/*
		 Write a method that calculates the sum of 3 numbers
		 */

        sumOf3numbers();
    }

    public static void sumOf3numbers() {

        int sum, a =10, b= 20, c = 30;

        sum = a + b + c;

        System.out.println("Sum of " + a + "+" + b + "+" + c + " is " + sum);
    }
}
