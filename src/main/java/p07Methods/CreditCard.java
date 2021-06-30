package p07Methods;

public class CreditCard {
    public static void main(String[] args) {


        int rate = 4;

        double salary = 4000;

        System.out.println("Your  salary  is     : " + salary + "$"+
                "\nYour Credit reate is : " + rate + "\n");

        System.out.println("//if ((salary > 5000) && (rate > 5))");
        if ((salary > 5000) && (rate > 5)) {

            qualified();}

        else {

            unQualified();}

    }
    public static void qualified() {
        System.out.println("You are qualified for CC");
    }

    public static void unQualified() {
        System.out.println("Sorry, you are not qualified");
    }
}
