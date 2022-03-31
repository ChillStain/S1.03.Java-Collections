package S103N1Ex3;

import java.util.*;

public class MainTheShining {
    public static void main(String[] args) {
        TheShining chars = new TheShining(); //Instance of the object to be able to access the next() method.

        ArrayList<String> listArrayList = new ArrayList<String>(); //Inefficient to insert or remove elements; efficient to go through.
        for(int i=0; i<18; i++){
            listArrayList.add(chars.next());
        }
        System.out.println(listArrayList);


        HashSet<String> listHashSet = new HashSet<String>(); //doesn`t allow duplicates. doesn`t sort, doesn`t give random access.
        for(int i=0; i<12; i++) {
            listHashSet.add(chars.next());

        }
        System.out.println(listHashSet);

        TreeSet<String> listTreeSet = new TreeSet<String>(); // sorts items alphabetically
        for(int i=0; i<18; i++){
            listTreeSet.add(chars.next());

        }
        System.out.println(listTreeSet);

        LinkedList<String> listLinked = new LinkedList<String>(); //efficient for inserting or deleting items, not so much for traversing
        for(int i =0; i <12; i++) {
            listLinked.add(chars.next());

        }
        System.out.println(listLinked);

        LinkedHashSet<String> listLinkedHashSet = new LinkedHashSet<String>(); //sorts by order entry, easy to access, not used to add
        for (int i = 0; i<12; i++) {
            listLinkedHashSet.add(chars.next());
        }
        System.out.println(listLinkedHashSet);





    }
}
