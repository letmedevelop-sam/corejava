package literals;

import java.util.function.IntFunction;

public class Lambda {

    public static void main(String[] args) {
        Sample1 try1 = (int i) -> 10 + i;
        System.out.println(try1.method1(5));
    }
}

    interface Sample1 {
    int method1(int i);
    }

    interface Sample2 {
    int method2();
    }

    interface Sample {
    void method2(String s);
    }
    /*
            //Passes an integer argument i, and returns 10+i
        IntFunction<Integer> integerIntFunction = (int i) -> 10 + i;
//Passes no arguments and returns 50
        () -> 50;
//Passes string argument s and returns nothing
        (String s) -> {system.out.println(s);}
     */