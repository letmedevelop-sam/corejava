package p08MethodOverloading;

public class SumMethodOverLoading {
    public static void main(String[] args) {

        System.out.print("sum(2,3) -> ");
        System.out.println(sum(2,3));

        System.out.print("sum(2,3,4) -> ");
        System.out.println(sum(2,3,4));

    }public static int sum (int a, int b) {
        return a+b;

    }
    public static int sum (int c, int d, int e) {
        return c+d+e;

    }
    public static int sum (int f, int g, int h, int i) {
        return f+g+h+i;

    }
}
