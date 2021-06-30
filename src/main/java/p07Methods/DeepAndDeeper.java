package p07Methods;

public class DeepAndDeeper {
    public static void main(String[] args) {

        System.out.println("I am starting in main\n");

        deep();

        System.out.println("I am back in main");

    }

    public static void deep() {
        System.out.println("\t I am in deep");
        deeper();
        System.out.println("\t I am back in deep\n");
    }

    public static void deeper() {
        System.out.println("\t \t I am in deeper");

    }
}
