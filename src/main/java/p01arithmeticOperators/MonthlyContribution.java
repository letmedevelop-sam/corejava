package p01arithmeticOperators;

public class MonthlyContribution {
    public static void main(String[] args) {
        /* This program calculates the amount
         * that will be contributed to the retirement plan
         * if 5%, 8% or %10 of monthly pay is withheld*/

        double monthlyPay = 6_000;
        double  rate1 = 0.05;
        double  rate2 = 0.08;
        double  rate3 = 0.1;

        double contribution1;
        double contribution2;
        double contribution3;

        contribution1 =  monthlyPay * rate1;
        contribution2 = monthlyPay * rate2;
        contribution3 = monthlyPay * rate3;


        System.out.print("\"Monthly $6.000  -> \" with  %5 rate your monthly contribution will be  : " + contribution1 + "\n");
        System.out.print("\"Monthly $6.000  -> \" with  %8 rate your monthly contribution will be  : " + contribution2 + "\n");
        System.out.print("\"Monthly $6.000  -> \" with  %10 rate your monthly contribution will be : " + contribution3);


    }
}
