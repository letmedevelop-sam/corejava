package p01ArithmeticOperators;

public class CalculateWages {
    public static void main(String[] args) {
        // This program calculates hourly wages plus overtime

        double regularWage;        // The calculated regular wage
        double basePay = 25.75f;   // The base  pay;
        double regularHours = 40;  // The hours worked without overtime
        double overTimeWages;      // Overtime wages
        double overTimePay = 37.5; // Overtime pay rate
        double overTimeHours = 15;
        double totalWage;          // Total wage

        regularWage = basePay * regularHours;
        overTimeWages = overTimePay * overTimeHours;

        totalWage = regularWage + overTimeWages;

        System.out.println("Regular Working Time  : " + regularHours + " hours");
        System.out.println("Base payment/hour     : $" + basePay);
        System.out.println("Overtime hours        : " + overTimeHours + " hours");
        System.out.println("Overtime payment/hour : $" + overTimePay);

        System.out.println("Wages for this week are $" + totalWage);



    }
}
