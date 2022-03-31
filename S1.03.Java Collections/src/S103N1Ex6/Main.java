package S103N1Ex6;

import S103N1Ex4.Iterator;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> listLinked = new LinkedList<Integer>();

        Iterator<Integer> listIterator = new Iterator<Integer>();

        do{
            listLinked.add(listLinked.size()/2,addInt());
            System.out.println(listLinked);

        }while (listLinked.listIterator() !=null );

    }
    public static int addInt(){
        Scanner input = new Scanner(System.in);
        int numAdded;
        do{
            System.out.println("Add a number. ");
            numAdded = input.nextInt();
            return  numAdded;
        }
        while (numAdded != 0);


            }


    }

