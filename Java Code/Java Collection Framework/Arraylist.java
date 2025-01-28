// ArrayList: unlike regular array, which has fixed size. an ArrayList can grow and shrink as elements are added or removed.
// ArrayList implemented as an array of object references. 
// inital capacity(default is 10)
// ordered array with duplicate value

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList <Integer> list= new ArrayList<>();
        list.add(1); //0
        list.add(5); //1
        list.add(4); //2
        list.add(8); //3
      

        list.add(1, 6);

        list.set(2, 50);

        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.contains(8));
        


        for(int i=0; i<list.size(); i++) {   //iterate
            System.out.println(list.get(i));
        }

        System.out.println(list.remove(3));

        Collections.sort(list);    // Sort ArrayList

        System.out.println(list);




    }
}