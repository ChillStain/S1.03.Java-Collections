package S103N1Ex7;

import com.sun.source.tree.Tree;
import jdk.swing.interop.SwingInterOpUtils;

import java.security.KeyStore;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Employee> team = new HashMap<Integer, Employee>();
        team.put(45, new Employee("Karen"));
        team.put(13, new Employee("Charlie"));
        team.put(911, new Employee("Ambulance"));
        team.put(112, new Employee("Police"));

        System.out.println(team);

        TreeMap<Integer,Employee> listTS = new TreeMap<>(team);

        System.out.println(listTS);

        //Creo 2 listas para comprobar que sigue el orden de cada 1
        LinkedHashMap<Integer,Employee> listLHM = new LinkedHashMap<>(listTS);
        LinkedHashMap<Integer,Employee> listLHM2 = new LinkedHashMap<>(team);

        System.out.println(listLHM + "\n" + listLHM2);
        LinkedHashSet<Integer> listLHS = new LinkedHashSet<>();
        HashSet<Integer> listHS = new HashSet<>();

        for (Map.Entry<Integer,Employee> key:listTS.entrySet()) {
            listLHS.add(key.getKey());
            listHS.add(key.getKey());

        }
        System.out.println(listHS + "\n" + listLHS);


}
}