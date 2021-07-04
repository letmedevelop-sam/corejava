package p07Methods;

public class ValueReturn {
    public static void main(String[] args) {

        int x = sum(2,3);

        System.out.println(x);

    }
    public static int sum(int a, int b) {

        int res = a+b;

        return res;
    }
}
