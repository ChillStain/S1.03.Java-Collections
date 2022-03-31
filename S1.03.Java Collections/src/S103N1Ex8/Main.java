package S103N1Ex8;

import java.util.*;

public class Main {
   /* Ejercicio 8. Rellena un mapa LinkedHashMap con llaves de tipo String y objetos del tipo que prefiera.
    Extraiga a las parejas, ordenelas según las claves (en orden alfabético) y vuelva a insertarlas en el mapa.
     Idea: Haz servir un ArrayList para realizar la ordenación con la clase Comparator.*/

    public static void main(String[] args) {

        LinkedHashMap<String,Singer> mapLHM = new LinkedHashMap<String,Singer>();

        mapLHM.put("From the Philippines ",new Singer("Karencitta "," with 45 Booop booop."));
        mapLHM.put("From Canada ", new Singer(" Merkules"," with Lemon Grass Pepper."));
        mapLHM.put("From Venezuela", new Singer("Canserber0"," with Jeremias." ));
        System.out.println("Best songs of the year awards " + mapLHM);

        Set<Map.Entry<String,Singer>> listSet = mapLHM.entrySet(); //Must use entrySet() on an arraylist if to order it with sort()
        ArrayList<Map.Entry<String,Singer>> listAL = new ArrayList<Map.Entry<String,Singer>>(listSet);

       //System.out.println(listAL);

        Collections.sort(listAL, new Comparator<Map.Entry<String, Singer>>() {//Compaarator as  parameter of sort and use the compareto to order the strings
            @Override
            public int compare(Map.Entry<String, Singer> o1, Map.Entry<String, Singer> o2) {
                return o1.getKey().compareTo(o2.getKey());

            }
        });
        System.out.println("Best songs of the year awards " + listAL);

        LinkedHashMap<String,Singer> linkedHashMap =new LinkedHashMap<String,Singer>();
        for (Map.Entry<String,Singer> entry : listAL) {
            linkedHashMap.put(entry.getKey(), entry.getValue());

        }
        System.out.println("Best songs of the year awards " + linkedHashMap);


    }

}
