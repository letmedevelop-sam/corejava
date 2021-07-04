package p04ForLoop;

public class MutiplicationTableForN {

    public static void main(String[] args) {
		/*Write a program that the user to declare a positive integer. It should then print the
		multiplication table of that number.*/

        int n = 9;
        System.out.println("Multiplication table of " + n);
        System.out.println("------------------------------");

        for (int i = 1; i<=10; i++) {
            int j = i*n;
            if(i<10) {
                System.out.println(" " + i + "  x  " + n + " = " + j);
            }else {
                System.out.println( i + "  x  " + n + " = " + j);
            }
        }
    }
}
