package p05NestedForAndWhileLoops;

public class SixStars {
    public static void main(String[] args) {
        /*
        Write a Java program to create pattern

         *  *  *  *  *  *
         *  *  *  *  *  *
         *  *  *  *  *  *
         *  *  *  *  *  *
         *  *  *  *  *  *
         *  *  *  *  *  *

         */

        int n = 7;
        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                System.out.print("*  ");}
            System.out.println();
        }
    }
}
