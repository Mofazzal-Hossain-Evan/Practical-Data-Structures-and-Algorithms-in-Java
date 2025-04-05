package lesson4;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(34);
        list1.add(55);

        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(33);

        list1.addAll(newlist);
        System.out.println(list1);
    }
}
