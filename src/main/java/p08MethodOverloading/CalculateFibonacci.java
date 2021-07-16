package p08MethodOverloading;

public class CalculateFibonacci {
    public static void main(String[] args) {

        /*
        Write a method to print the Fibonacci series with the number of elements given as method parameter.
         */

        printFibonacci(10);

    }

    private static void printFibonacci(int members) {
        int elements = members;
        int sumOfNext = 0, member1 = 0, member2 = 1;
        System.out.println("Fibonacci series of " + elements + " numbers.");

        for (int i = 1; i <= elements; i++) {
            if (i == 1) {
                System.out.print(member1);
            }
            else{
                System.out.print(", " + member2);

                sumOfNext = member1 + member2;
                member1 = member2;
                member2 = sumOfNext;}
        }
    }
}
