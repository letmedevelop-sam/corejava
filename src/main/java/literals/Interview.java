package literals;

public class Interview {
    public static void main(String[] args) {

        //Primitive variable declaration - var1,
        //var1 contains literal value 123.
        int var1 = 123;

        //Reference variable declaration - var2,
        //var2 contains reference to object of type 'Interview'.
        Interview var2 = new Interview();

        System.out.println(var1);  //It will directly return the value of literal

        //prints   - >  123

        System.out.println(var2);  //It will return the address of the object

        //prints   - >  literals.Interview@7b23ec81

    }
}


