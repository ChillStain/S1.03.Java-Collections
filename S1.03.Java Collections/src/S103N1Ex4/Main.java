package S103N1Ex4;

import java.util.*;

public class Main {

    public static <T> void  iterator (Collection<T> c) {//iterating is going through a collection
        java.util.Iterator<T> goThrough = c.iterator(); //Generate the iterator
            while (goThrough.hasNext()) { // Check if are more elements or not

                System.out.println(goThrough.next().toString());// Next() --> Search the next object of the list
            }
    }

    public static void main(String[] args) {
        Iterator letters = new Iterator("new");
        LinkedHashSet<Iterator> listLHS = new LinkedHashSet<Iterator>();
        listLHS.add(new Iterator("CH"));
        listLHS.add(new Iterator("A"));

        ArrayList<Iterator> listAL = new ArrayList<Iterator>();
        listAL.add(new Iterator("R"));
        listAL.add(new Iterator("L"));

        TreeSet<Iterator> listTS = new TreeSet<Iterator>();
        listTS.add(new Iterator("I"));
        listTS.add(new Iterator("E"));

        LinkedList<Iterator> listLL = new LinkedList<Iterator>();
        listLL.add(new Iterator("CH"));
        listLL.add(new Iterator("I"));

        HashSet<Iterator> listHS = new HashSet<Iterator>();
        listHS.add(new Iterator("L"));
        listHS.add(new Iterator("L"));

        iterator(listLHS);
        iterator(listAL);
        iterator(listTS);
        iterator(listLL);
        iterator(listLHS);


    }
}
