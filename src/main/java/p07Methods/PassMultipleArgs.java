package p07Methods;

public class PassMultipleArgs {
    public static void main(String[] args) {

        showSum(5, 10);
        showSum(12, 13);    // dont write data type here

    }

    public static void showSum(int a, int b) {

        System.out.println(a+b);
    }
}
