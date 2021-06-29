package p05NestedForAndWhileLoops;

public class NumberStep {
    public static void main(String[] args) {
		/* Write a Java program to create pattern
		1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
*/
        int n = 6;
        for (int number = 0;  number<n;   number++) {
            for (int step = 0;  step<number;  step++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }

}
