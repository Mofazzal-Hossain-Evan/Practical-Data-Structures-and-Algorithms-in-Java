package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class app3 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abc");

        hashSet.add("ghi");

        hashSet.add("def");
        hashSet.add("jkl");




        ArrayList<String> myList = new ArrayList<String>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);
    }
}
