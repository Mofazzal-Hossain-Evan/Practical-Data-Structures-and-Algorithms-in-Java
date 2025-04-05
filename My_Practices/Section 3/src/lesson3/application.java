package lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class application {
    public static void main(String[] args) {
        HashSet<String> valuesH = new HashSet<>();
        LinkedHashSet<String> valuesL = new LinkedHashSet<>();
        ArrayList<String> valuesA = new ArrayList<>();


        valuesH.add("Random");
        valuesH.add("Birds");
        valuesH.add("Lion");
        valuesH.add("HUman");
        valuesH.add("Random");
        valuesH.add("Random");

        valuesA.add("Random");
        valuesA.add("Birds");
        valuesA.add("Lion");
        valuesA.add("HUman");
        valuesA.add("Random");
        valuesA.add("Random");

        valuesL.add("Random");
        valuesL.add("Birds");
        valuesL.add("Lion");
        valuesL.add("HUman");
        valuesL.add("Random");
        valuesL.add("Random");

        for (String Value : valuesH ){
            System.out.println("HashSet: " + Value);

        }
        System.out.println("\n");

        for (String Value : valuesA) {
            System.out.println("ArrayList : " +Value);


        }
        System.out.println("\n");


        for (String value : valuesL){
            System.out.println("LinkedHashSet : " + value);


        }

    }
}
