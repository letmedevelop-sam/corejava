package p07Methods;

public class PassArgumentToMethod {
    public static void main(String[] args) {

        int x = 100;

        displayValue();  //this is a different method
        displayValue(3);   // dont write data type here
        displayValue(x);
        displayValue(x*4);

        double  y = 10.45;


        displayValue((int)y);
    }

    public static void displayValue(int num) {
        System.out.println("The value is : " + num);
    }

    public static void displayValue() {
        System.out.println("The value is : 10 ");
    }
}
