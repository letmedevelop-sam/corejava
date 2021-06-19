package p01arithmeticOperators;

public class CircleCalculations {
    public static void main(String[] args) {

        final double PI = 3.14;
        double radius = 5.5;
        double perimeter, area;

        perimeter = 2 * radius * PI;
        area = radius * radius * PI;

        System.out.println("The  AREA  of  the  circle  with a radius of " + radius + " is : " + area);
        System.out.println("The PERIMETER of the circle with a radius of " + radius + " is : " + perimeter);
    }
}
