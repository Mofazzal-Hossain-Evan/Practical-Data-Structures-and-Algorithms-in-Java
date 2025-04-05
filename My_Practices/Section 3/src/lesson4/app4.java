package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class app4{
public static void main(String[] args) {
        HashSet<Employee> hashSetList = new HashSet<Employee>();
        hashSetList.add(new Employee("Mike", 40000, "Accounting"));
        hashSetList.add(new Employee("Mile", 40000, "HR"));
        hashSetList.add(new Employee("Joe", 40000, "IT"));

        ArrayList<Employee> myList = new ArrayList<Employee>(hashSetList);
        Collections.sort(myList);
        System.out.println(myList);

    }
}

