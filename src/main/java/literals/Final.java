package literals;

public class Final {

    String name;

    public static void main(String[] args) {
        //final primitive variable var1,
        //value of var1 cannot change from 123
        final int var1 = 123;
        //final reference variable - var2
        //var2 cannot be changed to refer another Final object,
        //attributes of the Box object can change.
        final Final var2 = new Final();
        System.out.println(var2.name);   //Name attribute has default value -> NULL
        //var2 = new Final();      //We can not assign new object to this final variable
        var2.name = "Mike";
        System.out.println(var2.name);
    }
}


