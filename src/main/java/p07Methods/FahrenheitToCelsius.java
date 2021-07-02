package p07Methods;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

		/*
		Write a function that accepts Fahrenheit and displays the Celcius in the console.
		Sample Output:
			calculateCelcius(32) -- > 0
			calculateCelcius(50) --> 10
		*/

        fahrenheitToCelsius(32);
    }
    public static void fahrenheitToCelsius(double fahrenheit) {

        double celcius = (fahrenheit-32)/1.8;

        System.out.println(fahrenheit  + " fahrenheit  is " + celcius + " degrees celcius.") ;
    }

}
