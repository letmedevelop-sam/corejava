package literals;

public class TypeCasting {
    public static void main(String[] args) {

        int x = 100;
        double y = 20.3;

        y = x; // NO ERROR; Implicit Casting

       // x = y; //ERROR

        //So how to store this double value in int forcefully?

        x = (int)20.3; //Explicit Casting
        System.out.println(x); // Output 20; .3 will be discarded
        System.out.println(10/3);
    }

}
