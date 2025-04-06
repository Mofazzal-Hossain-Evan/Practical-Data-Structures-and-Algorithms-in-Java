package lesson5;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<String, String> dictionary = new TreeMap<>();

        dictionary.put("Apple", "A fruit that is sweet and red or green in color");
        dictionary.put("Book", "A set of written or printed pages bound together");
        dictionary.put("Computer", "An electronic device for storing and processing data");
        dictionary.put("Java", "A high-level programming language");
        dictionary.put("School", "A place where people go to learn");

        System.out.println("Dictionary contents:");

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
