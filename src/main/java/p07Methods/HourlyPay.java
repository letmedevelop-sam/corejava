package p07Methods;

public class HourlyPay {
    /*
	 Write a method that accepts number of hours and hourly pay and show your pay for
those hours in the console.
	 */

    public static void main(String[] args) {

        calculatePay(3, 15.33);


    }

    public static void calculatePay (int hour, double pay) {
        double total = hour * pay;
        System.out.println("You worked " + hour + " hours.");
        System.out.println("Hourly pay is "+ pay + "$");
        System.out.println("Your total pay is = " + total + "$");
    }
}
