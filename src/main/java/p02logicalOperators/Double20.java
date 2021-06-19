package p02logicalOperators;

public class Double20 {
    public static void main(String[] args) {

        double d1 = 20;
        double d2 = 80;
        double result = (d1 + d2)*25;

        System.out.println(result);

        double result2 = result % 40;
        System.out.println(result2);

        System.out.println(result2 <= 20);
    }
}
