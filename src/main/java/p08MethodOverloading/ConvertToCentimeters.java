package p08MethodOverloading;

public class ConvertToCentimeters {
    public static void main(String[] args) {
    /*
     * Create a method called calcFeetAndInchesToCentimeters. It needs to have two parameters.
     * Feet is the first parameter, inches is the second parameter.
     * You should validate that the first parameter feet is >=0,
     * and second parameter inches is>=0 and <=12.
     * Return -1 from the method if either of the above is not true.
     * If the parameters are valid, then calculate how many centimeters comprise the feet and
     * inches passed to this method and return that value.
     * Create a second method of the same name but with only one parameter inches is the
     * parameter and validate it >=0, return -1 if it is not true. But if it is valid,
     * then calculate how many feet are in the inches.
     * Call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.
     * Hints : Use double for your number data types 1 inch = 2.54cm and 1 ft = 12 inches
     */

		System.out.println("6    0");
    calcFeetAndInchesToCentimeters(6,0);

		System.out.println("\n-10   0");
    calcFeetAndInchesToCentimeters(-10,0);

		System.out.println("\n0   1");
    calcFeetAndInchesToCentimeters(0,1);

		System.out.println("\n100");
    calcFeetAndInchesToCentimeters(100);

		System.out.println("\n156");
    calcFeetAndInchesToCentimeters(156);

}
    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {

        if ((feet >= 0) && (inch >= 0) && (inch <= 12)) {

            double cm = (inch * 2.54) + (feet * 12 * 2.54);

            System.out.println(feet + " feet and " + inch + " inches = " + cm + " cm.");

            return cm;

        }else {

            System.out.println("Invalid feet or inches");

            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {

        if (inch >= 0) {

            double feet = (int) (inch / 12);

            double inch2 = (inch%12);

            System.out.println(inch + " inches = " + feet + " feet and " + inch2 + " inches.");

            return calcFeetAndInchesToCentimeters(feet,inch2);
        }
        else{
            return -1;
        }
    }
}
