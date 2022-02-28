
import java.util.ArrayList;

import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        //adding the element to arrayList
        list.add(2);
        list.add(3);
        list.add(34);
        list.add(5);
        System.out.println(list);

        // to get element from the arrayList
        int x =list.get(3);
        System.out.println(x);

        // to add element in the arrayList
        list.set(3,11);
        System.out.println(list);

        // to set the element(change)
        list.set(0,222);
        System.out.println(list);

        // to delete the element from the ArrayList
        list.remove(2);
        System.out.println(list);

        // to get the size of the ArrayList
        int y = list.size();
        System.out.println(y);

        //for the sorting the arrayList
        Collections.sort(list);
        System.out.println(list);

        // loop in arrayList
        for(int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }



    }
}
