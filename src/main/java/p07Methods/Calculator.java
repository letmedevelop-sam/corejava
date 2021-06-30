package p07Methods;

public class Calculator {
    /*
	 Write a method that accepts 3 parameters:
			1- number
			2- number
			3- operator(-,+,*,/)
		Sample output:
		calculator(6,3, “+”) -- > 9
		calculator(6,3, “-”) -- > 3
		calculator(6,3, “*”) -- > 18
		calculator(6,3, “/”) -- > 2

	 */

    public static void main(String[] args) {

        calculate(6, 3, "+");
        calculate(6, 3, "-");
        calculate(6, 3, "*");
        calculate(6, 3, "/");
        calculate(6, 3, "%");
    }

    public static void calculate ( double a, double b, String choose) {

        double result;

        switch (choose) {
            case "+":
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;

            case "-":
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;

            case "*":
                result = a * b;
                System.out.println(a + " x " + b + " = " + result);
                break;

            case "/":
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
                break;

            case "%":
                result = a % b;
                System.out.println(a + " % " + b + " = " + result);
                break;

            default:
                System.out.println("Wrong operator. Please choose +, -, *, / or %");
        }
    }
}
