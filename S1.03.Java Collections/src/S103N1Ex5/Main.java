package S103N1Ex5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.reverse(list1); //That way do the list1 on reverse

        Iterator<Integer> iteratorList1 = list1.iterator();

        while(iteratorList1.hasNext()) {
            list2.add((Integer) iteratorList1.next());

        }
        System.out.println(list2);

    }

}
