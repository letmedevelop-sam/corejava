package literals;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumber<T extends Number> {

    public static void main(String[] args) {
  //      ListOfNumber<T> list = new ListOfNumber();

    }
}




class ListOfNumberFactory{

    //Lower Bounded Wildcard
    public static void addIntegers(List<? super Integer> list){
        list.add(new Integer(50));

    }

 //   static ListOfNumber<T> listOfNumber;

    public static ListOfNumber<Double> getList(){
        return new ListOfNumber<>();
    }
}