package p05NestedForAndWhileLoops;

public class PyramidWithAsterisks {

    public static void main(String[] args) {
        /* Write a program that displays triangle with stars*/
        int line =4;
        for (int i = 0; i < line; i++) {
            for (int space = line-i; space > 1; space--) {
                System.out.print(" ");
            }
            for (int asterisk = 0; asterisk <=i; asterisk++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
