package literals;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

    public List<? extends People> addMember(Men menClub){
        List <Men> listMen = new ArrayList<>();
        listMen.add(new Men());
 //      listMen.add(new People());
        listMen.add(new Children());
        return listMen;
    }
}

class People{

}

class Men extends People{

}

class Children extends Men {

}