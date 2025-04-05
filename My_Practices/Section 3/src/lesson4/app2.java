package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class app2 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(23);
        hashSet.add(24);
        hashSet.add(25);
        hashSet.add(26);

        ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);
    }
}
