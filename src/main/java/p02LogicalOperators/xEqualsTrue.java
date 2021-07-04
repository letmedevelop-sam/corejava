package p02LogicalOperators;

public class xEqualsTrue {
    public static void main(String[] args) {

        boolean x = true, z = true;
        int y = 20;

        x = (y!=10) || (z = false);

        //  T or F
        //   T


        System.out.println(x);

    }
}
