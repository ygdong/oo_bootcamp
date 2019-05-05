package oo3.exam;

import java.util.ArrayList;
import java.util.List;

public class Shelf<T extends Diffable> {

    List<T> list  = new ArrayList();

    public void add(T t){
        list.add(t);
    }

    public T  getBest(){
        T best = list.get(0);
        for (int i=1;i<list.size();i++){
            if (list.get(i).isBetterThan(best))
                best = list.get(i);
        }
        return best;
    }

    public T getBest(Flavor<T>  flavor){
        T best = list.get(0);
        for (int i=1;i<list.size();i++){
            if (flavor.isBetterThan(list.get(i),best))
                best = list.get(i);
        }
        return  best;
    }
}
