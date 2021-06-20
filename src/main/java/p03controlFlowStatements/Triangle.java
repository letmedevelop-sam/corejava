package p03controlFlowStatements;

public class Triangle {
    public static void main(String[] args) {
        /* A triangle is valid if the sum of all the three angles is equal to 180 degrees.
         * Write a program that declares three integers as angles and check whether a triangle is valid or not. */

        int angle1 = 10, angle2=60, angle3 = 70;

        if ((angle1 + angle2 + angle3) == 180) {

            System.out.println("This is a valid triangle");
        }else {

            System.out.println("This is not a valid triangle");
            System.out.print("Sum of the angles = " );
            System.out.print(angle1 + angle2 + angle3);
        }
    }
}
