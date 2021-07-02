package p07Methods;

public class LastDigitSame {
    public static void main(String[] args) {
		/*Write a method that accepts 2 numbers and return if they have the same last digit.

		 Sample Output

		 lastDigit(7,17) ->true
		 lastDigit(6,17) ->false
		 lastDigit(3,113) ->true

		 */
        String x = lastDigit(7,17);
        System.out.println(x);

		/*

		String y = lastDigit(6,17);
		System.out.println(y);

		String z = lastDigit(3,113);
		System.out.println(z);

		*/
    }
    public static String lastDigit(int a, int b) {

        String str1, str2;

        if (a%10==b%10) {

            return str1 = "true" ;

        }else {

            return str2 = "false" ;
        }
    }
}
