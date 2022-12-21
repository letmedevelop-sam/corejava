package literals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics<T extends Number> {

    public static void main(String[] args) {
        Generics<Integer> generic = new Generics();
        generic.addToList(5);
        System.out.println(generic.myList);
    }

    List <T> myList = new ArrayList<>();

    void addToList(T number){
        myList.add(number);
    }

}
