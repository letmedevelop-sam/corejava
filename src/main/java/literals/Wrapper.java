package literals;

public class Wrapper {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(45); //value smaller than 127
        Integer num2 = Integer.valueOf(45); //value smaller than 127
        Integer num3 = new Integer(45); //value smaller than 127
        Integer num4 = 45;      //value smaller than 127

        System.out.println(num1==num2); //true
        System.out.println(num1==num3); //false
        System.out.println(num1==num4);  //true
        System.out.println(num3==num4);  //false


        Integer num5 = Integer.valueOf(145);  //value larger than 127
        Integer num6 = Integer.valueOf(145);  //value larger than 127
        Integer num7 = new Integer(145);  //value larger than 127
        Integer num8 = 145;        //value larger than 127

        System.out.println(num5==num6); //false
        System.out.println(num5==num7); //false
        System.out.println(num5==num8);  //false
        System.out.println(num7==num8);  //false
    }
}
